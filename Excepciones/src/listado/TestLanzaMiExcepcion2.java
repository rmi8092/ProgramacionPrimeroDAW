package listado;

/**
 * @author rafael miranda ibañez
 */

public class TestLanzaMiExcepcion2 {

	public static void main(String[] args) {
		try{
			metodo1();
			System.out.println("main: Acabando...");
		} catch (MiExcepcion e){
			System.err.println(e.getMessage());
		}
	}
	
	private static void metodo1() throws MiExcepcion{
		metodo2();
		System.out.println("Metodo1: Acabando...");
	}
	
	private static void metodo2() throws MiExcepcion{
		String nula = null;
		if(nula != null){
			nula.toString();
			System.out.println("Metodo 2: Acabando...");
		}
		else
			throw new MiExcepcion("Mi primera excepcion");
	}
}
