package usuario;
/**
 * Recuerda enviar los ficheros fuentes en sus paquetes. Utiliza los modificadores de visibilidad (private en la medida de lo posible para fomentar el encapsulamiento) y documenta correctamente (clases, atributos, constructores y métodos)

 *1. Define la clase Usuario que contenga:

 *Campos (almacenen los siguientes atributos del usuario):
 *dni
 *nombre
 *apellidos
 *dirección
 *
 *Constructores
 *Uno sin argumentos
 *Otro con cuatro argumentos (uno por cada campo)
 *
 *Métodos (por cada campo)
 *getCampo1
 *setCampo1
 *
 *2. Entrega la clase TestUsuario que compruebe el funcionamiento de la clase Usuario:
 *Creará tres usuarios con las siguientes características:
 *(123) Nombre1 Apellidos1 Mikasa1
 *(456) Nombre4 Apellidos4 Mikasa4
 *(789) Nombre7 Apellidos7 Mikasa7
 *
 *Los almacenará en un VECTOR (de usuarios, almacenará los tres usuarios)
 *
 *Pedirá por teclado el dni de un usuario y mostrará el resto de los atributos del usuario. Lo hará tantas veces como el usuario quiera.
 *3. Entrega la clase ModificaUsuario que compruebe el funcionamiento de la clase Usuario:

 *Creará un objeto usu1 con las siguientes características:
 *(123) Rompetechos Apellidos1 Mikasa1
 *Utilizará el constructor vacío.
 *Como el usuario se ha mudado, cambiará de dirección:
 *(123) Rompetechos Apellidos1 Num. 13 de la Rue del Percebe
 *Cada vez que se modifique el estado del objeto, se mostrarán todos los atributos. Para ello sobreescribe el método toString() en la clase Usuario
 *
 * @author Emanuel Galván Fontalba
 * @version 1.0
 */

public class Usuario {
	
	private int dni;
	private String nombre;
	private String apellidos;
	private String direccion;

	Usuario(){
	}
	
	Usuario(int dni, String nombre, String apellidos, String direccion){
		setDni(dni);
		setNombre(nombre);
		setApellidos(apellidos);
		setDireccion(direccion);
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
		return "Usuario [dni=(" + dni + "), nombre=" + nombre + ", apellidos="
				+ apellidos + ", direccion=" + direccion + "]";
	}
}
