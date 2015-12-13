package PruebaUsuario;

public class Usuario {
	private int dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	
	public Usuario() {
	}

	public Usuario(int dni, String nombre, String apellidos, String direccion){
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	int getDni() {
		return dni;
	}

	void setDni(int dni) {
		this.dni = dni;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getApellidos() {
		return apellidos;
	}

	void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	String getDireccion() {
		return direccion;
	}

	void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", direccion=" + direccion + "]";
	}
}
