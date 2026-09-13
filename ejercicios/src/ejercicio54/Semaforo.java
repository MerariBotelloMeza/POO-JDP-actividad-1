package ejercicio54;

public class Semaforo {
    int color;

    public void cambioColor(){

        if (color == 1){
            System.out.println("Rojo");
        }else if (color == 2){
            System.out.println("Amarillo");
        }else if(color == 3){
            System.out.println("Verde");
        }else{
            System.out.println("te saliste del rango");
        }

    }

    public void mostrarSemaforo(){
        System.out.println("el semaforo esta en: ");
        cambioColor();
    }
}
