package ejercicio4;
public class CuentaBancaria {
    int numero;
    String titular;
    double saldo;

    // metodo
    public void mostrarCuenta(){
        System.out.println("numero de cuenta: "+numero);
        System.out.println("Titular de la cuenta: "+titular);
        System.out.println("Saldo: "+ saldo);
    }
}
