package listadoGenerics;

import java.util.ArrayList;

/**
 * TopMusic. Implementa un programa que gestione una lista de las canciones más escuchadas. El usuario podrá:
 * a. Añadir una canción (en una posición) al TopMusic.
 * b. Sacar un elemento del TopMusic.
 * c. Subir un puesto en el TopMusic.
 * d. Bajar un puesto en el TopMusic.
 * e. Mostrar la lista TopMusic.
 * f. Mostrar la canción más escuchada.
 * Sobre la canción se almacenará el título, artista o grupo y año de grabación.
 * 
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */

public class TopMusic<Cancion> {

	ArrayList<Cancion> topMusic;
		
	public TopMusic() {
		topMusic = new ArrayList<Cancion>();
	}
	
	void añadirCancion(Cancion cancion){
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
