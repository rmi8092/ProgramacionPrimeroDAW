package casino;

import utiles.Menu;
import utiles.Teclado;

public class JuegoDado {

	public static void main(String args[]) {

		Menu menuDado = new Menu ("Menu Dado", 2, new String[]{"lanzar dado", "salir"});
		Dado miDado = new Dado();
		
		int opcion;
		do{
			opcion = menuDado.gestionar();
			switch (opcion){
			case 1:
				jugarDados(miDado);
				break;
			case 2:
				return;
			}
		}while(opcion!=2);	
	}
	
	public static void jugarDados(Dado miDado){
		int j1;
		int j2;
		
		do{
			j1 = miDado.lanzar();
			System.out.println(miDado.toString());
			j2 = miDado.lanzar();
			System.out.println(miDado.toString());
			
			
			if(j1<j2)
				System.out.println("Gana el jugador numero 2.");
			if(j1>j2)
				System.out.println("Gana el jugador numero 1");
			if(j1==j2)
				System.out.println("Empate, lance de nuevos los dados");
		}while(j1==j2);			
	}
}
