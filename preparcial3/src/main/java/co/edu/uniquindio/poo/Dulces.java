package co.edu.uniquindio.poo;

public class Dulces extends Producto {
    private double contenidoAzucar; // Contenido de azúcar en porcentaje

    public Dulces(String nombre, double valor, double contenidoAzucar) {
        super(nombre, valor);
        this.contenidoAzucar = contenidoAzucar;
    }

    @Override
    public double calcularPrecio() {
        double impuestoBase = 0.1; // Impuesto base para dulces

        double precio = getValor() * (1 + impuestoBase);

        if (contenidoAzucar > 50) {
            double impuestoAdicional = 0.1;
            precio *= (1 + impuestoAdicional);
        }

        return precio;
    }
}

