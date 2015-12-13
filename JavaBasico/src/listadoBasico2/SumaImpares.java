package listadoBasico2;

/**
* Define la clase SumaImpares. Visualiza la suma de
* los números impares del 1 al 75, ambos inclusive.
*
* @author Rafa Miranda
* @version 1.0
*/

public class SumaImpares{
	public static void main(String[]args){

		int total=0, num;
		String sumando="0";

		for (num=1; num<76; num += 2){
			total += num;
			sumando += "+"+num;
		}
			System.out.println("\nEl sumatorio de "+sumando+" es: "+total);
	}
}