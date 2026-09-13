package ejercicio22;

public class Libro {
    String nombre;
    String autor;
    int codigo;

    public static void main(String[] arg) {

        Libro libro1 = new Libro();

        libro1.nombre="cien años de soledad";
        libro1.autor="gabriel garcia marques";
        libro1.codigo=123;

        Libro libro2 = new Libro();

        libro2.nombre="el mundo oscuro de teresa";
        libro2.autor=" Paloma Sánchez Ibarzábal";
        libro2.codigo=333;

        Libro libro3 = new Libro();

        libro3.nombre="el tunel";
        libro3.autor="Ernesto Sabato";
        libro3.codigo=143;

        Libro libro4 = new Libro();
        libro4.nombre="el amor en los tiempos del colera";
        libro4.autor="gabriel garcia marques";
        libro4.codigo=155;


        /*
         * Podemos concluir que la clase es como un plano o plantilla que
         * define la estructura y las características que tendrán los objetos.
         * Los objetos son las instancias de esa clase, es decir, los libros
         * creados a partir de ese modelo, cada uno con sus propios valores.
         */

    }

}
