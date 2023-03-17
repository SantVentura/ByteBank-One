public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario gabriel = new Administrador();
        gabriel.setNombre("gabriel");
        gabriel.setDocumento("503020");
        gabriel.setSalario(2000);
        gabriel.setTipo(1);
        System.out.println(gabriel.getSalario());
        System.out.println(gabriel.getBonificacion());
        System.out.println("*************");
        System.out.println(gabriel);

    }
}
