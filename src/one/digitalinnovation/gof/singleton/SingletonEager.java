package one.digitalinnovation.gof.singleton;


/**
 * Singleton 'apressado',
 * 
 * @author Tarcisio
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();;
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getIntancia() {
		
		return instancia;
	}
}
