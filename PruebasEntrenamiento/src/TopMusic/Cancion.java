package TopMusic;

/**
 * TopMusic. Implementa un programa que gestione una lista de las canciones más
 * escuchadas. El usuario podrá:
 * a. Añadir una canción (en una posición) al TopMusic.
 * b. Sacar un elemento del TopMusic.
 * c. Subir un puesto en el TopMusic.
 * d. Bajar un puesto en el TopMusic.
 * e. Mostrar la lista TopMusic.
 * f. Mostrar la canción más escuchada.
 * Sobre la canción se almacenará el título, artista o grupo y año de grabación.
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
	 * Año de lanzamiento
	 */
	private String año;
	
	/**
	 * @param titulo
	 * @param artista
	 * @param año
	 */
	public Cancion(String titulo, String artista, String año) {
		setTitulo(titulo);
		setArtista(artista);
		setAño(año);
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
	 * @return el año
	 */
	private String getAño() {
		return año;
	}

	/**
	 * @param año el año de lanzamiento
	 */
	private void setAño(String año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "\nTitulo=" + titulo + "\n" + "Artista=" + artista + "\n" + "Año="
				+ año + "\n";
	}
}
