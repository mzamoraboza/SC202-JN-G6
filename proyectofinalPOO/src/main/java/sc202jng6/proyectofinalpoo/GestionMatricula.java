package sc202jng6.proyectofinalpoo;
/**
 *
 * @author Manuel Zamora Boza
 */
import javax.swing.JOptionPane;

public class GestionMatricula {
    private Matricula[] matriculas = new Matricula[100];
    private int contador = 0;
    private GestionCurso gestionCurso;

    public GestionMatricula(GestionCurso gestionCurso) {
        this.gestionCurso = gestionCurso;
    }

    public void menuGestionarMatriculas() {
        String[] opciones = { "Agregar Matrícula", "Buscar Curso", "Mostrar Matrículas", "Volver" };
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Gestión de Matrículas",
                    "Matrículas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);
            switch (opcion) {
                case 0 -> agregarMatricula();
                case 1 -> buscarCurso();
                case 2 -> mostrarMatriculas();
            }
        } while (opcion != 3);
    }

    public void agregarMatricula() {
        String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
        int idEstudiante = Integer.parseInt(JOptionPane.showInputDialog("ID del estudiante:"));
        int idCurso = Integer.parseInt(JOptionPane.showInputDialog("Código del curso:"));

        Curso curso = gestionCurso.buscarCursoPorCodigo(idCurso);
        if (curso == null) {
            JOptionPane.showMessageDialog(null, "Curso no encontrado.");
            return;
        }

        matriculas[contador++] = new Matricula(contador, idEstudiante, idCurso);
        JOptionPane.showMessageDialog(null, "Matrícula agregada correctamente.\nCurso: " + curso.getNombreCurso());
    }

    public void buscarCurso() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del curso:"));
        Curso curso = gestionCurso.buscarCursoPorCodigo(codigo);
        if (curso != null) {
            JOptionPane.showMessageDialog(null,
                    "Curso encontrado:\n" + curso.getNombreCurso() + " - " + curso.getHorarioCurso());
        } else {
            JOptionPane.showMessageDialog(null, "Curso no encontrado.");
        }
    }

    public void mostrarMatriculas() {
        StringBuilder info = new StringBuilder("ID\tEstudiante ID\tCurso\n");
        for (int i = 0; i < contador; i++) {
            Curso curso = gestionCurso.buscarCursoPorCodigo(matriculas[i].getIdCurso());
            info.append(matriculas[i].getId()).append("\t")
                    .append(matriculas[i].getIdEstudiante()).append("\t")
                    .append(curso != null ? curso.getNombreCurso() : "Desconocido").append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString(), "Lista de Matrículas",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
