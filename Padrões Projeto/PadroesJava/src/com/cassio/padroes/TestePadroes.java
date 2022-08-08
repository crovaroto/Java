package com.cassio.padroes;

import com.cassio.padroes.facade.Facade;
import com.cassio.padroes.singleton.SingletonEager;
import com.cassio.padroes.singleton.SingletonLazy;
import com.cassio.padroes.singleton.SingletonLazyHolder;
import com.cassio.padroes.strategy.*;

public class TestePadroes {
    public static void main(String[] args) {
        //Testes de Singleton
        /*
        SingletonLazy lazy = SingletonLazy.getIntance();
        System.out.println("Singleton Lazy " + lazy);
        lazy = SingletonLazy.getIntance();
        System.out.println("Singleton Lazy " + lazy);

        SingletonEager eager = SingletonEager.getIntance();
        System.out.println("Singleton Eager " + eager);
        eager = SingletonEager.getIntance();
        System.out.println("Singleton Eager " + eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIntance();
        System.out.println("Singleton Lazy Holder " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getIntance();
        System.out.println("Singleton Lazy Holder " + lazyHolder);
         */

        /*//Testes de Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();
         */

        //Testes Facade
        Facade facade = new Facade();
        facade.migrarCliente("Cássio", "72007095");
    }

}
