package ejercicio59;

public class UsuarioSistema {
    String nombreUsuario;
    int clave;
    boolean activo;

    public void activar(){

        activo = true;
    }
    public void desactivar(){
        activo= false;
    }
}
