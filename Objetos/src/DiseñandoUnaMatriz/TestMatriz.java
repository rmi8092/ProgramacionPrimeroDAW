package DiseñandoUnaMatriz;

public class TestMatriz {
	public static void main(String [] args){
		Matriz m1= new Matriz(2,2);
		Matriz m2= new Matriz(3,2,100,0);
		Matriz m3= new Matriz(3,2,100,0);
		Matriz m4= new Matriz(3,3);
		
		System.out.println("Matriz de ceros"+m1.toString()+"\n\nMatriz aleatoria1"+m2.toString()+"\n\nMatriz aleatoria2"+m3.toString());
		m4=m2.suma(m3);
		System.out.println("Matriz 1 + Matriz 2\n"+m4.toString());
		m4=m2.resta(m3);
		System.out.println("Matriz 1 - Matriz 2\n"+m4.toString());
	
		System.out.println("Matriz 1 traspuesta\n"+m2.trasponer().toString());
		m4=m2.multiplicacion(m3);
		System.out.println("Matriz 1 * Matriz 2\n"+m4.toString());
	}

}
