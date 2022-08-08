package com.cassio.padroes.singleton;

/**
 * Singleton Lazy Holder
 * Trabalha com a instância encapsulada
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência de Singleton Lazy Holder</a>
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getIntance() {
        return InstanceHolder.instancia;
    }
}
