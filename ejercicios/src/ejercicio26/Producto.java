package ejercicio26;

public class Producto {
    String nombreP;
    double precio;
    int stock;

    Producto(){
        nombreP = "leche";
        precio = 2500;
        stock=10;
    }

    Producto (String nombreP,double precio, int stock){
        this.nombreP = nombreP;
        this.precio= precio;
        this.stock= stock;
    }

    public static void main (String[] args ){

        Producto producto1 = new Producto();

        Producto producto2 = new Producto("limones",200,1000);
    }
}
