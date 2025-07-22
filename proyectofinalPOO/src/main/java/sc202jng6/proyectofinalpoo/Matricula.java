/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202jng6.proyectofinalpoo;

/**
 *
 * @author mzamo
 */
public class Matricula {
    private int id;
    private int idEstudiante;
    private int idCurso;
    // Constructor de la clase Matricula
    public Matricula() {
        // Constructor vacío
    }

    public Matricula(int id, int idEstudiante, int idCurso) {
        this.id            = id;
        this.idEstudiante  = idEstudiante;
        this.idCurso       = idCurso;
    }
    public int getId() {
        return id;
    }
    public int getIdEstudiante() {
        return idEstudiante;
    }
    public int getIdCurso() {
        return idCurso;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    

    

   
}
