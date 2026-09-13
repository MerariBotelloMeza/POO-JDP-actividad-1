package ejercicio58;

public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public double valorTotal(){
        return (precioUnitario * cantidad);
    }

    public void mostrarInfo(){
        System.out.println("el precio total de las"+ nombre+" es: "+ valorTotal());

    }
}
