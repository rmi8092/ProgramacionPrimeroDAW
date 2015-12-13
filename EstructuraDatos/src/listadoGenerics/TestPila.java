package listadoGenerics;

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

public class TestPila<T> {
	static Pila<String> miPila = null;

	public static void main(String[] args) {
		miPila = new Pila<String>();

		miPila.push("Antonio");
		miPila.push("Pedro");
		miPila.push("Carlos");
		miPila.push("Maria");
		miPila.push("Carmen");
		miPila.push("Carolina");
		miPila.push("Juan");
		miPila.push("Monica");
		
		System.out.println(miPila.toString());
		
		System.out.println("\nEl primer elemento es: "+miPila.top()+"\n");
		System.out.println("Primer elemento eliminado LIFO: "+miPila.pop());
		System.out.println("Siguiente elemento eliminado LIFO: "+miPila.pop());
		System.out.println("\nEl primer elemento ahora es: "+miPila.top()+"\n");
		
		while (!miPila.isEmpty())
			 System.out.println("Desapilo de la pila: " + miPila.pop());
		
		System.out.println("\n"+miPila.toString());
		
	}

}
