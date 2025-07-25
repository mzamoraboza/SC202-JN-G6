package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;

/**
 *
 * @author mzamo
 */
public class SistemaGestion {
    // Atributos del sistema de gestión
    private Curso[] cursos = new Curso[15];
    private int cursoCount = 0;
    // Atributos para gestionar usuarios, matrículas e inscripciones
    private Usuario[] usuarios = new Usuario[100];
    private int usuarioCount = 0;
    private Matricula[] matriculas = new Matricula[100];
    private int matriculaCount = 0;
    private Inscripcion[] inscripciones = new Inscripcion[100];
    private int inscripcionCount = 0;

    // Método para agregar un curso al sistema
    public void agregarCurso(Curso curso) {
        cursos[cursoCount++] = new Curso("Curso Java para principiantes", " Java para principiantes",
                "Lunes a Viernes 10:00 - 12:00");
        cursos[cursoCount++] = new Curso("Curso de Python avanzado", "Python avanzado",
                "Lunes a Viernes 14:00 - 16:00");
        cursos[cursoCount++] = new Curso("Curso de desarrollo web", "Desarrollo web", "Martes y Jueves 18:00 - 20:00");
        cursos[cursoCount++] = new Curso("Curso de bases de datos", "Bases de datos",
                "Miércoles y Viernes 16:00 - 18:00");
        cursos[cursoCount++] = new Curso("Curso de inteligencia artificial", "Inteligencia artificial",
                "Lunes, Miércoles y Viernes 19:00 - 21:00");
        cursos[cursoCount++] = new Curso("Curso de diseño gráfico", "Diseño gráfico", "Martes y Jueves 10:00 - 12:00");
        cursos[cursoCount++] = new Curso("Curso de marketing digital", "Marketing digital",
                "Lunes a Viernes 13:00 - 15:00");
        cursos[cursoCount++] = new Curso("Curso de ciberseguridad", "Ciberseguridad", "Martes y Jueves 20:00 - 22:00");
        cursos[cursoCount++] = new Curso("Curso de desarrollo móvil", "Desarrollo móvil",
                "Lunes, Miércoles y Viernes 17:00 - 19:00");
        cursos[cursoCount++] = new Curso("Curso de análisis de datos", "Análisis de datos",
                "Martes y Jueves 15:00 - 17:00");
        cursos[cursoCount++] = new Curso("Curso de programación de videojuegos", "Programación de videojuegos",
                "Lunes, Miércoles y Viernes 21:00 - 23:00");

    }

