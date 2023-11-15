package co.edu.uniquindio.poo;

public class Estudiante extends Cliente {
    private int semestre;
    
    public Estudiante(String cedula, String nombre, String apellido, String correoElectronico, int semestre) {
        super(cedula, nombre, apellido, correoElectronico);
        this.semestre = semestre;
    }

    @Override
    public double calcularDescuento() {
        // Descuento de 1.2% por cada semestre
        return semestre * 0.012;
    }
    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}
