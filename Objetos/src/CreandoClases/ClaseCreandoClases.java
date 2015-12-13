package CreandoClases;
/*
Crea tres clases con las siguientes características. Para ello,
Procura escribir todo el código (no copies y pegues)
Inicialmente, no te preocupes de los modificadores de acceso (sólo public class
por cada fichero.java. El resto, friendly)
Al finalizar el ejercicio, indica:
¿Cuántos objetos en total se han creado?
¿Cuántos paquetes en total se han creado?
¿Utilizas algún paquete externo? ¿Has tenido que utilizar algún import? ¿Por qué?
Clase1.
Contiene los campos 
* campo1 tipo int; 
* campo2 tipo String; 
* campo3 tipo Clase2
Constructores 
* Clase1() que inicializa los tres campos anteriores.
Contiene los métodos 
* metodo1 muestra "En ObjetoDeClase1.metodo1" 
* metodo2 muestra "En ObjetoDeClase1.metodo2" 
* metodo3 muestra "En ObjetoDeClase1.metodo3"
Clase2.
Contiene los campos 
* campo1 tipo int[][]; 
* campo2 tipo char;
Constructores 
* Clase2() que inicializa los dos campos anteriores.
Contiene los métodos 
* metodo1 muestra "En ObjetoDeClase2.metodo1" 
* metodo2 muestra "En ObjetoDeClase2.metodo2" 
* metodo3 muestra "En ObjetoDeClase2.metodo3"
ClaseCreandoClases
Con método main que 
* cree una instancia de cada objeto Clase1 y Clase2. 
* invoque a todos los métodos definidos.
Si todo va bien, el resultado debería ser algo parecido a esto:
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
*¿Cuántos objetos en total se han creado? Se han creado cuatro objetos (c1, c2, un String,
*y una matriz).
*¿Cuántos paquetes en total se han creado? Se ha creado un paquete.
*¿Utilizas algún paquete externo? No ¿Has tenido que utilizar algún import? No
*¿Por qué? Porque no hay que importar ninguna clase desde otro paquete.
*/