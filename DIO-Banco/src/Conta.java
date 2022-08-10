public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 0001;
    protected int agencia; 
    protected int numero; 
    protected int saldo;
    private static int SEQUENCIAL = 1;
    
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }
    
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }
}
