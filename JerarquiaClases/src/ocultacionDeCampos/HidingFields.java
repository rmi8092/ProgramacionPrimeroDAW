package ocultacionDeCampos;

/**
 * <ol>
 * <li>Ocultar un campo: consiste en definir un atributo/campo con el mismo
 * nombre de la clase padre
 * <li>No es recomendable
 * <li>Para acceder al campo oculto se utiliza
 * 
 * <ol>
 * <li>super.nombreAtributoOculto (dentro de la declaraci�n del hijo)
 * <li>mediante un casting al padre
 * 
 * </ol>
 * <li>Si se hace privado el atributo, no est� accesible en el hijo.
 * <li>Si se hace protected, s�lo est� accesible a trav�s de la herencia o
 * dentro del mismo paquete.
 * 
 * @author lmagarin
 * 
 */
public class HidingFields {
	public static void main(String[] args) {

		Padre padre = new Padre();
		Hijo hijo = new Hijo();

		System.out.println(padre);
		System.out.println(hijo);
		System.out.println(padre.atributo);
		System.out.println(hijo.atributo);

		System.out.println(((Padre) hijo).atributo);// el del padre, por el
													// casting. Obligo a
													// referenciarlo de la clase
													// padre
		padre = hijo;// el objeto hijo es referenciado por el tipo est�tico del
						// padre. POLIMORFISMO
		System.out.println(padre.atributo);// el del padre, porque el tipo
											// est�tico es del padre.		SI "padre" APUNTA AL OBJETO "hijo" POR QUE IMPRIME EL ATRIBUTO DEL PADRE??
		System.out.println(padre);//LIGADURA DIN�MICA. Uso el sobreescrito del hijo
	}
}

class Padre {
	String atributo = "Del padre";
	int atributoEntero = 1;

	public int getAtributoEntero() {
		return atributoEntero;
	}

	public void setAtributoEntero(int atributoEntero) {
		this.atributoEntero = atributoEntero;
	}

	@Override
	// sobreescribe el de Object
	public String toString() {
		return "Padre [atributo=" + atributo + ", atributoEntero="
				+ atributoEntero + "]";
	}

}

class Hijo extends Padre {
	String atributo = "Del Hijo";// con el mismo nombre que el del padre. Est�
									// oculto
	int atributoEntero = 2;

	@Override
	// sobreescribe el de Padre
	public String toString() {
		return "Hijo [atributo=" + atributo + ", atributoEntero="
				+ atributoEntero + ", toString()=" + super.toString() + "]";
	}

}
