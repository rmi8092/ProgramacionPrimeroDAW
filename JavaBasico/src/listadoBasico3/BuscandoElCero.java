package listadoBasico3;

/**
* Define la clase BuscandoElCero. Utilizando el método Math.random()
* que devuelve un número aleatorio entre 0 y 1 [0, 1) comprueba
* mediante un bucle infinito si el resultado en algún momento da el
* valor 0. Utiliza la sentencia break para salir del bucle.
*
* @author Rafa Miranda
* @version 1.0
*/

public class BuscandoElCero{
	public static void main (String[]args){
		double valor;

		do{
			valor = Math.random();
			if (valor==0)
				break;//nunca va a dar cero pero hay que incluir break y puede tener sentido aquí.
			System.out.println(valor);
		}while(true);
	}//main
}//class