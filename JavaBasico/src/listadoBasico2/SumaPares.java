package listadoBasico2;

/**
* Define la clase SumaPares que sume los números
* pares comprendidos entre 7 y 101.
*
* @author Rafa Miranda
* @version 1.0
*/

public class SumaPares{
	public static void main(String[]args){
		int n, suma=0;

		for (n=8;n<101;n+=2)
			suma+=n;
				System.out.println("\nLa suma de los numeros pares de 7 a 101 es: "+suma);
	}//main
}//class