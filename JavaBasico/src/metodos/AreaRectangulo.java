package metodos;

import utiles.Teclado;

/**
* Entrega una clase java por cada uno de los siguientes ejercicios. Debes utilizar métodos. Pídele al
* usuario los datos necesarios por teclado tantas veces como quiera. Para ello implementa el método
* deseaContinuar que devuelva true si introduce 's' ó 'S', false si introduce 'n' ó 'N':
* 
* Clase  AreaRectangulo. La fórmula del área de un rectángulo
* es b * h, siendo b la base y h la altura. Solicita los datos 
* al usuario por teclado.  Calcula y muestra el área de un rectángulo.
* 
* @author Rafa Miranda
* @version 1.0
*/

public class AreaRectangulo{
	public static void main (String[]args){
		int b, h, area;

		do{
			System.out.println("\nIntroduce la base del rectangulo: ");
			b = Teclado.leerEntero();
			System.out.println("Introduce la altura del rectangulo: ");
			h = Teclado.leerEntero();
			
			area = calcularArea(b, h);

			System.out.println("\nEl area de tu rectangulo es: "+area);
		}while(deseaContinuar());
	}
	
	static int calcularArea(int b, int h){
	return b*h;
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



