public class SistemaInterno {
    private String clave = "Alura cursos online";

    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean autenticar(Autenticable gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("Login exitoso");
            return true;
        }else {
            System.out.println("Error login");
            return false;
        }
    }


}
