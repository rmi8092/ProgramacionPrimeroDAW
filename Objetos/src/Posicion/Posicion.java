/*
 * Dise�a la clase Posicion que represente un punto (x,y) en el eje de coordenadas.
 * Cada posici�n viene definida por dos valores enteros x e y. Constar� de los
 * siguietes m�todos:
 * - Constructor por defecto. Se corresponde con la posici�n (0,0).
 * - Constructor al que se le pasa como argumento los valores inciales de las
 * coordenadas x e y.
 * - Constructor de copia. Se le pasa como argumento un objeto de la misma clase.
 * Se inicializan los campos del nuevo objeto con los mismos valores de los campos
 * del objeto que se pasa como par�metro.
 * - M�todos para modificaci�n y consulta (set/get) de los atributos de la clase.
 * - M�todos para incrementar y decrementar los valores de cada una de las
 * coordenadas de la posici�n (incX, incY, decX, decY).
 * - Un m�todo para establecer los valores de las coordenadas (setXY).
 *
 * Para su comprobaci�n, crea la clase TestPosici�n
 */

package Posicion;

public class Posicion {
	
	private int x;
	private int y;
	
	Posicion() {
		setXY(0,0);
	}
	Posicion(int x, int y){
		setXY(x,y);
	}
	Posicion(Posicion posicion){
		setXY(posicion.getX(),posicion.getY());
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}
	private void setXY(int x, int y){
		setX(x);
		setY(y);
	}
	
	void incX(){
		setX(getX()+1);
	}
	void incY(){
		setY(getY()+1);
	}
	void decX(){
		setX(getX()-1);
	}
	void decY(){
		setY(getY()-1);
	}
	void mostrar(){
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
}
