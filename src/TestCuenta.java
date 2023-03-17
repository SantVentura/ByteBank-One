public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1,1);
        CuentaAhorros ca = new CuentaAhorros(2,1);
        cc.depositar(2000);
        cc.transferir(1000,ca);

        System.out.println(ca.getSaldo());
        System.out.println(cc.getSaldo());
    }
}
