package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;

/**
 *
 * @author mzamo
 */
public class SistemaGestion {
    private Usuario[] usuarios = new Usuario[100];
    private Matricula[] matriculas = new Matricula[100];
    private Curso[] cursos = new Curso[100];
    private int cantidadUsuarios = 0;
    private int cantidadMatricula = 0;
    private int cantidadCursos = 0;

    public void menuAdministrador() {
        // Implementación del menú para el administrador
        String menu = "";
        menu += "1. Agregar Usuario\n";
        menu += "2. Agregar Curso\n";
        menu += "3. Agregar Matrícula\n";
        menu += "4. Ver Usuarios\n";
        menu += "5. Ver Cursos\n";
        menu += "6. Ver Matrículas\n";
        menu += "7. Salir\n";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione una opción:\n" + menu + "Ingrese su opción:", JOptionPane.INFORMATION_MESSAGE));
        // Procesar la opción seleccionada
        if (opcion < 1 || opcion > 7) {
            JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            return;
        }

        switch (opcion) {
            case 1 -> {
                // Solicitar datos del usuario
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
                String correo = JOptionPane.showInputDialog("Ingrese el correo del usuario:");
                String password = JOptionPane.showInputDialog("Ingrese la contraseña del usuario:");
                int id = cantidadUsuarios + 1; // Asignar un ID único al usuario
                Usuario nuevoUsuario = new Usuario(id, nombre, correo, password, RolUsuario.Administrador);
                agregarUsuario(nuevoUsuario);
                JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente: " + nuevoUsuario.getNombre(),
                        "Usuario Agregado", JOptionPane.INFORMATION_MESSAGE);
                // Mostrar el usuario agregado
                JOptionPane.showMessageDialog(null, "Usuario: " + nuevoUsuario.getNombre() +
                        "\nCorreo: " + nuevoUsuario.getCorreo() +
                        "\nRol: " + nuevoUsuario.getRol(), "Detalles del Usuario", JOptionPane.INFORMATION_MESSAGE);
            }
            case 2 -> {
                // Solicitar datos del curso
                String nombreCurso = JOptionPane.showInputDialog("Ingrese el nombre del curso:");
                String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del curso:");
                String horario = JOptionPane.showInputDialog("Ingrese el horario del curso:");
                Curso nuevoCurso = new Curso(nombreCurso, descripcion, horario);
                nuevoCurso.setIdCurso(cantidadCursos + 1); // Asignar un ID único al curso
                agregarCurso(nuevoCurso);
                JOptionPane.showMessageDialog(null, "Curso agregado exitosamente: " + nuevoCurso.getnombreCurso(),
                        "Curso Agregado", JOptionPane.INFORMATION_MESSAGE);

            }
            case 3 -> {
                // Solicitar datos para la matrícula
                String idEstudianteStr = JOptionPane.showInputDialog("Ingrese el ID del estudiante:");
                String idCursoStr = JOptionPane.showInputDialog("Ingrese el ID del curso:");
                int idMatricula = cantidadMatricula + 1;
                int idEstudiante = Integer.parseInt(idEstudianteStr);
                int idCursoMatricula = Integer.parseInt(idCursoStr);
                Matricula nuevaMatricula = new Matricula(
                        idMatricula,
                        idEstudiante,
                        idCursoMatricula);
                agregarMatricula(nuevaMatricula);
            }
            case 4 -> verUsuarios(); // falta implementar el método verUsuarios

                static Usuario[] listaUsuarios = new Usuario[100];
                static int totalUsuarios = 0;
                
            case 5 -> verCursos(); // falta implementar el método verCursos
            case 6 -> verMatriculas();// falta implementar el método verMatriculas
            case 7 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
            default -> JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
        }
    }

    public void agregarUsuario(Usuario usuario) {
        if (cantidadUsuarios < usuarios.length) {
            usuarios[cantidadUsuarios++] = usuario;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más usuarios.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para agregar una matrícula al sistema
    public void agregarMatricula(Matricula matricula) {
        if (cantidadMatricula < matriculas.length) {
            matriculas[cantidadMatricula++] = matricula;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más matrículas.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para agregar un curso al sistema
    public void agregarCurso(Curso curso) {
        if (cantidadCursos < cursos.length) {
            cursos[cantidadCursos++] = curso;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más cursos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public SistemaGestion() {
        // Constructor de la clase SistemaGestion
        // Inicializa los arreglos de usuarios, matrículas y cursos
        this.usuarios = new Usuario[100];
        this.matriculas = new Matricula[100];
        this.cursos = new Curso[100];
        this.cantidadUsuarios = 0;
        this.cantidadMatricula = 0;
        this.cantidadCursos = 0;
    }

    // Método para mostrar el menú del administrador
    public void menuAdmin() {
        // Implementación del menú para el administrador
        String adminMenu = "";
        adminMenu += "1. Agregar Usuario\n";
        adminMenu += "2. Agregar Curso\n";
        adminMenu += "3. Agregar Matrícula\n";
        adminMenu += "4. Ver Usuarios\n";
        adminMenu += "5. Ver Cursos\n";
        adminMenu += "6. Ver Matrículas\n";
        adminMenu += "7. Salir\n";
        JOptionPane.showMessageDialog(null, adminMenu, "Menú Administrador", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para mostrar los usuarios registrados
    public void verUsuarios() {
        // Ver los usuarios registrados
    }

    // Método para mostrar los cursos registrados
    public void verCursos() {
        // Ver los cursos registrados

    }

    // Método para mostrar las matrículas registradas
    public void verMatriculas() {
        // ver las matrículas registradas
    }

    public void iniciar() {
        // Método para iniciar el sistema de gestión
        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Gestión de Cursos", "Sistema de Gestión",
                JOptionPane.INFORMATION_MESSAGE);
        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog("Seleccione una opción:\n1. Administrador\n2. Estudiante\n3. Salir"));
        switch (opcion) {
            case 1 -> menuAdministrador();

            case 2 -> {
                // Implementación del menú para el estudiante
                String menuEstudiante = "1. Inscribirse en un curso\n2. Ver cursos inscritos\n3. Registrar asistencia\n4. Salir";
                JOptionPane.showMessageDialog(null, menuEstudiante, "Menú Estudiante", JOptionPane.INFORMATION_MESSAGE);
                int opcionEstudiante = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:"));
                switch (opcionEstudiante) {
                    case 1 -> {
                        // inscripción a un curso
                    }
                    case 2 -> {
                        // ver los cursos inscritos
                    }
                    case 3 -> {
                        // Implementación para registrar asistencia
                    }
                    case 4 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    default -> JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                }

            }
            case 3 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
            default -> JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
        }
    }

    // Devuelve la cantidad de usuarios registrados
    public int getUsuarioCount() {
        return usuarioCount;
    }

    // Devuelve la cantidad de cursos registrados
    public int getCursoCount() {
        return cursoCount;
    }

    // Devuelve la cantidad de matrículas registradas
    public int getMatriculaCount() {
        return matriculaCount;
    }

} // public class SistemaGestion
