package listado;

/**
 * @author rafael miranda ibañez
 */

public class TestLanzaExcepcion {

	public static void main(String[] args) {
		metodo1();
		System.out.println("main: Acabando...");
	}
	
	private static void metodo1(){
		metodo2();
		System.out.println("Metodo1: Acabando...");
	}
	
	private static void metodo2(){
		String nula = null;
		nula.toString();
		System.out.println("Metodo 2: Acabando...");
	}
}
