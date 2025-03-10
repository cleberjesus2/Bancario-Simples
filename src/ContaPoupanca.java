import exceptions.SaldoInsuficienteExcepetion;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, long numeroConta, double saldoIncial) {
        super(titular, numeroConta, saldoIncial);
    }


    public void renderJuros(double taxa) {
        double rendimento = (taxa * saldo) / 100;
        saldo += rendimento;
        System.out.println("Juros de R$" + rendimento + " aplicados. Saldo atual: R$" + saldo);
    }

}

