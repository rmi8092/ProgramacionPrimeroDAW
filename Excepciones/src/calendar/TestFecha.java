package calendar;

/**
 * Este programa TestFecha maneja objetos de la clase Calendar. Almac�nalo en el paquete "calendar". Mostrar� un men� con las siguientes opciones:
 * Comprobar a�os transcurridos
 * Es futuro?
 * Es pasado?
 * Salir
 * S�lo se admiten fechas v�lidas. En caso de no serlas, se lanzar�a una excepci�n FechaNoValida que se capturar�a y mostrar�a el error.
 * Comprobar a�os transcurridos solicita dos fechas por teclado e indica cu�ntos a�os han transcurrido entre ellas.
 * Se indica tambi�n si el tiempo ha pasado hacia delante o hacia atr�s.
 * Es futuro? indica si la fecha introducida por teclado es futuro o no.
 * Es pasado? indica si la fecha introducida por teclado es pasado o no.
 * 
 * @author rafael miranda iba�ez
 * @version 1.0
 */

import indulgencia.TestIndulgencia2;

import java.util.Calendar;

import utiles.Menu;
import utiles.Teclado;

public class TestFecha {
	public static void main(String[] args) {

		Menu menu = new Menu("Menu Test Fechas", new String[] {
				"Comprobar a�os transcurridos", "Es futuro?", "Es pasado?",
				"Salir" });

		int opcion;
		do {
			opcion = menu.gestionar();
			lanzarMenu(opcion);
		} while (opcion != 4);
	}

	private static void lanzarMenu(int opcion) {
		switch (opcion) {
		case 1:
			a�osTranscurridos();
			break;
		case 2:
			esFuturoPasado();
			break;
		case 3:
			esFuturoPasado();
			break;
		case 4:
			return;
		}
	}

	private static void a�osTranscurridos() {

		Calendar fecha1 = Calendar.getInstance();
		Calendar fecha2 = Calendar.getInstance();

		int dia1 = Teclado.leerEntero("Cual es el dia de la primera fecha?");
		int mes1 = Teclado.leerEntero("Cual es el mes de la primera fecha?");
		int anno1 = Teclado.leerEntero("Cual es el a�o de la primera fecha?");
		int dia2 = Teclado.leerEntero("Cual es el dia de la segunda fecha?");
		int mes2 = Teclado.leerEntero("Cual es el mes de la segunda fecha?");
		int anno2 = Teclado.leerEntero("Cual es el a�o de la segunda fecha?");

		fecha1.set(anno1, mes1, dia1);
		try {
			comprobarFecha(fecha1, dia1, mes1, anno1);
		} catch (FechaNoValida e) {
			System.out.println(e.getMessage());
		}

		fecha2.set(anno2, mes2, dia2);
		try {
			comprobarFecha(fecha2, dia2, mes2, anno2);
		} catch (FechaNoValida e) {
			System.out.println(e.getMessage());
		}

		long milis1 = fecha1.getTimeInMillis();
		long milis2 = fecha2.getTimeInMillis();
		// diferencia en milisengundos
		long diff = milis2 - milis1;
		// diferencia en a�os
		long diffYears = ((diff / (24 * 60 * 60 * 1000)) / 365);

		String avance;
		if (diff > 0)
			avance = "adelante";
		else
			avance = "atras";

		System.out.println("La diferencia en a�os entre ambas fechas es: "
				+ diffYears + " y el tiempo ha pasado hacia " + avance);
	}

	private static void esFuturoPasado() {
		Calendar fecha = Calendar.getInstance();
		Calendar actual = Calendar.getInstance();

		int dia = Teclado
				.leerEntero("Cual es el dia de la fecha a comparar con la actual?");
		int mes = Teclado
				.leerEntero("Cual es el mes de la fecha a comparar con la actual?");
		int anno = Teclado
				.leerEntero("Cual es el a�o de la fecha a comparar con la actual?");

		fecha.set(anno, mes, dia);
		try {
			comprobarFecha(fecha, dia, mes, anno);
		} catch (FechaNoValida e) {
			System.out.println(e.getMessage());
			return;
		}

		long milis1 = fecha.getTimeInMillis();
		long milis2 = actual.getTimeInMillis();
		long diff = milis2 - milis1;

		if (diff < 0)
			System.out.println("La fecha comparada con la actual es futura");
		else
			System.out.println("La fecha comparada con la actual es pasada");
	}
	
/**
 * Indica si la fecha es v�lida
 * @param fecha
 * @param dia
 * @param mes
 * @param anno
 * @throws FechaNoValida Cuando la fecha no es v�lida
 */
	private static void comprobarFecha(Calendar fecha, int dia, int mes, int anno) throws FechaNoValida {
	
		try {
			fecha.setLenient(false);
			fecha.set(anno, (mes - 1), dia);
			fecha.getTime();
		} catch (IllegalArgumentException e) {
			throw new FechaNoValida("La fecha introducida no es valida");
		}
	}
}
