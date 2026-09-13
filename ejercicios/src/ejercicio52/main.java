package ejercicio52;

public class main {
    public static void main(String[] args){

        FacturaSimple factura1 = new FacturaSimple();

        factura1.numero=2;
        factura1.cliente="carlos";
        factura1.valor= 23000;

        factura1.descuento();
        factura1.mostraInfo();
    }
}
