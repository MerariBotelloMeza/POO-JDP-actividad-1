package ejercicio73;

public class Farmacia {
    public String nombre;
    public String medicamentos;
    public int stockMedi;

    public void mostrarInfo(){
        System.out.println("Nombre de la farmacia: " + nombre);
        System.out.println("Medicamentos: " + medicamentos);
        System.out.println("Cantidad de medicamentos: " + stockMedi);
    }

    Farmacia (Farmacia otrafarmacia){
        this.nombre= otrafarmacia.nombre;
        this.medicamentos=otrafarmacia.medicamentos;
        this.stockMedi= otrafarmacia.stockMedi;

    }
}