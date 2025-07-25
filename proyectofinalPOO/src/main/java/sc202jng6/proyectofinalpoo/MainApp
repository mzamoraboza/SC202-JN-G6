/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202jng6.proyectofinalpoo;

/**
 *
 * @author acgb1
 */

public class MainApp {

    public static void main(String[] args) {
        // Crear el sistema de gestión
        SistemaGestion sistema = new SistemaGestion();

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
