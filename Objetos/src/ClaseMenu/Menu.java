package ClaseMenu;

import utiles.Teclado;

public class Menu {

	private String titulo;
	private int numOpciones;
	private String[] opciones;

	public Menu(String titulo, String[] opciones){
		setTitulo(titulo);
		setOpciones(opciones);
		this.numOpciones=opciones.length;
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

	private String[] getOpciones() {
		return opciones;
	}

	private void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}
	
	private void mostrar(){
		System.out.println(getTitulo());
		for(int i=0; i<getNumOpciones(); i++)
			System.out.println("("+(i+1)+")- "+getOpciones()[i]);
	}
	
	private void mostrarOpcion(int opcion){
		System.out.println("("+opcion+")- "+getOpciones()[(opcion-1)]);
	}
	
	private int recogeOpcion(){
		return Teclado.leerEntero("Introduce la opcion deseada: ");
	}
	
	public int gestionar() throws OpcionInvalidaException{
		
		mostrar();
		int opcion=recogeOpcion();
		if(!opcionValida(opcion))
			throw new OpcionInvalidaException("La opcion introducida no existe. ");
		mostrarOpcion(opcion);
		return opcion;
	}
	
	private boolean opcionValida(int opcion){
		if(opcion<1||opcion>getNumOpciones())
			return false;
		return true;
	}
}