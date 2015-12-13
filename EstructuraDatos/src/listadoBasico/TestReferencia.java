package listadoBasico;

/**
 * @author rafael miranda iba�ez
 */

public class TestReferencia {
	static char[] vector1; // referencia (puntero a memoria din�mica)
	static char[] vector2; // referencia (puntero a memoria din�mica)
	
	/**
	 * Gesti�n de referencias y reserva de memoria din�mica
	 * @param args array de cadenas que no se usa.
	 */
	public static void main(String[] args) {
		if(vector1 == null)
			System.out.println("vector vale null: " + vector1 + ". Todav�a no"
					+ " apunta a la memoria din�mica.");
		
		vector1 = new char[5]; // reserva de memoria y asignaci�n.
		vector2 = vector1; // asignaci�n: ambas apuntan al mismo trozo de memoria.
		
		if(vector1 == vector2) // comparaci�n
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
		
	/*Crea el siguiente c�digo. Contesta a las siguientes preguntas:
	a. �Cu�ndo la comparaci�n de dos referencias es true?
		Cuando apuntan al mismo objeto.
	b. �Siempre se inicializa una referencia a null?
		No, se puede inicializar con los valores que deseemos.
	c. �Por qu� vector1 y vector2 han de ser static? �Cu�l ser�a otra soluci�n?
	 	En este caso son static porque son variables de clase. La otra opci�n es declararlos
	 	dentro del main y en ese caso no tendr�an que ser static. Pero en este caso tienen
	 	que ser inicializadas, no se pueden dejar a null.*/
	}
}

