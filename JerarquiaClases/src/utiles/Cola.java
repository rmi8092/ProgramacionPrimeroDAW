package utiles;

import java.util.ArrayList;

/**
 * Crea una clase gen�rica Cola (debe de aceptar cualquier tipo de objeto concreto, utiliza generics).
 * Recuerda que has de evitar la interacci�n con el usuario dentro de Cola. Utilizando generics,
 * implementa las operaciones b�sicas de una estructura de datos cola. Recuerda que una cola es una
 * estructura FIFO donde el primer elemento en entrar es el primero en salir. Un ejemplo b�sico de cola
 * es la de la taquilla de un cine. Las operaciones a implementar son:
 * a. Crear una cola.
 * b. Introducir elemento en la cola (a�adir/enqueue).
 * c. Sacar elemento de la cola (extraer/dequeue).
 * d. Cabeza de la cola. (devuelve el primer elemento de la cola, cabeza o front).
 * Implementa los m�todos necesarios, y recuerda hacer las pruebas precisas. Para ello, crea una clase
 * TestCola donde se a�adan muchos elementos de una clase creada en el mismo fichero (Persona, Paciente, Cartas...)
 * y se invoquen a todos los m�todos. Al final, vac�a la cola con un bucle while que extraiga de la cola hasta que se vac�e.
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

public class Cola<T> {
	private ArrayList<T> Cola = null;

	public Cola() {
		this.Cola = new ArrayList<T>();
	}
	
	void enqueue(T elemento){
		Cola.add(elemento);
	}
	
	T dequeue (){
		if(isEmpty())
			return null;
		return Cola.remove(0);
	}
	
	T front (){
		if(isEmpty())
			return null;
		return Cola.get(0);
	}

	boolean isEmpty() {
		if(Cola.size()==0)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Cola: " + Cola;
	}
}
