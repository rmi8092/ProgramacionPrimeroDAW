/**
 * Env�a los ficheros �Lampara.java�, �TestLampara.java� y la respuesta
 * �preguntas.txt� en un �nico fichero comprimido �LamparaMiNombreCompleto�
 * Disponemos del siguiente c�digo:  class Lampara { boolean encendida = false;
 * encender(){ encendida = true; System.out.println("Ilumninando"); } apagar()
 * { encendida = false; System.out.println("Oscuridad"); } } 
 * - El c�digo actual contiene errores de compilaci�n. Corr�gelos.
 * - Encapsula en la medida de lo posible
 * - Empaqueta la clase Lampara en una biblioteca
 * - Haciendo uso de la clase L�mpara ya modificada, simula el funcionamiento de
 * una l�mpara en una nueva clase TestLampara (con m�todo main()) El resultado
 * de la ejecuci�n ser� este:  Ilumninando Oscuridad.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package Lampara;

public class Lampara {
	private boolean encendida = false;

	public boolean isEncendida() {
		return encendida;
	}

	private void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public void encender(){
		setEncendida(true);
		//encendida = true; Hace la misma funci�n que la l�nea superior.
		System.out.println("Ilumninando");
	}
	
	public void apagar(){
		setEncendida(false);
		//encendida = false; Hace la misma funci�n que la l�nea superior.
		System.out.println("Oscuridad");
	}
}
