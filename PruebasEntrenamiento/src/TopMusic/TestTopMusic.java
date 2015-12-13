package TopMusic;

import utiles.Menu;
import utiles.Teclado;

public class TestTopMusic {

	static Menu menu = new Menu("TopMusic!!!", 7, new String[]{"Añadir canción","Eliminar canción","Subir canción","Bajar canción",
			"Mostrar TopMusic","Mostar más escuchada","Salir"});
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
	 * Ejecución de las diferentes opciones del menu
	 * 
	 * @param opcion
	 * 			la opción recogida por teclado tras el menu
	 */
	private static void hacerOpcion(int opcion) {
		switch(opcion){
			case 1:
				int tamaño = lista.tamaño();
				lista.annadirCancion(Teclado.leerEntero("En que posicion quieres insertar la canción (menor a " + (tamaño+1) + ")"),
						new Cancion(Teclado.leerCadena("Titulo:"), Teclado.leerCadena("Artista:"), Teclado.leerCadena("Año:")));
				break;
			case 2:
				lista.eliminarCancion(Teclado.leerEntero("Cual es la posicion de canción que quieres eliminar?"));
				break;
			case 3:
				lista.subirCancion(Teclado.leerEntero("Cual es la posicion de la canción que quieres subir?"));
				break;
			case 4:
				lista.bajarCancion(Teclado.leerEntero("Cual es la posicion de la canción que quieres bajar?"));
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
