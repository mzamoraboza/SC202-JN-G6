package sc202jng6.proyectofinalpoo;
/**
 *
 * @author mzamo
 */
import javax.swing.JOptionPane;

public class Estudiante {
    // Atributos del estudiante
    private final String nombre;
    private final SistemaGestion sistema;

    // Constructor
    public Estudiante(String nombre, String correo, String password, int idEstudiante, SistemaGestion sistema) {
        this.nombre = nombre;
        this.sistema = sistema;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para mostrar el catálogo de cursos disponibles
    public void verCatalogoCursos() {
        StringBuilder catalogo = new StringBuilder("Cursos disponibles:\n\n");

        if (sistema.getCursos() == null || sistema.getCursos().length == 0) {
            JOptionPane.showMessageDialog(null, "No hay cursos disponibles en este momento.");
            return;
        }


        for (Curso curso : sistema.getCursos()) {
            catalogo.append("ID: ").append(curso.getIdCurso())
                    .append("\nTítulo: ").append(curso.getTitulo())
                    .append("\nDescripción: ").append(curso.getDescripcion())
                    .append("\nHorario: ").append(curso.getHorario())
                    .append("\n----------------------\n");
        }

        JOptionPane.showMessageDialog(null, catalogo.toString());
    }

    // Métodos que aún puedes implementar si te lo asignan más adelante
    public void inscribirseCurso() {
        // Implementación de inscripción a curso (opcional)
    }

    public void verCursosInscritos() {
        // Implementación para ver cursos inscritos (opcional)
    }
}
