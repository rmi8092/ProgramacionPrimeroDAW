package listado;

public class TestCapturaExcepcion {

	public static void main(String[] args) {
		
		int dividendo = 7;
		int divisor = 0;
		try {
			int cociente = dividendo / divisor;
		} catch (ArithmeticException e){
			System.err.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.toString());
		}
		System.out.println("Aaaaadios");
	}
}
