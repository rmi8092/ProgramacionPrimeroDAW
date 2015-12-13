package listadoBasico3;

import utiles.Teclado;

/**
* Define la clase BuscaArroba. Lee caracteres desde teclado
* hasta que introduzca la arroba. Una vez introducida, se mostrará
* el número de caracteres introducidos entre la B mayúscula y la T mayúscula.
*
* @author Rafa Miranda
* @version 1.0
*/


public class BuscaArroba{
	public static void main (String[]args){
		char caracter;
		int contador=0;
		
		do{
		caracter = Teclado.leerCaracter();
		if (caracter>'B' && caracter<'T')
			contador++;
		}while (caracter!='@');
		
		System.out.println("Caracteres introducidos entre B y T: "+contador);
	}
}