package utiles;

import utiles.Teclado;

/*
 * Crea la clase Menu. M�telo en el paquete utiles. Implementa al menos los siguientes m�todos y atributos:
a. titulo
b. opciones
c. numOpciones
d. gestionar()
e. mostrar()
f. recogerOpcion()
 */

public class Menu {

	private String titulo;
	private int numOpciones;
	private String[] opciones;
	
	Menu(String titulo, int numOpciones, String[] opciones){
		setTitulo(titulo);
		setNumOpciones(numOpciones);
		setOpciones(opciones);
	}

	private String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private int getNumOpciones() {
		return numOpciones;
	}

	private void setNumOpciones(int numOpciones) {
		this.numOpciones = numOpciones;
	}

	private String[] getOpciones() {
		return opciones;
	}

	private void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}
	
	void mostrar(){
		System.out.println(getTitulo()+"\n");
		for(int i=0; i<getNumOpciones(); i++){
			System.out.println((i+1) +". "+getOpciones()[i]);
		}
	}
	
	int recogerOpcion(){
		int opcion;
		do{
			opcion=Teclado.leerEntero("\nIntroduzca su opci�n elegida del men�");
		}while(opcion<1||opcion>getNumOpciones());
		return opcion;
	}
	
	void gestionar(){
		mostrar();
		System.out.println("Su opcion elegida es: "+recogerOpcion());
	}
}
