package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;

        // Calcular el precio de cada producto y sumarlo al precio total
        for (Producto producto : productos) {
            precioTotal += producto.calcularPrecio();
        }

        // Aplicar descuento según el tipo de cliente
        double descuentoCliente = cliente.calcularDescuento();
        precioTotal *= (1 - descuentoCliente);

        return precioTotal;
    }
}

