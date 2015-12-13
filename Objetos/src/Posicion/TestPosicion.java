/*
 * Diseña la clase Posicion que represente un punto (x,y) en el eje de coordenadas.
 * Cada posición viene definida por dos valores enteros x e y. Constará de los
 * siguietes métodos:
 * - Constructor por defecto. Se corresponde con la posición (0,0).
 * - Constructor al que se le pasa como argumento los valores inciales de las
 * coordenadas x e y.
 * - Constructor de copia. Se le pasa como argumento un objeto de la misma clase.
 * Se inicializan los campos del nuevo objeto con los mismos valores de los campos
 * del objeto que se pasa como parámetro.
 * - Métodos para modificación y consulta (set/get) de los atributos de la clase.
 * - Métodos para incrementar y decrementar los valores de cada una de las
 * coordenadas de la posición (incX, incY, decX, decY).
 * - Un método para establecer los valores de las coordenadas (setXY).
 *
 * Para su comprobación, crea la clase TestPosición
 */

package Posicion;

public class TestPosicion {
	public static void main(String [] args){
		Posicion pos1 = new Posicion();
		Posicion pos2 = new Posicion(23,8);
		Posicion pos3 = new Posicion(pos2);
		
		System.out.println("Posicion por defecto: ");
		pos1.mostrar();
		pos1.incX();
		pos1.incY();
		System.out.println("Posicion por defecto incrementada:");
		pos1.mostrar();
		pos1.decX();
		pos1.decY();
		System.out.println("Posicion por defecto decrementada:");
		pos1.mostrar();
		
		System.out.println("Posicion asignada por usuario: ");
		pos2.mostrar();
		pos2.incX();
		pos2.incY();
		System.out.println("Posicion incrementada:");
		pos2.mostrar();
		pos2.decX();
		pos2.decY();
		System.out.println("Posicion decrementada:");
		pos2.mostrar();
		
		System.out.println("Posicion asignanda a partir de otro objeto: ");
		pos3.mostrar();
		pos3.incX();
		pos3.incY();
		System.out.println("Incrementando posicion ...");
		pos3.mostrar();
		pos3.decX();
		pos3.decY();
		System.out.println("Decrementando posicion ...");
		pos3.mostrar();
	}
}