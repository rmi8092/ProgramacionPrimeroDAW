package pruebasCajaBlanca;

/**
 * Ampl�a la clase Matematicas con los siguientes m�todos. Para cada uno de ellos dise�a el conjunto de
 * casos de prueba mediante la t�cnica del camino b�sico:
 * 1. static int menorDeTres(int a, int b, int c) {},
 * 2. static Respuesta positivoNegativoCero(int numero) {},
 * 3. static boolean esPar(int a) {}
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

public class Respuesta {

	private boolean positivo = false;
	private boolean negativo = false;
	private boolean cero = false;
	
	public Respuesta() {
		setPositivo(positivo);
		setNegativo(negativo);
		setCero(cero);
	}

	private boolean isPositivo() {
		return positivo;
	}

	void setPositivo(boolean positivo) {
		this.positivo = positivo;
	}

	private boolean isNegativo() {
		return negativo;
	}

	void setNegativo(boolean negativo) {
		this.negativo = negativo;
	}

	private boolean isCero() {
		return cero;
	}

	void setCero(boolean cero) {
		this.cero = cero;
	}
}
