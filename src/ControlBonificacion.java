public class ControlBonificacion {
    private double suma;
    public double RegistrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo De la suma " + this.suma );
        return this.suma;
    }

}
