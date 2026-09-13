package ejercicio38;

public class Ventilador {
    String marca;
    int velocidad;
    boolean encendido;

    public void encender(){
        encendido = true;
    }

    public void apagar(){
        encendido = false;
    }

    public void subirVelocidad( int aumentador){
        velocidad = velocidad + aumentador;
    }
}
