package com.cassio.padroes.singleton;

/**
 * Singleton "lazy" =  preguiçoso
 * Em um primeiro momento não disponibiliza a instância
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getIntance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
