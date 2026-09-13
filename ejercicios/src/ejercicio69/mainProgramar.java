package ejercicio69;

import ejercicio66.AprenderProgramar;

public class mainProgramar {
    public static void main(String[] args){
        AprenderProgramar programar1 = new AprenderProgramar();
        AprenderProgramar programar2 = new AprenderProgramar();
        AprenderProgramar programar3 = new AprenderProgramar();
        AprenderProgramar programar4 = new AprenderProgramar();
        AprenderProgramar programar5 = new AprenderProgramar();


        programar1.nombreEstudiante = "Lusi";
        programar1.duracionEstudio=2;
        programar1.vecesSemanales= 3;

        programar2.nombreEstudiante = "Marta";
        programar2.duracionEstudio=4;
        programar2.vecesSemanales= 1;

        programar3.nombreEstudiante = "marcos";
        programar3.duracionEstudio=3;
        programar3.vecesSemanales= 3;

        programar4.nombreEstudiante = "manuel";
        programar4.duracionEstudio=2;
        programar4.vecesSemanales= 4;

        programar5.nombreEstudiante = "lesly";
        programar5.duracionEstudio=1;
        programar5.vecesSemanales= 3;

        programar1.estudiar();
        programar2.estudiar();
        programar3.estudiar();
        programar4.estudiar();
        programar5.estudiar();

    }
}
