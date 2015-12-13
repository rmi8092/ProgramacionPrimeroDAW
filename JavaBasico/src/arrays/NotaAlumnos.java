/**
 * Crea la clase NotasAlumnos. Declara y crea un tipo de variable que sea capaz
 * de contener la nota que han obtenido 4 alumnos en los diferentes m�dulos en
 * los que est�n matriculados. Sabemos que el primer alumno est� matriculado en
 * 4 m�dulos; el segundo en 7, el tercero en 3 m�dulos y el cuarto en dos m�dulos.
 * Genera aleatoriamente las notas de los alumnos y mu�stralos. Utiliza m�todos de
 * la forma m�s eficiente y clara.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

public class NotaAlumnos {
	public static void main(String[]args){
		
		int[][]matriz = {{notaAleatoria(),notaAleatoria(),notaAleatoria(),notaAleatoria()},{notaAleatoria(),
			notaAleatoria(),notaAleatoria(),notaAleatoria(),notaAleatoria(),notaAleatoria(),notaAleatoria()},{notaAleatoria(),
				notaAleatoria(),notaAleatoria()},{notaAleatoria(),notaAleatoria()}};
		mostrarMatriz(matriz);
	}
	
	static int notaAleatoria(){
		int Nota=(int)Math.rint((Math.random()*(10-1))+0);
		return Nota;
	}
	
	static void mostrarMatriz(int[][]matriz){
		System.out.println("Las notas de los cuatro alumnos son:");
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=notaAleatoria();
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
