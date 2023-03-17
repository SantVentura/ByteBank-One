public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente2 = new Gerente();
        Administrador admin = new Administrador();

        sistema.autenticar(gerente2);
        sistema.autenticar(admin);

    }
}
