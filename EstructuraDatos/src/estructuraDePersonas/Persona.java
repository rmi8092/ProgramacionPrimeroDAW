package estructuraDePersonas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea una estructura din�mica de personas. Una persona consta de:
 * 1. Nombre (regex con m�nimo de tres caracteres v�lidos seguidos)
 * 2. Apellido primero (regex con m�nimo de tres caracteres v�lidos seguidos)
 * 3. Apellido segundo (regex con m�nimo de tres caracteres v�lidos seguidos)
 * 4. Fecha de nacimiento (regex con formato dd/mm/aaaa y (opcional) es v�lida (a�o bisiesto)
 * 5. C�digo postal (regex que admita pplll � pp.lll)
 * 6. Edad (opcional)
 * 7. Identificador un�voco, generado mediante un campo static)
 * Con la estructura podr�s realizar las siguientes operaciones:
 * a. A�adir una nueva persona
 * b. Eliminarla (utiliza contains)
 * c. Contar y mostrar los que hay de una provincia (utiliza iteradores)
 * d. Mostrar la estructura al completo(utiliza toString)
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

public class Persona {
	
	//private static final Pattern reGexNombre = Pattern.compile("(?i)^[a-z������������]{3,}\\s+([a-z������������]{3,})*$");
	private static final Pattern reGexNombre = Pattern.compile("(?i)^[a-z������������]{2,}");
	private static final Pattern reGexFecha = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})$");
	private static final Pattern reGexCodigo = Pattern.compile("^(0[1-9]|[1-4][0-9]|5[0-2])\\.?(([0-9]{2}[1-9]|[0-9][1-9][0-9]|[1-9][0-9]{2}))$");
	
	private String nombre;
	private String apellidoPrimero;
	private String apellidoSegundo;
	private String fechaNacimiento;
	private String codigoPostal;
	//private Genero genero; 
	private static int idContador; 
	private int id;
	
	private Persona(int id){
		this.id = id;
	}
	
	private Persona(String nombre, String apellidoPrimero, String apellidoSegundo, String codigoPostal, String fechaNacimiento/*, Genero genero*/) {
		setNombre(nombre);
		setApellidoPrimero(apellidoPrimero);
		setApellidoSegundo(apellidoSegundo);
		setCodigoPostal(codigoPostal);
		setFechaNacimiento(fechaNacimiento);
		//setGenero(genero);
		setId();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellidoPrimero(String apellidoPrimero) {
		this.apellidoPrimero = apellidoPrimero;
	}

	private void setApellidoSegundo(String apellidoSegundo) {
		this.apellidoSegundo = apellidoSegundo;
	}

	private void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	String getCodigoPostal() {
		return codigoPostal;
	}

	private void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	/*private void setGenero(Genero genero) {
		this.genero = genero;
	}*/

	private void setId() {
		this.id = ++idContador;
	}

	static Persona instanciarPersona(int id) {
		if(id>0 && id<=idContador)
			return new Persona(id);
		return null;
	}
	
	//Se hace est�tico porque de lo contrario habria que crear el objeto para invocar este m�todo,
	//pero �como voy a tener un objeto previamente a invocar este m�todo si el objetivo del metodo es instanciar personas??
	static Persona instanciarPersona(String nombre, String apellidoPrimero, String apellidoSegundo, String codigoPostal, String fechaNacimiento){
		if(esValidoNombre(nombre)&&esValidoNombre(apellidoPrimero)&&esValidoNombre(apellidoSegundo)&&esValidoCodigo(codigoPostal)
				&&esValidoFecha(fechaNacimiento))
			return new Persona(nombre, apellidoPrimero, apellidoSegundo, codigoPostal, fechaNacimiento/*, genero*/);
		return null;
	}
	
	private static boolean esValidoNombre(String n) {
		return reGexNombre.matcher(n).matches();
	}
	
	private static boolean esValidoFecha(String fn) {
		return reGexFecha.matcher(fn).matches();
	}

	private static boolean esValidoCodigo(String cp){
		return reGexCodigo.matcher(cp).matches();	
	}
	
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) { //contains se usa en annadir pero no es necesario porque si ha pasado el filtro de instanciarPersona
		if (this == obj)				//ya se sabe que no existe previamente en la lista. La verdadera utilidad de contains est� implicita
			return true;				//en el metodo remove y como ah� le pasamos solo el campo id, pues tiene sentido equals compare
		if (obj == null)				//solo en base al id.
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nPersona [nombre=" + nombre + ", primerApellido="
				+ apellidoPrimero + ", segundoApellido=" + apellidoSegundo
				+ ", fechaDeNacimiento=" + fechaNacimiento
				+ ", codigoPostal=" + codigoPostal + ", id=" + id + "]";
	}

	String getProvincia() {
		Matcher matcher = reGexCodigo.matcher(getCodigoPostal());
		matcher.matches();
		return matcher.group(1);
	}
}
