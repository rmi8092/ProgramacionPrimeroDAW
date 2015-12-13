package listadoGenerics;

import utiles.Menu;
import utiles.Teclado;

public class TestPilaConMenu {
	static Pila<String> miPila = null;

	public static void main(String[] args) {
		
		Menu menu = new Menu("Gestión Pila", new String[] {"Apilar","Mostrar cumbre","Desapilar","Desapilar todo","Salir"});
		miPila = new Pila<String>();
		
		do{
			switch(menu.gestionar()){
				case 1:
					int cantidad, contador=0;
					String nombre;
					cantidad = Teclado.leerEntero("Cuantos elementos quieres apilar?");
					do{
						nombre = Teclado.leerCadena("Introduce el nombre del elemento a apilar");
						miPila.push(nombre);
						contador++;
					}while(contador!=cantidad);
					break;
				case 2:
					System.out.println("\n"+miPila.top()+"\n");
					break;
				case 3:
					cantidad = Teclado.leerEntero("Cuantos elementos quieres desapilar?");
					int contador2=0;
					do{
						miPila.pop();
						contador2++;
					}while(contador2!=cantidad);
					break;
				case 4:
					while (!miPila.isEmpty())
						 System.out.println("Desapilo de la pila: " + miPila.pop());
					break;
				case 5:
					System.out.println("Adios!!");
					return;
			}
			System.out.println(miPila.toString());
		}while(true);		
	}
}
