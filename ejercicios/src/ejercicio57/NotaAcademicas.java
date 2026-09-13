package ejercicio57;

public class NotaAcademicas {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    public double definitiva(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarResultado(){
        System.out.println(" Nota final de "+asignatura+": " + definitiva());


    }
}
