package estructuraDePersonas;

/**
 * Crea una estructura din�mica de personas. Una persona consta de:
 * 1. Nombre (regex con m�nimo de tres caracteres v�lidos seguidos)
 * 2. Apellido primero (regex con m�nimo de tres caracteres v�lidos seguidos)
 * 3. Apellido segundo (regex con m�nimo de tres caracteres v�lidos seguidos)
 * 4. Fecha de nacimiento (regex con formato dd/mm/aaaa y (opcional) es v�lida (a�o bisiesto)
 * 5. C�digo postal (regex que admita pplll � pp.lll)
 * 6. Edad (opcional)
 * 7. Identificador un�voco, generado mediante un campo static)
 * Con la estructura podr�s realizar las siguientes operaciones:
 * a. A�adir una nueva persona
 * b. Eliminarla (utiliza contains)
 * c. Contar y mostrar los que hay de una provincia (utiliza iteradores)
 * d. Mostrar la estructura al completo(utiliza toString)
 * 
 * @author Rafael Miranda Iba�ez
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