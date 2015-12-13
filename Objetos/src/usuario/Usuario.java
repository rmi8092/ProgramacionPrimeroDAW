package usuario;
/**
 * Recuerda enviar los ficheros fuentes en sus paquetes. Utiliza los modificadores de visibilidad (private en la medida de lo posible para fomentar el encapsulamiento) y documenta correctamente (clases, atributos, constructores y m�todos)

 *1. Define la clase Usuario que contenga:

 *Campos (almacenen los siguientes atributos del usuario):
 *dni
 *nombre
 *apellidos
 *direcci�n
 *
 *Constructores
 *Uno sin argumentos
 *Otro con cuatro argumentos (uno por cada campo)
 *
 *M�todos (por cada campo)
 *getCampo1
 *setCampo1
 *
 *2. Entrega la clase TestUsuario que compruebe el funcionamiento de la clase Usuario:
 *Crear� tres usuarios con las siguientes caracter�sticas:
 *(123) Nombre1 Apellidos1 Mikasa1
 *(456) Nombre4 Apellidos4 Mikasa4
 *(789) Nombre7 Apellidos7 Mikasa7
 *
 *Los almacenar� en un VECTOR (de usuarios, almacenar� los tres usuarios)
 *
 *Pedir� por teclado el dni de un usuario y mostrar� el resto de los atributos del usuario. Lo har� tantas veces como el usuario quiera.
 *3. Entrega la clase ModificaUsuario que compruebe el funcionamiento de la clase Usuario:

 *Crear� un objeto usu1 con las siguientes caracter�sticas:
 *(123) Rompetechos Apellidos1 Mikasa1
 *Utilizar� el constructor vac�o.
 *Como el usuario se ha mudado, cambiar� de direcci�n:
 *(123) Rompetechos Apellidos1 Num. 13 de la Rue del Percebe
 *Cada vez que se modifique el estado del objeto, se mostrar�n todos los atributos. Para ello sobreescribe el m�todo toString() en la clase Usuario
 *
 * @author Emanuel Galv�n Fontalba
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
