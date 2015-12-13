package listadoGenerics;

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
 * ser �nico (static...). Para ello, genera un interfaz con el usuario que permita entre otras acciones:
 * e. A�adir un producto nuevo a la lista.
 * f. Eliminar un elemento de la lista.
 * g. Incrementar las existencias de un art�culo.
 * h. Decrementar las existencias de un art�culo.
 * i. Modificar la cantidad m�nima del art�culo.
 * j. Mostrar la lista de todos los art�culos.
 * k. Mostrar la lista de la compra.
 * Comienza analizando el dise�o. Piensa en el total de clases que vas a utilizar y aprovecha aquellas clases que puedas.
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

public class Articulo {

	private String nombre;
	private int existencias;
	private int cantMinima;
	
	public Articulo(String nombre, int existencias, int cantMinima) {
		setNombre(nombre);
		setExistencias(existencias);
		setCantMinima(cantMinima);
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	int getExistencias() {
		return existencias;
	}

	private void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	int getCantMinima() {
		return cantMinima;
	}

	void setCantMinima(int cantMinima) {
		this.cantMinima = cantMinima;
	}

	void comprarArticulo(int cantidad){
		setExistencias(getExistencias() + cantidad);
	}
	
	void consumirArticulo(int cantidad){
		setExistencias(getExistencias() - cantidad);
	}

	@Override
	public String toString() {
		return "Articulos [nombre=" + nombre + ", existencias=" + existencias
				+ ", cantMinima=" + cantMinima + "]";
	}
}
