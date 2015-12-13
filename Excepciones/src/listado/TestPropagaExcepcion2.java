package listado;

/**
 * @author rafael miranda ibañez
 */

public class TestPropagaExcepcion2 {
	public static void main(String[] args) {
		metodo1();
	}
	private static void metodo1() {
		metodo2();
	}
	private static void metodo2() {
		metodo3();
	}
	private static void metodo3() {
		try{
			int a = 7 / 0;
		} catch (ArithmeticException e){
			System.err.println("Division por cero");
		}
	}
}

