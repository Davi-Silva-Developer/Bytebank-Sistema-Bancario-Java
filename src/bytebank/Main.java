package bytebank;

public class Main {
    public static void main(String[] args) {

        // 1. Criando Clientes
        Cliente davi = new Cliente("Davi", "111.222.333-44");
        Cliente isabel = new Cliente("Isabel", "555.666.777-88");


        //  Criando Contas
        // Conta Corrente (Taxa de 0.20)
        ContaCorrente cc = new ContaCorrente(davi, 1, 0);
        cc.depositar(100.0); // Saldo: 100.0


        // Conta Poupança (Sem taxa)
        ContaPoupanca cp = new ContaPoupanca(davi,1, 0 );
        cp.depositar(100.0); // Saldo: 100.0


        System.out.println("--- TESTE DE SAQUE ---");
        // 3. Testar Saque na Corrente (Deve cobrar taxa)
        cc.sacar(10.0);

        // Esperado: 100 0.20 = 89.80
        System.out.println("Saldo CC (Davi): " + cc.getSaldo());


    }



}