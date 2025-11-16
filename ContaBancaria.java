public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    
    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.trim().isEmpty()) {
            throw new IllegalArgumentException("Número da conta inválido!");
        }
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do titular inválido!");
        }
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo!");
        }
        this.saldo = saldo;
    }

    public void depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            saldo += valorDepositado;
        } else {
            throw new IllegalArgumentException("O valor deve ser positivo!");
        }
    }

    public void sacar(double valorDeSaque) {
        if (valorDeSaque <= 0) {
            throw new IllegalArgumentException("Operação inválida!");
        } else if (valorDeSaque > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        } else {
            saldo -= valorDeSaque;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    
}
