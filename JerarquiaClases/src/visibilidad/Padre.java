package visibilidad;

/**
 * A cada m�todo le doy una visibilidad distinta. Voy a crear dos subclases, una
 * en cada paquete. Intentar� redefinirlos.
 * 
 * En Eclipse, utiliza el di�logo "Override/Implement Methods..."
 * 
 * @author mlmc
 * 
 */
public class Padre {
	protected int i = 1;
	int j = 2;
	
	private void metodo1() {
		System.out.println("metodo1 de padre");
	}

	void metodo2() {
		System.out.println("metodo2 de padre");
	}

	protected void metodo3() {
		System.out.println("metodo3 de padre");
	}

	public void metodo4() {
		System.out.println("metodo4 de padre");
	}
}
