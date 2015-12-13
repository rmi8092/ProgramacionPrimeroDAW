package Lampara;

public class TestLampara {
	public static void main(String[]args){
		Lampara primeralampara = new Lampara(); // Se instancia el objeto.
		primeralampara.encender(); // Se invoca a un método.
		primeralampara.apagar(); // Se invoca a un método.
		//Mediante ambos métodos accede al campo "encendida".
		System.out.println(primeralampara.isEncendida());
	}
}
