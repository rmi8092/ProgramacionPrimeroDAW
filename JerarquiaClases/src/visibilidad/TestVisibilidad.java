package visibilidad;

import visibilidad2.Hija2;

/**
 * Para comprobar la visibilidad de los m�todos, vamos a crear una jerarqu�a de
 * clases en dos paquetes distintos: "visibilidad" y "visibilidad2"
 * 
 * La clase visibilidad.Padre dispondr� de dos clases hijas. La clase
 * "visibilidad.Hija1" pertenecer� al mismo paquete que el padre "visibilidad",
 * y la clase "visibilidad2.Hija2" pertenecer� al otro paquete distinto al del
 * padre "visibilidad2"
 * 
 * El padre dispondr� de cuatro m�todos, cada uno con una visibilidad distinta.
 * As�:
 * <ol>
 * <li>private void m�todo1()</li>
 * <li>void m�todo2()</li>
 * <li>protected void m�todo3()</li>
 * <li>public void m�todo4()</li>
 * </ol>
 * Contesta a las siguientes preguntas:
 * <ol>
 * <li>�Qui�n tiene m�s visibilidad, el m�todo friendly o el protected?
 * Ord�nalos de menor a mayor visibilidad</li>
 * <li>Con la palabra reservada super se puede invocar a un m�todo de la clase
 * padre. Suele utilizarse en el refinamiento de los m�todos heredados. �Qu�
 * m�todos pueden refinarse en las clases hijas?</li>
 * <li>Un m�todo oculto es aquel al que no se puede acceder. El m�todo privado
 * m�todo1, �puede accederse en la clase hija? �Es un m�todo oculto?</li>
 * <li>Redefinir un m�todo consiste en poder sobreescribirlo en la clase hija.
 * En la clase hija, el m�todo sobreescrito ha de tener la misma
 * signatura(nombre, par�metros y valor devuelto) �En alg�n caso puede
 * sobreescribirse el m�todo1 que es privado?�Qu� sucede si creo un m�todo1 con
 * el mismo nombre en la clase hija?</li>
 * <li>�En qu� casos no se puede sobreescribir el m�todo2 que es friendly?</li>
 * <li>�En qu� casos no se puede sobreescribir el m�todo3 que es protected?</li>
 * <li>�Qu� diferencia hay entre sobreescribir y sobrecargar un m�todo?</li>
 * </ol>
 * 
 * @author mlmc
 * 
 */
public class TestVisibilidad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Padre padre = new Padre();
		Hija1 hija1 = new Hija1();
		Hija2 hija2 = new Hija2();

		System.out.println("\nProbando la accesibilidad del objeto padre: ");
		// padre.metodo1(); m�todo privado. No accesible fuera de la clase
		padre.metodo2();// friendly. Accesible por el paquete
		padre.metodo3();// protected. Accesible por el paquete
		padre.metodo4();// public. Accesible siempre

		System.out
				.println("\nProbando la accesibilidad del objeto hija1 fuera del mismo paquete donde se define: ");
		// hija1.metodo1(); m�todo privado. No accesible
		hija1.metodo2(); // friendly. Accesible por el paquete
		hija1.metodo3(); // protected. Accesible por el paquete
		hija1.metodo4();// public. Accesible siempre

		System.out
				.println("\nProbando la accesibilidad del objeto hija2 dentro del mismo paquete donde se define: ");
		// hija2.metodo1(); m�todo privado. No accesible
		// hija2.metodo2(); m�todo friendly. No accesible fuera del paquete
		// visibilidad 2. Estoy en visibilidad
		// hija2.metodo3(); m�todo protected. No accesible fuera del paquete
		// visibilidad 2. Epstoy en visibilidad. Tampoco visible por la herencia
		hija2.metodo4();// public. Accesible siempre

		System.out.println(hija1.i); // protected. Accesible por el paquete
		System.out.println(hija1.j); // friendly. Accesible por el paquete

		System.out.println(hija2.i); // protected. Accesible a trav�s del paquete
		// System.out.println(hija2.j); // ERROR. friendly. No es accesible por
		// el paquete

	}

}
