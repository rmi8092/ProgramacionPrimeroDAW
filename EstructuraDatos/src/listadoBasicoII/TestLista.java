package listadoBasicoII;

import utiles.Menu;
import utiles.Teclado;

/**
 * Entrega la clase Lista que:
 * a. Añada al final de la lista
 * b. Inserte un elemento en una determinada posición
 * c. Modifique un elemento reemplazándolo por otro
 * d. Conozca el tamaño de la lista
 * e. Elimine elementos de la lista
 * f. Busque elementos en la lista
 * g. Copie la lista
 * Utilízala en un ejemplo TestLista (por ejemplo, la alineación de un equipo de fútbol, con
 * titulares y reservas) y entrégalo correctamente identificado y documentado, incluyendo
 * JavaDoc.
 * Deberás implementar un menú con las opciones posibles para que el usuario lo utilice
 * fácilmente.
 * 
 * @author rafael miranda ibañez
 * @version 1.0
 */

public class TestLista {
	public static void main (String args[]){
		
		Menu menu = new Menu ("Alineacion", new String[] {"añadir al final", "insertar elemento", "reemplazar elemento",
				"tamaño alineacion", "eliminar elemento", "buscar en la alineacion", "copiar alineacion", "salir"});
		
		Lista alineacion = new Lista();
				
		do{
			switch (menu.gestionar()){
				case 1:
					alineacion.añadirFinal(new Jugador(Teclado.leerCadena("\nCual es el nombre del jugador que quieres añadir?")));
					break;
				case 2:
					alineacion.insertarEnPosicion(Teclado.leerEntero("Posicion del elemento a introducir."),
							new Jugador(Teclado.leerCadena("\nCual es el nombre del jugador que quieres insertar?")));
					break;
				case 3:
					alineacion.reemplazarElemento(Teclado.leerEntero("Posicion del elemento a reemplazar."),
							new Jugador(Teclado.leerCadena("\nCual es el nombre del jugador que quieres añadir?")));
					break;
				case 4:
					System.out.println("Tamaño: " + alineacion.tamañoLista());
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
