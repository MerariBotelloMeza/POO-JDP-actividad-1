package ejercicio69;

import ejercicio67.Almuerzo;

public class mainAlmuerzo {
    public static void main(String[] args){

        Almuerzo comida1 = new Almuerzo();
        Almuerzo comida2 = new Almuerzo();
        Almuerzo comida3 = new Almuerzo();
        Almuerzo comida4 = new Almuerzo();
        Almuerzo comida5 = new Almuerzo();

        comida1.nombreComida ="pizza";
        comida1.bebidas="coca-cola";
        comida1.horaAlmuezo="12:00 pm";

        comida2.nombreComida ="arroz y pollo";
        comida2.bebidas="maracuya";
        comida2.horaAlmuezo="01:00 pm";

        comida3.nombreComida ="sopa";
        comida3.bebidas="Agua panela";
        comida3.horaAlmuezo="02:00 pm";

        comida4.nombreComida ="arroz chino";
        comida4.bebidas="limonada";
        comida4.horaAlmuezo="12:00 pm";

        comida5.nombreComida ="arroz con cerdo";
        comida5.bebidas="tomate de arbol";
        comida5.horaAlmuezo="01:00 pm";

        comida1.mostraarinfo();
        comida2.mostraarinfo();
        comida3.mostraarinfo();
        comida4.mostraarinfo();
        comida5.mostraarinfo();

    }
}
