package listado;

/**
 * @author rafael miranda iba�ez
 */

public class HolaMundoExcepcion {
	
	public static void main(String[] args){
	
		String[] mensaje = new String[2];
		mensaje[0] = "Hola ";
		mensaje[1] = "mundo!";
		// este bucle acceder� a un �ndice fuera de rango
				// y lanzar� una excepci�n
		try{
			for (int i = 0; i < 3; i++)
			System.out.println(mensaje[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.toString());
		} finally {
		System.out.println("Despu�s del lanzamiento de la excepci�n");
		}
	}
}
