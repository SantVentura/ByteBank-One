public abstract class Cuenta {
   protected double saldo;
   private int agencia;
   private int numero;
//tipo de dato cliente
   private Cliente titular = new Cliente();
   //esta variable va  haser de la clase no de la instancia
  private static int total = 0;


   public Cuenta(int agencia, int numero){
       if (agencia <= 0){
           System.out.println("No se permite el 0");
           this.agencia = 1;
       }else {
           this.agencia = agencia;
       }
       total++;
       System.out.println("se van creando: " + total + " cuentas");
   }

    //valor representa la cantidad de dinero a depositar
    //void no retorna
  public abstract void depositar(double valor);
   //{
       //esta cuenta        esta cuenta
       //This account       This account
       //this object
       //aca le diremos al saldo de esta cuenta
        //this.saldo += valor;
   //}
   //vamos a referenciar bolean para ahorrar trabajo
    //retorna valor
  public boolean retirar(double valor){
    if (this.saldo >= valor){
        this.saldo = this.saldo - valor;
        return true;
    }
        return false;
  }

 public boolean transferir(double valor,Cuenta cuenta){
    if (this.saldo >= valor){
        this.retirar(valor);
        cuenta.depositar(valor);
        return true;
    }else{
        return false;
    }
  }

  public double getSaldo(){
      //retornamos el saldo de esta cuenta
      return this.saldo;
  }
  /*public void setAgencia(int agencia){
      if (agencia > 0){
          this.agencia = agencia;
      }else {
          System.out.println("No se permiten valores negativos");
      }
      }*/
  public int getAgencia(){
      return agencia;
  }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

}
