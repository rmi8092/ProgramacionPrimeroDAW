package listado;

public class TestLanzaMiExcepcion {

	public static void main(String[] args) {
		metodo1();
		System.out.println("main: Acabando...");
	}
	
	private static void metodo1(){
		try{
			metodo2();
			System.out.println("Metodo1: Acabando...");
		} catch (MiExcepcion e) {
			System.err.println(e.getMessage());
		}
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
