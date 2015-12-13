package listadoBasicoII;

/**
 * Entrega la clase Lista que:
 * a. Añada al final de la lista
 * b. Inserte un elemento en una determinada posición
 * c. Modifique un elemento reemplazándolo por otro
 * d. Conozca el tamaño de la lista
 * e. Elimine elementos de la lista
 * f. Busque elementos en la lista
 * g. Copie la lista
 * Utilízala en un ejemplo TestLista (por ejemplo, la alineación de un equipo de fútbol, con
 * titulares y reservas) y entrégalo correctamente identificado y documentado, incluyendo
 * JavaDoc.
 * Deberás implementar un menú con las opciones posibles para que el usuario lo utilice
 * fácilmente.
 * 
 * @author rafael miranda ibañez
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
