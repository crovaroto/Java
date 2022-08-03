package metodos;

public class Mensagem {
    public static String obterMensagem(int hora) {
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return mensagemBomDia();
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return mensagemBoaTarde();
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                return mensagemBoaNoite();
            default:
                return "Esta não é uam hora válida.";
        }
    }

    private static String mensagemBoaNoite() {
        return "Boa noite";
    }

    private static String mensagemBoaTarde() {
        return "Bom tarde";
    }

    private static String mensagemBomDia() {
        return "Bom dia";
    }
}
