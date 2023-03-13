class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNombre("Santi");
        gerente.setSalario(6000);
        gerente.setTipo(0);
        gerente.setClave("Alura cursos online");
        System.out.println(gerente.getBonificacion());

        System.out.println(gerente.iniciarSesion("Alura cursos online"));
    }
}
