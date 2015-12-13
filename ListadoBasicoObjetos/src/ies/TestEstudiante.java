package ies;

import utiles.Menu;
import utiles.Teclado;

public class TestEstudiante {

	public static void main (String args[]) {
		
		Menu menuGestion = new Menu ("Gesti�n Estudiantes", 5, new String[]{"alta", "baja", "mostrar", "modificar", "salir"});
		Menu menuDinamica = new Menu ("Din�mica Estudiantes", 3, new String[]{"promocionar", "cambiar de etapa", "salir"});
		Menu menuCurso = new Menu ("Cat�logo cursos", 8, new String[]{"1� ESO", "2� ESO", "3� ESO", "4� ESO", "1� BACH", "2� BACH", 
				"1� DAW", "2� DAW"});
		
		Estudiante estudiante = null;
		
		int opcion;
		do{
			opcion = menuGestion.gestionar();
			switch (opcion){
			case 1:
				altaEstudiante(estudiante, menuCurso);
				break;
			case 2:
				bajaEstudiante(estudiante);	
				break;
			case 3:
				System.out.println(estudiante.toString());
				break;
			case 4:
				dinamicaEstudiante(estudiante, menuDinamica);
			case 5:
				return;		
			}
		}while(opcion!=5);
	}
	
	public static void altaEstudiante(Estudiante estudiante, Menu menuCurso){
		estudiante = new Estudiante(Teclado.leerCadena("Introduce el nombre del estudiante"),
				Teclado.leerCadena("Introduce su primer apellido"),Teclado.leerCadena("Introduce su segundo apellido"),
				elegirCurso(menuCurso));
		System.out.println(estudiante.getCurso());
	}
	
	private static Cursos elegirCurso(Menu menuCurso){
		Cursos opcioncurso = null;
		switch (menuCurso.gestionar()){
		case 1:
			opcioncurso = Cursos.PRIMEROESO;
			break;
		case 2:
			opcioncurso = Cursos.SEGUNDOESO;
			break;
		case 3:
			opcioncurso = Cursos.TERCEROESO;
			break;
		case 4:
			opcioncurso = Cursos.CUARTOESO;
			break;
		case 5:
			opcioncurso = Cursos.PRIMEROBACHILLER;
			break;
		case 6:
			opcioncurso = Cursos.SEGUNDOBACHILLER;
			break;
		case 7:
			opcioncurso = Cursos.PRIMERODAW;
			break;
		default:
			opcioncurso = Cursos.SEGUNDODAW;
		}
		return opcioncurso;
	}
	
	private static void bajaEstudiante(Estudiante estudiante) {
		estudiante = null;
	}
	
	private static void dinamicaEstudiante(Estudiante estudiante, Menu menuDinamica){
		switch (menuDinamica.gestionar()){
		case 1:
			estudiante.promocionarCurso();
			System.out.println(estudiante.toString());
			break;
		case 2:
			estudiante.cambiarEtapa();
			System.out.println(estudiante.toString());
			break;
		case 3:
			System.out.println("Adios");
			return;
		}
	}
}