package TopMusic;

import java.util.ArrayList;

public class ListaCanciones {

	/**
	 * Lista de todas las canciones que tenemos
	 */
	private ArrayList<Cancion> lista;
	
	/**
	 * Se crea una lista vacia
	 */
	public ListaCanciones() {
		setLista(new ArrayList<Cancion>());
	}

	/**
	 * @return la lista
	 */
	private ArrayList<Cancion> getLista() {
		return lista;
	}

	/**
	 * @param lista
	 *            modifica la lista
	 */
	private void setLista(ArrayList<Cancion> lista) {
		this.lista = lista;
	}
	
	/**
	 * A�ade una cancion a la lista
	 * 
	 * @param posicion
	 *            posicion donde se quiere a�adir.
	 * @param cancion
	 * 			  cancion a a�adir
	 */
	void annadirCancion(int posicion, Cancion cancion){
		lista.add(posicion, cancion);
	}
	
	/**
	 * Elimina una cancion de la lista
	 * 
	 * @param posicion
	 *            posicion de la cancion a eliminar.
	 * @return true si el art�culo se elimina. False en otro caso (cancion no existente en la lista)
	 */
	boolean eliminarCancion(int posicion){
		Cancion cancion = lista.get(posicion);
		if(cancion == null)
			return false;
		else
			return lista.remove(cancion);
	}
	
	/**
	 * Promociona una cancion en el ranking
	 * 
	 * @param posicion
	 *            posicion de la cancion a promocionar.
	 */
	void subirCancion(int posicion){
		Cancion cancion_alt = lista.get(posicion-1);
		lista.set(posicion-1, lista.get(posicion));
		lista.set(posicion, cancion_alt);
	}
	
	/**
	 * Degrada una cancion en el ranking
	 * 
	 * @param posicion
	 *            posicion de la cancion a degradar.
	 */
	void bajarCancion(int posicion){
		Cancion cancion_alt = lista.get(posicion+1);
		lista.set(posicion+1, lista.get(posicion));
		lista.set(posicion, cancion_alt);
	}
	
	/**
	 * Da el tama�o de la lista
	 * 
	 * @return el tama�o de la lista.
	 */
	int tama�o() {
		return lista.size();
	}
	
	/**
	 * Da el primer elemento de la lista (cancion m�s escuchada)
	 * 
	 * @return el primer elemento de la lista.
	 */
	Cancion masEscuchada(){
		return lista.get(0);
	}

	@Override
	public String toString() {
		return ""+lista;
	}
}
