public abstract class Conta implements IConta {
    private int agencia; 
    private int numero; 
    private int saldo;
    



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
