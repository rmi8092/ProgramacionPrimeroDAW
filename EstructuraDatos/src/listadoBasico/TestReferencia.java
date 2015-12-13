package listadoBasico;

/**
 * @author rafael miranda ibañez
 */

public class TestReferencia {
	static char[] vector1; // referencia (puntero a memoria dinámica)
	static char[] vector2; // referencia (puntero a memoria dinámica)
	
	/**
	 * Gestión de referencias y reserva de memoria dinámica
	 * @param args array de cadenas que no se usa.
	 */
	public static void main(String[] args) {
		if(vector1 == null)
			System.out.println("vector vale null: " + vector1 + ". Todavía no"
					+ " apunta a la memoria dinámica.");
		
		vector1 = new char[5]; // reserva de memoria y asignación.
		vector2 = vector1; // asignación: ambas apuntan al mismo trozo de memoria.
		
		if(vector1 == vector2) // comparación
			System.out.println("Ambas apuntan al mismo trozo de memoria.");
		
		vector2 = new char[5];
		if(vector1 != vector2)
			System.out.println("NO apuntan al mismo trozo de memoria.");
		
		// se comprueba que ambos vectores contienen lo mismo
		for (char caracter : vector1){
			System.out.println(caracter + "-");
		}
		System.out.println();
		for (char caracter : vector2){
			System.out.println(caracter + "-");
		}
		
	/*Crea el siguiente código. Contesta a las siguientes preguntas:
	a. ¿Cuándo la comparación de dos referencias es true?
		Cuando apuntan al mismo objeto.
	b. ¿Siempre se inicializa una referencia a null?
		No, se puede inicializar con los valores que deseemos.
	c. ¿Por qué vector1 y vector2 han de ser static? ¿Cuál sería otra solución?
	 	En este caso son static porque son variables de clase. La otra opción es declararlos
	 	dentro del main y en ese caso no tendrían que ser static. Pero en este caso tienen
	 	que ser inicializadas, no se pueden dejar a null.*/
	}
}

