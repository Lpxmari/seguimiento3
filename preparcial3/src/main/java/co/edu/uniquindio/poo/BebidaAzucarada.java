package co.edu.uniquindio.poo;

public class BebidaAzucarada extends Bebida {
    public BebidaAzucarada(String nombre, double valor, double contenidoAzucar) {
        super(nombre, valor, "azucarada", contenidoAzucar, 0); // Llamada al constructor de la clase base
        this.contenidoAzucar = contenidoAzucar;
    }
    @Override
    public double calcularPrecio() {
        double impuestoBase = 0.05; // Impuesto base para bebidas azucaradas

        if (contenidoAzucar > 35) {
            double impuestoAdicional = 0.20;
            return getValor() * (1 + impuestoBase + impuestoAdicional);
        }

        return getValor() * (1 + impuestoBase);
    }
}

