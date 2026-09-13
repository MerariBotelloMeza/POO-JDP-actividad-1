package ejercicio37;

public class Celular {
    String marca;
    int bateria;
    boolean prendido;

    public void encender(){
        prendido = true;
    }

    public void apagar(){
        prendido = false;
    }

    public void cargarBateria(int carga){
        bateria = bateria + carga;
    }
}
