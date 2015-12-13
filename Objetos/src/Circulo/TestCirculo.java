package Circulo;

/**
 * Clase que prueba el comportamiento de un sencillo círculo
 * 
 * @author Rafa Miranda
 * @version 1.0
 */
public class TestCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//instanciación del objeto
		Circulo circulo = new Circulo(500);
		
		//asigno un radio inválido con la invocación del setter para comprobación.
		circulo.setRadio(0);
		
		//Tengo una única instancia de la clase Circulo.
		circulo.crecer();
		circulo.crecer();
		circulo.crecer(); 	
		circulo.crecer();
		circulo.mostrar();
		circulo.menguar();
		circulo.mostrar();
	}
}
