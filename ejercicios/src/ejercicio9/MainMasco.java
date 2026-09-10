package ejercicio9;

public class MainMasco {
    public static void main(String[] args ){

        Mascota mascota = new Mascota();

        mascota.nombreM= "misifu";
        mascota.edad=6;
        mascota.especie="felina";

        System.out.println("estado principal: ");
        mascota.mostrarMascota();

        mascota.edad = 7;

        System.out.println("se hizo el primer cambio");
        mascota.mostrarMascota();

        mascota.edad = 10;

        System.out.println(" se hizo el segundo cambio");
        mascota.mostrarMascota();





    }
}
