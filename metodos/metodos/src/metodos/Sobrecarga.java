package metodos;

public class Sobrecarga {
    public static double calculoArea(double lado) {
        return lado * lado;
    }
    public static double calculoArea(double lado1, double lado2) {
        return lado1 * lado2;
    }
    public static double calculoArea(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura);
    }

    public static double calculoArea(float diagonal1, float diagonal2) {
        return ((diagonal1 * diagonal2) /2);
    }
}
