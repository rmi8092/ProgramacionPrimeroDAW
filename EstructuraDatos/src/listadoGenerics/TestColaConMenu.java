package listadoGenerics;

/**
 * Crea una clase gen�rica Cola (debe de aceptar cualquier tipo de objeto concreto, utiliza generics).
 * Recuerda que has de evitar la interacci�n con el usuario dentro de Cola. Utilizando generics,
 * implementa las operaciones b�sicas de una estructura de datos cola. Recuerda que una cola es una
 * estructura FIFO donde el primer elemento en entrar es el primero en salir. Un ejemplo b�sico de cola
 * es la de la taquilla de un cine. Las operaciones a implementar son:
 * a. Crear una cola.
 * b. Introducir elemento en la cola (a�adir/enqueue).
 * c. Sacar elemento de la cola (extraer/dequeue).
 * d. Cabeza de la cola. (devuelve el primer elemento de la cola, cabeza o front).
 * Implementa los m�todos necesarios, y recuerda hacer las pruebas precisas. Para ello, crea una clase
 * TestCola donde se a�adan muchos elementos de una clase creada en el mismo fichero (Persona, Paciente, Cartas...)
 * y se invoquen a todos los m�todos. Al final, vac�a la cola con un bucle while que extraiga de la cola hasta que se vac�e.
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

import utiles.Menu;
import utiles.Teclado;

public class TestColaConMenu {
	static Cola<String> miCola = null;

		public static void main(String[] args) {
			
			Menu menu = new Menu("Gesti�n Cola", new String[] {"Encolar","Mostrar cumbre","Desencolar","Desencolar todo","Salir"});
			miCola = new Cola<String>();
			
			do{
				switch(menu.gestionar()){
					case 1:
						int cantidad, contador=0;
						String nombre;
						cantidad = Teclado.leerEntero("Cuantos elementos quieres encolar?");
						do{
							nombre = Teclado.leerCadena("Introduce el nombre del elemento a encolar");
							miCola.enqueue(nombre);
							contador++;
						}while(contador!=cantidad);
						break;
					case 2:
						System.out.println("\n"+miCola.front()+"\n");
						break;
					case 3:
						cantidad = Teclado.leerEntero("Cuantos elementos quieres desencolar?");
						int contador2=0;
						do{
							System.out.println(miCola.dequeue());
							contador2++;
						}while(contador2!=cantidad);
						break;
					case 4:
						while (!miCola.isEmpty())
							 System.out.println("Desapilo de la pila: " + miCola.dequeue());
						break;
					case 5:
						System.out.println("Adios!!");
						return;
				}
				System.out.println(miCola.toString());
			}while(true);		
		}
	}