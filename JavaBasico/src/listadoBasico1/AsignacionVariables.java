package listadoBasico1;
/**
* Crea una clase AsignacionVariables con el siguiente código. Corrígela si es necesario
* y coméntala en el mismo código fuente, indicando errores y valores de variables.
*
* @author Rafa Miranda
* @version 1.0
*/

public class AsignacionVariables {
	public static void main (String args[]){
		{
			// Mediante "int i;" se ha declarado la variable pero no se ha asignado.
			int i=200;
			byte b=(byte)i;
			// Al no habérsele asignado a la variable i ningún valor, no hay operación posible.
			System.out.println(i);
			System.out.println(b);
		}
	}
}