package listadoBasico2;

/**
* Define la clase EligeOpcion que permita visualizar los siguientes mensajes,
* dependiendo del número que pulsamos. Ha de mostrar 10 resultados.
* a. (1) Procesador de textos
* b. (2) Hoja de cálculo
* c. (3) Base de datos
* d. otro número, la tecla pulsada es errónea.
*
* @author Rafa Miranda
* @version 1.0
*/

public class EligeOpcion{
	private static java.util.Scanner scanner;

	public static void main(String[]args){

		scanner = new java.util.Scanner(System.in);
		System.out.println("Introduzca un numero");

		for(int n=0;n<11;n++){
			int num=scanner.nextInt();
			if(num==1)
					System.out.println("a. (1) Procesador de textos");
				else if (num==2)
						System.out.println("b. (2) Hoja de calculo");
					else if (num==3)
							System.out.println("c. (3) Base de datos");
						else
								System.out.println("otro numero, la tecla pulsada es erronea.");
		}//for
	}//main
}//class