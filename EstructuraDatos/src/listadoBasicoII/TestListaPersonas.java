package listadoBasicoII;

import java.util.ArrayList;
import java.util.Iterator;

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

public class TestListaPersonas {

	public static void main(String[] args) {
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("Juan","Rodriguez"));
		listaPersonas.add(new Persona("Pedro","Pamplonica"));
		listaPersonas.add(new Persona("Ana","Algarrobo"));
		
		System.out.print(listaPersonas.toString());
	
		listaPersonas.remove(listaPersonas.size()-1);
		System.out.println("\n"+listaPersonas.toString());

		listaPersonas.remove(0);
		System.out.print(listaPersonas.toString());

	}
}
