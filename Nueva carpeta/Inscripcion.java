package sc202jng6.proyectofinalpoo;

/**
 *
 * @author mzamo
 */
public class Inscripcion {
    private String estudiante;
    private String curso;
    private String fecha;

    public Inscripcion(String estudiante, String curso, String fecha) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.fecha = fecha;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

}