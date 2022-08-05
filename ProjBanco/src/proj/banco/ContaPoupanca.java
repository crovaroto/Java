package proj.banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
        public void visualizarExtrato() {
            System.out.println("=== Extrato Conta Poupança === ");
            InfosComuns();
        }
}
