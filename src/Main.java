
public class Main {

    public static void main(String[] args) {
        Cliente bispo = new Cliente();
        bispo.setNome("Bispo");

        Conta cc = new ContaCorrente(bispo);
        Conta poupanca = new ContaPoupanca(bispo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
