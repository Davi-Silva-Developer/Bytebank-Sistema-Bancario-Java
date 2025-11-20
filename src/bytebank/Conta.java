package bytebank;

abstract class Conta {
    protected double saldo;  //PROTECTED: As filhas podem mexer no saldo!
    private int numero;
    private Cliente titular;  // COMPOSIÇÃO: A conta "tem" um cliente.


    // --- CONSTRUTOR ---

    public Conta(Cliente titular, int numero, double saldo){

        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        System.out.println("Construindo conta de numero " + numero );
    }


    // --- METODOS ---

    //---DEPOSITAR VALOR
    public void depositar(double valor){
        this.saldo =+ valor;
        System.out.println("Deposito do valor: " + valor + "O saldo atual é de: " + this.saldo);
    }

    //--- TRANFERIR VALOR -----
    public void transferir(double valor, Conta destino){
        if (this.sacar(valor)) {

            destino.depositar(valor);
            System.out.println("Transferência realizada!");
        }else{
            System.out.println("Não foi possivel realizar essa tranferencia.");
        }

    }
    // Getter para ver o saldo (mas não mudar)

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //verificando se existe saldo para transferir para a outra conta
    public abstract boolean sacar(double valor);









}
