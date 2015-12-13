package codigosPostales;

/**
 * Crea un programa en Java que reconozca los códigos postales. Para ello:
 * Valida el código postal mediante una expresión regular
 * 52001 (válido)
 * 14014 (válido)
 * 53001 (inválido)
 * 14000 (inválido)
 * Extrae mediante grupos de expresiones regulares la provincia (dos primeros dígitos)
 * Muestra la provincia en cuestión y a la comunidad autónoma a la que pertenece (ha de reconocer al menos 10 provincias) Utiliza enumeraciones con al menos dos atributos y un método.
 * Utiliza la página de correos.
 * 
 * @author rafael miranda ibañez
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

