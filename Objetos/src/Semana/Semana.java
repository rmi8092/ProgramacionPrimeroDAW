package Semana;

public enum Semana{
	LUNES("Primer dia de la semana."),
	MARTES("Ni te cases ni te embarques."),
	MIERCOLES("Sin comentarios."),
	JUEVES("Siempre en medio."),
	VIERNES("�ltimo d�a de trabajo."),
	SABADO("Empieza el fin de semana."),
	DOMINGO("Ma�ana de nuevo a trabajar.");
	
	private String comentario;
	
	// Constructor acceso de paquete o private.
	Semana (String comentario){
		this.comentario = comentario;
	}
	
	public String getComentario ( ){
		return comentario;
	}	
}

/* PREGUNTAS TEORICAS:
   
   1. M�todos aplicables a una enumeraci�n y significado.
   		
   		A una enumeracion se le pueden aplicar los m�todos que incluye la API de Java entre los que est�n:
   		values(): devuelve un array con todos los valores de la enumeraci�n en el mismo orden en el que se declararon.
		ordinal(): devuelve la posici�n del elemento en su declaraci�n enum. Comienza por cero.
		name(): Devuelve una cadena con el nombre de la constante de enumeraci�n, tal y como se declar�.
		
		Aparte de estos m�todos incluidos en la API una enumeraci�n puede servirse de los m�todos que los programadores creemos
		en el c�digo, como por ejemplo en este caso el getter "getComentario()" con el que podremos recuperar la cadena o comentario
		que acompa�a a cada d�a de la semana en la declaraci�n de la enumeraci�n.
		
   2. Modificadores de visibilidad aplicables a una enumeraci�n.
   
   		Las enumeraciones nunca puede ser privadas o protegidas, siempre publicas o friendly.
   
   3. Comprueba si las afirmaciones son verdaderas o falsas:
   
		Una enumeraci�n puede declararse dentro de una clase. VERDADERO.
		Una enumeraci�n puede declararse dentro de un m�todo. FALSO.
		Una enumeraci�n puede declararse fuera de una clase, en una unidad de compilaci�n sola. VERDADERO.
		Cada uno de los elementos de la enumeraci�n (constantes) son instancias de la enumeraci�n. VERDADERO.
		El constructor de una enumeraci�n puede invocarse directamente en el c�digo. FALSO.
		El constructor de una enumeraci�n se invoca autom�ticamente cuando se inicializa la enumeraci�n. VERDADERO.*/