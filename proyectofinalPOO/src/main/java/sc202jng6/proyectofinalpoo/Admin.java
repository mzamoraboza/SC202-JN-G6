package sc202jng6.proyectofinalpoo;
/**
 *
 * @author mzamo
 */
import javax.swing.JOptionPane;

public class Admin {

    // Atributos de la clase Administrador
    private final Usuario usuario;
    private final SistemaGestion sistema;

    public Admin(int id, String nombre, String correo, String password, SistemaGestion sistema) {
        this.usuario = new Usuario(id, nombre, correo, password, RolUsuario.Administrador);
        this.sistema = sistema;
    }

    // Método para gestionar usuarios
    public void gestionarUsuarios() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo usuario:");
        String correo = JOptionPane.showInputDialog("Ingrese el correo del nuevo usuario:");
        String password = JOptionPane.showInputDialog("Ingrese la contraseña del nuevo usuario:");
        int id = sistema.getUsuarioCount() + 1;

        Usuario nuevoUsuario = new Usuario(id, nombre, correo, password, RolUsuario.Estudiante);
        sistema.agregarUsuario(nuevoUsuario);

        JOptionPane.showMessageDialog(null, "Usuario agregado:\nNombre: " + nombre + "\nCorreo: " + correo);
    }

    // Método para gestionar cursos
    public void gestionarCursos() {
        String nombreCurso = JOptionPane.showInputDialog("Ingrese el nombre del curso:");
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del curso:");
        String horario = JOptionPane.showInputDialog("Ingrese el horario del curso:");
        int id = sistema.getCursoCount() + 1;

        Curso nuevoCurso = new Curso(nombreCurso, descripcion, horario);
        nuevoCurso.setIdCurso(id);
        sistema.agregarCurso(nuevoCurso);

        JOptionPane.showMessageDialog(null, "Curso agregado:\n" + nombreCurso);
    }

    // Método para gestionar matrículas
    public void gestionarMatriculas() {
        String idEstudianteStr = JOptionPane.showInputDialog("Ingrese el ID del estudiante:");
        String idCursoStr = JOptionPane.showInputDialog("Ingrese el ID del curso:");
        int idEstudiante = Integer.parseInt(idEstudianteStr);
        int idCurso = Integer.parseInt(idCursoStr);
        int idMatricula = sistema.getMatriculaCount() + 1;

        Matricula nuevaMatricula = new Matricula(idMatricula, idEstudiante, idCurso);
        sistema.agregarMatricula(nuevaMatricula);

        JOptionPane.showMessageDialog(null, "Matrícula registrada con éxito.");
    }

    // Getter para usuario
    public Usuario getUsuario() {
        return usuario;
    }
}
