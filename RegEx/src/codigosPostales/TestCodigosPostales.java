package codigosPostales;

/**
 * Crea un programa en Java que reconozca los c�digos postales. Para ello:
 * Valida el c�digo postal mediante una expresi�n regular
 * 52001 (v�lido)
 * 14014 (v�lido)
 * 53001 (inv�lido)
 * 14000 (inv�lido)
 * Extrae mediante grupos de expresiones regulares la provincia (dos primeros d�gitos)
 * Muestra la provincia en cuesti�n y a la comunidad aut�noma a la que pertenece (ha de reconocer al menos 10 provincias) Utiliza enumeraciones con al menos dos atributos y un m�todo.
 * Utiliza la p�gina de correos.
 * 
 * @author rafael miranda iba�ez
 * @version 1.0
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utiles.Teclado;

public class TestCodigosPostales {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("^(0[1-9]|[1-4][0-9]|5[0-2])(([0-9]{2}[1-9]|[0-9][1-9][0-9]|[1-9][0-9]{2}))$");
				
		do {
			Matcher matcher = pattern.matcher(Teclado
					.leerCadena("Introduce tu codigo postal: "));
			if (matcher.matches()) {
				Provincias.esProvincia(matcher.group(1));
			} else
				System.out.println("No hay coincidencia");
		} while (true);
	}	
}

