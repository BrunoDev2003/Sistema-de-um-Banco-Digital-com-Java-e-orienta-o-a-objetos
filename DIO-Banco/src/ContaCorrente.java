public class ContaCorrente extends Conta {
    
    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente");
        super.imprimirInfosComuns();
        
        
    }


    

    

    
}
