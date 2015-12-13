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

public class Estudiante extends Persona {
	
	private Nivel nivel;

	public Estudiante(String nombre, String apellido, String nif, Nivel nivel) {
		super(nombre, apellido,nif);
		setNivel(nivel);
	}

	Nivel getNivel() {
		return nivel;
	}

	void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return super.toString() + "\tEstudiante [nivel=" + nivel + "]";
	}
}
