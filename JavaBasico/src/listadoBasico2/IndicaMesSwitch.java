package listadoBasico2;

/**
* Define la clase IndicaMesSwitch. Semejante
* al anterior, pero usando la estructura Switch.
*
* @author Rafa Miranda
* @version 1.0
*/

public class IndicaMesSwitch{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		int mes;
		
		for (int n=0;n<11;n++){
			System.out.println("\nIntroduce un numero del 1 al 12. Yo te dare "+
			"el nombre del mes del anio: ");
			mes = scanner.nextInt();
			switch (mes){
				case 1:
					System.out.println("Tu mes es enero");
					break;
				case 2:
					System.out.println("Tu mes es febrero");
					break;
				case 3:
					System.out.println("Tu mes es marzo");
					break;
				case 4:
					System.out.println("Tu mes es abril");
					break;
				case 5:
					System.out.println("Tu mes es mayo");
					break;
				case 6:
					System.out.println("Tu mes es junio");
					break;
				case 7:
					System.out.println("Tu mes es julio");
					break;
				case 8:
					System.out.println("Tu mes es agosto");
					break;
				case 9:
					System.out.println("Tu mes es septiembre");
					break;
				case 10:
					System.out.println("Tu mes es octubre");
					break;
				case 11:
					System.out.println("Tu mes es noviembre");
					break;
				case 12:
					System.out.println("Tu mes es noviembre");
					break;
				default:
					System.out.println("Este mes no existe");
			}//switch
		}//for
	}//main
}//class