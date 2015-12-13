package estructuraDePersonas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import utiles.Menu;
import utiles.Teclado;

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

public class TestEstructuraPersonas {

	static Menu menu = new Menu("Censo Personas", new String[]{"Añadir persona", "Eliminar persona", "Contrar y mostrar los de misma provincia",
			"Mostrar censo completo", "Salir"});
	//static Menu menuGenero = new Menu("Genero persona", 2, new String[]{"Masculino","Femenino"});
	static ListaPersonas lista = new ListaPersonas();
		
	public static void main (String []args){
		
		lista.annadirPersona("Anamaria", "Gómez", "Delrío", 
				"51002","31/01/2000");
		lista.annadirPersona("Pepe", "Tómez", "Delrío", 
				"51003","31/01/2000");
		lista.annadirPersona("Anacleta", "Francia", "Delrío",
				"14002","31/01/2000");
		lista.annadirPersona("Rigoberto", "Fernández", "Delrío", 
				"14003","31/01/2000");
		
		System.out.println("Inicialmente, la lista contiene: \n"+lista.toString());
		
		int opcion;
		do{
			opcion = menu.gestionar();
			ejecutarOpcion(opcion);
		}while(opcion!=5);
	}

	private static void ejecutarOpcion(int opcion) {
		switch(opcion){
		case 1:
			lista.annadirPersona(Teclado.leerCadena("Nombre:"),Teclado.leerCadena("Primer apellido:"),
					Teclado.leerCadena("Segundo apellido:"),Teclado.leerCadena("Codigo Postal:"),Teclado.leerCadena("Fecha nacimiento:"));
			break;
		case 2:
			lista.eliminarPersona(Teclado.leerEntero("Cual es el id de la persona que quieres borrar?"));
			break;
		case 3:
			System.out.println(lista);
			String cp = Teclado.leerCadena("Introduce los dos primeros digitos de la provincia que quieres censar.");
			ArrayList<Persona> recuento = lista.recuentoProvincias(cp);
			
			ListIterator<Persona> it = recuento.listIterator(recuento.size());
			while(it.hasPrevious()){
				Persona persona = (Persona) it.previous();
				System.out.println(persona);
			}
			System.out.println("El numero de personas en esa provincia es: " + recuento.size());
			break;
		case 4:
			System.out.println(lista);
			break;
		default:
			return;
		}
	}
}
