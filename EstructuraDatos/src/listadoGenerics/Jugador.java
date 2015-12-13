package listadoGenerics;

/**
 * Crea una clase generica Lista. Has de implementar los siguientes m�todos:
 * a. A�ada al final de la lista
 * b. Inserte un elemento en una determinada posici�n
 * c. Modifique un elemento reemplaz�ndolo por otro
 * d. Conozca el tama�o de la lista
 * e. Elimine elementos de la lista
 * f. Busque elementos en la lista
 * g. Copie la lista
 * Util�zala en un ejemplo TestLista (por ejemplo, la alineaci�n de un equipo de f�tbol, con
 * titulares y reservas) y entr�galo correctamente identificado y documentado, incluyendo
 * JavaDoc.
 * Deber�s implementar un men� con las opciones posibles para que el usuario lo utilice
 * f�cilmente.
 * 
 * @author rafael miranda iba�ez
 * @version 1.0
 */

public class Jugador {
	
	private String nombre;
	
	public Jugador(String nombre) {
		setNombre(nombre);
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
