package co.edu.uniquindio.poo;

public class Frutas extends Producto {
    private double pesoEnKilos;

    public Frutas(String nombre, double valor, double pesoEnKilos) {
        super(nombre, valor);
        this.pesoEnKilos = pesoEnKilos;
    }

    @Override
    public double calcularPrecio() {
        double impuesto = 0.07;

        if (pesoEnKilos > 3) {
            impuesto -= (pesoEnKilos - 3) * 0.01;
            if (impuesto < 0) {
                impuesto = 0;
            }
        }

        return getValor() * (1 + impuesto);
    }
}