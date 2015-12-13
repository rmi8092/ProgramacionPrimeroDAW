package listadoGenerics;

import utiles.Menu;
import utiles.Teclado;

/**
 * ListaDeLaCompra. Implementa un programa que gestione una lista de la compra de forma automática.
 * Se dispondrá de una lista de artículos y de sus existencias. En el momento en el que la cantidad de artículos llegue
 * a un límite mínimo, dicho artículo aparecerá en la lista de la compra. Cada vez que el usuario utilice uno de los artículos
 * se decrementarán las existencias de dicho artículo. De igual forma, cada vez que el usuario compre el artículo,
 * se incrementarán las existencias de dicho artículo.
 * A modo de ejemplo, supongamos que del artículo "latas de cerveza" se establece a un mínimo de 10 cervezas.
 * Actualmente hay 14 y se consumen de golpe 5 cervezas.
 * a. Artículo: [nombre = latas de cerveza, cantidad mínima= 10, existencias = 14]
 * b. articulo.consumir(5)
 * c. Artículo: [nombre = latas de cerveza, cantidad mínima= 10, existencias = 9]
 * d. Como (articulo.getExistencias() <= articulo.getCantidadMin()) hay que comprar latas de cerveza.
 * Quizás sea interesante añadir un campo código del artículo para facilitar la gestión de la lista. Este código ha de
 * ser único (static...).
 * Para ello, genera un interfaz con el usuario que permita entre otras acciones:
 * a. Añadir un producto nuevo a la lista.
 * b. Eliminar un elemento de la lista.
 * c. Incrementar las existencias de un artículo.
 * d. Decrementar las existencias de un artículo.
 * e. Modificar la cantidad mínima del artículo.
 * f. Mostrar la lista de todos los artículos.
 * g. Mostrar la lista de la compra.
 * Comienza analizando el diseño. Piensa en el total de clases que vas a utilizar y aprovecha aquellas clases que puedas.
 * 
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */

public class ListaDeLaCompra {
	
	static Lista<Articulo> listaCompra = new Lista();
	static Lista<Articulo> frigorifico = new Lista();
	
	public static void main(String[]args) {
		Menu menu = new Menu("Lista de la compra", new String[]{"Añadir artículo a frigo", "Eliminar artículo del frigo", "Subir existencias en el frigo",
				"Bajar existencias en el frigo", "Cambiar cantidad minima", "Mostrar mi frigo", "Mostrar lista compra", "Salir"});
		
		int opcion = 0;
		do{
			opcion = menu.gestionar();
			Menu(opcion);
		}while(opcion!=8);
	}
	
	public static void Menu(int opcion){
		switch(opcion){
			case 1:				
				frigorifico.añadirFinal(new Articulo(Teclado.leerCadena("Nombre del articulo a añadir"),
						Teclado.leerEntero("Cantidad en existencias"),
						Teclado.leerEntero("Cual es la cantidad minima permitida?")));
				break;
			case 2:
				System.out.println(frigorifico.toStringNumerado());
				frigorifico.eliminarElemento(Teclado.leerEntero("Cual es la posicion del articulo a eliminar?"));
				break;
			case 3:
				if(listaCompra.estaVacia()){
					System.out.println("La lista de la compra está vacia");
					break;
				}
				System.out.println(listaCompra.toStringNumerado());
				int codArticulo=Teclado.leerEntero("Introduce el artículo que quieres incrementar");
				frigorifico.obtenerElemento(codArticulo).comprarArticulo(Teclado.leerEntero("Introduce la cantidad que quieres comprar"));
				listaCompra.eliminarElemento(listaCompra.obtenerElemento(codArticulo));
				break;
			case 4:
				System.out.println(frigorifico.toStringNumerado());
				int codArt=Teclado.leerEntero("Introduce el artículo que quieres consumir");
				frigorifico.obtenerElemento(codArt).consumirArticulo(Teclado.leerEntero("Introduce la cantidad que vas a consumir"));
				if(frigorifico.obtenerElemento(codArt).getExistencias() <= frigorifico.obtenerElemento(codArt).getCantMinima())
					listaCompra.añadirFinal(frigorifico.obtenerElemento(codArt));
				break;
			case 5:
				System.out.println(frigorifico.toStringNumerado());
				int codA=Teclado.leerEntero("Introduce el artículo que quieres modificar la cantidad minima");
				frigorifico.obtenerElemento(codA).setCantMinima(Teclado.leerEntero("Introduce la cantidad minima para este artículo"));
				if(frigorifico.obtenerElemento(codA).getExistencias() >= frigorifico.obtenerElemento(codA).getCantMinima())
					listaCompra.eliminarElemento(frigorifico.obtenerElemento(codA));
				break;
			case 6:
				System.out.println(frigorifico.toStringNumerado());
				break;
			case 7:
				System.out.println(listaCompra.toStringNumerado());
			default:
				System.out.println("Adios!!");
				break;
		}
	}
}
