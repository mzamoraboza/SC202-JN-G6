/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202jng6.proyectofinalpoo;

/**
 *
 * @author mzamo
 */
public class Curso {
    private String nombreCurso;
    private String descripcion;
    private String horario;
    private int idCurso;
    
    public Curso(String nombreCurso, String descripcion, String horario){
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.horario = horario;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    
    public String getnombreCurso(){
        return nombreCurso;
    }
    
    public String getdescripcion(){
        return descripcion;
    }
    
    public String gethorario(){
        return horario;
    }
    
    public void setnombreCurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }
    
    public void setdescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public void sethorario(String horario){
        this.horario = horario;
    }

    public void mostrarCurso() {
        JOptionPane.showMessageDialog(null, 
        "Curso: " + nombreCurso + 
        "\nDescripción: " + descripcion + 
        "\nHorario: " + horario);
    }
}
