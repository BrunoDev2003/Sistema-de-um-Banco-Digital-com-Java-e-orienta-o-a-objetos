public class ContaCorrente extends Conta {
    
    private static int SEQUENCIAL = 1;

    public ContaCorrente() {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        
    }

    @Override
    public void transferir(Conta contaDestino) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente");
        System.out.println(String.format("Agencia %d", super.agencia));
        System.out.println(String.format("Numero %d", super.numero));
        System.out.println(String.format("saldo %.2f", super.saldo));
        
        
    }

    

    
}
