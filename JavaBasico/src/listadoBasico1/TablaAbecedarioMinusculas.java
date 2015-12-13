package listadoBasico1;
/**
* Crea la clase TablaAbecedarioMinusculas que muestre la siguiente salida. Para ello 
utiliza el método System.out.print() con los caracteres \n y \t. Utiliza una variable char 
con el código Unicode para mostrar la letra ñ. (no uses \udddd)
*
* @author Rafa Miranda
* @version 1.0
*/

class TablaAbecedarioMinusculas{
	public static void main (String[] args){
		char enie=164,	utilde=163;
		System.out.print(
		"Esto es una tabla con el abecedario en min"+utilde+"sculas\n"+
		"\ta"+"\tb"+"\tc"+"\td\n"+
		"\te"+"\tf"+"\tg"+"\th\n"+
		"\ti"+"\tj"+"\tk"+"\tl\n"+
		"\tm"+"\tn"+"\t"+enie+"\to\n"+
		"\tp"+"\tq"+"\tr"+"\ts\n"+
		"\tt"+"\tu"+"\tv"+"\tw\n"+
		"\tx"+"\ty"+"\tz");
	}
}	