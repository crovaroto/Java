package poo;

public class Main {
    public static void main(String[] args) {
        //Exemplos de polimorfismo e override
        Funcionario[] funcionarios = new Funcionario[] {
                new Gerente(),
                new Vendedor(),
                new Faxineiro(),
                new Funcionario()
        };

        for (Funcionario funcionario: funcionarios) {
            funcionario.metodo1();            
        }

        System.out.println("");

        for (Funcionario funcionario: funcionarios) {
            funcionario.metodo2();
        }

        System.out.println("");

        Vendedor vendedor = new Vendedor();
        vendedor.metodo2();
    }
}