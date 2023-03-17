public class Gerente extends Funcionario implements Autenticable{
    //gerente tiene sus propios atributos pero se hereda de funcionario
    private AutenticacionUtil util;
    public Gerente(){
        this.util = new AutenticacionUtil();
    }
//sobre - escritura del metodo en la clase hija ojo uwu
    @Override
    public double getBonificacion(){
        System.out.println("ejecutando test de gerente");
        return super.getSalario() + this.getSalario() * 0.5;

    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
