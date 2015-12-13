package TopMusic;

/**
 * TopMusic. Implementa un programa que gestione una lista de las canciones m�s
 * escuchadas. El usuario podr�:
 * a. A�adir una canci�n (en una posici�n) al TopMusic.
 * b. Sacar un elemento del TopMusic.
 * c. Subir un puesto en el TopMusic.
 * d. Bajar un puesto en el TopMusic.
 * e. Mostrar la lista TopMusic.
 * f. Mostrar la canci�n m�s escuchada.
 * Sobre la canci�n se almacenar� el t�tulo, artista o grupo y a�o de grabaci�n.
 * 
 * @author rafael
 * @version 1.0
 */

public class Cancion {
	/**
	 * Titulo de la cancion
	 */
	private String titulo;
	/**
	 * Nombre del artista
	 */
	private String artista;
	/**
	 * A�o de lanzamiento
	 */
	private String a�o;
	
	/**
	 * @param titulo
	 * @param artista
	 * @param a�o
	 */
	public Cancion(String titulo, String artista, String a�o) {
		setTitulo(titulo);
		setArtista(artista);
		setA�o(a�o);
	}

	/**
	 * @return el titulo
	 */
	private String getTitulo() {
		return titulo;
	}
	
	/**
	 * @param titulo
	 *            modifica el titulo
	 */
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return el artista
	 */
	private String getArtista() {
		return artista;
	}
	
	/**
	 * @param artista
	 *            modifica el artista
	 */
	private void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * @return el a�o
	 */
	private String getA�o() {
		return a�o;
	}

	/**
	 * @param a�o el a�o de lanzamiento
	 */
	private void setA�o(String a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "\nTitulo=" + titulo + "\n" + "Artista=" + artista + "\n" + "A�o="
				+ a�o + "\n";
	}
}
