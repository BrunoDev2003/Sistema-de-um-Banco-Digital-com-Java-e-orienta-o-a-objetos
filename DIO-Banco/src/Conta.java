public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 0001;
    protected int agencia; 
    protected int numero; 
    protected int saldo;
    



    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void transferir(Conta contaDestino) {
        // TODO Auto-generated method stub
        
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
