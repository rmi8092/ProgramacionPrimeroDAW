package listadoBasico1;
/**
* Crea la siguiente clase y justifica por qué el sufijo float (f ó F) es necesario.
*
* @author Rafa Miranda
* @version 1.0
*/

public class PotenciaConversion {
	public static void main (String args[]) {
		//Si no incluimos el sufijo f o F el compilador entiende que se trata de una variable
		//tipo double. Es por tanto necesario afinar en esa asignación.
		float f=1e-39f;
		double d=1e-39;

		System.out.println("float: "+f);
		System.out.println("double: "+d);
	}
}