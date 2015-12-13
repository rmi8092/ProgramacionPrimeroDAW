package listadoBasico2;

/**
* Define la clase MenorDeTres que lea tres números y calcule
* cuál de ellos es el menor. Suponemos que los tres números son distintos.
*
* @author Rafa Miranda
* @version 1.0
*/

public class MenorDeTres{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		int num1, num2, num3;
		System.out.println("\nIntroduzca tres numeros, y le dire cual"+
			" es el menor:");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();

		if (num1<num2 && num1<num3)
				System.out.println(num1+" es el menor.");
			else if (num2<num1 && num2<num3)
					System.out.println(num2+" es el menor.");
				else if (num3<num1 && num3<num2)
						System.out.println(num3+" es el menor.");
					else
							System.out.println("Los tres numeros deben ser diferentes.");
	}//main
}//class