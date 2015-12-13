package herencia;

/**
 * Dise�a, implementa y prueba las clases Mam�fero, Perro y Gato. Para ello, supongamos que:
 * a. Todo mam�fero tiene patas y nombre
 * b. Un perro es un mam�fero con cuatro patas, nombre y que adem�s, ladra.
 * c. Un gato es un mam�fero con cuatro patas, nombre y que adem�s, maulla.
 * d. Crea la clase TestMamiferos que:
 *    i. Cree al perro Mil�
 *    ii. Cree al gato Garfield
 *    iii. Haga ladrar a Mil�
 *    iv. Haga maullar a Garfield
 *    v. Muestre los datos de Garfield y de Mil� mediante toString y mediante los getters
 *    (prueba la diferencia entre hacerlos protected y private)
 * 
 * @author Rafael Miranda Iba�ez
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
