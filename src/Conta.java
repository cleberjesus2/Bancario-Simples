import exceptions.SaldoInsuficienteExcepetion;

public abstract class Conta {
    private String titular;
    private long numeroConta;
    protected double saldo;

    public Conta(String titular, long numeroConta, double saldoIncial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoIncial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double saldo) throws SaldoInsuficienteExcepetion {
        if (saldo <= 0){
            throw new SaldoInsuficienteExcepetion("Não foi possível depositar " + saldo);
        }

        this.saldo += saldo;
        System.out.println(saldo + "$ Foi depositado em sua conta !");

    }

    public void  sacar(double saldo) throws SaldoInsuficienteExcepetion{
        if (saldo > this.saldo){
           throw new SaldoInsuficienteExcepetion("Saldo Insuficiente para saque !");
        }

        this.saldo -= saldo;
        System.out.println("Você sacou " + saldo + "$");
    }

    public void exibirSaldo(){
        System.out.println("Olá, " + titular + " seu saldo é " + saldo);
    }

}
