package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;
/**
 *
 * @author mzamo
 */
public class Asistencia {
    // Atributos de la clase Asistencia
    private final String estudiante;
    private final String curso;
    private final String fecha;

    // Constructor
    public Asistencia(String estudiante, String curso, String fecha) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.fecha = fecha;
    }

    // Métodos para gestionar asistencia
    public void registrarAsistencia() {
        // Implementación del registro de asistencia del estudiante al curso
        JOptionPane.showMessageDialog(null, "Asistencia registrada:\nEstudiante: " + estudiante + "\nCurso: " 
        + curso + "\nFecha: " + fecha, "Registro de Asistencia", JOptionPane.INFORMATION_MESSAGE);


    }

    public String getEstudiante() {
        return estudiante;
    }

    public String getCurso() {
        return curso;
    }

    public String getFecha() {
        return fecha;
    }

}
