package listaPersonas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

	private String nombre;
	private String apellido;	
	private Genero genero;
	private FechaNacimiento fecha;
	private CodigoPostal codigo;
	private int id;
	private static int idContador;
	private static final String reGex = "^[A-Z¡…Õ”⁄—][a-z·ÈÌÛ˙Ò]{2}";
	
	private Persona(String nombre, String apellido, Genero genero, String fecha, String codigo) {
		setNombre(nombre);
		setApellido(apellido);
		setGenero(genero);
		setFecha(fecha);
		setCodigo(codigo);
		setId();
	}
	
	static Persona instanciarPersona(String nombre, String apellido, Genero genero, String fecha, String codigo){
		if(esValido(nombre)&&esValido(apellido))
			return new Persona(nombre, apellido, genero, fecha, codigo);
		return null;
	}

	private static boolean esValido(String nombre) {
		Pattern patron = Pattern.compile(reGex);
		Matcher motor = patron.matcher(nombre);
		if(motor.matches())
			return true;
		return false;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private Genero getGenero() {
		return genero;
	}

	private void setGenero(Genero genero) {
		this.genero = genero;
	}

	private FechaNacimiento getFecha() {
		return fecha;
	}

	private void setFecha(String fecha) {
		this.fecha = new FechaNacimiento(fecha);
	}

	private CodigoPostal getCodigo() {
		return codigo;
	}

	private void setCodigo(String codigo) {
		this.codigo = new CodigoPostal(codigo);
	}

	private int getId() {
		return id;
	}

	private void setId() {
		this.id = ++idContador;
	}
	
	

}
