package ejercicio42;

public class Curso {
    String nombreC;
    int codigo;
    int duracion;

    public static void main (String[] args){

        Curso curso1 = new Curso();

        curso1.nombreC="sistema";
        curso1.codigo= 5555;
        curso1.duracion= 60;

        Curso curso2 = new Curso();

        curso2.nombreC= "tecnologia";
        curso2.codigo= 3333;
        curso2.duracion= 60;

    }
    /*bueno porque ambos objetos pertenecen a la misma clase porque fueron creados
     a partir de la clase Curso y tienen los mismos
     atributos: nombre, código y duración. Aunque cada objeto tiene datos
     diferentes, la estructura que los define es la misma.
     */
}
