package co.edu.uniquindio.poo;

public class Panaderia extends Producto {
    private boolean contieneConservantes;

    public Panaderia(String nombre, double valor, boolean contieneConservantes) {
        super(nombre, valor);
        this.contieneConservantes = contieneConservantes;
    }

    @Override
    public double calcularPrecio() {
        double impuesto = 0.0;

        if (contieneConservantes) {
            impuesto = 0.18;
        }

        return getValor() * (1 + impuesto);
    }
}
