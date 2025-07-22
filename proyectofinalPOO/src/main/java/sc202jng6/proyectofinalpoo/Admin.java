package sc202jng6.proyectofinalpoo;
/**
 *
 * @author mzamo
 */
public class Admin {

    // Atributos de la clase Administrador
    private final Usuario usuario;

    public Admin(int id, String nombre, String correo, String password) {
        this.usuario = new Usuario(id, nombre, correo, password, RolUsuario.Administrador);
    }

    // Métodos para gestionar usuarios, cursos y matrículas
    public void gestionarUsuarios() {
        // Implementación de gestión de usuarios
    }

    public void gestionarCursos() {
        // Implementación de gestión de cursos
    }

    public void gestionarMatriculas() {
        // Implementación de gestión de matrículas
    }

    // Getter para usuario
    public Usuario getUsuario() {
        return usuario;
    }

}
