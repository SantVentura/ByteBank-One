public class TestTributacion{
        public static void main(String[] args) {
            CuentaCorriente cc = new CuentaCorriente(222, 333);
            cc.depositar(1000);
            SeguroDeVida seguro = new SeguroDeVida();

            CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();

            calc.registrar(cc);
            calc.registrar(seguro);

            System.out.println(calc.getTotalImpuesto());
            System.out.println(cc.getSaldo());
        }
}
