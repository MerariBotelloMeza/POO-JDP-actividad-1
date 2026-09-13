package ejercicio28;

public class CuentaBancaria {
    int numero;
    String titular;
    double saldoInicial;

    CuentaBancaria(int numero,String titular,double saldoInicial){
        this.numero=numero;
        this.titular=titular;
        this.saldoInicial=saldoInicial;

    }
    public static void main(String[] arg){

        CuentaBancaria cuenta1 = new CuentaBancaria(444,"leris",10000);
        CuentaBancaria cuenta2 = new CuentaBancaria(22222,"Marco",44444);
        CuentaBancaria cuenta3 = new CuentaBancaria(999,"Melis",8000);
    }
}
