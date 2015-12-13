package utiles;

import java.util.ArrayList;
import java.util.Iterator;

public class Lista<T> {

	private ArrayList<T> lista;
	
	public Lista() {
		lista = new ArrayList<T>();
	}

	private ArrayList<T> getLista() {
		return lista;
	}
	
	T obtenerElemento(int posicion){
		return lista.get(posicion);
	}
	
	void añadirFinal(T elemento){
		lista.add(elemento);
	}
	
	void insertarEnPosicion(int posicion, T elemento){
		lista.add(posicion,elemento);
	}
	
	boolean estaVacia(){
		if(lista.isEmpty())
			return true;
		return false;
	}
	
	ArrayList<T> reemplazarElemento(int posicion, T elemento){
		lista.set(posicion,elemento);
		return lista;
	}

	int tamañoLista(){
		return lista.size();
	}
	
	ArrayList eliminarElemento(int posicion){
		lista.remove(posicion);
		return lista;
	}
	
	void eliminarElemento(T element){
		lista.remove(element);
	}
	
	boolean buscarElemento(T elemento){
		return lista.contains(elemento);
	}
	
	Object copiarLista(){
		return lista.clone();
	}
	
	@Override
	public String toString() {
		return "Lista [lista=" + lista + "]";
	}
	
	String toStringNumerado(){
	  Iterator<T> it= lista.iterator();
	  int i=0;
	  String cadena="";
	  while(it.hasNext()){
		  cadena+="\t"+i+")- "+it.next()+"\n";
		  i++;
	  }
	  return cadena;
	 }
}
