package arrays;

public class SumaMatriz {
	public static void main (String[]args){
		int[][]matriz1 = new int[4][4];
		int[][]matriz2 = new int[4][4];
		int[][]suma = new int[4][4];
		
		System.out.println("Sus matrices aleatorias son:");
		generarAleatoria(matriz1);
		mostrarMatriz(matriz1);
		System.out.println("\nY:");
		generarAleatoria(matriz2);
		mostrarMatriz(matriz2);
		System.out.println("\nSu matriz suma es:");
		sumarMatrices(matriz1,matriz2,suma);
		mostrarMatriz(suma);
		
	}
	static void generarAleatoria(int[][]matriz){
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random()*11);
			}
		}
	}
	
	static void sumarMatrices(int[][]matriz1, int[][]matriz2, int[][]suma){
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				suma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
	}
	
	static void mostrarMatriz(int[][]suma){
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[i].length; j++) {
				System.out.print(suma[i][j]+"\t");	
			}
		System.out.print("\n");
		}
	}
}
