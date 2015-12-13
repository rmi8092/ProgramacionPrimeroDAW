package listadoBasico2;

/**
* Define la clase CuentaNegativos. Lee 10 enteros
* y visualiza cuántos son negativos.
*
* @author Rafa Miranda
* @version 1.0
*/

public class CuentaNegativos{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		
		System.out.println("\nIntroduce diez numeros y te dire "+
		"cuantos de ellos son negativos: ");
		int numero;
		int cont=0;
		
		for (int n=1; n<11; n++){ //con este bucle obligo a introducir 10 numeros.
			numero=scanner.nextInt();
			//ahora vamos a comprobar si es positivo o negativo.
			if (numero<0)
				//quiero guardar si es negativo. Lo haria con un contador.
				cont++;
				//else
				//no quiero guardar nada.		
		}
		System.out.println("El numero de enteros negativos es: "+cont);
	}
}