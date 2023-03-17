public class CuentaCorriente extends Cuenta implements Tributacion{
    public  CuentaCorriente(int agencia,int numero){

        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {

        this.saldo = this.saldo + valor;
    }
//override me indica que el metodo esta siendo sobreescribido

    @Override
    public boolean retirar(double valor) {
        double comision = 0.2;
        return super.retirar(valor + comision);
    }

    @Override
    public double getValorImpuesto() {
        return super.saldo * 0.01;
    }
}
