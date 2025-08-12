package sc202jng6.proyectofinalpoo;

import javax.swing.JOptionPane;

public class GestionEstudiante {
    
    // Atributos de la gestión del estudiantes
    Estudiante[] estudiantes = new Estudiante[100]; // Array para almacenar estudiantes
    int contador = 0; // Contador para el número de estudiantes
    // Método para agregar un estudiante
    public void agregarEstudiante(Estudiante estudiante) { // Método para agregar un estudiante al arreglo
        if (contador < estudiantes.length) {
            estudiantes[contador] = estudiante;
            contador++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más estudiantes.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public GestionEstudiante() { // Constructor para inicializar algunos estudiantes
        estudiantes[contador++] = new Estudiante(1, "Juan Pérez", "jperez@estudiantegrupo6.com", "estudiante123");
        estudiantes[contador++] = new Estudiante(2, "Ana Gómez", "agomez@estudiantegrupo6.com", "estudiante123");
        estudiantes[contador++] = new Estudiante(3, "Luis Fernández", "lfernandez@estudiantesgrupo6.com", "estudiante123");
        estudiantes[contador++] = new Estudiante(4, "María López", "mlopez@estudiantesgrupo6.com", "estudiante123");
}
    public void mostrarEstudiantes() { // Método para mostrar la información de todos los estudiantes
        String informacionEstudiantes = "Estudiantes:\n";
        informacionEstudiantes += "ID\tNombre\tCorreo\n";
        for (int i = 0; i < contador; i++) {
            informacionEstudiantes += estudiantes[i].getId() + "\t" +
                    estudiantes[i].getNombre() + "\t" + estudiantes[i].getCorreo() + "\n";
        }
        JOptionPane.showMessageDialog(null, informacionEstudiantes, "Lista de Estudiantes",
                JOptionPane.INFORMATION_MESSAGE);
    }
    

}