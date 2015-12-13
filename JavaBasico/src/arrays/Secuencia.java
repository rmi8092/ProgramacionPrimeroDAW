/**
 * Define la clase Secuencia que busque la secuencia en orden creciente (<=) m�s
 * larga dentro de un vector de enteros inicializado aleatoriamente (Math.random()).
 * Se mostrar� tanto la posici�n de la primera componente de la secuencia como
 * el tama�o de la misma.
 * 
 * @author Rafa Miranda
 * @version 1.0
 */

package arrays;

public class Secuencia {
	public static void main(String[] args) {
        int[] vector=new int[20];
        rellenarVector(vector);
        mostrarVector(vector);
        encontrarSecuencia(vector);
   }
   private static void mostrarVector (int [] vector){
       for (int i=0;i<vector.length;i++)
       System.out.println("vector["+i+"] = "+vector[i]);
   }
   private static void encontrarSecuencia(int[] vector) {
        int secMax=0;
        int secIni=0;
        int secuencia=1;
        int inicio=0;
        for (int i = 0; i < (vector.length-1); i++) {
            if (vector[i]<=vector[(i+1)]) {
                secuencia++;
                if(secuencia==2)
                inicio=i;
            }
            else{
                if(secuencia>secMax){
                    secMax=secuencia;
                    secIni=inicio;
            }
            secuencia=1;
            } 
        }
        System.out.println("\nSecuencia m�s larga: "+secMax);
        System.out.println("Posici�n inicio: "+secIni);
        System.out.println("Posici�n final: "+(secIni+secMax-1));
   }
   private static void rellenarVector(int [] vector) {
       for (int i=0;i<vector.length;i++)
           vector[i]=(int) Math.rint(Math.random()*10);
   }
}
