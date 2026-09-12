package ejercicio49;

public class Persona {
    String nombre;

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.nombre = "Manuelito";
        persona2.nombre = "Carlos";

        System.out.println(persona1.nombre);
        System.out.println(persona2.nombre);
    }

    /*
     *
     * public class Persona {
     *     String nombre;
     *
     *     public static void main(String[] args) {
     *
     *         Persona persona1 = new Persona();
     *         Persona persona2 = new Persona();
     *
     *         persona1.nombre = "Manuelito";
     *         persona2.nombre = "Carlos";
     *
     *         System.out.println(nombre);
     *
     *     }
     *}
     * Este ejemplo intenta acceder al atributo nombre, pero no especifica
     * de qué objeto se refiere, si a persona1 o a persona2.
     * Así que no puede acceder a la información de manera correcta.*/
}