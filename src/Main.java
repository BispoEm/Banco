
public class Main {

    public static void main(String[] args) {
        Cliente bispo = new Cliente();
        bispo.setNome("Bispo");

        Conta cCorrente = new ContaCorrente(bispo);
        Conta poupanca = new ContaPoupanca(bispo);

        cCorrente.depositar(900);
        cCorrente.transferir(300, poupanca);

        cCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
