public class TestControlBonificacion {
    public static void main(String[] args){
     Funcionario Mistyc = new Contador();
     Mistyc.setSalario(2000);

     Gerente zacha = new Gerente();
     zacha.setSalario(8000);

     ControlBonificacion controlBonificacion =
             new ControlBonificacion();
     controlBonificacion.RegistrarSalario(Mistyc);
     controlBonificacion.RegistrarSalario(zacha);


     Contador alex = new Contador();
     alex.setSalario(2800);
    
        controlBonificacion.RegistrarSalario(alex);
    }
}
