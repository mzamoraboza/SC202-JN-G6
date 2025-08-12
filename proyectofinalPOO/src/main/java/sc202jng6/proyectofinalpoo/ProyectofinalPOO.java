/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;

/**
 *
 * @author mzamo
 */
public class ProyectofinalPOO {

    public static void main(String[] args) {
        GestionAdministrador gestionAdministrador = new GestionAdministrador();
        GestionCurso gestionCurso = new GestionCurso();
        GestionMatricula gestionMatricula = new GestionMatricula();
        GestionEstudiante gestionEstudiante = new GestionEstudiante();
        // Llamada al método para mostrar el menú principal
        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Gestión de Cursos",
                "Sistema de Gestión de Cursos", JOptionPane.INFORMATION_MESSAGE);
        mostrarMenuPrincipal();

        // Aquí puedes agregar más lógica para manejar la interacción con el usuario
        // y las diferentes funcionalidades del sistema.
    }

    static void mostrarMenuPrincipal() {
        while (true) {
            switch (JOptionPane.showInputDialog(null, "Seleccione una opción:\n"
                    + "1. Administrador\n"
                    + "2. Estudiante\n"
                    + "3. Salir", "Menú Principal", JOptionPane.INFORMATION_MESSAGE)) {
                case "1":
                    // Lógica para el administrador
                    mostrarMenuAdministrador();
                    break;
                case "2":
                    // Lógica para el estudiante
                    mostrarMenuEstudiante();
                    break;
                case "3":
                    // Salir del programa
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Hasta luego!",
                            "Salir", JOptionPane.INFORMATION_MESSAGE);

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, intente de nuevo.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
