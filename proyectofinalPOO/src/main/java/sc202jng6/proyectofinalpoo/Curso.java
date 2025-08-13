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
    private String nombreCurso;
    private int codigoCurso;
    private String horarioCurso;

    public Curso(int codigoCurso, String nombreCurso, String horarioCurso){
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.horarioCurso = horarioCurso;
    }

    public String getNombreCurso() { return nombreCurso; }
    public int getCodigoCurso() { return codigoCurso; }
    public String getHorarioCurso() { return horarioCurso; }

    public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }
    public void setCodigoCurso(int codigoCurso) { this.codigoCurso = codigoCurso; }
    public void setHorarioCurso(String horarioCurso) { this.horarioCurso = horarioCurso; }

    public void mostrarInformacionCurso(){
        JOptionPane.showMessageDialog(null,
            "Nombre del Curso: " + nombreCurso +
            "\nCódigo del Curso: " + codigoCurso +
            "\nHorario: " + horarioCurso,
            "Información del Curso", JOptionPane.INFORMATION_MESSAGE);
    }
}