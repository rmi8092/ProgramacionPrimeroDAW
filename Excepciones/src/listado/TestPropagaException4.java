package listado;

/**
 * @author rafael miranda ibañez
 */

public class TestPropagaException4 {
	public static void main(String[] args) {
		try{
			metodo1();
		} catch (ArithmeticException e){
			System.err.println("Division por cero");
		}
	}
	private static void metodo1() {
		metodo2();
	}
	private static void metodo2() {
		metodo3();
	}
	private static void metodo3() {
		int a = 7 / 0;
	}
}
