package ies;

/*
 * 3. Crea la Clase Estudiante. Mételo en el paquete ies. Implementa al menos los siguientes métodos y atributos.
 * a. nombre
 * b. apellido primero
 * c. apellido segundo
 * d. curso (sólo se admitirán los valores 1ESO, 2ESO, 3ESO, 4ESO, 1BACH, 2BACH, 1DAW, 2DAW)
 * e. setCurso()
 * f. incCurso(), que hará la promoción del alumno dentro de la etapa, que es:
 *  i. 1ESO ->2ESO->3ESO->4ESO
 *  ii. 1BACH ->2BACH,
 *  iii. 1DAW -> 2DAW
 * 
 *  
 *  4. Implementa la clase TestEstudiante() para probar la clase Estudiante: Mediante un menú se podrá crear un estudiante,
 *  borrarlo, mostrarlo y modificarlo. Tendrás al menos las clases:
 *   a. ies.Estudiante.java,
 *   b. testEstudiante.TestEstudiante.java,
 *   c. utiles.Menu.java. Deberás crear al menos un menú con las opciones “alta”, “baja”, “mostrar”, “modificar” y “salir”,
 *   	y otro con las opciones “promocionar” o “cambiar de etapa”  
 */

public class Estudiante {

	private String nombre;
	private String apellido_primero;
	private String apellido_segundo;
	private Cursos curso;
	
	Estudiante(String nombre, String apellido_primero, String apellido_segundo, Cursos curso) {
		setNombre(nombre);
		setApellido_primero(apellido_primero);
		setApellido_segundo(apellido_segundo);
		setCurso(curso);
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getApellido_primero() {
		return apellido_primero;
	}

	void setApellido_primero(String apellido_primero) {
		this.apellido_primero = apellido_primero;
	}

	String getApellido_segundo() {
		return apellido_segundo;
	}

	void setApellido_segundo(String apellido_segundo) {
		this.apellido_segundo = apellido_segundo;
	}

	public Cursos getCurso() {
		return curso;
	}

	void setCurso(Cursos curso){
		this.curso=curso;
	}
	
	void promocionarCurso(){
		switch (getCurso()){
		case PRIMEROESO:
			setCurso(Cursos.SEGUNDOESO);
			break;
		case SEGUNDOESO:
			setCurso(Cursos.TERCEROESO);
			break;
		case TERCEROESO:
			setCurso(Cursos.CUARTOESO);
			break;
		case PRIMEROBACHILLER:
			setCurso(Cursos.SEGUNDOBACHILLER);
			break;
		case PRIMERODAW:
			setCurso(Cursos.SEGUNDODAW);
			break;
		default:
			System.out.println("El alumno no puede promocionar directamente");
			break;
		}
	}
	
	void cambiarEtapa(){
		switch (getCurso()){
		case PRIMEROESO:
			System.out.println("Este estudiante no puede cambiar de etapa.");
			break;
		case SEGUNDOESO:
			System.out.println("Este estudiante no puede cambiar de etapa.");;
			break;
		case TERCEROESO:
			System.out.println("Este estudiante no puede cambiar de etapa.");;
			break;
		case CUARTOESO:	
			setCurso(Cursos.PRIMEROBACHILLER);
			break;
		case PRIMEROBACHILLER:
			System.out.println("Este estudiante no puede cambiar de etapa.");;
			break;
		case SEGUNDOBACHILLER:
			setCurso(Cursos.PRIMERODAW);
			break;
		default:
			System.out.println("El alumno no puede promocionar mas.");
			break;
		}
	}

	@Override
	public String toString() {
		return "El curso actual del alumno "+getNombre()+" "+getApellido_primero()+" "+getApellido_segundo()+" es: "+getCurso();
	}
}
//	Para evitar hacer el switch-case:
//
//		for(Cursos c1: curso.values()){
//			if(c1.ordinal()<curso.ordinal()){
//				setCurso(c1);
//			{
//		}

