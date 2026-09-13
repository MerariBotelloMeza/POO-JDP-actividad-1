package ejercicio69;

import ejercicio68.Farmacia;

public class mainFarma {
    public static void main(String[] args){

        Farmacia farmacia1 = new Farmacia();
        Farmacia farmacia2 = new Farmacia();
        Farmacia farmacia3 = new Farmacia();
        Farmacia farmacia4 = new Farmacia();
        Farmacia farmacia5 = new Farmacia();

        farmacia1.nombre = "la bendita";
        farmacia1.medicamentos= "sevedol";
        farmacia1.stockMedi=50;

        farmacia2.nombre = "FarmaTodo";
        farmacia2.medicamentos= "doles";
        farmacia2.stockMedi=30;

        farmacia3.nombre = "la salud";
        farmacia3.medicamentos= "apronax";
        farmacia3.stockMedi=100;

        farmacia4.nombre = "la bendita";
        farmacia4.medicamentos= "paracetamol";
        farmacia4.stockMedi=500;

        farmacia5.nombre = "farmatodo";
        farmacia5.medicamentos= "lumbal";
        farmacia5.stockMedi=80;

        farmacia1.mostrarInfo();
        farmacia2.mostrarInfo();
        farmacia3.mostrarInfo();
        farmacia4.mostrarInfo();
        farmacia5.mostrarInfo();

    }
}
