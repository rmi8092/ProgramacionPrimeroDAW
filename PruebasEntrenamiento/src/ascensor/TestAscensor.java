package ascensor;

import utiles.Teclado;

public class TestAscensor {
	public static void main(String args[]) {
		
		Ascensor miAscensor = new Ascensor (Teclado.leerEntero("Cuantas plantas tiene tu edificio?"),
				Teclado.leerEntero("En que planta está tu ascensor?"));
		do{
			
			System.out.println(miAscensor.ascensorViajar(Teclado.leerEntero("A que planta quieres ir?")));
		}while(deseaContinuar());
	}
	
	static boolean deseaContinuar() {
		char resp = Character.toUpperCase(Teclado.leerCaracter("Desea continuar en el ascensor y hacer un nuevo viaje?"));
		return resp=='S'?true:false;
	}
}

	
