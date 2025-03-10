import exceptions.SaldoInsuficienteExcepetion;

public class ContaCorrente extends Conta{
    double chequeEspecial = 500;

    public ContaCorrente(String titular, long numConta, double saldoInicial) {
        super(titular,numConta, saldoInicial );

    }

    @Override
    public void depositar(double saldo) throws SaldoInsuficienteExcepetion {
        if (saldo <= 0){
            throw new SaldoInsuficienteExcepetion("Saldo para depósito Incorreto.");
        }
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteExcepetion {
        if (getSaldo() + chequeEspecial >= valor){
            this.saldo -= valor;
            System.out.println("Saque de R$" + saldo+ " realizado (incluindo cheque especial). Saldo atual: R$" + this.saldo);
        }
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Olá, " + getTitular() + " seu saldo é " + saldo);
        System.out.println("Cheque Especial: " + chequeEspecial);
    }
}
