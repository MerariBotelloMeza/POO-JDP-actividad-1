package ejercicio31;

public class Producto {
    String nombreP;
    double precio;
    int stock;

    Producto (){
        nombreP= "Poni";
        precio=3000;
        stock= 100;
    }

    public static Producto crearProductoBasico(){
        return new Producto();
    }
}
