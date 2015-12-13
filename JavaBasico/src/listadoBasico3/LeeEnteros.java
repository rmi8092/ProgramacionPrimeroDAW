package listadoBasico3;

/**
* Define la clase LeeEnteros. Lee 10 enteros e
* indica al final si se ha introducido algún cero.
*
* @author Rafa Miranda
* @version 1.0
*/

public class LeeEnteros{
	public static void main(String[]args){
		int i=0, n=0;

		System.out.println("\nIntroduce diez numeros y te dire si alguno es un cero.");
		for (int c=1;c<11;c++){
			i=new java.util.Scanner(System.in).nextInt();
			if (i==0)
				n++;
		}//for
			if (n!=0)
				System.out.println("Has introducido al menos un cero.");
	}//main
}//class