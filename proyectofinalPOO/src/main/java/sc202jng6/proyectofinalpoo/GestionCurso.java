package sc202jng6.proyectofinalpoo;

/**
 *
 * @author Manuel Zamora Boza
 */
import javax.swing.JOptionPane;

public class GestionCurso {
    private Curso[] cursos = new Curso[15];
    private int contador = 0;

    public GestionCurso() {
        cursos[contador++] = new Curso(1, "Introducción a Java", "Lunes 18:00-21:00");
        cursos[contador++] = new Curso(2, "Programación en Python", "Martes 17:00-20:00");
        cursos[contador++] = new Curso(3, "Desarrollo Web con HTML y CSS", "Miércoles de 18:00 a 21:00");
        cursos[contador++] = new Curso(4, "Bases de Datos con MySQL", "Jueves de 17:00 a 20:00");
        cursos[contador++] = new Curso(5, "JavaScript Interactivo", "Viernes de 18:00 a 21:00");
        cursos[contador++] = new Curso(6, "Diseño Gráfico con Canva", "Sábado de 09:00 a 12:00");
        cursos[contador++] = new Curso(7, "Linux y Scripting Básico", "Lunes de 09:00 a 12:00");
        cursos[contador++] = new Curso(8, "Automatización de Procesos", "Martes de 18:00 a 21:00");
        cursos[contador++] = new Curso(9, "Branding y Comunicación Visual", "Miércoles de 17:00 a 20:00");
        cursos[contador++] = new Curso(10, "Creación de Materiales Didácticos", "Jueves de 09:00 a 12:00");
    }

    public void menuCursos() {
        String[] opciones = { "Mostrar Cursos", "Agregar Curso", "Volver" };
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Gestión de Cursos",
                    "Cursos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);
            switch (opcion) {
                case 0 -> mostrarCursos();
                case 1 -> agregarCurso();
            }
        } while (opcion != 2);
    }

    public void mostrarCursos() {
        StringBuilder info = new StringBuilder("Código\tNombre\tHorario\n");
        for (int i = 0; i < contador; i++) {
            info.append(cursos[i].getCodigoCurso()).append("\t")
                    .append(cursos[i].getNombreCurso()).append("\t")
                    .append(cursos[i].getHorarioCurso()).append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString(), "Lista de Cursos",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void agregarCurso() {
        int codigo = contador + 1;
        String nombre = JOptionPane.showInputDialog("Nombre del Curso:");
        String horario = JOptionPane.showInputDialog("Horario del Curso:");
        cursos[contador++] = new Curso(codigo, nombre, horario);
        JOptionPane.showMessageDialog(null, "Curso agregado correctamente.");
    }

    public Curso buscarCursoPorCodigo(int codigo) {
        for (int i = 0; i < contador; i++) {
            if (cursos[i].getCodigoCurso() == codigo)
                return cursos[i];
        }
        return null;
    }
}
