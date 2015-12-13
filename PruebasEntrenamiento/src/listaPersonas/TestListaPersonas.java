package listaPersonas;

import utiles.Menu;
import utiles.Teclado;

public class TestListaPersonas {

	private static ListaPersonas lista = new ListaPersonas();
	
	public static void main(String[] args) {

		Menu menu = new Menu("Censo de personas", 5, new String[]{"Añadir persona","Eliminar personas","Contar y mostrar provincias",
				"Mostrar el censo","Salir"});
		
		do{
			int opcion = menu.gestionar();
			ejecutarMenu(opcion);
		}while(true);
	}

	private static void ejecutarMenu(int opcion) {
		switch(opcion){
			case 1:
				annadirPersona();
				break;
			case 2:
				eliminarPersona();
				break;
			case 3:
				contarProvincias();
				break;
			case 4:
				System.out.println();
				break;
			default:
				return;
		}
	}

	private static void annadirPersona() {
		Genero genero=null;
			System.out.println("Para escoger masculino introduzca 0 y para femenino introduzca 1.");
			int opcion=Teclado.leerEntero("Introduce la opcion deseada");
			do{
				switch(opcion){
					case 0:
						genero=Genero.obtenerMasculino();
						break;
					case 1:
						genero=Genero.obtenerFemenino();
						break;
				}
			}while(opcion!=0 && opcion!=1);
		
		if(lista.annadir(Persona.instanciarPersona(Teclado.leerCadena("Nombre:"),Teclado.leerCadena("Apellido:"), genero,
				Teclado.leerCadena("Fecha nacimiento:"),Teclado.leerCadena("Codigo postal:"))))
			System.out.println("Persona añadida con éxito");
		else
			System.out.println("Persona no se puede añadir");
	}
	
	private static void eliminarPersona() {

	}

	private static void contarProvincias() {
	
	}
}