    // Método para listar los cursos disponibles
    public void listarCursos() {
        StringBuilder lista = new StringBuilder("Cursos disponibles:\n");
        for (int i = 0; i < cursoCount; i++) {
            Curso curso = cursos[i];
            lista.append("ID: ").append(curso.getIdCurso())
                    .append(", Nombre: ").append(curso.getnombreCurso())
                    .append(", Descripción: ").append(curso.getdescripcion())
                    .append(", Horario: ").append(curso.gethorario())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Cursos", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para agregar un usuario al sistema
    public void agregarUsuario(Usuario usuario) {
        usuarios[usuarioCount++] = new Usuario(1, "Juan Perez", "juanperez@usuario.com", "password123",
                RolUsuario.Estudiante);
        usuarios[usuarioCount++] = new Usuario(2, "Maria Lopez", "marial@usuario.com", "password456",
                RolUsuario.Estudiante);
        usuarios[usuarioCount++] = new Usuario(3, "Carlos Gomez", "carlosgomez@usuario.com", "password789",
                RolUsuario.Estudiante);
    }

    // Método para listar los usuarios registrados
    public void listarUsuarios() {
        StringBuilder lista = new StringBuilder("Usuarios registrados:\n");
        for (int i = 0; i < usuarioCount; i++) {
            Usuario usuario = usuarios[i];
            lista.append("ID: ").append(usuario.getId())
                    .append(", Nombre: ").append(usuario.getNombre())
                    .append(", Correo: ").append(usuario.getCorreo())
                    .append(", Rol: ").append(usuario.getRol())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Usuarios", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para agregar una matrícula al sistema
    public void agregarMatricula(Matricula matricula) {
        matriculas[matriculaCount++] = new Matricula(1, 1, 1);
        matriculas[matriculaCount++] = new Matricula(2, 2, 2);
        matriculas[matriculaCount++] = new Matricula(3, 3, 3);
    }

    // Método para listar las matrículas registradas
    public void listarMatriculas() {
        StringBuilder lista = new StringBuilder("Matrículas registradas:\n");
        for (int i = 0; i < matriculaCount; i++) {
            Matricula matricula = matriculas[i];
            lista.append("ID Matrícula: ").append(matricula.getId())
                    .append(", Estudiante ID: ").append(matricula.getIdEstudiante())
                    .append(", Curso ID: ").append(matricula.getIdCurso())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Matrículas", JOptionPane.INFORMATION_MESSAGE);
    }

    // Sistema de gestión en mantenimiento 25/07/2025
    /*
     * private Usuario[] usuarios = new Usuario[100];
     * private Matricula[] matriculas = new Matricula[100];
     * private Curso[] cursos = new Curso[100];
     * private int cantidadUsuarios = 0;
     * private int cantidadMatricula = 0;
     * private int cantidadCursos = 0;
     * 
     * public void menuAdministrador() {
     * Implementación del menú para el administrador
     * String menu = "";
     * menu += "1. Agregar Usuario\n";
     * menu += "2. Agregar Curso\n";
     * menu += "3. Agregar Matrícula\n";
     * menu += "4. Ver Usuarios\n";
     * menu += "5. Ver Cursos\n";
     * menu += "6. Ver Matrículas\n";
     * menu += "7. Salir\n";
     * 
     * int opcion = Integer.parseInt(JOptionPane.showInputDialog(
     * "Seleccione una opción:\n" + menu + "Ingrese su opción:",
     * JOptionPane.INFORMATION_MESSAGE));
     * Procesar la opción seleccionada
     * if (opcion < 1 || opcion > 7) {
     * JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
     * return;
     * }
     * 
     * switch (opcion) {
     * case 1 -> {
     * Solicitar datos del usuario
     * String nombre =
     * JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
     * String correo =
     * JOptionPane.showInputDialog("Ingrese el correo del usuario:");
     * String password =
     * JOptionPane.showInputDialog("Ingrese la contraseña del usuario:");
     * int id = cantidadUsuarios + 1; // Asignar un ID único al usuario
     * Usuario nuevoUsuario = new Usuario(id, nombre, correo, password,
     * RolUsuario.Administrador);
     * agregarUsuario(nuevoUsuario);
     * JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente: " +
     * nuevoUsuario.getNombre(),
     * "Usuario Agregado", JOptionPane.INFORMATION_MESSAGE);
     * Mostrar el usuario agregado
     * JOptionPane.showMessageDialog(null, "Usuario: " + nuevoUsuario.getNombre() +
     * "\nCorreo: " + nuevoUsuario.getCorreo() +
     * "\nRol: " + nuevoUsuario.getRol(), "Detalles del Usuario",
     * JOptionPane.INFORMATION_MESSAGE);
     * }
     * case 2 -> {
     * Solicitar datos del curso
     * String nombreCurso =
     * JOptionPane.showInputDialog("Ingrese el nombre del curso:");
     * String descripcion =
     * JOptionPane.showInputDialog("Ingrese la descripción del curso:");
     * String horario =
     * JOptionPane.showInputDialog("Ingrese el horario del curso:");
     * Curso nuevoCurso = new Curso(nombreCurso, descripcion, horario);
     * nuevoCurso.setIdCurso(cantidadCursos + 1); // Asignar un ID único al curso
     * agregarCurso(nuevoCurso);
     * JOptionPane.showMessageDialog(null, "Curso agregado exitosamente: " +
     * nuevoCurso.getnombreCurso(),
     * "Curso Agregado", JOptionPane.INFORMATION_MESSAGE);
     * 
     * }
     * case 3 -> {
     * Solicitar datos para la matrícula
     * String idEstudianteStr =
     * JOptionPane.showInputDialog("Ingrese el ID del estudiante:");
     * String idCursoStr = JOptionPane.showInputDialog("Ingrese el ID del curso:");
     * int idMatricula = cantidadMatricula + 1;
     * int idEstudiante = Integer.parseInt(idEstudianteStr);
     * int idCursoMatricula = Integer.parseInt(idCursoStr);
     * Matricula nuevaMatricula = new Matricula(
     * idMatricula,
     * idEstudiante,
     * idCursoMatricula);
     * agregarMatricula(nuevaMatricula);
     * }
     * case 4 -> verUsuarios();
     * 
     * public void verUsuarios() {
     * if (usuarioCount == 0) {
     * JOptionPane.showMessageDialog(null, "No hay usuarios registrados.",
     * "Usuarios", JOptionPane.INFORMATION_MESSAGE);
     * return;
     * }
     * 
     * StringBuilder lista = new StringBuilder("Usuarios registrados:\n");
     * for (int i = 0; i < usuarioCount; i++) {
     * Usuario u = usuarios[i];
     * lista.append("ID: ").append(u.getInt())
     * .append(", Nombre: ").append(u.getNombre())
     * .append(", Correo: ").append(u.getCorreo())
     * .append(", Rol: ").append(u.getRol())
     * .append("\n");
     * }
     * 
     * JOptionPane.showMessageDialog(null, lista.toString(), "Lista de usuarios",
     * JOptionPane.INFORMATION_MESSAGE);
     * }
     * 
     * case 5 -> verCursos();
     * public void verCursos() {
     * if (cursoCount == 0) {
     * JOptionPane.showMessageDialog(null, "No hay cursos registrados", "Cursos",
     * JOptionPane.INFORMATION_MESSAGE);
     * return;
     * }
     * 
     * String lista = new String("Cursos registrados:\n");
     * for (int i = 0; i < cursoCount; i++) {
     * Curso c = cursos[i];
     * lista.append("ID: ").append(c.getIdCurso())
     * .append(", Nombre: ").append(c.getnombreCurso())
     * .append(", Descripción: ").append(c.getdescripcion())
     * .append(", Horario: ").append(c.gethorario())
     * .append("\n");
     * }
     * JOptionPane.showMessageDialog(null, lista.toString(), "Lista de cursos",
     * JOptionPane.INFORMATION_MESSAGE);
     * }
     * 
     * case 6 -> verMatriculas();
     * public void verMatriculas() {
     * if (matriculaCount == 0) {
     * JOptionPane.showMessageDialog(null, "No hay matrículas registradas.",
     * "Matrículas", JOptionPane.INFORMATION_MESSAGE);
     * return;
     * }
     * 
     * String lista = new String("Matrículas registradas:\n");
     * for (int i = 0; i < matriculaCount; i++) {
     * Matricula m = matriculas[i];
     * 
     * String nombreEstudiante = "Desconocido";
     * for (int j = 0; j < usuarioCount; j++) {
     * if (usuarios[j].getInt() == m.getIdEstudiante()) {
     * nombreEstudiante = usuarios[j].getNombre();
     * break;
     * }
     * }
     * 
     * String nombreCurso = "Desconocido";
     * for (int k = 0; k < cursoCount; k++) {
     * if (cursos[k].getIdCurso() == m.getIdCurso()) {
     * nombreCurso = cursos[k].getnombreCurso();
     * break;
     * }
     * }
     * 
     * lista.append("ID Matrícula: ").append(m.getId())
     * .append(", Estudiante: ").append(nombreEstudiante)
     * .append(", Curso: ").append(nombreCurso)
     * .append("\n");
     * }
     * 
     * JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Matrículas",
     * JOptionPane.INFORMATION_MESSAGE);
     * }
     * 
     * case 7 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
     * default -> JOptionPane.showMessageDialog(null,
     * "Opción no válida. Intente de nuevo.");
     * }
     * }
     * 
     * public void agregarUsuario(Usuario usuario) {
     * if (cantidadUsuarios < usuarios.length) {
     * usuarios[cantidadUsuarios++] = usuario;
     * } else {
     * JOptionPane.showMessageDialog(null, "No se pueden agregar más usuarios.",
     * "Error",
     * JOptionPane.ERROR_MESSAGE);
     * }
     * }
     * 
     * Método para agregar una matrícula al sistema
     * public void agregarMatricula(Matricula matricula) {
     * if (cantidadMatricula < matriculas.length) {
     * matriculas[cantidadMatricula++] = matricula;
     * } else {
     * JOptionPane.showMessageDialog(null, "No se pueden agregar más matrículas.",
     * "Error",
     * JOptionPane.ERROR_MESSAGE);
     * }
     * }
     * 
     * Método para agregar un curso al sistema
     * public void agregarCurso(Curso curso) {
     * if (cantidadCursos < cursos.length) {
     * cursos[cantidadCursos++] = curso;
     * } else {
     * JOptionPane.showMessageDialog(null, "No se pueden agregar más cursos.",
     * "Error", JOptionPane.ERROR_MESSAGE);
     * }
     * }
     * 
     * public SistemaGestion() {
     * Constructor de la clase SistemaGestion
     * Inicializa los arreglos de usuarios, matrículas y cursos
     * this.usuarios = new Usuario[100];
     * this.matriculas = new Matricula[100];
     * this.cursos = new Curso[100];
     * this.cantidadUsuarios = 0;
     * this.cantidadMatricula = 0;
     * this.cantidadCursos = 0;
     * }
     * 
     * Método para mostrar el menú del administrador
     * public void menuAdmin() {
     * Implementación del menú para el administrador
     * String adminMenu = "";
     * adminMenu += "1. Agregar Usuario\n";
     * adminMenu += "2. Agregar Curso\n";
     * adminMenu += "3. Agregar Matrícula\n";
     * adminMenu += "4. Ver Usuarios\n";
     * adminMenu += "5. Ver Cursos\n";
     * adminMenu += "6. Ver Matrículas\n";
     * adminMenu += "7. Salir\n";
     * JOptionPane.showMessageDialog(null, adminMenu, "Menú Administrador",
     * JOptionPane.INFORMATION_MESSAGE);
     * }
     * 
     * Método para mostrar los usuarios registrados
     * public void verUsuarios() {
     * Ver los usuarios registrados
     * }
     * 
     * Método para mostrar los cursos registrados
     * public void verCursos() {
     * Ver los cursos registrados
     * 
     * }
     * 
     * Método para mostrar las matrículas registradas
     * public void verMatriculas() {
     * ver las matrículas registradas
     * }
     * 
     * public void iniciar() {
     * Método para iniciar el sistema de gestión
     * JOptionPane.showMessageDialog(null,
     * "Bienvenido al Sistema de Gestión de Cursos", "Sistema de Gestión",
     * JOptionPane.INFORMATION_MESSAGE);
     * int opcion = Integer.parseInt(
     * JOptionPane.
     * showInputDialog("Seleccione una opción:\n1. Administrador\n2. Estudiante\n3. Salir"
     * ));
     * switch (opcion) {
     * case 1 -> menuAdministrador();
     * 
     * case 2 -> {
     * Implementación del menú para el estudiante
     * String menuEstudiante =
     * "1. Inscribirse en un curso\n2. Ver cursos inscritos\n3. Registrar asistencia\n4. Salir"
     * ;
     * JOptionPane.showMessageDialog(null, menuEstudiante, "Menú Estudiante",
     * JOptionPane.INFORMATION_MESSAGE);
     * int opcionEstudiante =
     * Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:"));
     * switch (opcionEstudiante) {
     * case 1 -> {
     * inscripción a un curso
     * }
     * case 2 -> {
     * ver los cursos inscritos
     * }
     * case 3 -> {
     * Implementación para registrar asistencia
     * }
     * case 4 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
     * default -> JOptionPane.showMessageDialog(null,
     * "Opción no válida. Intente de nuevo.");
     * }
     * 
     * }
     * case 3 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
     * default -> JOptionPane.showMessageDialog(null,
     * "Opción no válida. Intente de nuevo.");
     * }
     * }
     * 
     * Devuelve la cantidad de usuarios registrados
     * public int getUsuarioCount() {
     * return usuarioCount;
     * }
     * 
     * Devuelve la cantidad de cursos registrados
     * public int getCursoCount() {
     * return cursoCount;
     * }
     * 
     * Devuelve la cantidad de matrículas registradas
     * public int getMatriculaCount() {
     * return matriculaCount;
     * }
     */

} // public class SistemaGestion
