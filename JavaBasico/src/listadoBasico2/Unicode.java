package listadoBasico2;

/**
* Muestra la tabla de caracteres Unicode.
* Utiliza el carácter tabulador.
*
* @author Rafa Miranda
* @version 1.0
*/

public class Unicode{
	public static void main(String[]args){
		int i;
		char u;

		System.out.println("La tabla de caracteres Unicode es: ");
		for (i=0; i<256; i++){
			u=(char)i;
			System.out.print("\t\t"+ i +" => "+ u);
		}//for
	}//main
}//class