/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;

/**
 *
 * @author mzamo
 */
public class Curso {
    public String nombreCurso;
    public String codigoCurso;
    public String descripcionCurso;
    public String horarioCurso;

    public Curso(String nombreCurso, String codigoCurso, String descripcionCurso, String horarioCurso) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.descripcionCurso = descripcionCurso;
        this.horarioCurso = horarioCurso;
    }
    public String getNombreCurso() { return nombreCurso; }
    public String getCodigoCurso() { return codigoCurso; }
    public String getDescripcionCurso() { return descripcionCurso; }
    public String getHorarioCurso() { return horarioCurso; }
    public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }
    public void setCodigoCurso(String codigoCurso) { this.codigoCurso = codigoCurso; }  
    public void setDescripcionCurso(String descripcionCurso) { this.descripcionCurso = descripcionCurso; }
    public void setHorarioCurso(String horarioCurso) { this.horarioCurso = horarioCurso; }

    public void mostrarInformacionCurso(){
        JOptionPane.showMessageDialog(null,
                "Nombre del Curso: " + nombreCurso + "\nCódigo del Curso: " + codigoCurso + "\nDescripción: " + descripcionCurso + "\nHorario: " + horarioCurso,
                "Información del Curso", JOptionPane.INFORMATION_MESSAGE);      
    }
}


      
