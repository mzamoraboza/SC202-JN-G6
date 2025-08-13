package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;

public class GestionCurso {
    Curso[] cursos = new Curso[15];
    int contador = 0;

    public GestionCurso() {

        cursos[contador++] = new Curso(1, "Introducción a Java", "Lunes de 18:00 a 21:00");
        cursos[contador++] = new Curso(2, "Programación en Python", "Martes de 17:00 a 20:00");
        cursos[contador++] = new Curso(3, "Desarrollo Web con HTML y CSS", "Miércoles de 18:00 a 21:00");
        cursos[contador++] = new Curso(4, "Bases de Datos con MySQL", "Jueves de 17:00 a 20:00");
        cursos[contador++] = new Curso(5, "JavaScript Interactivo", "Viernes de 18:00 a 21:00");
        cursos[contador++] = new Curso(6, "Diseño Gráfico con Canva", "Sábado de 09:00 a 12:00");
        cursos[contador++] = new Curso(7, "Linux y Scripting Básico", "Lunes de 09:00 a 12:00");
        cursos[contador++] = new Curso(8, "Automatización de Procesos", "Martes de 18:00 a 21:00");
        cursos[contador++] = new Curso(9, "Branding y Comunicación Visual", "Miércoles de 17:00 a 20:00");
        cursos[contador++] = new Curso(10, "Creación de Materiales Didácticos", "Jueves de 09:00 a 12:00");
    }
    public void crearCurso(){
        int codigoCurso = Integer.parseInt(JOptionPane.showInputDialog("Código del Curso"));
        String nombreCurso = JOptionPane.showInputDialog("Nombre del Curso");
        String horarioCurso = JOptionPane.showInputDialog("Horario del Curso");
        
        cursos[contador++] = new Curso(codigoCurso, nombreCurso, horarioCurso);
    }
    public void mostrarCursos(){
        StringBuilder sb = new StringBuilder();
        for (Curso curso : cursos) {
            if (curso != null) {
                sb.append(curso.toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Cursos", JOptionPane.INFORMATION_MESSAGE); 
    }

}
