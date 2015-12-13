package listadoGenerics;

import utiles.Menu;
import utiles.Teclado;

/**
 * ListaDeLaCompra. Implementa un programa que gestione una lista de la compra de forma autom�tica.
 * Se dispondr� de una lista de art�culos y de sus existencias. En el momento en el que la cantidad de art�culos llegue
 * a un l�mite m�nimo, dicho art�culo aparecer� en la lista de la compra. Cada vez que el usuario utilice uno de los art�culos
 * se decrementar�n las existencias de dicho art�culo. De igual forma, cada vez que el usuario compre el art�culo,
 * se incrementar�n las existencias de dicho art�culo.
 * A modo de ejemplo, supongamos que del art�culo "latas de cerveza" se establece a un m�nimo de 10 cervezas.
 * Actualmente hay 14 y se consumen de golpe 5 cervezas.
 * a. Art�culo: [nombre = latas de cerveza, cantidad m�nima= 10, existencias = 14]
 * b. articulo.consumir(5)
 * c. Art�culo: [nombre = latas de cerveza, cantidad m�nima= 10, existencias = 9]
 * d. Como (articulo.getExistencias() <= articulo.getCantidadMin()) hay que comprar latas de cerveza.
 * Quiz�s sea interesante a�adir un campo c�digo del art�culo para facilitar la gesti�n de la lista. Este c�digo ha de
 * ser �nico (static...).
 * Para ello, genera un interfaz con el usuario que permita entre otras acciones:
 * a. A�adir un producto nuevo a la lista.
 * b. Eliminar un elemento de la lista.
 * c. Incrementar las existencias de un art�culo.
 * d. Decrementar las existencias de un art�culo.
 * e. Modificar la cantidad m�nima del art�culo.
 * f. Mostrar la lista de todos los art�culos.
 * g. Mostrar la lista de la compra.
 * Comienza analizando el dise�o. Piensa en el total de clases que vas a utilizar y aprovecha aquellas clases que puedas.
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

public class ListaDeLaCompra {
	
	static Lista<Articulo> listaCompra = new Lista();
	static Lista<Articulo> frigorifico = new Lista();
	
	public static void main(String[]args) {
		Menu menu = new Menu("Lista de la compra", new String[]{"A�adir art�culo a frigo", "Eliminar art�culo del frigo", "Subir existencias en el frigo",
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
				frigorifico.a�adirFinal(new Articulo(Teclado.leerCadena("Nombre del articulo a a�adir"),
						Teclado.leerEntero("Cantidad en existencias"),
						Teclado.leerEntero("Cual es la cantidad minima permitida?")));
				break;
			case 2:
				System.out.println(frigorifico.toStringNumerado());
				frigorifico.eliminarElemento(Teclado.leerEntero("Cual es la posicion del articulo a eliminar?"));
				break;
			case 3:
				if(listaCompra.estaVacia()){
					System.out.println("La lista de la compra est� vacia");
					break;
				}
				System.out.println(listaCompra.toStringNumerado());
				int codArticulo=Teclado.leerEntero("Introduce el art�culo que quieres incrementar");
				frigorifico.obtenerElemento(codArticulo).comprarArticulo(Teclado.leerEntero("Introduce la cantidad que quieres comprar"));
				listaCompra.eliminarElemento(listaCompra.obtenerElemento(codArticulo));
				break;
			case 4:
				System.out.println(frigorifico.toStringNumerado());
				int codArt=Teclado.leerEntero("Introduce el art�culo que quieres consumir");
				frigorifico.obtenerElemento(codArt).consumirArticulo(Teclado.leerEntero("Introduce la cantidad que vas a consumir"));
				if(frigorifico.obtenerElemento(codArt).getExistencias() <= frigorifico.obtenerElemento(codArt).getCantMinima())
					listaCompra.a�adirFinal(frigorifico.obtenerElemento(codArt));
				break;
			case 5:
				System.out.println(frigorifico.toStringNumerado());
				int codA=Teclado.leerEntero("Introduce el art�culo que quieres modificar la cantidad minima");
				frigorifico.obtenerElemento(codA).setCantMinima(Teclado.leerEntero("Introduce la cantidad minima para este art�culo"));
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
