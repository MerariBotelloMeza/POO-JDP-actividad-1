package ejercicio56;

public class Temperatura {
    double celcio;
    double Fahrenheit;

    public void convertirF(){
        Fahrenheit = (celcio * 1.8) + 32;
    }

    public void mostrarResuldo(){
        convertirF();
        System.out.println("los grados del celcio a Fahrenheit es: " + Fahrenheit);

    }
}
