package ejercicio52;

public class FacturaSimple {
    int numero;
    String cliente;
    double valor;

    public void descuento(){
        valor = valor -(valor * 0.10);
    }
    public void mostraInfo(){
        System.out.println("el numero es: "+ numero);
        System.out.println("el cliente: "+ cliente);
        System.out.println("el valor del descuento es el 10%: "+ valor);
    }
}
