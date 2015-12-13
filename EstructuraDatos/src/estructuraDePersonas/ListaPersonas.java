package estructuraDePersonas;

/**
 * Crea una estructura dinámica de personas. Una persona consta de:
 * 1. Nombre (regex con mínimo de tres caracteres válidos seguidos)
 * 2. Apellido primero (regex con mínimo de tres caracteres válidos seguidos)
 * 3. Apellido segundo (regex con mínimo de tres caracteres válidos seguidos)
 * 4. Fecha de nacimiento (regex con formato dd/mm/aaaa y (opcional) es válida (año bisiesto)
 * 5. Código postal (regex que admita pplll ó pp.lll)
 * 6. Edad (opcional)
 * 7. Identificador unívoco, generado mediante un campo static)
 * Con la estructura podrás realizar las siguientes operaciones:
 * a. Añadir una nueva persona
 * b. Eliminarla (utiliza contains)
 * c. Contar y mostrar los que hay de una provincia (utiliza iteradores)
 * d. Mostrar la estructura al completo(utiliza toString)
 * 
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonas {

	private ArrayList<Persona> lista = new ArrayList<Persona>();

	boolean annadirPersona(String nombre, String apellidoPrimero,
			String apellidoSegundo, String codigoPostal, String fechaNacimiento) {
		Persona persona = Persona.instanciarPersona(nombre, apellidoPrimero,
				apellidoSegundo, codigoPostal, fechaNacimiento);
		if (persona == null || lista.contains(persona))
			return false;
		return lista.add(persona);
	}

	boolean eliminarPersona(int id) {
		Persona persona = Persona.instanciarPersona(id);
		return lista.remove(persona);
	}

	ArrayList<Persona> recuentoProvincias(String cp) {
		ArrayList<Persona> nuevaLista = new ArrayList<Persona>();
		/*
		 * Iterator<Persona> it = getLista().iterator();
		 * while(it.hasNext()){
		 * Persona person = (Persona)it.next();
		 */
		for (Persona persona : lista) {
			if (persona.getProvincia().equals(cp))
				nuevaLista.add(persona);
		}
		return nuevaLista;
	}

	@Override
	public String toString() {
		return "Censo de personas =" + lista + "]";
	}

	/*
	 * @Override public String toString() { Iterator<Persona> it =
	 * getLista().iterator(); String cadena = ""; int i = 0;
	 * while(it.hasNext()){ cadena += i + ". "+ it.next() + "\n"; i++; } return
	 * cadena; }
	 */
}