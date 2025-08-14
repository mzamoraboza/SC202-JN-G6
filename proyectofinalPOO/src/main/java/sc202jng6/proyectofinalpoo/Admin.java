package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Zamora Boza
 */

public class Admin {
    // Atributos del administrador
    private int id;
    private String nombre;
    private String contrasena;
    private String tipoUsuario = "Administrador";

    // Constructor
    public Admin(int id, String nombre, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    // getters
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

    // setters
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

            if (isValid) {
                this.contrasena = contrasena;
                JOptionPane.showMessageDialog(null, "Contraseña actualizada correctamente.", "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void mostrarInformacionAdmin() {
        JOptionPane.showMessageDialog(null,
                "ID: " + id + "\nNombre: " + nombre + "\nTipo de Usuario: " + tipoUsuario,
                "Información del Administrador", JOptionPane.INFORMATION_MESSAGE);
    }

}


