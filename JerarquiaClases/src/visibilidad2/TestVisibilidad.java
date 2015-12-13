package visibilidad2;

import visibilidad.Hija1;
import visibilidad.Padre;

public class TestVisibilidad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Padre padre = new Padre();
		Hija1 hija1 = new Hija1();
		Hija2 hija2 = new Hija2();
		
		System.out.println("\nProbando la accesibilidad del objeto padre: ");
		//padre.metodo1(); método privado. No accesible fuera de la clase
		//padre.metodo2();// friendly. NO Accesible por el paquete
		//padre.metodo3();// protected. NO Accesible NI por el paquete NI por herencia
		padre.metodo4();// public. Accesible siempre

		System.out.println("\nProbando la accesibilidad del objeto hija1 FUERA del mismo paquete donde se define: ");
		// hija1.metodo1(); método privado. No accesible
		//hija1.metodo2(); // friendly. NO accesible por el paquete
		//hija1.metodo3(); // protected. NO Accesible NI por el paquete NI por herencia
		hija1.metodo4();// public. Accesible siempre

		System.out.println("\nProbando la accesibilidad del objeto hija2 fuera del mismo paquete donde se define: ");
		//hija2.metodo1(); método privado. No accesible
		hija2.metodo2(); //método friendly. Accesible por el paquete
		hija2.metodo3(); //método protected. Accesible por el paquete, NO por la herencia
		hija2.metodo4();// public. Accesible siempre

		//System.out.println(hija1.i); // ERROR.protected. No accesible a través de la herencia
		//System.out.println(hija1.j); // ERROR.friendly. No Accesible por estar en otro paquete

		//System.out.println(hija2.i); // ERROR. protected. Accesible a través de la herencia
		//System.out.println(hija2.j); // ERROR. friendly. No es accesible por estar fuera del paquete del padre

	}

}
