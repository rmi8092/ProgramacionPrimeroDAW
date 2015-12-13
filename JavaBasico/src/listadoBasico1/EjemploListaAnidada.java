package listadoBasico1;
/**
* Crea la clase EjemplolistaAnidada que muestre la siguiente salida.
* Para ello utiliza el método System.out.print() con los carácteres \n \t
*
* @author Rafa Miranda
* @version 1.0
*/

class EjemploListaAnidada{
	public static void main(String[] args){
		System.out.println(
			"\t<ul>\n"+
			"\t\t<li>\n"+
			"\t\t<li>\n"+
			"\t\t<li>\n"+
			"\t\t\t<ul>\n"+
			"\t\t\t\t<li>\n"+
			"\t\t\t\t<li>\n"+
			"\t\t\t\t<li>\n"+
			"\t\t\t<\\ul>\n"+
			"\t<\\ul>");
	}
}
