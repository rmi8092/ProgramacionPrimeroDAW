package listadoGenerics;

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

public class Cancion {

	private String titulo;
	private String artista_grupo;
	private int a�oGrabacion;

	public Cancion(String titulo, String artista_grupo, int a�oGrabacion) {
		setTitulo(titulo);
		setArtista(artista_grupo);
		setA�oGrabacion(a�oGrabacion);
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

	private int getA�oGrabacion() {
		return a�oGrabacion;
	}

	private void setA�oGrabacion(int a�oGrabacion) {
		this.a�oGrabacion = a�oGrabacion;
	}

	@Override
	public String toString() {
		return "titulo=" + titulo + ", artista/grupo=" + artista_grupo
				+ ", a�oGrabacion=" + a�oGrabacion + "\n";
	}
}
