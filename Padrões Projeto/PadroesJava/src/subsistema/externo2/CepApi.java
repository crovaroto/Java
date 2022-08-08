package subsistema.externo2;

import com.cassio.padroes.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getIntance() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Brasília";
    }

    public String recuperarEstado(String cep){
        return "DF";
    }
}
