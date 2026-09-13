package ejercicio36;

public class Puerta {
    String material;
    boolean abierta;

    public void abrir(){
        abierta = true;
    }

    public void cerrar(){
        abierta = false;
    }

    public void mostrarEstado(){
        System.out.println("el materia de la puesta: " + material);
        System.out.println("la puerta esta: "+ abierta);
    }
}
