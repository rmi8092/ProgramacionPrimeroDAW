package listado;

/**
 * @author rafael miranda ibañez
 */

public class HolaMundoExcepcion {
	
	public static void main(String[] args){
	
		String[] mensaje = new String[2];
		mensaje[0] = "Hola ";
		mensaje[1] = "mundo!";
		// este bucle accederá a un índice fuera de rango
				// y lanzará una excepción
		try{
			for (int i = 0; i < 3; i++)
			System.out.println(mensaje[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.toString());
		} finally {
		System.out.println("Después del lanzamiento de la excepción");
		}
	}
}
