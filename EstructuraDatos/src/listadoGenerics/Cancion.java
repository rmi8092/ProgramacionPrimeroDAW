package listadoGenerics;

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

public class Cancion {

	private String titulo;
	private String artista_grupo;
	private int añoGrabacion;

	public Cancion(String titulo, String artista_grupo, int añoGrabacion) {
		setTitulo(titulo);
		setArtista(artista_grupo);
		setAñoGrabacion(añoGrabacion);
	}

	String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private String getArtista() {
		return artista_grupo;
	}

	private void setArtista(String artista_grupo) {
		this.artista_grupo = artista_grupo;
	}

	private int getAñoGrabacion() {
		return añoGrabacion;
	}

	private void setAñoGrabacion(int añoGrabacion) {
		this.añoGrabacion = añoGrabacion;
	}

	@Override
	public String toString() {
		return "titulo=" + titulo + ", artista/grupo=" + artista_grupo
				+ ", añoGrabacion=" + añoGrabacion + "\n";
	}
}
