package listaPersonas;

import java.util.ArrayList;

public class ListaPersonas {

	ArrayList<Persona> lista;
	
	public ListaPersonas() {
		setLista(new ArrayList<Persona>());
	}

	private ArrayList<Persona> getLista() {
		return lista;
	}

	private void setLista(ArrayList<Persona> lista) {
		this.lista = lista;
	}

	boolean annadir(Persona persona){
		if(persona == null)
			return false;
		if(lista.contains(persona))
			return false;
		return lista.add(persona);
	}
}
