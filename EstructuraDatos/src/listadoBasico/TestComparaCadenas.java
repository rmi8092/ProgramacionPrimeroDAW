package listadoBasico;

/**
 * Entrega el siguiente código comentado con los resultados a la derecha de cada system.out.println() y contesta:
 * a. ¿Cómo se comparan dos cadenas?
 * b. ¿Para qué se utiliza el operador de comparación == entre objetos?
 * c. Una cadena puede crearse mediante new o directamente con su literal. ¿Se
 * crean de igual manera? ¿Se aprovecha la memoria de alguna manera?
 * 
 * @author rafael miranda
 * @version 1.0
 */

public class TestComparaCadenas {

	public static void main(String[] args) {
		String string1 = new String ("Hola");
		String string2 = new String ("Hola");
		System.out.println("string1 == string2: " + (string1 == string2)); // FALSE
		System.out.println("string1.equals(string2): " + (string1.equals(string2))); // TRUE
		
		String string3 = "Hola";
		String string4 = "Hola";
		System.out.println("\nstring3 == string4: " + (string3 == string4)); // TRUE
		System.out.println("string3.equals(string4: " + (string3.equals(string4))); // TRUE
		
		String stringMay = "Hola";
		String stringMin = "hola";
		System.out.println("\nstringMay == stringMin: " + (stringMay == stringMin)); // FALSE
		System.out.println("stringMay.equals(stringMin): " + (stringMay.equals(stringMin))); // FALSE
		System.out.println("stringMay.equals(stringMin: " + (stringMay.equalsIgnoreCase(stringMin))); // TRUE
		
	/* a. ¿Cómo se comparan dos cadenas?
	 * Para comparar el contenido se usa el metodo cadena1.equals(cadena2).
	 * 
	 * b. ¿Para qué se utiliza el operador de comparación == entre objetos?
	 * Para comprobar si las referencias anotadas ambos lados del operador apuntan o no al mismo objeto.
	 * 
	 * c. Una cadena puede crearse mediante new o directamente con su literal. ¿Se
	 * crean de igual manera? ¿Se aprovecha la memoria de alguna manera?
	 * Con new se crea un objeto en cualquier situación mientras que con la creación mediante literal se
	 * comprueba antes si ese objeto ya existe en la string pool, y si es así no se vuelve a crear otro con
	 * el mismo contenido sino que se coloca la referencia apuntando a ese objeto que ya existía. De esta
	 * segunda manera se ahorra memoria porque se reutiliza un objeto existente en lugar de crear otro duplicado.
	*/	

		
	}

}
