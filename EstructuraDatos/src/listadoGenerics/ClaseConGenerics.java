package listadoGenerics;

/**
 * Reproduce una clase con Generics. Llámala ClaseConGenerics. Entrega su esqueleto donde:
 * a. Definas una variable de objeto. Ha de ser una colección homogénea (del tipo parametrizado de la clase)
 * b. Definas un constructor donde instancies el atributo anterior
 * c. Definas un método metodo1 cuyo parámetro sea del tipo parametrizado
 * d. Definas un método metodo2 cuyo valor devuelto sea del tipo parametrizado.
 * 
 * @author Rafael Miranda Ibañez
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
