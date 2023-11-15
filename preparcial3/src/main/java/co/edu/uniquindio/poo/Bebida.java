package co.edu.uniquindio.poo;

public class Bebida extends Producto {
    protected String tipo; // Tipo de bebida: agua, azucarada, alcoholica
    protected double contenidoAzucar;
    protected double contenidoAlcohol;

    public Bebida(String nombre, double valor, String tipo, double contenidoAzucar, double contenidoAlcohol) {
        super(nombre, valor);
        this.tipo = tipo;
        this.contenidoAzucar = contenidoAzucar;
        this.contenidoAlcohol = contenidoAlcohol;
    }

    @Override
    public double calcularPrecio() {
        double impuestoBase = 0.0; // Impuesto base para bebidas

        if (tipo.equals("agua")) {
            // No tiene impuestos adicionales
            return getValor();
        } else if (tipo.equals("azucarada")) {
            impuestoBase = 0.05; // Impuesto base para bebidas azucaradas

            if (contenidoAzucar > 35) {
                double impuestoAdicional = 0.20;
                return getValor() * (1 + impuestoBase + impuestoAdicional);
            }
        } else if (tipo.equals("alcoholica")) {
            if (contenidoAlcohol <= 50) {
                return getValor() * (1 + (contenidoAlcohol * 0.02));
            } else {
                return (getValor() * 1.3) * (1 + (0.3 * contenidoAlcohol));
            }
        }
        return getValor() * (1 + impuestoBase);
    }
}