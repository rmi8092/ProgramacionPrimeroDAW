package listadoGenerics;

/**
 * Crea una clase genérica Cola (debe de aceptar cualquier tipo de objeto concreto, utiliza generics).
 * Recuerda que has de evitar la interacción con el usuario dentro de Cola. Utilizando generics,
 * implementa las operaciones básicas de una estructura de datos cola. Recuerda que una cola es una
 * estructura FIFO donde el primer elemento en entrar es el primero en salir. Un ejemplo básico de cola
 * es la de la taquilla de un cine. Las operaciones a implementar son:
 * a. Crear una cola.
 * b. Introducir elemento en la cola (añadir/enqueue).
 * c. Sacar elemento de la cola (extraer/dequeue).
 * d. Cabeza de la cola. (devuelve el primer elemento de la cola, cabeza o front).
 * Implementa los métodos necesarios, y recuerda hacer las pruebas precisas. Para ello, crea una clase
 * TestCola donde se añadan muchos elementos de una clase creada en el mismo fichero (Persona, Paciente, Cartas...)
 * y se invoquen a todos los métodos. Al final, vacía la cola con un bucle while que extraiga de la cola hasta que se vacíe.
 * 
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */

public class TestCola {
	static Cola<String> miCola = null;

	public static void main(String[] args) {
		miCola = new Cola<String>();

		miCola.enqueue("Antonio");
		miCola.enqueue("Pedro");
		miCola.enqueue("Carlos");
		miCola.enqueue("Maria");
		miCola.enqueue("Carmen");
		miCola.enqueue("Carolina");
		miCola.enqueue("Juan");
		miCola.enqueue("Monica");
		
		System.out.println(miCola.toString());
		
		System.out.println("\nEl primer elemento es: "+miCola.front()+"\n");
		System.out.println("Primer elemento eliminado FIFO: "+miCola.dequeue());
		System.out.println("Siguiente elemento eliminado FIFO: "+miCola.dequeue());
		System.out.println("\nEl primer elemento ahora es: "+miCola.front()+"\n");
		
		while (!miCola.isEmpty())
			 System.out.println("Desapilo de la pila: " + miCola.dequeue());
		
		System.out.println("\n"+miCola.toString());
		
	}

}
