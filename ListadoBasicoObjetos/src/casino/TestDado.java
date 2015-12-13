package casino;

import utiles.Menu;
import utiles.Teclado;

public class TestDado {

	public static void main(String args[]) {

		Menu menudado = new Menu ("Menu Dado", 2, new String[]{"lanzar dado", "salir"});
		Dado miDado = new Dado();
		
		int opcion;
		do{
			opcion = menudado.gestionar();
			switch (opcion){
			case 1:
				miDado.lanzar();
				System.out.println(miDado.toString());
				break;
			case 2:
				return;
			}
		}while(opcion!=2);	
	}
}
