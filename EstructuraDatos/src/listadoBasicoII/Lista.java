package listadoBasicoII;

/**
 * Entrega la clase Lista que:
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
	
	void a�adirFinal(Jugador jugador){
		lista.add(jugador);
	}
	
	void insertarEnPosicion(int posicion, Jugador jugador){
		lista.add(posicion,jugador);
	}
	
	ArrayList reemplazarElemento(int posicion, Jugador jugador){
		lista.set(posicion,jugador);
		return lista;
	}

	int tama�oLista(){
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
