package Circulo;

/**
 * Demostración de un sencillo objeto, sin preocuparnos de la privacidad,
 * accesibilidad, documentación javadoc...
 * 
 * @author Rafa Miranda
 * @version 1.0 
 */
public class Circulo {

	private int radio;// en milímetros

	// Constructor del objeto. Se utiliza para crear un objeto de la clase.
	// Inicializan el estado del objeto
	Circulo(int radio) {
		this.radio = radio;
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		if (radio > 0){
			this.radio = radio;
		}
		else {
			System.out.println("El rádio de tu circulo debe ser mayor que cero.");
		}
	}

	// Comportamiento del objeto (métodos o mensajes que se le envían al objeto)
	void crecer() {
		radio++;
	}

	void menguar() {
		radio--;
	}

	void mostrar() {
		System.out.println("Soy un círculo de radio " + radio / 1000d
				+ " metros. Ocupo un área de " + area() / 1000000d
				+ " metros cuadrados");
	}

	double area() {
		return Math.PI * radio * radio;
	}
}

