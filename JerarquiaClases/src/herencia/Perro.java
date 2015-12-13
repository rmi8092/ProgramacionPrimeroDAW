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

public class Perro extends Mamifero {

	private static final int patas = 4;
	private boolean ladrar = false;
	
	Perro(String nombre) {
		super(patas, nombre);
	}

	boolean isLadrar() {
		return ladrar;
	}

	void setLadrar(boolean ladrar) {
		this.ladrar = ladrar;
	}

	@Override
	public String toString() {
		return "Perro [ladrar=" + ladrar + "]";
	}
}
