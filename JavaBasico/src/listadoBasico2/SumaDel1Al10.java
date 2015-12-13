package listadoBasico2;

/**
* Define la clase SumaDel1Al10 que calcule la suma
* de los enteros entre 1 y 10, es decir 1+2+3+4+5,...
*
* @author Rafa Miranda
* @version 1.0
*/

public class SumaDel1Al10{
	public static void main (String[]args){
		int num=0, suma=0;

		do{
			suma+=num;
			num++;
		}while (num>0 && num<11);
	System.out.println("La suma de valores del 1 al 10 es: "+suma);
	}
}