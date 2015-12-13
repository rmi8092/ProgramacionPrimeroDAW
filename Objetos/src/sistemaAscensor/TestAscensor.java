package sistemaAscensor;

import utiles.Teclado;

public class TestAscensor {

	public static void main(String []args){
	
	Ascensor a1 = new Ascensor();
	
	System.out.print("Cuantas plantas tiene su edificio?");
	try {
		a1.setPlantasTotales(Teclado.leerEntero());
	} catch (plantasTotalesException e) {
		System.out.println(e.getMessage());
		return;
	}
	System.out.print("En que planta te encuentras?");
	try {
		a1.setPlantaUsuario(Teclado.leerEntero());
	} catch (plantaUsuarioException e) {
		System.out.println(e.getMessage());
		return;
	}
	
	do{
		System.out.print("Elija un destino por favor.");
		try {
			a1.setPlantaDestino(Teclado.leerEntero());
		} catch (plantaDestinoException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.println(a1.abrirPuerta());
		System.out.println(a1.cerrarPuerta());
		while(a1.getPlantaDestino()!= a1.getPlanta()){
			a1.ascensorMover();
			System.out.println(a1.toString());
		}
	
	}while(Salir());
}
	
	static boolean Salir(){
		String respuesta;
		
		respuesta = Teclado.leerCadena("Quieres dejar el ascensor ya? s/n").toLowerCase();
		if(respuesta.charAt(0) != 'n')
			return false;
		else
			return true;
	}
}
