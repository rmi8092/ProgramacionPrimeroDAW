package metodos;

/**
* Define la clase Alumnos que obtenga aleatoriamente las notas de 30 alumnos.
* La nota será un número decimal comprendido entre 0 y 10, ambos inclusive.
* Utiliza métodos. Al finalizar el programa deberá mostrar:
* a. Total de notas
* b. Número de aprobados
* c. Número de suspensos
* d. Nota máxima
* e. Nota mínima
* f. Media
*
* @author Rafa Miranda
* @version 1.0
*/

public class Alumnos{
	public static void main (String[]args){
		float nota, max=-1, min=11, media=0;
		int a=0, s=0;
			for (int i=1;i<31;i++){
				nota=generarNota();
				a=numeroAprobados(nota,a);
				s=numeroSuspensos(nota,s);
				min=notaMinima(min,nota);
				max=notaMaxima(max,nota);
				media=media(nota,i,media);
				System.out.println("\nNota: "+nota+"\nAprobados: "+a+
					"\nSuspensos: "+s+"\nMaxima: "+max+
					"\nMinima: "+min+"\nMedia: "+media);
			}
	}
	
	/**
	* Genera una nota entre 0 y 10.
	* @return a Devuelve un valor aleatorio entre 0 y 10.
	*/
	static float generarNota(){
		return (float)Math.random()*10;
	}

	/**
	* Ofrece el numero de alumnos aprobados.
	* @param nota La nota generada aleatoriamente en otro metodo.
	* @param a numero de aprobados hasta el momento.
	* @return Devuelve el valor de aprobados en cada momento actualizado.
	*/
	static int numeroAprobados(float nota, int a){
		if (nota>=5)
			a++;
		return a;	
	}

	/**
	* Ofrece el numero de alumnos suspensos.
	* @param nota Nota generada aleatoriamente en otro metodo.
	* @param s Numero de suspensos hasta el momento.
	* @return Devuelve el valor de suspensos en cada momento actualizado.
	*/
	static int numeroSuspensos(float nota, int s){
		if (nota<5)
			s++;
		return s;	
	}

	/**
	* Ofrece la nota maxima.
	* @param max Nota maxima hasta el momento.
	* @param nota Nota generada aleatoriamente en otro metodo.
	* @return Devuelve la nota maxima hasta el momento actualizada.
	*/
	static float notaMaxima(float max, float nota){
		if (nota>max)
			return max=nota;
		else
			return max;
	}

	/**
	* Ofrece la nota minima.
	* @param min Nota minima hasta el momento.
	* @param nota Nota generada aleatoriamente en otro metodo.
	* @return Devuelve la nota minima hasta el momento actualizada.
	*/
	static float notaMinima(float min, float nota){
		if (nota<min)
			return min=nota;
		else
			return min;
	}

	/**
	* Ofrece la nota media.
	* @param nota Nota generada aleatoriamente en otro metodo.
	* @param i Numero de bucles del for en el main.
	* @param media Nota media hasta el momento.
	* @return Devuelve la nota media hasta el momento actualizada.
	*/
	static float media(float nota, int i, float media){
		if (i==1)
			return media=nota;
		else
			return media=(media+nota)/2; 
	}
}