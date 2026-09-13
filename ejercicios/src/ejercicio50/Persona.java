package ejercicio50;

public class Persona {

    String nombre;

    public void mostrarNombre(){
        System.out.println(nombre);
    }

    public static void main(String[] args){
        Persona persona1 = new Persona();

        persona1.nombre = "manuelito";

        persona1.mostrarNombre();

    }

    /*
    * public class Persona {

    String nombre;

    public void mostrarNombre(){
        System.out.println(nombre);
    }

    public static void main(String[] args){
        Persona persona1;

        persona1.nombre = "manuelito";

        persona1.mostrarNombre();

    }}
    *
 * Este ejemplo está mal porque se creó el main, pero nunca se creó
 * el objeto para poder utilizarlo. El objeto se tiene que colocar
 * con new para que el objeto se cree.*/

}
