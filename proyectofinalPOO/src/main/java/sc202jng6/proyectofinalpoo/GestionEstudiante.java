package sc202jng6.proyectofinalpoo;
/**
 *
 * @author Manuel Zamora Boza
 */
import javax.swing.JOptionPane;

public class GestionEstudiante {
    private Estudiante[] estudiantes = new Estudiante[100];
    private int contador = 0;

    public GestionEstudiante() {
        estudiantes[contador++] = new Estudiante(1, "Juan Pérez", "estudiante123");
        estudiantes[contador++] = new Estudiante(2, "Ana Gómez", "estudiante123");
    }

    public void menuEstudiantes() {
        String[] opciones = {"Mostrar Estudiantes", "Agregar Estudiante", "Volver"};
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Gestión de Estudiantes",
                    "Estudiantes", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);
            switch (opcion) {
                case 0 -> mostrarEstudiantes();
                case 1 -> agregarEstudiante();
            }
        } while (opcion != 2);
    }

    public void mostrarEstudiantes() {
        StringBuilder info = new StringBuilder("ID\tNombre\n");
        for (int i = 0; i < contador; i++) {
            info.append(estudiantes[i].getId()).append("\t")
                    .append(estudiantes[i].getNombreEstudiante()).append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString(), "Lista de Estudiantes",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void agregarEstudiante() {
        int id = contador + 1;
        String nombre = JOptionPane.showInputDialog("Nombre del Estudiante:");
        String contrasena = JOptionPane.showInputDialog("Contraseña:");
        estudiantes[contador++] = new Estudiante(id, nombre, contrasena);
        JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente.");
    }
}
