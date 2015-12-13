package metodos;

import utiles.Teclado;

/**
* Define la clase MediaPositivos que calcule la media de una serie
* de números positivos, introducidos por teclado. Dejará de leer
* cuando el usuario introduzca el 0. Utiliza métodos.
*
* @author Rafa Miranda
* @version 1.0
*/

public class MediaPositivos{
	public static void main (String[]args){
		int n, c=0, res=0;

		System.out.println("\nDame tantos numeros como quieras. Si introduces 0 "+
			"dejare de leer y hare la media solo de los positivos.");
		
		do{
			n = leerNumero();
			c = cuentaPositivos(n,c);
			res = sumaPositivos(n,res);
		}while(n!=0);
		System.out.println("La media de los numeros positivos introducidos es: "+resMedia(res,c));
	}

	static int leerNumero(){
		return Teclado.leerEntero();
	}

	static int cuentaPositivos(int n, int c){
		if(n>0)
			c++;
		return c;
	}

	static int sumaPositivos(int n, int res){
		if (n>0)
			res +=n;
		return res;
	}

	static int resMedia(int res, int c){
		return res/c;
	}
}