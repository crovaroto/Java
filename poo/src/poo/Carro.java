package poo;

public class Carro {
   //Atributos
   private String cor;
   private String modelo;
   private double capacidadeTanque;
   //Métodos
    //Construtor
    public Carro() { }

    public Carro(String cor, String modelo, double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //Métodos GET
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Métodos SET
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double valorTotalTanque(double valorCombustivel) {
        return valorCombustivel * getCapacidadeTanque();
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("Vermelho");
        carro.setModelo("Gol");
        carro.setCapacidadeTanque(46d);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println("Quanto custa seu tanque cheio? " + String.format("%.2f", carro.valorTotalTanque(5.59)));

        Carro carro1 = new Carro();
        carro1.setCor("Prata");
        carro1.setModelo("Monza");
        carro1.setCapacidadeTanque(58.5d);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println("Quanto custa seu tanque cheio? " + String.format("%.2f", carro1.valorTotalTanque(5.59)));
    }

}
