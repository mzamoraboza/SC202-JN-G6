package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;

public class GestionMatricula {
    private Matricula[] matriculas;
    private int contador;

    public GestionMatricula() {
        matriculas = new Matricula[100]; // Capacidad inicial
        contador = 0;
    }

    public void agregarMatricula(Matricula matricula) {
        if (contador < matriculas.length) {
            matriculas[contador++] = matricula;
        } else {
                JOptionPane.showMessageDialog(null, "No se pueden agregar más matrículas.", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarMatriculas() {
        StringBuilder informacionMatriculas = new StringBuilder("Lista de Matrículas:\n");
        for (int i = 0; i < contador; i++) {
            informacionMatriculas.append("ID: ").append(matriculas[i].getId())
                    .append(", Estudiante ID: ").append(matriculas[i].getIdEstudiante())
                    .append(", Curso ID: ").append(matriculas[i].getIdCurso()).append("\n");
        }
        JOptionPane.showMessageDialog(null, informacionMatriculas.toString(), "Lista de Matrículas",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
