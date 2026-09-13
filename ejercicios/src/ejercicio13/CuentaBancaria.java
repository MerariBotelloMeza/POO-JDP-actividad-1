package ejercicio13;

public class CuentaBancaria {
    int numero;
    String titular;
    double saldo;

    // metodo consignar
    public void consignar(double valor){
        saldo= saldo+valor;
    }

}