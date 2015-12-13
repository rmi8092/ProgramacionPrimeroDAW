package listadoBasico1;
/**
* Crea la clase CaracteresEspagnoles que muestre la siguiente salida. Para ello utiliza el 
* método System.out.print() con los caracteres \n y \t. Utiliza el formato de carácter 
* \udddd
*
* @author Rafa Miranda
* @version
*/

class CaracteresEspagnoles{
	public static void main (String[] args){
		System.out.print(
		"Estos caracteres son muy nuestros:\n"+
		"\u00e1"+"\t\u00eD"+"\t\u00f3"+"\t\u00fa"+
		"\t\u00f1"+"\t\u00d1"+"\t\u00aa"+"\t\u00ba");
	}
}