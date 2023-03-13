public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1,1);
        CuentaAhorros ca = new CuentaAhorros(2,1);
        cc.depositar(2000);

    }
}
