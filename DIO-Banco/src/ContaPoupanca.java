public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente bruno) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("extrato conta poupanca");
        super.imprimirInfosComuns();
    }
}
