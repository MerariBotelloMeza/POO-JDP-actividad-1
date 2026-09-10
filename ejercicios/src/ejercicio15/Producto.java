package ejercicio15;

public class Producto {
    String nombreP;
    double precio;
    int stock;

    // metodo vender
    public void vender(int cantidad){
        if (stock>= cantidad) {
            stock = stock - cantidad;
        }
        else {
            System.out.println("No hay suficientes productos para la venta");
        }
    }
}
