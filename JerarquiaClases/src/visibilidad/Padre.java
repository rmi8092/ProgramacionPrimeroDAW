package visibilidad;

/**
 * A cada método le doy una visibilidad distinta. Voy a crear dos subclases, una
 * en cada paquete. Intentaré redefinirlos.
 * 
 * En Eclipse, utiliza el diálogo "Override/Implement Methods..."
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
