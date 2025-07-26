package sc202jng6.proyectofinalpoo;

/**
 *
 * @author mzamo
 */
import javax.swing.JOptionPane;

public class Estudiante {
    // Atributos del estudiante
    private String nombre;
    private SistemaGestion sistema;
    private String correo;
    private String password;
    private int idEstudiante;

    public Estudiante(String nombre, String correo, String password, int idEstudiante) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.idEstudiante = idEstudiante;
    }


    // Getter para el correo
    public String getCorreo() {
        return correo;
    }   
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    // Getter para el password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // Getter para el id del estudiante
    public int getIdEstudiante() {
        return idEstudiante;
    }   
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Setter para el sistema de gestión
    public void setSistema(SistemaGestion sistema) {
        this.sistema = sistema;
    }   
    // Getter para el sistema de gestión
    public SistemaGestion getSistema() {
        return sistema;
    }
    // Método para establecer el nombre del estudiante
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }   
    // Método para obtener el nombre del estudiante
    public String obtenerNombre() {
        return nombre;
    }
    // Método para obtener el ID del estudiante
    public int obtenerIdEstudiante() {
        return idEstudiante;
    }   
    // Método para establecer el ID del estudiante
    public void establecerIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    // Método para establecer el correo del estudiante
    public void establecerCorreo(String correo) {
        this.correo = correo;
    }
    // Método para obtener el correo del estudiante
    public String obtenerCorreo() {
        return correo;
    }   
    // Método para establecer el password del estudiante
    public void establecerPassword(String password) {
        this.password = password;
    }
    // Método para obtener el password del estudiante
    public String obtenerPassword() {
        return password;
    }
    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, 
        "Nombre: " + nombre + 
        "\nCorreo: " + correo + 
        "\nID Estudiante: " + idEstudiante);
    }
    // Método para inscribir al estudiante en un curso
    public void inscribirCurso(Curso curso) {
        if (sistema != null) {
            sistema.inscribirEstudianteEnCurso(this, curso);
        } else {
            JOptionPane.showMessageDialog(null, "El sistema de gestión no está configurado.");
        }
    }
    // Método para mostrar los cursos inscritos
    public void mostrarCursosInscritos() {
        if (sistema != null) {
            sistema.mostrarCursosInscritos(this);
        } else {
            JOptionPane.showMessageDialog(null, "El sistema de gestión no está configurado.");
        }
        
    }



    
}
