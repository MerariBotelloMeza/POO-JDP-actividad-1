package ejercicio7;

public class mainvehi {
    public static void main(String[] args){

        //Objetos 1
        Vehiculo vehiculo1= new Vehiculo();
        //objeto 2
        Vehiculo vehiculo2= new Vehiculo();

        vehiculo1.marca = "suzuki";
        vehiculo1.modelo = "S-Cross";
        vehiculo1.velocidadActual = 80;

        vehiculo2.marca = "Nissan";
        vehiculo2.modelo = "Kicks";
        vehiculo2.velocidadActual = 100;

        vehiculo1.mostrarEstado();
        vehiculo2.mostrarEstado();

    }
}
