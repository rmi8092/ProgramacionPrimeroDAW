package indulgencia;

import java.util.Calendar;

import utiles.Teclado;

/**
 * Quita el comentario en la línea "ahora.setLenient(false);" y vuelve a ejecutarlo. 
 * ¿Qué hace la línea ahora.setLenient(false);
 * ¿Le encuentras alguna utilidad?
 * Modifica el código y diseña un método que puedas reutilizar para futuros programas con fechas. Entrégalo como TestIndulgencia2
 * 
 * @author rafael miranda ibañez
 * @version 1.0
 */

public class TestIndulgencia2 {

	public static void main(String[] args) {

		Calendar ahora = Calendar.getInstance();
		System.out.println(ahora.getClass());
		
		int dia = Teclado.leerEntero("Introduzca el dia:");
		int mes = Teclado.leerEntero("Introduzca el mes:");
		int anno = Teclado.leerEntero("Introduzca el año:");
		
		comprobarFecha(ahora,dia,mes,anno);
	}
	
	public static void comprobarFecha(Calendar ahora, int dia, int mes, int anno){
		try{
			ahora.setLenient(false);
			ahora.set(anno,(mes-1),dia);
			System.out.println(ahora.getTime());
		} catch (IllegalArgumentException e){
			System.err.println("Fecha incorrecta");
		}
	}
}

