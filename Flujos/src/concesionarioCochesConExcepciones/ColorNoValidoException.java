/**
 * Paquete contenedor de las clases Coche, Color, Concesionario, Marca, y Modelo.
 */
package concesionarioCochesConExcepciones;

/**
 * Excepci�n lanzada en el caso de que el color del coche no sea valido.
 */
public class ColorNoValidoException extends Exception {

	public ColorNoValidoException(String arg0) {
		super(arg0);
	}
}
