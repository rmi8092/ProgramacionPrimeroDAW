package metodos;

import utiles.Teclado;

/**
* Define la clase EcuacionSegundoGrado que muestre las soluciones de una ecuación
* de segundo grado ax2 + bx + c = 0. Se le preguntará al usuario si quiere repetir
* el programa. Utiliza métodos (deseaContinuar, leerCoeficientes, mostrarResultados…).
*
* @author Rafa Miranda
* @version 1.0
*/

public class EcuacionSegundoGrado{
	public static void main (String[]args){
				
		do{
			double a=0, b=0, c=0;
			
			System.out.println("\nVamos a resolver una ecuacion de segundo grado, "+
				"dame los coeficientes a, b y c.");
			a = leerCoeficienteA(a);
			b = leerCoeficienteB(b);
			c = leerCoeficienteC(c);
			System.out.println("\nLos valores de x en tu ecuacion de segundo grado son: "+mostrarResultado1(a,b,c)
				+"\t"+mostrarResultado2(a,b,c));
		}while (deseaContinuar());
	}

	/**
	* Metodo para leer los coeficientes de nuestra ecuación.
	*
	* @param respuesta si (S) o no (N).
	* @return Booleano true o false.
	*/
	static double leerCoeficienteA(double a){
		return Teclado.leerEntero();	
	}
	static double leerCoeficienteB(double b){
		return Teclado.leerEntero();
	}	
	static double leerCoeficienteC(double c){
		return Teclado.leerEntero();
	}
	
	/**
	* Metodo para despejar x en la resolucion de una ecuacion de segundo grado.
	*
	* @param a primer coeficiente.
	* @param b segundo coeficiente.
	* @param c tercer coeficiente.
	* @return Solución para nuestra incognita x.
	*/
	static double mostrarResultado1(double a, double b, double c){
		double potencia = Math.pow(b,2);
		double factor = potencia-(4*a*c);
		double raiz = Math.sqrt(factor);
		return ((-b+raiz)/(2*a));
	}
	static double mostrarResultado2(double a, double b, double c){
		double potencia = Math.pow(b,2);
		double factor = potencia-(4*a*c);
		double raiz = Math.sqrt(factor);
		return ((-b-raiz)/(2*a));
	}

	/**
	* Metodo para controlar si queremos repetir o no nuestro programa.
	*
	* @param respuesta si (S) o no (N).
	* @return Booleano true o false.
	*/
	static boolean deseaContinuar(){
		char resp;
		System.out.println("\nQuiere repetir el programa? (s,n).");
		resp = Character.toUpperCase(Teclado.leerCaracter());
		return resp=='S'?true:false;
	}
}