package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;

public class GestionAdministrador {
    // Atributos de la gestión del administrador
    Admin[] administradores = new Admin[4]; // Array para almacenar administradores
    int contador = 0; // Contador para el número de administradores
    // Método para agregar un administrador

    public void agregarAdministrador(Admin admin) { // Método para agregar un administrador al arreglo
        if (contador < administradores.length) {
            administradores[contador] = admin;
            contador++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más administradores.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public GestionAdministrador() { // Constructor para inicializar algunos administradores
        administradores[contador++] = new Admin(1, "Manuel","admin123");
        administradores[contador++] = new Admin(2, "Barrtholomeo", "admin123");

    }

    public void mostarAdministradores() { // Método para mostrar la información de todos los administradores
        String informacionAdministradores = "Administradores:\n";
        informacionAdministradores += "ID\tNombre\t";
        for (int i = 0; i < contador; i++) {
            informacionAdministradores += administradores[i].getId() + "\t" +
                    administradores[i].getNombre() + "\t" + "\n";
        }
        JOptionPane.showMessageDialog(null, informacionAdministradores, "Lista de Administradores",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
