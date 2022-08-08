package com.cassio.padroes.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se de maneira agressiva... ");
    }
}
