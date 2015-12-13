package listado;

/**
 * @author rafael miranda ibañez
 */

public class TestCapturaEnElMain {

	public static void main(String[] args) {
		try{
			metodo1();
			System.out.println("main: Acabando...");
		} catch (NullPointerException e){
			System.err.println(e.getMessage());
		}
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
