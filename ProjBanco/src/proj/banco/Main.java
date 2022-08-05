package proj.banco;

public class Main {
    public static void main(String[] args) {

        Cliente clienteCc = new Cliente();
        Cliente clienteCp = new Cliente();
        clienteCc.setNome("Cássio");
        clienteCp.setNome("Bárbara");
        Conta cc = new ContaCorrente(clienteCc);
        Conta cp = new ContaPoupanca(clienteCp);

        cc.depositar(100);
        cc.transferir(cp, 100);

        cc.visualizarExtrato();
        cp.visualizarExtrato();
    }
}
