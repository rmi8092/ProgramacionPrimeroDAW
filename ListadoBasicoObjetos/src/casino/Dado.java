/*
 * 5. Crea la clase Dado de seis caras (valores del 1 al 6). M�telo en el paquete casino. Implementa al menos los m�todos
 *   a. toString().
 *   b. lanzar()
 * 6. Implementa la clase TestDado() para probar la clase Dado: Mediante un men� se lanza el dado tantas veces como se quiera,
 *    mostr�ndose su valor. Tendr�s al menos las clases:
 *   a. casino.Dado.java,
 *   b. testCasino.TestDado.java,
 *   c. utiles.Menu.java. Deber�s crear al menos un men� con al menos las opciones �lanzar dado� y �salir�
 * 7. Implementa la clase JuegoDado(). Consiste en lanzar el dado. Ganar� aquel que saque el mayor valor. Mediante un men�
 *    se lanza el dado tantas veces como se quiera, mostr�ndose su valor. Tendr�s al menos las clases:
 *   a. casino.Dado.java,
 *   b. casino.JuegoDado.java. Has de implementar al menos el m�todo jugar(),
 *   c. utiles.Menu.java. Deber�s crear al menos un men� con las opciones �jugar� y �salir�
 *   d. testCasino.TestJuegoDado.java, donde se crear� el juego.
 */

package casino;

public class Dado {
	
	private int valor;
	
	private int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	int lanzar(){
		setValor((int)(Math.random()*6)+1);
		return getValor();
	}

	@Override
	public String toString() {
		return "Dado [valor=" + valor + "]";
	}
	
}
