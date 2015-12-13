package ClaseMenu;

import utiles.Teclado;
import DiseñandoUnaMatriz.Matriz;
import DiseñandoUnaMatriz.TamanoException;

public class TestMenu {
	
	public static void main(String [] args){
		Menu menu2= new Menu("Matrices",new String[] {"Matriz de ceros","Matrices de num aleatorios","Trasponer", "Sumar", "Restar","Multiplicar","Salir"});
		Matriz m1=new Matriz(numeroDeFilas(),numeroDeColumnas());
		Matriz m2=new Matriz(numeroDeFilas(),numeroDeColumnas(),seleccionarMax(),seleccionarMin());
		Matriz m3=new Matriz(numeroDeFilas(),numeroDeColumnas(),seleccionarMax(),seleccionarMin());
		int opcion=6;
		
		do{
			try {
				opcion=menu2.gestionar();
			} catch (OpcionInvalidaException e) {
				e.printStackTrace();
			}
			switch(opcion-1){
			case 0:{
				opcion1(m1);
				break;
			}
			case 1:{
				System.out.println("Matriz 1: ");
				opcion2(m2);
				System.out.println("Matriz 2: ");
				opcion2(m3);
				break;
			}
			case 2:{
				opcion3(m2);
				break;
			}
			case 3:{
				try {
					opcion4(m2,m3);
				} catch (TamanoException e) {
					e.printStackTrace();
				}
				break;
			}
			case 4:{
				try {
					opcion5(m2,m3);
				} catch (TamanoException e) {
					e.printStackTrace();
				}
				break;
			}
			case 5:{
				try {
					opcion6(m2,m3);
				} catch (TamanoException e) {
					e.printStackTrace();
				}
				break;
			}
			case 6: break;
			
			}
		}while(opcion!=7);
		
	}
	public static void opcion1(Matriz m){
		System.out.println("Matriz de ceros"+m.toString());
	}
	
	public static void opcion2(Matriz m){
		System.out.println(m.toString());
	}
	public static void opcion3(Matriz m){
		System.out.println("Matriz 1 de aleatorios traspuesta\n"+m.trasponer().toString());
	}
	public static void opcion4(Matriz m2, Matriz m3) throws TamanoException{
		System.out.println("Matriz 1 + Matriz 2\n"+m2.suma(m3).toString());
	}
	public static void opcion5(Matriz m2, Matriz m3) throws TamanoException{
		System.out.println("Matriz 1 - Matriz 2\n"+m2.resta(m3).toString());
	}
	public static void opcion6(Matriz m2, Matriz m3) throws TamanoException{
		System.out.println("Matriz 1 * Matriz 2\n"+m2.multiplicacion(m3).toString());
	}

	public static int seleccionarMax(){
		return Teclado.leerEntero("Introduce el valor maximo");
	}
	public static int seleccionarMin(){
		return Teclado.leerEntero("Introduce el valor minimo");
	}
	public static int numeroDeColumnas(){
		return Teclado.leerEntero("Introduce las columnas de la matriz");
	}
	public static int numeroDeFilas(){
		return Teclado.leerEntero("Introduce las filas de la matriz");
	}
}
