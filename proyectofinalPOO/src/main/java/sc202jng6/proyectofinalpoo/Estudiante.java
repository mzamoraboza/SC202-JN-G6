package sc202jng6.proyectofinalpoo;

/**
 *
 * @author mzamo
 */
import javax.swing.JOptionPane;

public class Estudiante {
    // Atributos del estudiante
    public int id = 0;
    public String nombre = "";

    private String tipoUsuario = "Estudiante";
    private String contrasena = "";

    // Constructor
    public Estudiante(int id, String nombre, String contrasena) {
        this.id = id;
        this.nombre = nombre;

        this.contrasena = contrasena;
    }

    public Estudiante() {
    }

    // Métodos para gestionar el estudiante
    public void mostrarInformacionEstudiante() {
        JOptionPane.showMessageDialog(null,
                "ID: " + id + "\nNombre: " + nombre + "\nTipo de Usuario: " + tipoUsuario,
                "Información del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return "*".repeat(contrasena.length());
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        boolean isValid = true;

        if (contrasena.length() < 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            isValid = false;
        }

        for (int i = 1; i < contrasena.length(); i++) {
            if (contrasena.charAt(i) == ' ' || contrasena.charAt(i) == (i - 1)) {
                JOptionPane.showMessageDialog(null, "La contraseña no puede contener espacios.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                isValid = false;
                break;
            }
        }

        if (isValid) {
            this.contrasena = contrasena;
            JOptionPane.showMessageDialog(null, "Contraseña actualizada correctamente.", "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}