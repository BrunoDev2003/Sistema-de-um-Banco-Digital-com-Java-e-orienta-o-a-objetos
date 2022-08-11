public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        Conta corrente = new ContaCorrente();

        cc.transferir(100, poupanca);
        cc.depositar(200,corrente);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
