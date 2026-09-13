package ejercicio8;

public class Producto {
    String nombreP;
    double precio;
    int stock;

    //metodo
    public void mostrarProducto() {
        System.out.println("nombre del producto:" + nombreP);
        System.out.println("precio: " + precio);
        System.out.println("el stock: " + stock);
    }
}