/*
 * 5. Crea la clase Dado de seis caras (valores del 1 al 6). Mételo en el paquete casino. Implementa al menos los métodos
 *   a. toString().
 *   b. lanzar()
 * 6. Implementa la clase TestDado() para probar la clase Dado: Mediante un menú se lanza el dado tantas veces como se quiera,
 *    mostrándose su valor. Tendrás al menos las clases:
 *   a. casino.Dado.java,
 *   b. testCasino.TestDado.java,
 *   c. utiles.Menu.java. Deberás crear al menos un menú con al menos las opciones “lanzar dado” y “salir”
 * 7. Implementa la clase JuegoDado(). Consiste en lanzar el dado. Ganará aquel que saque el mayor valor. Mediante un menú
 *    se lanza el dado tantas veces como se quiera, mostrándose su valor. Tendrás al menos las clases:
 *   a. casino.Dado.java,
 *   b. casino.JuegoDado.java. Has de implementar al menos el método jugar(),
 *   c. utiles.Menu.java. Deberás crear al menos un menú con las opciones “jugar” y “salir”
 *   d. testCasino.TestJuegoDado.java, donde se creará el juego.
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
