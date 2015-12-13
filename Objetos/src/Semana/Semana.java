package Semana;

public enum Semana{
	LUNES("Primer dia de la semana."),
	MARTES("Ni te cases ni te embarques."),
	MIERCOLES("Sin comentarios."),
	JUEVES("Siempre en medio."),
	VIERNES("Último día de trabajo."),
	SABADO("Empieza el fin de semana."),
	DOMINGO("Mañana de nuevo a trabajar.");
	
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
   
   1. Métodos aplicables a una enumeración y significado.
   		
   		A una enumeracion se le pueden aplicar los métodos que incluye la API de Java entre los que están:
   		values(): devuelve un array con todos los valores de la enumeración en el mismo orden en el que se declararon.
		ordinal(): devuelve la posición del elemento en su declaración enum. Comienza por cero.
		name(): Devuelve una cadena con el nombre de la constante de enumeración, tal y como se declaró.
		
		Aparte de estos métodos incluidos en la API una enumeración puede servirse de los métodos que los programadores creemos
		en el código, como por ejemplo en este caso el getter "getComentario()" con el que podremos recuperar la cadena o comentario
		que acompaña a cada día de la semana en la declaración de la enumeración.
		
   2. Modificadores de visibilidad aplicables a una enumeración.
   
   		Las enumeraciones nunca puede ser privadas o protegidas, siempre publicas o friendly.
   
   3. Comprueba si las afirmaciones son verdaderas o falsas:
   
		Una enumeración puede declararse dentro de una clase. VERDADERO.
		Una enumeración puede declararse dentro de un método. FALSO.
		Una enumeración puede declararse fuera de una clase, en una unidad de compilación sola. VERDADERO.
		Cada uno de los elementos de la enumeración (constantes) son instancias de la enumeración. VERDADERO.
		El constructor de una enumeración puede invocarse directamente en el código. FALSO.
		El constructor de una enumeración se invoca automáticamente cuando se inicializa la enumeración. VERDADERO.*/