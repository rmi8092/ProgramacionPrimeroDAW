package listado;

/**
 * @author rafael miranda ibañez
 */

public class TestPropagaExcepcion3 {
	public static void main(String[] args) {
		metodo1();
	}
	private static void metodo1() {
		metodo2();
	}
	private static void metodo2() {
		try{
			metodo3();
		} catch (ArithmeticException e) {
			System.err.println("Division por cero");
		}
	}
	private static void metodo3() {
		int a = 7 / 0;
	}
}
