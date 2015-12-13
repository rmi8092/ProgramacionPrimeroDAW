/**
 * Paquete contenedor de las clases Coche, Color, Concesionario, Marca, y Modelo.
 */
package concesionarioCochesConExcepciones;

/**
 * Excepci�n lanzada en el caso de que el coche ya exista en el concesionario.
 */
public class CocheYaExisteException extends Exception {

	public CocheYaExisteException(String arg0) {
		super(arg0);
	}
}
