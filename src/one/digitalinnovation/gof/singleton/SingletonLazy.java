package one.digitalinnovation.gof.singleton;


/**
 * Singleton 'pregui�oso',
 * 
 * @author Tarcisio
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getIntancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
