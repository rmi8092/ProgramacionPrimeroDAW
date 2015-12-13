package listadoBasico1;
/**
* Crea la clase ConversionExplicitaExtensora y justifica los resultados.
*
* @author Rafa Miranda
* @version 1.0
*/

public class ConversionExplicitaExtensora {
	public static void main (String args[]) {
		byte b1=100, b2=100, b3;

		//conversión explícita. Al salirse la operación matemática del rango máximo establecido
		//en un byte arroja un valor incorrecto que no responde a ningun criterio, en nuestro caso 16.
		b3= (byte) (b1 * b2 * b1/100);
		System.out.println("Con conversion Expl"+"\u00ED"+"cita: "+b3);

		//conversión extensora. Al declarar la variable del tipo "int" esta puede ocupar 4 bytes
		//con lo que el resultado de la operación, 10000, entra dentro de rango.
		int n;
		n= b1 * b2 * b1/100;
		System.out.println("Con conversion Extensora: "+n);

	}
}