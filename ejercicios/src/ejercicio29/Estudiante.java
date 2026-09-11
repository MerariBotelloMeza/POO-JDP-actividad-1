package ejercicio29;

public class Estudiante {
    String nombre;
    int codigo;
    String semestre;

    Estudiante (){
        nombre = "lucia";
        codigo = 555;
        semestre ="primer";
    }

    Estudiante (String nombre,int codigo){
        this.nombre = nombre;
        this.codigo= codigo;
        semestre= "primer";
    }

    Estudiante (String nombre,int codigo, String semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }
}
