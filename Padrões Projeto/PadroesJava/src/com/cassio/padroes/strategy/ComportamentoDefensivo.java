package com.cassio.padroes.strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se de maneira defensiva.... ");
    }
}
