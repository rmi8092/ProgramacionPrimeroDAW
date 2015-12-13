package listadoGenerics;

/**
 * Reproduce una clase con Generics. Ll�mala ClaseConGenerics. Entrega su esqueleto donde:
 * a. Definas una variable de objeto. Ha de ser una colecci�n homog�nea (del tipo parametrizado de la clase)
 * b. Definas un constructor donde instancies el atributo anterior
 * c. Definas un m�todo metodo1 cuyo par�metro sea del tipo parametrizado
 * d. Definas un m�todo metodo2 cuyo valor devuelto sea del tipo parametrizado.
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

import java.util.ArrayList;

public class ClaseConGenerics<T> {
	
	private ArrayList<T> arrayList = null;

	public ClaseConGenerics() {
		this.arrayList = new ArrayList<T>();
	}

	private void metodo1(ArrayList<T> arrayList) {
		this.arrayList = arrayList;
	}
	
	private ArrayList<T> metodo2() {
		return arrayList;
	}
}
