/**
 * Crea la clase AlumnosMatriculados. Queremos guardar en la memoria del
 * ordenador el número de alumnos matriculados en cada grupo del ciclo de
 * "Desarrollo de Aplicaciones Web" (por módulos). Existen dos grupos y
 * se imparten seis módulos distintos en cada grupo. Utiliza métodos en la
 * medida de lo posible. Sabemos que:
 * a. En el primer grupo hay:
 *   i. 30 alumnos matriculados en Sistemas informáticos.
 *   ii. 27 alumnos matriculados en Bases de datos.
 *   iii. 25 alumnos matriculados en Programación
 *   iv. 21 alumnos matriculados en Lenguaje de marcas
 *   v. 19 alumnos matriculados en Entornos de desarrollo
 *   vi. 16 alumnos matriculados en FOL
 * b. En el segundo grupo hay:
 *   i. 15 alumnos matriculados en Desarrollo Web en entorno cliente
 *   ii. 14 alumnos matriculados en Desarrollo Web en entorno servidor
 *   iii. 15 alumnos matriculados en Despliegue de aplicaciones Web
 *   iv. 15 alumnos matriculados en Diseño de interfaces Web
 *   
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

import utiles.Teclado;

public class AlumnosMatriculados {
	public static void main (String[]args){
		int[]grupo1 = new int [6];
		int[]grupo2 = new int [4];
		String[]asignatura1 = {"en Sistemas informaticos","en Base de datos","en Programacion",
				"en Lenguaje de marcas","en Entornos Desarrollo","en FOL"};
		String[]asignatura2 = {"en Desarrollo web entorno cliente","en Desarrollo web entorno servidor",
				"en Despliegue aplicaciones web","en Diseño interfaces web"};
		cargarAlumnos(grupo1,asignatura1);
		mostrarVector(grupo1);
		cargarAlumnos(grupo2,asignatura2);
		mostrarVector(grupo2);
	}
	
	static void cargarAlumnos(int[]grupo,String[]asignatura){
		System.out.println("Cuantos alumnos hay matriculados?");
		for (int i = 0; i < grupo.length; i++) {
			System.out.println(asignatura[i]);
			grupo[i]=Teclado.leerEntero();
		}
	}
	
	static void mostrarVector(int[]grupo){
		System.out.println("Los alumnos son:");
		for (int i = 0; i < grupo.length; i++){
			System.out.print(grupo[i]+"\t");
		}
		System.out.println("\n");

	}
}
