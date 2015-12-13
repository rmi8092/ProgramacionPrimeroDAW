package Gato;

class Gato {// Clase o molde para crear objetos (lindos gatitos)

	// estado del objeto (campos o atributos)
	private int peso;
	private String nombre;
	private String raza;
	
	static final int pesoMinimo=2000;
	static final int pesoMaximo=10000;

	// Constructor del objeto. Se utilizan para crear un objeto. Inicializan el
	// estado del objeto
	Gato(int peso, String nombre, String raza) throws ExceptionPesoInvalido{
		setPeso(peso);
		this.nombre = nombre;
		this.raza = raza;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) throws ExceptionPesoInvalido{
		if ((peso < pesoMinimo) || (peso > pesoMaximo))
			throw new ExceptionPesoInvalido("El peso "+peso+" no es un peso "+
					"peso válido, debe estar entre "+pesoMinimo+" y "+pesoMaximo);
		this.peso = peso;
	}

	// Comportamiento del objeto (métodos o mensajes que se le envían al objeto)
	void comer() {
		this.peso++;
		System.out.println("Rico, rico...");
		
		/*
		if (pesoMaximo > this.getPeso()){
			this.peso++;
			System.out.println("Rico, rico...");
		else if ((pesoMaximo-1) == this.getPeso()){
			System.out.println("Cuidadorr, tu gato no deberia comer mucho mas");
			this.peso++;
			System.out.println("Rico, rico...");{
		}
		else if (Gato.pesoMaximo < this.getPeso()){
			System.out.println("Tu gato está muy gordo y no puede comer más");
		}
		*/
	}

	void jugar() {
		this.peso--;
		System.out.println("Qué diver...");
		
		/*
		if (pesoMinimo < this.getPeso()){
			this.peso--;
			System.out.println("Que diver...");
		else if ((pesoMinimo+1) == this.getPeso()){
			System.out.println("Cuidadorr, tu gato no deberia jugar mucho mas");
			this.peso--;
			System.out.println("Que diver...");{
		}
		else if (Gato.pesoMinimo > this.getPeso()){
			System.out.println("Tu gato está muy canijo y no puede juger más");
		}
		*/
	}

	void dormir() {
		System.out.println("Ronroneo. Zzz");
	}

	void mostrar() {
		System.out.println("Hola, soy " + nombre + " de raza " + raza
				+ ". Peso " + peso / 1000d + " kilos");

	}
}