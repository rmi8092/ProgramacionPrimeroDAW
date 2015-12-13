package cadenas;

import utiles.Teclado;

/**
* Entrega la clase CadenasConMenu que muestre el siguiente menú. 
* 1. Capitaliza palabras: solicitará al usuario una cadena por teclado y convertirá
* el primer carácter de cada palabra a mayúsculas. Mostrará el resultado.
* 2. Extrae mayúsculas: solicitará al usuario una cadena por teclado y extraerá las
* iniciales que estén en mayúsculas acompañadas por un punto. Necesitarás el
* método Character.isUpperCase(caracter). Mostrará el resultado.
* 3. Salir.
* Requisitos:
* - Sólo se recogerán opciones de menú válidos (1, 2 y 3).
* - Utiliza métodos en la medida de lo posible.
*
* @author Rafa Miranda
* @version 1.0
*/

public class CadenasConMenu{
	public static void main(String[]args){
	int opcion;
	do{
		System.out.println("\n1. Convertir la primera letra de cada palabra en mayuscula."+
			"\n2. Extraer solo la primera letra que este en mayuscula de cada palabra.\n3. Salir.");
		opcion=pedirOpcion();
		realizarAccion(opcion);
	}while(opcion!=3);
	System.out.println("Adios.");
	}

/**
* Metodo para registrar la opcion del menu principal escogida por usuario.
* @return Devuelve el entero registrado por teclado.
*/
	static int pedirOpcion(){
		int opcion;
		do{
			opcion=Teclado.leerEntero();
		}while(opcion!=1&&opcion!=2&&opcion!=3);
		return opcion;
	}

/**
* Metodo para redirigir el flujo hacia el metodo asociado a la opcion registrada por teclado.
* @param opcion indica la eleccion que ha hecho el usuario del menu principal.
*/
	static void realizarAccion(int opcion){
	String cadena;
		switch (opcion){
			case 1:
				cadena=Teclado.leerCadena("Introduce una cadena");
				capitalizarCadena(cadena);
				break;
			case 2:
				cadena=Teclado.leerCadena("Introduce una cadena");
				extraerMayuscula(cadena);
				break;
			default:
				break;
		}
	}

/**
* Metodo para convertir en mayuscula todas las primeras letras de cada palabra.
* @param cadena es la frase introducida por teclado por el usuario.
*/
	static void capitalizarCadena(String cadena){
		StringBuilder fin = new StringBuilder(cadena.length());

		for(int i=0;i<cadena.length()-1;i++){
			if(i==0)
				fin.append(Character.toUpperCase(cadena.charAt(i)));
			if(cadena.charAt(i)==' '&&cadena.charAt(i+1)!=' ')
				fin.append(Character.toUpperCase(cadena.charAt(i+1)));
			else
				fin.append(cadena.charAt(i+1));
		}
		System.out.println(fin);
	}

/**
* Metodo para extraer solo las iniciales mayusculas todas las palabras.
* @param cadena es la frase introducida por teclado por el usuario.
*/
	static void extraerMayuscula(String cadena){
		StringBuilder fin = new StringBuilder(cadena.length());
		
		for(int i=0;i<cadena.length()-1;i++){
			if(i==0){
				if(Character.isUpperCase(cadena.charAt(i)))
					fin.append(cadena.charAt(i)+".");
			} 	
			if(cadena.charAt(i)==' '&&Character.isUpperCase(cadena.charAt(i+1)))
				fin.append(cadena.charAt(i+1)+".");
		}
		System.out.println(fin);
	}
}