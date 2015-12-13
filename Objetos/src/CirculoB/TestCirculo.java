package CirculoB;

import utiles.Teclado;

public class TestCirculo {

	public static void main (String []args) {
		int c;
		do{
			c = Teclado.leerEntero("Cuantos circulos quiere almacenar?");
		}while(c<=0);
		
		Circulo[]arrayCirc = new Circulo[c];
		
		try {
			for(int i=0; i<c; i++){		
				System.out.println("Circulo numero " + (i + 1) + ". ");
				arrayCirc[i] = new Circulo(new Punto(
						Teclado.leerEntero("Introduce coordenada X"),
						Teclado.leerEntero("Introduce coordenada Y")),
						Teclado.leerEntero("Introduce el radio"));
			}
			
			for(int i=0; i<c; i++){
				System.out.println("El circulo es: "+arrayCirc[i].toString());
			}
		} catch (RadioException e) {
			System.out.println(e.getMessage());
		}
	}
}
