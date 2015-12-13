package TopMusic;

import utiles.Menu;
import utiles.Teclado;

public class TestTopMusic {

	static Menu menu = new Menu("TopMusic!!!", 7, new String[]{"A�adir canci�n","Eliminar canci�n","Subir canci�n","Bajar canci�n",
			"Mostrar TopMusic","Mostar m�s escuchada","Salir"});
	static ListaCanciones lista = new ListaCanciones();
	
	/**
	 * Arranque del programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		do{
			int opcion = menu.gestionar();
			hacerOpcion(opcion);
		}while(true);
	}

	/**
	 * Ejecuci�n de las diferentes opciones del menu
	 * 
	 * @param opcion
	 * 			la opci�n recogida por teclado tras el menu
	 */
	private static void hacerOpcion(int opcion) {
		switch(opcion){
			case 1:
				int tama�o = lista.tama�o();
				lista.annadirCancion(Teclado.leerEntero("En que posicion quieres insertar la canci�n (menor a " + (tama�o+1) + ")"),
						new Cancion(Teclado.leerCadena("Titulo:"), Teclado.leerCadena("Artista:"), Teclado.leerCadena("A�o:")));
				break;
			case 2:
				lista.eliminarCancion(Teclado.leerEntero("Cual es la posicion de canci�n que quieres eliminar?"));
				break;
			case 3:
				lista.subirCancion(Teclado.leerEntero("Cual es la posicion de la canci�n que quieres subir?"));
				break;
			case 4:
				lista.bajarCancion(Teclado.leerEntero("Cual es la posicion de la canci�n que quieres bajar?"));
				break;
			case 5:
				System.out.println(lista);
				break;
			case 6:
				System.out.println(lista.masEscuchada());
				break;
			default:
				System.out.println("Adios!!");
				return;
		}	
	}
}
