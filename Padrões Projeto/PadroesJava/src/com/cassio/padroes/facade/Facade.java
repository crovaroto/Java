package com.cassio.padroes.facade;

import subsistema.externo.BaseService;
import subsistema.externo2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getIntance().recuperarCidade(cep);
        String estado = CepApi.getIntance().recuperarEstado(cep);
        BaseService.gravarCliente(nome, cep, estado, cidade);
    }
}
