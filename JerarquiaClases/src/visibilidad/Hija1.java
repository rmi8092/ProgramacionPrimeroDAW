package visibilidad;

/**
 * Intenta redefinir todos los métodos del padre. Utiliza el diálogo
 * "Source-Override/Implement Methodos...".
 * 
 * @author mlmc
 * 
 */
public class Hija1 extends Padre {
	//@Override //NO puede sobreescribrirse
	void metodo1(){
		//super.metodo1(); oculto al ser privado
		System.out.println("metodo1 de Hija1 NUEVO");
	}
	
	@Override
	void metodo2() {// friendly. Puede sobreescribrirse
		// TODO Auto-generated method stub
		super.metodo2();// Tengo acceso al padre
		System.out.println("metodo2 de Hija1 redefinido");
	}

	@Override
	protected void metodo3() {// protected. Puede sobreescribrirse porque es su
								// hija y está dentro del mismo paquete
		// TODO Auto-generated method stub
		super.metodo3();//accesible por herencia, y por el paquete
		System.out.println("metodo3 de Hija1 redefinido");
	}

	@Override
	public void metodo4() {// public. Puede sobreescribrirse
		// TODO Auto-generated method stub
		super.metodo4();
		System.out.println("metodo4 de Hija1 redefinido");
	}
}
