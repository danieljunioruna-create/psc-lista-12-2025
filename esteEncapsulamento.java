public class TesteEncapsulamento {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

      
      //conta.saldo = 500; 
      //conta.titular = "luiz"; 
      //conta.numeroConta = "12345";
         
        
        conta.setNumeroConta("123456");
        conta.setTitular("maria silva");
        

        //conta.depositar(-100.00);
        conta.depositar(1000.00);
         
        
        conta.sacar(300.00);
        //conta.sacar(-50.00);

        double saldoFinal = conta.getSaldo();
        System.out.printf("Saldo final obtido via Getter: R$ "  + saldoFinal);
      
    }
}