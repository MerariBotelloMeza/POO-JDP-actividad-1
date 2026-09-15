package ejercicio6;
public class mainEstudi {
    public static void main(String[] args){

        //objecto
        Estudiante estudiantes = new Estudiante();

        // se asignaron valores manuales
        estudiantes.nombre="carla";
        estudiantes.codigo = 4444;
        estudiantes.semestre = "Primero";

        //muestra la infor
        estudiantes.mostrarInfo();

    }
}
