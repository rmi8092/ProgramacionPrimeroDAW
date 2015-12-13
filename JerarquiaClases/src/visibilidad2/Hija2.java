package visibilidad2;

import visibilidad.Padre;

public class Hija2 extends Padre {
	//@Override NO Puede sobreescribirse porque es privado
	private void metodo1() {
		//super.metodo1(); //no puede reutilizarse porque es privado. OCULTO
		System.out.println("metodo1 de Hija2 NUEVO");
	}

	//@Override NO Puede sobreescribirse porque es protected
	void metodo2(){
		//super.metodo2(); //friendly. ERROR porque pertenece a otro paquete. OCULTO
		System.out.println("metodo2 de Hija2 NUEVO");
	}

	@Override//Puede sobreescribirse por herencia, no por pertenecer al mismo paquete
	protected void metodo3() {
		// TODO Auto-generated method stub
		super.metodo3();//accesible por herencia, no por el paquete
		System.out.println("metodo3 de Hija2 redefinido");
	}

	@Override
	public void metodo4() {
		// TODO Auto-generated method stub
		super.metodo4();
		System.out.println("metodo4 de Hija2 redefinido");
	}
	

}
