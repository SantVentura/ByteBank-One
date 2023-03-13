public class TestReferencias {
    public static void main(String[] args) {
        //Elemento mas generico puede ser adaptado
        //Al Elemento Mas Especifico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("angela");
        funcionario.setSalario(2000);


        Gerente gerente = new Gerente();
        gerente.setNombre("abigail");

        gerente.setSalario(8000);



    }
}
