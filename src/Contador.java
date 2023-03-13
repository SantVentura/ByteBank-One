public class Contador extends Funcionario{

    @Override
    public double getBonificacion() {
        System.out.println("Ejecutando test de Contador");
        return 200;
    }
}
