package listadoBasico3;

/**
* Define la clase DiaDelMes que pide dos enteros, que representarán
* un mes y un año. Se visualizará el número de días del mes, teniendo en cuenta que:
* a. 31 días tienen Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
* b. 30 días tienen Febrero, Abril, Junio, Septiembre, Noviembre
* c. Febrero tiene 29 días si el año es bisiesto. En cualquier otro caso, tiene 28
* d. Un año es bisiesto si es divisible entre 4, a menos que sea divisible
* entre 100. Sin embargo, si un año es divisible entre 100 y además es
* divisible entre 400, también resulta bisiesto.
*
* @author Rafa Miranda
* @version 1.0
*/

public class DiaDelMes{
	private static java.util.Scanner scanner;

	public static void main (String[]args){
		scanner = new java.util.Scanner(System.in);
		int m, a;

		System.out.println("\nDame el numero del mes, del 1 al 12, que quieras ver");
		m=scanner.nextInt();
		System.out.println("\nDame el numero del año, cuatro cifras, que quieras ver");
		a=scanner.nextInt();

		if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
			System.out.println("El mes introducido tiene 31 dias.");
			else{
				if (m==4 || m==6 || m==9 || m==11)
					System.out.println("El mes introducido tiene 30 dias.");
					else{
						if(((a%4==0) && (a%100!=0)) || ((a%100==0) && (a%400==0)))
							System.out.println("El mes introducido tiene 29 dias.");
						else
							System.out.println("El mes introducido tiene 28 dias.");
					}//else
			}//else
	}//main
}//class