package CreandoClases;
/*
Crea tres clases con las siguientes caracter�sticas. Para ello,
Procura escribir todo el c�digo (no copies y pegues)
Inicialmente, no te preocupes de los modificadores de acceso (s�lo public class
por cada fichero.java. El resto, friendly)
Al finalizar el ejercicio, indica:
�Cu�ntos objetos en total se han creado?
�Cu�ntos paquetes en total se han creado?
�Utilizas alg�n paquete externo? �Has tenido que utilizar alg�n import? �Por qu�?
Clase1.
Contiene los campos 
* campo1 tipo int; 
* campo2 tipo String; 
* campo3 tipo Clase2
Constructores 
* Clase1() que inicializa los tres campos anteriores.
Contiene los m�todos 
* metodo1 muestra "En ObjetoDeClase1.metodo1" 
* metodo2 muestra "En ObjetoDeClase1.metodo2" 
* metodo3 muestra "En ObjetoDeClase1.metodo3"
Clase2.
Contiene los campos 
* campo1 tipo int[][]; 
* campo2 tipo char;
Constructores 
* Clase2() que inicializa los dos campos anteriores.
Contiene los m�todos 
* metodo1 muestra "En ObjetoDeClase2.metodo1" 
* metodo2 muestra "En ObjetoDeClase2.metodo2" 
* metodo3 muestra "En ObjetoDeClase2.metodo3"
ClaseCreandoClases
Con m�todo main que 
* cree una instancia de cada objeto Clase1 y Clase2. 
* invoque a todos los m�todos definidos.
Si todo va bien, el resultado deber�a ser algo parecido a esto:
En ObjetoDeClase1.metodo1
En ObjetoDeClase1.metodo2 
En ObjetoDeClase1.metodo3 
En ObjetoDeClase2.metodo1 
En ObjetoDeClase2.metodo2 
En ObjetoDeClase2.metodo3
*/

public class ClaseCreandoClases {
	public static void main(String[] args) {
	
		int[][]array = new int[4][5];
		
		Clase2 c2 = new Clase2(array,'t'); //podria definir el array dentro (new int[4][5])
		Clase1 c1 = new Clase1(10,"objeto clase1",c2);
	
		c1.metodo1();
		c1.metodo2();
		c1.metodo3();
		c2.metodo1();
		c2.metodo2();
		c2.metodo3();
	}
}
/*
*�Cu�ntos objetos en total se han creado? Se han creado cuatro objetos (c1, c2, un String,
*y una matriz).
*�Cu�ntos paquetes en total se han creado? Se ha creado un paquete.
*�Utilizas alg�n paquete externo? No �Has tenido que utilizar alg�n import? No
*�Por qu�? Porque no hay que importar ninguna clase desde otro paquete.
*/