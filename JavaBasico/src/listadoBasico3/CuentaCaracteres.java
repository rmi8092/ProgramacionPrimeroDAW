package listadoBasico3;

import utiles.Teclado;

/**
* Define la clase CuentaCaracteres. Lee caracteres desde el teclado
* hasta que el usuario introduce un asterisco.
* En ese caso, se mostrará un recuento de:
* a. Los dígitos introducidos [0-9]
* b. Las minúsculas introducidos [a-z]
* c. Las mayúsculas introducidos [A-Z]
*
* @author Rafa Miranda
* @version 1.0
*/

public class CuentaCaracteres{
	public static void main (String[]args){
		char caracter;
		int contadorMay=0, contadorMin=0, contadorNum=0, resto=0;
		
		do{
		caracter = Teclado.leerCaracter();
		if (caracter>='A' && caracter<='Z')
			contadorMay++;
		else if (caracter>='a' && caracter<='z')
			contadorMin++;
		else if (caracter>='0' && caracter<='9')
			contadorNum++;
		else
			resto++;
		}while (caracter!='*');
		
		System.out.println("Caracteres introducidos entre A y Z: "+contadorMay);
		System.out.println("Caracteres introducidos entre a y z: "+contadorMin);
		System.out.println("Caracteres introducidos entre 0 y 9: "+contadorNum);
		System.out.println("Otros caracteres introducidos: "+ --resto);
		//tengo que restarle 1 porque al entrar siempre en resto++ ya comenzaria con valor 1 en lugar de 0.
	}
}