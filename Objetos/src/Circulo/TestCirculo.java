package Circulo;

/**
 * Clase que prueba el comportamiento de un sencillo c�rculo
 * 
 * @author Rafa Miranda
 * @version 1.0
 */
public class TestCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//instanciaci�n del objeto
		Circulo circulo = new Circulo(500);
		
		//asigno un radio inv�lido con la invocaci�n del setter para comprobaci�n.
		circulo.setRadio(0);
		
		//Tengo una �nica instancia de la clase Circulo.
		circulo.crecer();
		circulo.crecer();
		circulo.crecer(); 	
		circulo.crecer();
		circulo.mostrar();
		circulo.menguar();
		circulo.mostrar();
	}
}
