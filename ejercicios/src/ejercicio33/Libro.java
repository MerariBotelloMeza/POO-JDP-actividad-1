package ejercicio33;

public class Libro {
    String nombre;
    String autor;
    int codigo;

    Libro(Libro otroLibro){
        this.nombre= otroLibro.nombre;
        this.autor= otroLibro.autor;
        this.codigo= otroLibro.codigo;
    }
    
}
