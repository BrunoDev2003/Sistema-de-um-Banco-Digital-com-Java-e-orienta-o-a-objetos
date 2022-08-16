public class Main {
    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("bruno");
        Conta cc = new ContaCorrente(bruno);
        Conta poupanca = new ContaPoupanca(bruno);
        Conta corrente = new ContaCorrente(bruno);

        cc.transferir(100, poupanca);
        cc.depositar(200,corrente);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
