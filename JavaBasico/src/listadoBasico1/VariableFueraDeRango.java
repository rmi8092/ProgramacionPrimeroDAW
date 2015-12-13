package listadoBasico1;
/**
* 9. Si se asigna un valor a una variable fuera de rango (mayor de lo establecido), ¿qué ocurre?
* Existe alguna manera de resolverlo? Demuéstralo mediante un ejemplo. (VariableFueraDeRango)
*
* @author Rafa Miranda
* @version 1.0
*/

public class VariableFueraDeRango{
	public static void main (String args[]){
		int Var1=100;
		byte Var2;

		Var2= (byte)(Var1 * 2);

		System.out.println("El byte: " + Var2);
		//Si asignasemos un valor fuera de rango arrojaria un mensaje de error. Haciendo el casting
		//convertimos una variable int a byte y daría un resultado sin sentido, pero evitariamos
		//el mensaje de error.
	}
}