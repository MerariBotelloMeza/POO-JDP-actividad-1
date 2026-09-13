package ejercicio16;

public class Producto {
    String nombreP;
    double precio;
    int stock;

    //metodo reabastecer
    public void reabastecer(int cantidad){
        stock = stock+ cantidad;
    }

}
