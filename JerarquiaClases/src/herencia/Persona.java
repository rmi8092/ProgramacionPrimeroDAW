package herencia;

/**
 * Dise�a, implementa y prueba las clases Persona, Estudiante y TestEstudiante. Para ello, supongamos que:
 * a. Una persona tiene nombre, apellidos y nif.
 * b. Un estudiante est� cursando un curso dentro de un nivel (PRIMARIA, ESO, BACHILLERARO, UNIVERSIDAD)
 * c. Implementa los m�todos getters, setters y toString
 * d. En la clase TestEstudiante:
 *    i. Cree dos personas
 *    ii. Cree dos estudiantes
 *    iii. Muestre los cuatro objetos
 *    iv. Asigne un estudiante a una referencia de persona. �Qu� m�todos pueden usarse?
 *    v. Asigne una persona a un estudiante. �Qu� m�todos pueden usarse?
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

public class Persona {

	private String nombre;
	private String apellido;
	private String nif;

	public Persona(String nombre, String apellido, String nif) {
		setNombre(nombre);
		setApellido(apellido);
		setNif(nif);
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getApellido() {
		return apellido;
	}

	void setApellido(String apellido) {
		this.apellido = apellido;
	}

	String getNif() {
		return nif;
	}

	void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", nif=" + nif + "]";
	}
}
