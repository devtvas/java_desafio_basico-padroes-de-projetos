package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		// Singleton
		SingletonLazy lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		// eager
		SingletonEager eager = SingletonEager.getIntancia();
		System.out.println(eager);
		eager = SingletonEager.getIntancia();
		System.out.println(eager);
		// lazyHolder
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		
		facade.migrarCliente("Venilton", "74603090");
	}

}
