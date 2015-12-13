package listadoBasicoII;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * A continuación se muestra parte de una clase denominada RecorreArrayList:
 * a. Compila y entrega el código donde se invoquen cada uno de los métodos
 *	anteriores. Utiliza una lista de String.
 * b. Implementa cómo recorrer una lista al revés en la misma clase.
 * 
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */

public class RecorreArrayList {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Es viernes.");
		arrayList.add("Pero hay que seguir enclaustrado.");
		arrayList.add("Amo Java.");
		
		show(arrayList);
		showWithIterator(arrayList);
		showWithIterator2(arrayList);
		showWithGet(arrayList);
		showWithForEach(arrayList);		
		showWithListIterator(arrayList);
	}
	
	static void show(ArrayList<String> arrayList){
		System.out.println(arrayList);
	}
	
	static void showWithIterator(ArrayList<String> arrayList){
		Iterator<String> it = arrayList.iterator();
		
		while(it.hasNext())
			System.out.println("\t" + it.next());
	}
	
	static void showWithIterator2(ArrayList<String> arrayList){
		for(Iterator<String> it = arrayList.iterator(); it.hasNext();)
			System.out.println("\t" + it.next());
	}
	
	static void showWithGet(ArrayList<String> arrayList){
		for(int i=0; i < arrayList.size(); i++)
			System.out.println("\t" + arrayList.get(i));
	}
	
	static void showWithForEach(ArrayList<String> arrayList){
		for(String elemento: arrayList)
			System.out.println("\t" + elemento);
	}
	
	static void showWithListIterator(ArrayList<String> arrayList){
		ListIterator<String> it = arrayList.listIterator(arrayList.size());
		
		while(it.hasPrevious())
			System.out.println("\t" + it.previous());
	}
}
