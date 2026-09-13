package ejercicio53;

public class Reserva {
    String nombreCliente;
    String fecha;
    boolean activar;

    public void confirmar(){
        activar = true;
    }

    public void cancelar(){
        activar = false;
    }


}
