package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;
/**
 *
 * @author Manuel Zamora Boza
 */
public class ProyectofinalPOO {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Gestión de Cursos",
                "Sistema de Gestión de Cursos", JOptionPane.INFORMATION_MESSAGE);

        // Crear instancias de las gestiones
        GestionAdministrador gestionAdministrador = new GestionAdministrador();
        GestionCurso gestionCurso = new GestionCurso();
        GestionEstudiante gestionEstudiante = new GestionEstudiante();
        GestionMatricula gestionMatricula = new GestionMatricula(gestionCurso); // pasamos cursos

        while (true) {
            String menu = "Seleccione una opción:\n"
                    + "1. Administradores\n"
                    + "2. Cursos\n"
                    + "3. Estudiantes\n"
                    + "4. Matrículas\n"
                    + "5. Salir";

            String opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    gestionAdministrador.menuAdministradores();
                    break;
                case "2":
                    gestionCurso.menuCursos();
                    break;
                case "3":
                    gestionEstudiante.menuEstudiantes();
                    break;
                case "4":
                    gestionMatricula.menuGestionarMatriculas();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...",
                            "Sistema de Matricula Cursos SC202-JN-G6", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo.");
            }
        }
    }
}
