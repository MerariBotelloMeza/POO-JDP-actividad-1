package ejercicio35;

public class Lampara {
    String marca;
    boolean encendida;

    public void encender (){
        encendida = true;
    }

    public void apagar(){
        encendida = false;
    }

    public void mostrarEstado(){
        System.out.println("la marca de la lampara es: "+ marca);
        System.out.println("la lampara esta: "+ encendida);

    }

}
