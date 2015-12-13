package visibilidad;

import visibilidad2.Hija2;

/**
 * Para comprobar la visibilidad de los métodos, vamos a crear una jerarquía de
 * clases en dos paquetes distintos: "visibilidad" y "visibilidad2"
 * 
 * La clase visibilidad.Padre dispondrá de dos clases hijas. La clase
 * "visibilidad.Hija1" pertenecerá al mismo paquete que el padre "visibilidad",
 * y la clase "visibilidad2.Hija2" pertenecerá al otro paquete distinto al del
 * padre "visibilidad2"
 * 
 * El padre dispondrá de cuatro métodos, cada uno con una visibilidad distinta.
 * Así:
 * <ol>
 * <li>private void método1()</li>
 * <li>void método2()</li>
 * <li>protected void método3()</li>
 * <li>public void método4()</li>
 * </ol>
 * Contesta a las siguientes preguntas:
 * <ol>
 * <li>¿Quién tiene más visibilidad, el método friendly o el protected?
 * Ordénalos de menor a mayor visibilidad</li>
 * <li>Con la palabra reservada super se puede invocar a un método de la clase
 * padre. Suele utilizarse en el refinamiento de los métodos heredados. ¿Qué
 * métodos pueden refinarse en las clases hijas?</li>
 * <li>Un método oculto es aquel al que no se puede acceder. El método privado
 * método1, ¿puede accederse en la clase hija? ¿Es un método oculto?</li>
 * <li>Redefinir un método consiste en poder sobreescribirlo en la clase hija.
 * En la clase hija, el método sobreescrito ha de tener la misma
 * signatura(nombre, parámetros y valor devuelto) ¿En algún caso puede
 * sobreescribirse el método1 que es privado?¿Qué sucede si creo un método1 con
 * el mismo nombre en la clase hija?</li>
 * <li>¿En qué casos no se puede sobreescribir el método2 que es friendly?</li>
 * <li>¿En qué casos no se puede sobreescribir el método3 que es protected?</li>
 * <li>¿Qué diferencia hay entre sobreescribir y sobrecargar un método?</li>
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
		// padre.metodo1(); método privado. No accesible fuera de la clase
		padre.metodo2();// friendly. Accesible por el paquete
		padre.metodo3();// protected. Accesible por el paquete
		padre.metodo4();// public. Accesible siempre

		System.out
				.println("\nProbando la accesibilidad del objeto hija1 fuera del mismo paquete donde se define: ");
		// hija1.metodo1(); método privado. No accesible
		hija1.metodo2(); // friendly. Accesible por el paquete
		hija1.metodo3(); // protected. Accesible por el paquete
		hija1.metodo4();// public. Accesible siempre

		System.out
				.println("\nProbando la accesibilidad del objeto hija2 dentro del mismo paquete donde se define: ");
		// hija2.metodo1(); método privado. No accesible
		// hija2.metodo2(); método friendly. No accesible fuera del paquete
		// visibilidad 2. Estoy en visibilidad
		// hija2.metodo3(); método protected. No accesible fuera del paquete
		// visibilidad 2. Epstoy en visibilidad. Tampoco visible por la herencia
		hija2.metodo4();// public. Accesible siempre

		System.out.println(hija1.i); // protected. Accesible por el paquete
		System.out.println(hija1.j); // friendly. Accesible por el paquete

		System.out.println(hija2.i); // protected. Accesible a través del paquete
		// System.out.println(hija2.j); // ERROR. friendly. No es accesible por
		// el paquete

	}

}
