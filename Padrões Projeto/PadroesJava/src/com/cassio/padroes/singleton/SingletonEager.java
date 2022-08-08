package com.cassio.padroes.singleton;

/**
 * Singleton "eager" =  apressado
 * Já disponibiliza a instância a partir do construtor
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getIntance() {
        return instancia;
    }
}
