package listadoBasico2;

/**
* Define la clase SumaMientrasNoSeaNegativo que sume
* todos aquellos números leídos mientras no sean negativos.
*
* @author Rafa Miranda
* @version 1.0
*/

public class SumaMientrasNoSeaNegativo{
	private static java.util.Scanner scanner;
	public static void main (String[]args){

		scanner = new java.util.Scanner(System.in);
		int num, res=0;
		System.out.println("Introduce numeros y los ire sumando siempre "+
			"que no sean negativos. Para salir pulsa 0.");

		while (true){
			num = scanner.nextInt();
			if (num>0)
				res+=num;//res=res+num
			System.out.println("La suma hasta ahora es: "+res);
		}//while	
	}//main
}//class