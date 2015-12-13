package metodos;

import utiles.Teclado;

/**
* Define la clase Tiempo que dada una medida de tiempo expresada en
* horas, minutos y segundos con valores arbitrarios, elabore un programa
* que transforme dicha medida en una expresión correcta. Por ejemplo, dada
* la medida 3h 118m 195s, se deberá obtener como resultado 5h 1m 15s.
*
* @author Rafa Miranda
* @version 1.0
*/

public class Tiempo{
	public static void main (String[]args){
		int seg, min, hor;

		seg=pedirCifra("Inserte los segundos: ");
		min=pedirCifra("Inserte los minutos: ");
		hor=pedirCifra("Inserte las horas: ");
		calcularTiempo(seg,min,hor);
	}

	static int pedirCifra(String mensaje){
		int cifra;
		System.out.println(mensaje);
		cifra=Teclado.leerEntero();
		return cifra;
	}

	static void calcularTiempo(int seg, int min, int hor){	
		
			while(seg>=60){
				seg-=60;
				min++;
			}
			while(min>=60){
				min-=60;
				hor++;
			}
		System.out.println("Su expresion de tiempo correcta es: "+hor+" horas,"+min+" minutos,"+seg+" segundos.");
	}
}
