package listadoBasico2;

/**
* Define la clase IndicaMesIf que muestre el nombre del
* mes en función del número obtenido por teclado (del 1 al 12).
* Utiliza la estructura condicional If. Ha de mostrar 10 resultados.
*
* @author Rafa Miranda
* @version 1.0
*/

public class IndicaMesIf{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		int mes;
		int n;

		for (n=1;n<11;n++){
			System.out.println("\nIntroduce un numero del 1 al 12. Yo te dare "+
			"el nombre del mes del anio: ");
			mes = scanner.nextInt();
			if (mes==1)
				System.out.println("Tu mes es enero.");
				else if (mes==2)
						System.out.println("Tu mes es febrero.");
					else if (mes==3)
							System.out.println("Tu mes es marzo.");
						else if (mes==4)
								System.out.println("Tu mes es abril.");
							else if (mes==5)
									System.out.println("Tu mes es mayo.");
								else if (mes==6)
										System.out.println("Tu mes es junio.");
									else if (mes==7)
											System.out.println("Tu mes es julio.");
										else if (mes==8)
												System.out.println("Tu mes es agosto.");
											else if (mes==9)
													System.out.println("Tu mes es septiembre.");
												else if (mes==10)
														System.out.println("Tu mes es octubre.");
													else if (mes==11)
															System.out.println("Tu mes es noviembre.");
														else if (mes==12)
															System.out.println("Tu mes es diciembre.");
															else
																System.out.println("Este mes no existe.");
		}//for
	}//main
}//class