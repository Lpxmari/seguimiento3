package co.edu.uniquindio.poo;

public class Profesor extends Cliente {
    private String categoria;

    public Profesor(String cedula, String nombre, String apellido, String correoElectronico, String categoria) {
        super(cedula, nombre, apellido, correoElectronico);
        this.categoria = categoria;
    }

    @Override
    public double calcularDescuento() {
        // Descuento según la categoría del profesor
        if ("AUXILIAR".equals(categoria)) {
            return 0.03;
        } else if ("ASISTENTE".equals(categoria)) {
            return 0.05;
        } else if ("ASOCIADO".equals(categoria)) {
            return 0.10;
        } else if ("TITULAR".equals(categoria)) {
            return 0.16;
        } else {
            return 0.0; // En caso de categoría no válida
        }
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
    
