package ejercicio25;

public class Libro {
    String nombre;
    String autor;
    int codigo;

    Libro(){
        nombre = "cronicas de una muerte anunciada ";
        autor =" Gabriel garcia marques";
        codigo = 299;
    }

    Libro(String nombre, String autor ){
        this.nombre = nombre ;
        this. autor = autor;
        codigo = 299;
    }

    public static void main(String[] args) {

        Libro libro1 = new Libro();

        Libro libro2 = new Libro("cronicas de una muerte anunciada","gabriel garcia" );

    }
}
