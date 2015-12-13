package listadoGenerics;

import utiles.Menu;
import utiles.Teclado;

/**
 * Crea una clase generica Lista. Has de implementar los siguientes m�todos:
 * a. A�ada al final de la lista
 * b. Inserte un elemento en una determinada posici�n
 * c. Modifique un elemento reemplaz�ndolo por otro
 * d. Conozca el tama�o de la lista
 * e. Elimine elementos de la lista
 * f. Busque elementos en la lista
 * g. Copie la lista
 * Util�zala en un ejemplo TestLista (por ejemplo, la alineaci�n de un equipo de f�tbol, con
 * titulares y reservas) y entr�galo correctamente identificado y documentado, incluyendo
 * JavaDoc.
 * Deber�s implementar un men� con las opciones posibles para que el usuario lo utilice
 * f�cilmente.
 * 
 * @author rafael miranda iba�ez
 * @version 1.0
 */

public class TestLista {
	public static void main (String args[]){
		
		Menu menu = new Menu ("Alineacion", new String[] {"a�adir al final", "insertar elemento", "reemplazar elemento",
				"tama�o alineacion", "eliminar elemento", "buscar en la alineacion", "copiar alineacion", "salir"});
		
		Lista alineacion = new Lista();
				
		do{
			switch (menu.gestionar()){
				case 1:
					alineacion.a�adirFinal(new Jugador(Teclado.leerCadena("\nCual es el nombre del jugador que quieres a�adir?")));
					break;
				case 2:
					alineacion.insertarEnPosicion(Teclado.leerEntero("Posicion del elemento a introducir."),
							new Jugador(Teclado.leerCadena("\nCual es el nombre del jugador que quieres insertar?")));
					break;
				case 3:
					alineacion.reemplazarElemento(Teclado.leerEntero("Posicion del elemento a reemplazar."),
							new Jugador(Teclado.leerCadena("\nCual es el nombre del jugador que quieres a�adir?")));
					break;
				case 4:
					System.out.println("Tama�o: " + alineacion.tama�oLista());
					break;
				case 5:
					alineacion.eliminarElemento(Teclado.leerEntero("Posicion del elemento a eliminar."));
					break;
				case 6:
					if(alineacion.buscarElemento(new Jugador(Teclado.leerCadena("\nCual es el nombre del jugador que quieres buscar?"))))
						System.out.println("El elemento pertenece a la lista");
					else
						System.out.println("El elemento no pertenece a la lista");
					break;
					/*System.out.println(alineacion.buscarElemento(new Jugador(Teclado.leerCadena("\nCual es el nombre del jugador que quieres buscar?"))));
					 break;*/ //OTRA IMPLEMENTACION
				case 7:
					alineacion.copiarLista();
					break;
				case 8:
					System.out.println("Adios");
					return;
				}
			System.out.println(alineacion.toString());
		}while(true);
	}
}
