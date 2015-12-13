package listadoGenerics;

import java.util.ArrayList;

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

public class TopMusic<Cancion> {

	ArrayList<Cancion> topMusic;
		
	public TopMusic() {
		topMusic = new ArrayList<Cancion>();
	}
	
	void a�adirCancion(Cancion cancion){
		topMusic.add(cancion);
	}
	
	void sacarCancion(int posicion){
		topMusic.remove(posicion);
	}
	
	void subirUnPuesto(int posicion){
		Cancion cancionABajar = topMusic.get(posicion-1);
		topMusic.set(posicion-1, topMusic.get(posicion));
		topMusic.set(posicion, cancionABajar);
	}
	
	void bajarUnPuesto(int posicion){
		Cancion cancionASubir = topMusic.get(posicion+1);
		topMusic.set(posicion+1, topMusic.get(posicion));
		topMusic.set(posicion, cancionASubir);
	}
	
	void mostrarTopMusic(){
		System.out.println(topMusic.toString());
	}
	
	void mostrarMasEscuchada(){
		System.out.println(topMusic.get(0).toString());
	}

	@Override
	public String toString() {
		return "TopMusic " + topMusic;
	}
}
