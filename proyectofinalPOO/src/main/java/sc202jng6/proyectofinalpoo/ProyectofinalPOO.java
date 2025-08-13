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

    }

    public static void mostrarMenuPrincipal() {
        String[] opciones = { "Administradores", "Cursos", "Estudiantes", "Matrículas", "Salir" };
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {
            case 0:
                GestionAdministrador gestionAdministrador = new GestionAdministrador();
                gestionAdministrador.mostarAdministradores();
                break;
            case 1:
                GestionCurso gestionCurso = new GestionCurso();
                gestionCurso.mostrarCursos();
                break;
            case 2:
                GestionEstudiante gestionEstudiante = new GestionEstudiante();
                gestionEstudiante.mostrarEstudiantes();
                break;
            case 3:
                GestionMatricula gestionMatricula = new GestionMatricula();
                gestionMatricula.mostrarMatriculas();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Saliendo del sistema. ¡Hasta luego!");
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
        }
    }

}
