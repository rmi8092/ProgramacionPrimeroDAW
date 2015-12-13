package metodos;

import utiles.Teclado;

/**
* Entrega una clase java por cada uno de los siguientes ejercicios. Debes utilizar métodos. Pídele al
* usuario los datos necesarios por teclado tantas veces como quiera. Para ello implementa el método
* deseaContinuar que devuelva true si introduce 's' ó 'S', false si introduce 'n' ó 'N':
*
* Clase EurosADolares. Solicita una cantidad de euros y realiza
* el cambio a dólares sabiendo que el euro está a 1,26815 dólares americanos.
*
* @author Rafa Miranda
* @version 1.0
*/

public class EurosADolares{
	public static void main (String[]args){
		double euro, dolar;

		do{
		System.out.println("\nIntroduce los euros que quieres convertir a dolares: ");
		euro = Teclado.leerEntero();

		dolar = cambioDivisa(euro);

		System.out.println("\nSegun el cambio actual usted obtendria: "+dolar+" dolares.");
		}while (deseaContinuar());

	}
	static double cambioDivisa (double euro){
	return euro*1.26815;
	}

	static boolean deseaContinuar(){
	char resp;
		do{
		System.out.println("\nDesea continuar? (s,S/n,N)");
		resp = Teclado.leerCaracter();
		}while (!((resp=='s')||(resp=='S')||(resp=='n')||(resp=='N')));
			if (resp=='s'||resp=='S')
				return true;
			else
				return false;
	}
}
