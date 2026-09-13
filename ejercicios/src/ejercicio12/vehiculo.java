package ejercicio12;

public class vehiculo {
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
        //metodo frenar
        public void  frenar(double velocidadActual) {
            if (velocidadActual >= 10) {
                velocidadActual = velocidadActual - 10;

            } else{
                velocidadActual =0;
            }
        }

    }
}
