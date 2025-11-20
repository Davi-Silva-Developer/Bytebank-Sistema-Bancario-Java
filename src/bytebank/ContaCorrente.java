package bytebank;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular, int numero, double saldo) {
        super(titular, numero, saldo);
    }
    // METODO DE SAQUE APLICANDO OS JUROS
    @Override
    public boolean sacar(double valor) {
        if (this.saldo >= valor + 0.20){
            this.saldo -= (valor + 0.20);
            return true;
        }else {
            return false;
        }
    }
}
