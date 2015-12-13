package herencia;

/**
 * Diseña, implementa y prueba las clases Mamífero, Perro y Gato. Para ello, supongamos que:
 * a. Todo mamífero tiene patas y nombre
 * b. Un perro es un mamífero con cuatro patas, nombre y que además, ladra.
 * c. Un gato es un mamífero con cuatro patas, nombre y que además, maulla.
 * d. Crea la clase TestMamiferos que:
 *    i. Cree al perro Milú
 *    ii. Cree al gato Garfield
 *    iii. Haga ladrar a Milú
 *    iv. Haga maullar a Garfield
 *    v. Muestre los datos de Garfield y de Milú mediante toString y mediante los getters
 *    (prueba la diferencia entre hacerlos protected y private)
 * 
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */

public class Mamifero {

	private int patas;
	private String nombre;
	
	Mamifero(int patas, String nombre) {
		setPatas(patas);
		setNombre(nombre);
	}

	int getPatas() {
		return patas;
	}

	void setPatas(int patas) {
		this.patas = patas;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Mamifero [patas=" + patas + ", nombre=" + nombre + "]";
	}
}
