package ejercicio11;

public class Vehiculo {
    String marca;
    String modelo;
    double velocidadActual;

    //metodo
    public void mostrarEstado(){
        System.out.println("Marca: " + marca);
        System.out.println("modelo: "+ modelo);
        System.out.println("Velocida Actual: "+ velocidadActual);
    }

    // metodo aceleral

    public void acelerar(double velocidadActual){
        velocidadActual = velocidadActual + 10;

    }

}
