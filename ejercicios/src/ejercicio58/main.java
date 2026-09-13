package ejercicio58;

import ejercicio32.Producto;

public class main {
    public static void main(String[] args){

        InventarioItem producto1 = new InventarioItem();

        producto1.nombre=" leches";
        producto1.cantidad=2;
        producto1.precioUnitario=2000;

        producto1.mostrarInfo();
    }
}
