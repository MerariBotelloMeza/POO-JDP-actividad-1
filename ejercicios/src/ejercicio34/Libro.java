package ejercicio34;

public class Libro {
    String nombre;
    String autor;
    int codigo;

    Libro(){
        nombre = "El tunel";
        autor = "Ernesto Sabato";
        codigo = 555;
    }

    Libro(Libro otroLibro){
        this.nombre= otroLibro.nombre;
        this.autor= otroLibro.autor;
        this.codigo= otroLibro.codigo;
    }
}
