package blocos.logicos;

public class ControleFluxo {
    public static String ifFlecha(int mes) {
        String mesAno = "";
        if (mes == 1) {
            mesAno = "Janeiro";
        }
        else {
            if (mes == 2) {
                mesAno = "Fevereiro";
            }
            else {
                if (mes == 3) {
                    mesAno = "Março";
                }
                else {
                    if (mes == 4) {
                        mesAno = "Abril";
                    } else {
                        if (mes == 5) {
                            mesAno = "Maio";
                        }
                        else {
                            if (mes == 6) {
                                mesAno = "Junho";
                            }
                            else {
                                if (mes == 7) {
                                    mesAno = "Julho";
                                }
                                else {
                                    if (mes == 8) {
                                        mesAno = "Agosto";
                                    }
                                    else {
                                        if (mes == 9) {
                                            mesAno = "Setembro";
                                        }
                                        else {
                                            if (mes == 10) {
                                                mesAno = "Outubro";
                                            }
                                            else {
                                                if (mes == 11) {
                                                    mesAno = "Novembro";
                                                }
                                                else {
                                                    if (mes == 12) {
                                                        mesAno = "Dezembro";
                                                    }
                                                    else {
                                                        mesAno = "Mês indefinido";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
        return mesAno;
    }

    public static String ifSemFlecha(int mes) {
        String mesAno =  "";
        if (mes == 1) {
            mesAno = "Janeiro";
        }
        else if(mes == 2) {
            mesAno = "Fevereiro";
        }
        else if(mes == 3) {
            mesAno = "Março";
        }
        else if(mes == 4) {
            mesAno = "Abril";
        }
        else if(mes == 5) {
            mesAno = "Maio";
        }
        else if(mes == 6) {
            mesAno = "Junho";
        }
        else if(mes == 7) {
            mesAno = "Julho";
        }
        else if(mes == 8) {
            mesAno = "Agosto";
        }
        else if(mes == 9) {
            mesAno = "Setembro";
        }
        else if(mes == 10) {
            mesAno = "Outubro";
        }
        else if(mes == 11) {
            mesAno = "Novembro";
        }
        else if(mes == 12) {
            mesAno = "Dezembro";
        }
        else {
            mesAno = "Mês indefinido";
        }
        return mesAno;
    }

    public static String ifFerias(String mes) {
        switch (mes) {
            case "Julho":
            case "Dezembro":
            case "Janeiro":
                return "Férias";
            default:
                return "Não é férias";
        }
    }

    public static String ifMenor(){
        double salarioMensal = 1893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = (salarioMensal < mediaSalario);
        boolean muitosDependentes = (quantidadeDependentes >= mediaDependentes);
        boolean receberAuxilio = (salarioBaixo && muitosDependentes);

        if (receberAuxilio) {
            return "Funcionário deve receber auxílio";
        }
        else {
            return "Funcionário não deve receber auxílio";
        }
    }

    public static int switchSemana(String diaSemana) {
        switch (diaSemana) {
            case "Segunda":
                return 1;
            case "Terça":
                return 2;
            case "Quarta":
                return 3;
            case "Quinta":
                return 4;
            case "Sexta":
                return 5;
            case "Sábado":
                return 6;
            case "Domingo":
                return 7;
            default:
                return -1;
        }
    }
}
