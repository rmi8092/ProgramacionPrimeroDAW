package listadoBasico;

/**
 * ¿Qué es el autoboxing/unboxing? Explícalo mediante tu propio código en Java
 * “autoboxing.java”
 * 
 * @author rafael miranda
 * @version 1.0
 */

public class Autoboxing {

	public static void main(String[] args) {
		// Ejemplo de autoboxing: es la técnica mediante convertimos datos
		// primitivos en objetos con su mismo contenido. Se dice que cuando
		// la aplicamos hemos convertido ese dato primitivo en su Wrapper.
		
		Integer a = 3;
		Integer b = 12;
		System.out.println("El producto de ambos wrappers tal como si " +
		"fueran dos enteros seria: " + (a*b));
		
		// Ejemplo de unboxing: es la técnica inversa, es decir, hacemos unboxing
		// cuando convertimos un wrapper en su dato primitivo correspondiente.
		
		int c = a;
		int d = b;
		System.out.println("El producto de ambos enteros resulta el mismo " +
				"que el de sus wrappers: " + (c*d));
	}
}
