public class Gerente extends Funcionario {
    //gerente tiene sus propios atributos pero se hereda de funcionario
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean iniciarSesion(String clave){
            return  clave == "Alura cursos online";
    }
//sobre - escritura del metodo en la clase hija ojo uwu
    public double getBonificacion(){
        System.out.println("ejecutando test de gerente");
        return super.getSalario() +
                super.getBonificacion();
    }
}
