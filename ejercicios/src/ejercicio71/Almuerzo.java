package ejercicio71;

public class Almuerzo {
     String nombreComida;
     String bebidas;
     String horaAlmuezo;

    public void mostraarinfo(){
        System.out.println("el nombre de la comida es: "+ nombreComida);
        System.out.println("las bebidad:" + bebidas);
        System.out.println(" la hora del almuezo es: "+ horaAlmuezo);
    }

    Almuerzo(String nombreComida, String bebidas){
        this.nombreComida=nombreComida;
        this.bebidas = bebidas;
        horaAlmuezo ="12:00 pm";
    }


}
