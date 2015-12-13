package listadoBasicoII;

/**
 * Entrega la clase TestListaPersonas que haga lo siguiente:
 * a. Cree una lista (ArrayList) de personas.
 * 		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();//Generics
 * b. Añada tres personas a la lista (3 elementos).
 * c. Muestre la lista. (implementa toString() en Persona)
 * d. Elimine el último elemento.
 * e. Muestre la lista.
 * f. Elimine el primer elemento.
 * g. Muestre la lista.
 * La persona tiene al menos nombre y apellidos.
 * 
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */

public class Persona {

	private String nombre;
	private String apellido;
	
	public Persona() {
	}

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Nombre = " + nombre + " -- Apellido = " + apellido;
	}
}
