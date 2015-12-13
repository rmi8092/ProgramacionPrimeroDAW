package CreandoClases;
/*
Basándote en las clases anteriores, crea otra clase AccediendoCampos que: 
Instancie un objeto de cada clase Acceda y visualice cada campo de los objetos
Para ello:
Procura escribir todo el código (no copies y pegues).Inicialmente no te preocupes
de los modificadores de acceso (sólo public class por cada fichero.java.
El resto, friendly).
Al finalizar el ejercicio, indica: 
¿Has tenido algún impedimento para acceder a los campos?¿Por qué?
Recuerda los campos de Clase1 y Clase2.
Clase1. 
Contiene los campos 
* campo1 tipo int; 
* campo2 tipo String; 
* campo3 tipo Clase2 
Clase2. 
Contiene los campos 
* campo1 tipo int[][]; 
* campo2 tipo char; 
AccediendoCampos 
Con método main que:
* cree una instancia de cada objeto Clase1 y Clase2. 
* Acceda y muestre cada uno de los campos de los objetos.
Si todo va bien, el resultado debería ser algo parecido a esto: 

Acceciendo a los campos de o1: 
o1.campo1(9), 
o1.campo2(Campo2 del objeto de la Clase1), 
o1.campo3.campo2 (d) 
0 0 0 
0 0 0 

Acceciendo a los campos de o2: 
o2.campo2(Y) 
0 0 0 
0 0 0
*/

public class AccediendoCampos {
	public static void main (String[]args){
		
		int[][]matriz=new int[2][3];
		
		Clase2 o2 = new Clase2(matriz,'Y');
		Clase1 o1 = new Clase1(9,"Campo2 del objeto de la Clase1",o2);
	
		System.out.println("Accediendo a los campos de o1:");
		System.out.print(o1.getCampo1());
		System.out.println(o1.toString());
		System.out.print("\n");
		System.out.print("\nAccediendo a los campos de o2:");
		System.out.print(o2.toString());
	}
}