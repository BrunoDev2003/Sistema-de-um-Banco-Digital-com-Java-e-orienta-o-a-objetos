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
        imprimirInfosComuns();
        
        
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        
    }

    

    

    
}
