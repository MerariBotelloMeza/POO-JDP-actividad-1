package ejercicio10;

public class MainCuenta {
    public static void main(String[] args){

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();

        cuenta1.numero=12345;
        cuenta1.titular="lina";
        cuenta1.saldo= 500000;

        cuenta2.numero=54321;
        cuenta2.titular="manolo";
        cuenta2.saldo=60000;

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();

    }
}
