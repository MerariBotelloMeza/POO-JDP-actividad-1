package ejercicio48;

public class Persona {
    String nombre;

    public void verNombre(){
        System.out.println(nombre);
    }

    /*
    * public class Persona {
    String nombre;

    public void verNombre(){
        String nombre = "manuelito";
        System.out.println(nombre);
    }
    * El error está en que confundimos un atributo con una variable
 * del método. Las variables locales de los métodos solo existen
 * en el método en sí, no existen fuera de él.
 *
 * Por lo tanto, la manera correcta de hacerlo es solo imprimir
 * el atributo, ya que el nombre de la variable va a crearse
 * en el objeto, que es la manera correcta.
 *
 * */

}
