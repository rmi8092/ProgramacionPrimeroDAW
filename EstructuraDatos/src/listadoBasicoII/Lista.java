package listadoBasicoII;

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

import java.util.ArrayList;
import java.util.Iterator;

public class Lista {

	private ArrayList lista;
	
	public Lista() {
		lista = new ArrayList();
	}

	private ArrayList getLista() {
		return lista;
	}
	
	void añadirFinal(Jugador jugador){
		lista.add(jugador);
	}
	
	void insertarEnPosicion(int posicion, Jugador jugador){
		lista.add(posicion,jugador);
	}
	
	ArrayList reemplazarElemento(int posicion, Jugador jugador){
		lista.set(posicion,jugador);
		return lista;
	}

	int tamañoLista(){
		return lista.size();
	}
	
	ArrayList eliminarElemento(int posicion){
		lista.remove(posicion);
		return lista;
	}
	
	boolean buscarElemento(Jugador jugador){
		return lista.contains(jugador);
	}
	
	/*String buscarElemento(Jugador jugador){	//OTRA IMPLEMENTACION
		Iterator iterator = lista.iterator();
		while(iterator.hasNext()){
			Object element = iterator.next();
			if (element.equals(jugador))
				return "El jugador " + jugador.toString() + "pertenece a la lista.";
		}
		return "El jugador " + jugador.toString() + "no pertenece a la lista.";
	}*/
	
	Object copiarLista(){
		return lista.clone();
	}
	
	@Override
	public String toString() {
		return "Lista [lista=" + lista + "]";
	}
}
