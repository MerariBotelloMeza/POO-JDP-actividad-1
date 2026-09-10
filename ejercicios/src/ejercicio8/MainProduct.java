package ejercicio8;

public class MainProduct {
    public static void main(String[] arg){

        Producto producto1= new Producto();
        Producto producto2= new Producto();
        Producto producto3= new Producto();

        producto1.nombreP="leche";
        producto1.precio= 1000;
        producto1.stock= 52;

        producto2.nombreP="mani";
        producto2.precio= 1200;
        producto2.stock= 100;

        producto3.nombreP="pan";
        producto3.precio= 2000;
        producto3.stock= 22;

        producto1.mostrarProducto();
        producto2.mostrarProducto();
        producto3.mostrarProducto();

    }
}
