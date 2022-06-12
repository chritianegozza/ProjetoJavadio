public class Main {
    public static void main(String[] args) {
        Cliente christiane = new Cliente();
        christiane.setNome("Christiane");


        Conta cc = new ContaCorrente(christiane);
        Conta poupanca = new ContaPoupanca(christiane);


        cc.depositar(100);
        cc.transferir(100, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();

    }
}
