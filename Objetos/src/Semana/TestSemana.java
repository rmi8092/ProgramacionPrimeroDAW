package Semana;

public class TestSemana {
	public static void main (String []args){
	
		for (Semana dia: Semana.values()){
			System.out.println(dia.name());
			System.out.println(dia.ordinal());
			System.out.println(dia.getComentario());
			System.out.println("\n");
		}
		
		System.out.println("El peor día de la semana sin duda es el " + Semana.LUNES + " para la mayoria de las personas");
		System.out.println("Sin embargo, el " + Semana.VIERNES + " (empieza el fin de semana) la gente suele estar de mejor humor.");
		System.out.println("De hecho, las frases mas escuchadas para los lunes y para los viernes son: '" + Semana.LUNES.getComentario() +
				"' y: '" + Semana.VIERNES.getComentario() + "'");
	}
}
