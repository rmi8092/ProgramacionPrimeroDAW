/**
 * Envía los ficheros “Lampara.java”, “TestLampara.java” y la respuesta
 * “preguntas.txt” en un único fichero comprimido “LamparaMiNombreCompleto”
 * Disponemos del siguiente código:  class Lampara { boolean encendida = false;
 * encender(){ encendida = true; System.out.println("Ilumninando"); } apagar()
 * { encendida = false; System.out.println("Oscuridad"); } } 
 * - El código actual contiene errores de compilación. Corrígelos.
 * - Encapsula en la medida de lo posible
 * - Empaqueta la clase Lampara en una biblioteca
 * - Haciendo uso de la clase Lámpara ya modificada, simula el funcionamiento de
 * una lámpara en una nueva clase TestLampara (con método main()) El resultado
 * de la ejecución será este:  Ilumninando Oscuridad.
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
		//encendida = true; Hace la misma función que la línea superior.
		System.out.println("Ilumninando");
	}
	
	public void apagar(){
		setEncendida(false);
		//encendida = false; Hace la misma función que la línea superior.
		System.out.println("Oscuridad");
	}
}
