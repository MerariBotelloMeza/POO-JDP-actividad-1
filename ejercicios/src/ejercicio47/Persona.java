package ejercicio47;

public class Persona {

    String nombre;

    public void mostrarNombre(){
        System.out.println(nombre);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre="manuelito";

        persona1.mostrarNombre();

        /*
        public class Persona {
           String nombre;

           public void mostrarNombre(){
              System.out.println(nombre);
           }

           public static void main() {
           persona1.mostrarNombre();

        }
     }

     En este ejemplo podemos ver que llamamos al método que imprime
     el nombre guardado, pero el sistema trata de llamar un objeto
     que todavía no está creado, así que no puede llamar nada.
        * */

    }
}
