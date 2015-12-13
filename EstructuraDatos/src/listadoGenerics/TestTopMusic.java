package listadoGenerics;

import listadoBasicoII.Jugador;
import utiles.Menu;
import utiles.Teclado;

/**
 * TopMusic. Implementa un programa que gestione una lista de las canciones m�s escuchadas. El usuario podr�:
 * a. A�adir una canci�n (en una posici�n) al TopMusic.
 * b. Sacar un elemento del TopMusic.
 * c. Subir un puesto en el TopMusic.
 * d. Bajar un puesto en el TopMusic.
 * e. Mostrar la lista TopMusic.
 * f. Mostrar la canci�n m�s escuchada.
 * Sobre la canci�n se almacenar� el t�tulo, artista o grupo y a�o de grabaci�n.
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

public class TestTopMusic {
	
	static TopMusic ranking = new TopMusic();

	public static void main(String[] args) {
		
		Menu menu = new Menu ("TopMusic!!!", new String[] {"A�adir cancion", "Eliminar cancion", "Subir cancion",
				"Bajar cancion", "Mostrar ranking", "Cancion mas escuchada", "salir"});
		
		int opcion = 0;
		do{
			opcion = menu.gestionar();
			Menu(opcion);
		}while(opcion!=7);
	}
	
	public static void Menu(int opcion){
		switch (opcion){
		case 1:
			ranking.a�adirCancion(new Cancion(Teclado.leerCadena("\nCual es el nombre de la cancion que quieres a�adir?"),
					Teclado.leerCadena("\nDe qu� artista o grupo es?"), Teclado.leerEntero("\nDe qu� a�o es?")));
			break;
		case 2:
			ranking.sacarCancion(Teclado.leerEntero("Posicion de la cancion a eliminar."));
			break;
		case 3:
			ranking.subirUnPuesto(Teclado.leerEntero("Posicion de la canci�n a subir un puesto."));
			break;
		case 4:
			ranking.bajarUnPuesto(Teclado.leerEntero("Posicion de la canci�n a bajar un puesto."));
			break;
		case 5:
			ranking.mostrarTopMusic();
			break;
		case 6:
			ranking.mostrarMasEscuchada();
			break;
		default:
			System.out.println("Adios");
			return;
		}
	}
}
