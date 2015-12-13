package utiles;

import java.util.ArrayList;

/**
 * Crea una clase gen�rica Pila (debe de aceptar cualquier tipo de objeto concreto, utiliza generics).
 * Recuerda que has de evitar la interacci�n con el usuario dentro de Pila. Implementa las operaciones
 * b�sicas de una estructura de datos pila. Una pila es una estructura LIFO donde el �ltimo elemento
 * en entrar es el primero en salir. Un ejemplo b�sico de pila es la forma de almacenamiento de
 * procesos en la memoria. Las operaciones a implementar son:
 * a. Crear una pila.
 * b. Introducir elemento en la pila (apilar o push).
 * c. Sacar elemento de la pila (extraer o pop).
 * d. Cima de la pila (devuelve el elemento de la cima de la pila o top).
 * Implementa los m�todos necesarios, y recuerda hacer las pruebas precisas. Para ello, crea una
 * clase TestPila donde se a�adan muchos elementos de una clase creada en el mismo fichero (Persona, Paciente,
 * Cartas...) y se invoquen a todos los m�todos. Al final, vac�a la pila con un bucle de este estilo:
 * while (!pila.IsEmpty())
 * System.out.println("Desapilo de la pila: " + p.pop());
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 * @param <T>
 */
public class Pila<T> {

	private ArrayList<T> Pila = null;
	
	public Pila() {
		this.Pila = new ArrayList<T>();
	}
	
	void push(T elemento){
		Pila.add(elemento);
	}
	
	T pop (){
		if(isEmpty())
			return null;
		return Pila.remove(Pila.size()-1);
	}
	
	T top (){
		if(isEmpty())
			return null;
		return Pila.get(Pila.size()-1);
	}

	boolean isEmpty() {
		return Pila.isEmpty();
	}
	
	@Override
	public String toString() {
		return "Pila: " + Pila;
	}
		
}
