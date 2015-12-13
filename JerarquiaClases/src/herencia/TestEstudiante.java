package herencia;

/**
 * Diseña, implementa y prueba las clases Persona, Estudiante y TestEstudiante. Para ello, supongamos que:
 * a. Una persona tiene nombre, apellidos y nif.
 * b. Un estudiante está cursando un curso dentro de un nivel (PRIMARIA, ESO, BACHILLERARO, UNIVERSIDAD)
 * c. Implementa los métodos getters, setters y toString
 * d. En la clase TestEstudiante:
 *    i. Cree dos personas
 *    ii. Cree dos estudiantes
 *    iii. Muestre los cuatro objetos
 *    iv. Asigne un estudiante a una referencia de persona. ¿Qué métodos pueden usarse?
 *    v. Asigne una persona a un estudiante. ¿Qué métodos pueden usarse?
 * 
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */

public class TestEstudiante {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan","Garcia","43872038A");
		Persona persona2 = new Persona("Antonio","Hernandez","92635202B");

		Estudiante estudiante1 = new Estudiante("Alberto","Ramirez","52652581X", Nivel.PRIMARIA);
		Estudiante estudiante2 = new Estudiante("Rafael", "Miranda","24985232G", Nivel.UNIVERSIDAD);
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(estudiante1.toString()); //SOLO ME MUESTRA EN CONSOLA EL NIVEL, NO LOS DATOS PERSONALES. ¿POR QUE?
		System.out.println(estudiante2.toString()); //SOLO ME MUESTRA EN CONSOLA EL NIVEL, NO LOS DATOS PERSONALES. ¿POR QUE?
		
		persona1 = estudiante1;
		persona1.setNif("XXXXXXXXXX"); //SE PUEDEN SEGUIR USANDO LOS MISMOS METODOS QUE ERAN COMUNES, PERTENECIAN A LA CLASE PADRE.
									   //SIN EMBARGO YA NO SE PUEDE USAR EL METODO SETNIVEL QUE ERA PROPIO DE LA CLASE ESTUDIANTE.
		
		estudiante2 = (Estudiante) persona2; //NO PUEDE ASIGNARSE UN OBJETO PERSONA A UNO ESTUDIANTE PORQUE LA HERENCIA SE DA EN SENTIDO CONTRARIO.
		estudiante2.setNivel(Nivel.ESO);	//AÑADIENDOLE UN CASTING YA NO DA ERROR.	
	}
}
