package ejercicio20;

public class Estudiante {
    String nombre;
    int codigo;
    String semestre;

    public static void main(String[] args) {

        //1 objeto
        Estudiante estudiantes1 = new Estudiante();

        // se asignaron valores manuales
        estudiantes1.nombre = "carla";
        estudiantes1.codigo = 4444;
        estudiantes1.semestre = "Primer";

        // 2 objeto
        Estudiante estudiantes2 = new Estudiante();

        estudiantes2.nombre = "mery";
        estudiantes2.codigo = 1111;
        estudiantes2.semestre = "segundo";

        // 3 objeto
        Estudiante estudiantes3 = new Estudiante();

        estudiantes3.nombre = "marlo";
        estudiantes3.codigo = 2222;
        estudiantes3.semestre = "Primer";


        /*
         * Los tres objetos pertenecen a la misma clase, por lo que comparten
         * los mismos atributos: nombre, codigo y semestre.
         *
         * Se diferencian porque cada objeto tiene sus propios valores en esos
         * atributos y cada uno tiene un nombre diferente: estudiantes1,
         * estudiantes2 y estudiantes3.
         */
    }



}
