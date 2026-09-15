package ejercicio14;

public class CuentaBancaria {
    int numero;
    String titular;
    double saldo;

    // metodo retirar
    public void retirar(double valor){
        if(saldo >= valor) {
            saldo = saldo - valor;
        }
        else {
            System.out.println("saldo insuficiente");
        }
    }
}