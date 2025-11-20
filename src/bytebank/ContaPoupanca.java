package bytebank;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente titular, int numero, double saldo) {
        super(titular, numero, saldo);
    }
    //METODO DE SAQUE SEM JUROS
    @Override
    public boolean sacar(double valor) {
       if (this.saldo >= valor){
           this.saldo -= valor;
           return true;
       }else {
           return false;
       }
    }
}
