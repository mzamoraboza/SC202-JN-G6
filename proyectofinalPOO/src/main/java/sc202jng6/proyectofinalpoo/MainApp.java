package sc202jng6.proyectofinalpoo;

public class MainApp {

    public static void main(String[] args) {
        // Crear el sistema
        SistemaGestion sistema = new SistemaGestion();

        // Crear cursos de prueba (si quieres)
        Curso curso1 = new Curso("Programación Java", "Curso introductorio", "Lunes 4pm");
        curso1.setIdCurso(1);
        sistema.agregarCurso(curso1);

        // Crear un estudiante que tenga acceso al sistema
        Estudiante estudiante = new Estudiante("Augusto", "augusto@email.com", "clave123", 101, sistema);

        // Llamar el método para ver los cursos
        estudiante.verCatalogoCursos();
    }
}
