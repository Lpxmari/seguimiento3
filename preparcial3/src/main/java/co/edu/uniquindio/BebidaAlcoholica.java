package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Bebida;

public class BebidaAlcoholica extends Bebida {
    public BebidaAlcoholica(String nombre, double valor, double contenidoAlcohol) {
        super(nombre, valor, "alcoholica", contenidoAlcohol, 0); // Llamada al constructor de la clase base
    }

    @Override
    public double calcularPrecio() {
        if (contenidoAlcohol <= 50) {
            return getValor() * (1 + (contenidoAlcohol * 0.02));
        } 
        else {
            // Fórmula específica para bebidas importadas
            return (getValor() * 1.3) * (1 + (0.3 * contenidoAlcohol));
        }
    }
}




