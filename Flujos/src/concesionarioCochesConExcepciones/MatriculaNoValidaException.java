/**
 * Paquete contenedor de las clases Coche, Color, Concesionario, Marca, y Modelo.
 */
package concesionarioCochesConExcepciones;

/**
 * Excepci�n lanzada en el caso de que la matricula del coche no sea v�lida.
 */
public class MatriculaNoValidaException extends Exception {

	public MatriculaNoValidaException(String arg0) {
		super(arg0);
	}
}
