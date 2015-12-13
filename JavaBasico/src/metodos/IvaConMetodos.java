package metodos;

import utiles.Teclado;

/**
* Define la clase IvaConMetodos que calcule los impuestos que se aplican
* a un precio base en función de si el iva es superreducido (4%), reducido (10%)
* o general (21%). Para ello define y usa los siguientes métodos:
* a. pedirIVA()
* b. pedirPrecio()
* c. continuar()
* d. calcularIva(double, char)
*
* @author Rafa Miranda
* @version 1.0
*/

public class IvaConMetodos{
	public static void main (String[]args){
		double pre;
		char tipo;

		do{
			System.out.println("\nVamos a calcular el IVA sobre un precio base. Introduzca una cifra:");
			
			pre = pedirPrecio();
			System.out.println("\nPrecio base del articulo (mayor que cero): "+pre);

			tipo = pedirIVA();

			System.out.println("\nEl IVA a aplicar sobre "+pre+" es: "+tipo);

			System.out.println("\nEl precio de su producto con IVA incluido es: "+calcularIva(pre, tipo));
		}while(continuar());
	}

	/**
	* Nos pide precio por teclado.
	*
	* @return Devuelve la cifra.
	*/
	static int pedirPrecio(){
		return Teclado.leerEntero();
	}

	/**
	* Nos pide precio el tipo de IVA por teclado. Se controla con un
	* Do...While que el tipo no sea erroneo.
	*
	* @return Devuelve el tipo de IVA.
	*/
	static char pedirIVA(){
	char tipo;
		do{ 
			System.out.print("\nIndica el tipo de IVA: super reducido, reducido o general (s/r/g): ");
			tipo = Character.toUpperCase(Teclado.leerCaracter());
		} while (tipo!='S'&&tipo!='R'&&tipo!='G');
		return tipo;
	}

	/**
	* Aplica el tipo de IVA elegido al precio seleccionado. 
	* Con Switch controlamos el flujo por las diferentes opciones.
	*
	* @return Devuelve el precio con IVA incluido.
	*/
	static double calcularIva(double pre, char tipo){
		double porcentajeIva=0;
		switch(tipo){
			case 'S':
				porcentajeIva=1.04;
				break;
			case 'R':
				porcentajeIva=1.10;
				break;
			default://case 'g':
				porcentajeIva=1.21;
				//break;
		}
		return pre*porcentajeIva;
	}

	/**
	* Devuelve true o false en función de si se desea continuar o no.
	*
	* @return Booleano true o false.
	*/
	static boolean continuar(){
		char resp;
		do{
			System.out.println("\nDesea continuar? (s/n)");
			resp = Character.toUpperCase(Teclado.leerCaracter());
		}while(resp!='S'&&resp!='N');
		return resp=='S'?true:false;
	}
}
