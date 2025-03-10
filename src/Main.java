import exceptions.SaldoInsuficienteExcepetion;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca("Cleber", 11111,2000);

        try {
            cp.sacar(2110);
        } catch (SaldoInsuficienteExcepetion e) {
            System.out.println(e.getMessage());
        }

        System.out.println("_------------------------");

        try {
            cp.depositar(0);
        } catch (SaldoInsuficienteExcepetion e) {
            System.out.println(e.getMessage());
        }



        cp.exibirSaldo();
    }
}
