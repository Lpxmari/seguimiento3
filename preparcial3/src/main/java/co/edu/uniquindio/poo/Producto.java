package co.edu.uniquindio.poo;


public abstract class Producto {
    private String nombre;
    private double valor;

    public Producto(String nombre, Double valor){
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre(){
        return nombre;
    }
    public double getValor(){
        return valor;
    }

    public abstract double calcularPrecio(); // Metodo abstracto
}
