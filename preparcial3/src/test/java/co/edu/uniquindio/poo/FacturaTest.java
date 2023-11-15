package co.edu.uniquindio.poo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FacturaTest {

    @Test
    public void testCalcularPrecioTotal() {
        // Crear un estudiante con 3 semestres cursados
        Estudiante estudiante = new Estudiante("12345", "Juan", "Pérez", "juan@example.com", 3);

        // Crear una factura para el estudiante
        Factura factura = new Factura(estudiante);

        // Agregar productos a la factura
        Producto dulce = new Dulces("Chocolate", 10.0, 60);
        Producto bebida = new BebidaAzucarada("Refresco", 5.0, 40);
        Producto pan = new Panaderia("Pan blanco", 2.0, true);
        Producto fruta = new Frutas("Manzanas", 3.0, 5);

        factura.agregarProducto(dulce);
        factura.agregarProducto(bebida);
        factura.agregarProducto(pan);
        factura.agregarProducto(fruta);

        // Calcular el precio total con descuento de estudiante
        double precioTotalEsperado = (10.0 * 1.21) + (5.0 * 1.27) + (2.36) + (2.775 * 0.99); 
        // (precio de dulce con impuestos) + (precio de bebida con impuestos) + (precio de pan con impuestos) + (precio de fruta con impuestos y descuento de estudiante)

        assertEquals(precioTotalEsperado, factura.calcularPrecioTotal(), 0.01); // Comprobar que el resultado es igual al valor esperado con un margen de error de 0.01
    }
}


