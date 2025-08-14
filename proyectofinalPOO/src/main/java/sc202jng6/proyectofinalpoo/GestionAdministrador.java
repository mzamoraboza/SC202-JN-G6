package sc202jng6.proyectofinalpoo;

/**
 *
 * @author Manuel Zamora Boza
 */
import javax.swing.JOptionPane;

public class GestionAdministrador {
    private Admin[] administradores = new Admin[10];
    private int contador = 0;

    public GestionAdministrador() {
        administradores[contador++] = new Admin(1, "Manuel", "admin123");
        administradores[contador++] = new Admin(2, "Bartholomeo", "admin123");
    }

    public void menuAdministradores() {
        String[] opciones = { "Mostrar Administradores", "Agregar Administrador", "Volver" };
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Gestión de Administradores",
                    "Administradores", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);
            switch (opcion) {
                case 0 -> mostrarAdministradores();
                case 1 -> agregarAdministrador();
            }
        } while (opcion != 2);
    }

    public void mostrarAdministradores() {
        StringBuilder info = new StringBuilder("ID\tNombre\n");
        for (int i = 0; i < contador; i++) {
            info.append(administradores[i].getId()).append("\t")
                    .append(administradores[i].getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString(), "Lista de Administradores",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void agregarAdministrador() {
        int id = contador + 1;
        String nombre = JOptionPane.showInputDialog("Nombre del Administrador:");
        String contrasena = JOptionPane.showInputDialog("Contraseña:");
        administradores[contador++] = new Admin(id, nombre, contrasena);
        JOptionPane.showMessageDialog(null, "Administrador agregado correctamente.");
    }
}
