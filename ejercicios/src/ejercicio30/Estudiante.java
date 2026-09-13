package ejercicio30;

public class Estudiante {
    String nombre;
    int codigo;
    String semestre;

    Estudiante() {
        nombre = "lucia";
        codigo = 555;
        semestre = "primer";
    }

    Estudiante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        semestre = "primer";
    }

    Estudiante(String nombre, int codigo, String semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public static void main(String[] arg) {

        Estudiante estudiante1 = new Estudiante();

        Estudiante estudiante2 = new Estudiante("lucia", 444);

        Estudiante estudiante3 = new Estudiante("Marta", 333, "segundo");

    }

}
