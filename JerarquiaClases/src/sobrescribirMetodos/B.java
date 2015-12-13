package sobrescribirMetodos;

/**
 * <h1>Sobrescritura de m�todos de instancia (de objetos, no static).</h1>
 * Consiste en definir un m�todo en la clase hijo con la misma signatura y valor
 * devuelto que la clase padre
 * 
 * Para sobrescribir un m�todo se necesita:
 * <ol>
 * <li>Misma signatura (nombre, lista de argumentos (n�mero y tipo))</li>
 * <li>Mismo valor devuelto o subtipo del original (covariant return type)</li>
 * <li>Misma visibilidad o mayor</li>
 * </ol>
 * 
 * 
 * Notas sobre sobrescribir m�todos:
 * <ol>
 * <li>No puede sobrescribirse ni un m�todo final, static o private</li>
 * <li>Anotaci�n @Override: para indicarle al compilador que se est�
 * sobrescribiendo un m�todo</li>
 * <li>Puede utilizarse super.metodoSobrescrito() para utilizar la versi�n
 * sobrescrita</li>
 * <li>La ligadura din�mica permite en tiempo de ejecuci�n decidir qu�
 * implementaci�n se invoca</li>
 * </ol>
 * Para probar:
 * 
 * <ol>
 * <li>Cambia el tipo del valor devuelto en un m�todo sobrescrito
 * <li>Cambia el tipo de un argumento en un m�todo sobrescrito
 * <li>Cambia el n�mero de argumentos del m�todo sobrescrito
 * <li>Disminuye la visibilidad del m�todo sobrescrito
 * </ol>
 * 
 * @author lmagarin
 * 
 */
public class B extends A {
	Character character = 'b';

	public B(int entero, Float decimal, Character character) {
		super(entero, decimal);
		this.character = character;
	}

	@Override
	public String toString() {
		return "B [character=" + character + ", toString()=" + super.toString()
				+ "]";
	}
}
