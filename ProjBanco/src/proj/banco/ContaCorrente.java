package proj.banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void visualizarExtrato() {
        System.out.println("=== Extrato Conta Corrente === ");
        InfosComuns();
    }
}
