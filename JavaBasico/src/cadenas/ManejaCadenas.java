/**
* Sube el fichero "ManejaCadenas.java" que basándose en una
* cadena introducida por teclado:
* a. Imprima su longitud
* b. Muestre el número de veces que se repite un carácter (también introducido por teclado)
* c. Invierta la cadena
* d. La convierta a mayúsculas
* e. Cuente el número de palabras
* f. Indique si es o no un palíndromo
*
* @author Rafa Miranda
* @version 1.0
*/

package cadenas;

import utiles.Teclado;

public class ManejaCadenas{
	public static void main(String[]args){
		String cadena;
		char caracter;

		System.out.println("\nEscribe una cadena y le dire sus caracteristicas: ");
		cadena = Teclado.leerCadena();
		System.out.println("\na. Su longitud es: ");		
		System.out.println(cadena.length());

		System.out.println("\nb. Escribe un caracter de la cadena y te dire cuantas veces aparece: ");
		caracter = Teclado.leerCaracter();
		System.out.println("El caracter '"+caracter+"' aparece "+repetirCaracter(cadena,caracter)+" veces");

		System.out.println("\nc. La cadena invertida es la siguiente: "+invertirCadena(cadena));

		System.out.println("\nd. La cadena en mayusculas es la siguiente: ");
		System.out.println(cadena.toUpperCase());

		System.out.println("\nd. El numero de palabras de su cadena es: "+contarPalabras(cadena));

		System.out.println("\ne. Es su cadena un palindromo?: "+"\n"+comprobarPalindromo(cadena));
	}

/**
* Resuelve si un caracter introducido esta en nuestra cadena y si se repite mas de una vez.
* @param cadena es la cadena introducido por teclado.
* @param caracter es el caracter objeto de analisis.
* @return c variable contador que nos devuelve las repeticiones de ese caracter en la cadena.
*/
	public static int repetirCaracter(String cadena, char caracter) {
    	int c=0;
    	for (int i = 0; i < cadena.length(); i++) {
	        if (cadena.charAt(i) == caracter) {
	            c++;
	        }
	    }
    return c;
	}

/**
* Resuelve el numero de palabras contenidas en nuestra cadena.
* @param cadena es la cadena introducido por teclado.
* @return c variable contador que nos devuelve las palabras contabilizadas.
*/
	public static int contarPalabras(String cadena) {
    	int c = 1;
	    for (int i = 0; i < cadena.length(); i++) {
	        if (cadena.charAt(i) == ' ') {
	            c++;
	        }
	    }
    return c;
	}

/**
* Invierte el sentido de los caracteres en nuestra cadena.
* @param cadena es la cadena introducido por teclado.
* @return devuelve el metodo que hace esa inversion automaticamente.
*/
	public static StringBuffer invertirCadena(String cadena) {
		StringBuffer cadInv = new StringBuffer(cadena);
	return cadInv.reverse();
	}

/**
* Comprueba si nuestra cadena se lee igual en el sentido inverso a la escritura.
* @param cadena es la cadena introducido por teclado.
* @return el mensaje solucion a nuestra pregunta.
*/
	public static String comprobarPalindromo(String cadena) {
		int sub = 0;
		int des = cadena.length()-1;
		boolean diferente = false;

		while ((sub<des) && (!diferente)){
		 	if (cadena.charAt(sub)==cadena.charAt(des)){				
				sub++;
				des--;
			}
			else
				diferente = true;
		}

		if (!diferente)//si diferente sigue siendo false no se habrá encontrado ninguna comparación de letras diferente.
			return "Su cadena es un palindromo";
		else
			return "Su cadena no es un palindromo";
	}
}