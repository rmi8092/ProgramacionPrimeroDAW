package Gato;

/**
 * Clase que prueba el comportamiento de un sencillo gato
 * 
 * @author Rafa Miranda
 * @version 1.0
 */
public class TestGato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			//Gato miGato = new Gato(9999, "Gardfield", "Persa");
			Gato miGato2 = new Gato(3000, "Gardfield", "Persa");
			System.out.println(miGato2);
	
			int contador = 10;
			do {
				miGato2.comer();
				--contador;
			} while (contador > 0);
			
			System.out.println(miGato2);
			miGato2.jugar();
			System.out.println(miGato2);
			miGato2.dormir();
			System.out.println(miGato2);
			// miGato.mostrar();
		} catch (ExceptionPesoInvalido e) {
			System.out.println(e.getMessage());
		}
	}
}

/*if (Gato.pesoMaximo > miGato.getPeso()){
miGato.comer();
}
else if ((Gato.pesoMaximo-1) == miGato.getPeso()) {
System.out.println("Cuidadorr, tu gato no deberia comer mucho mas");
miGato.comer();
}
else if (Gato.pesoMaximo < miGato.getPeso()){
System.out.println("Tu gato está muy gordo y no puede comer más");
}

if (Gato.pesoMinimo < miGato2.getPeso()){
miGato2.jugar();
}
else if ((Gato.pesoMinimo+1) == miGato2.getPeso()){
System.out.println("Cuidadorr, tu gato no deberia jugar mucho mas");
miGato2.jugar();
}
else if (Gato.pesoMinimo > miGato2.getPeso()){
System.out.println("Tu gato está muy canijo y no puede jugar más");
}

miGato.mostrar();*/
