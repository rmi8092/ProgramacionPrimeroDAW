package metodos;

import utiles.Teclado;

/**
* Entrega una clase java por cada uno de los siguientes ejercicios. Debes utilizar métodos. Pídele al
* usuario los datos necesarios por teclado tantas veces como quiera. Para ello implementa el método
* deseaContinuar que devuelva true si introduce 's' ó 'S', false si introduce 'n' ó 'N':
* 
* Clase PerimetroRectangulo. La fórmula del perímetro de un rectángulo es
* 2*b + 2*h, siendo b la base y h la altura. Solicita los datos al usuario por teclado.
* Calcula y muestra el perímetro de un rectángulo de forma iterativa.
*
* @author Rafa Miranda
* @version 1.0
*/

class PerimetroRectangulo{
	public static void main (String[]args){
		int b, h, p;

		do{
		System.out.println("\nIntroduce la base del rectangulo: ");
		b = Teclado.leerEntero();
		System.out.println("Introduce la altura del rectangulo: ");
		h = Teclado.leerEntero();
		
		p = calcularPerimetro(b, h);

		System.out.println("\nEl perimetro de tu rectangulo es: "+p);
		}while (deseaContinuar());
	}

	static int calcularPerimetro(int b, int h){
	return 2*b+2*h;
	}

	static boolean deseaContinuar(){
	char resp;
		do{
		System.out.println("\nDesea continuar? (s,S/n,N)");
		resp = Teclado.leerCaracter();
		}while (!((resp=='s')||(resp=='S')||(resp=='n')||(resp=='N')));
			if (resp=='s'||resp=='S')
				return true;
			else
				return false;
	}
}