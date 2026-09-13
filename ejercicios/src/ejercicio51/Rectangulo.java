package ejercicio51;

public class Rectangulo {
    int base;
    int altura;
    int areaN;
    int perimetroN;

    public void area( ){
        areaN = base*altura;
    }

    public void perimetro (){
        perimetroN = base + base + altura + altura;
    }

    public void mostrarResultado(){
        System.out.println("el area del rectagulo es: "+ areaN);
        System.out.println("el perimetro es: " +perimetroN);
    }

}
