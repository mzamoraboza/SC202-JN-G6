/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sc202jng6.proyectofinalpoo;

/**
 *
 * @author mzamo
 */
public class ProyectofinalPOO {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Gestión de Cursos", "Sistema de Gestión", JOptionPane.INFORMATION_MESSAGE);
        SistemaGestion sistema = new SistemaGestion();
        sistema.iniciar();

                // Crear curso de prueba
        Curso curso1 = new Curso("Programación Java", "Curso introductorio", "Lunes 4pm");
        curso1.setIdCurso(1);
        sistema.agregarCurso(curso1);

        // Crear estudiante
        Estudiante estudiante = new Estudiante("Augusto", "augusto@email.com", "clave123", 101, sistema);

        // Mostrar el catálogo de cursos
        estudiante.verCatalogoCursos();

        
    }
}
