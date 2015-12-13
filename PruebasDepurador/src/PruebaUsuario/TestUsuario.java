package PruebaUsuario;

import utiles.Teclado;

public class TestUsuario {

	public static void main (String []args) {
		
		Usuario[] usuario = new Usuario[3];
		int dni;
		
		for(int i=0; i<3; i++)
			usuario[i]=new Usuario();
		
		usuario[0].setDni(123);
		usuario[0].setNombre("Nombre1");
		usuario[0].setApellidos("Apellido1");
		usuario[0].setDireccion("Mikasa1");
		
		usuario[1].setDni(456);
		usuario[1].setNombre("Nombre4");
		usuario[1].setApellidos("Apellido4");
		usuario[1].setDireccion("Mikasa4");
		
		usuario[2].setDni(789);
		usuario[2].setNombre("Nombre7");
		usuario[2].setApellidos("Apellido7");
		usuario[2].setDireccion("Mikasa7");		
		
		do{
			dni = Teclado.leerEntero("Introduzca el DNI del usuario y le dare el resto de datos");
			for(int i=0; i<3; i++){
				if (dni == usuario[i].getDni())
					System.out.println("El usuario introducido es: "+usuario[i].toString());
			}
		}while(deseaContinuar());
	}
		private static boolean deseaContinuar() {
			char resp;
			System.out.println("Desea continuar? s/n");
			resp = Teclado.leerCaracter();
			if(resp == 's')
				return true;
			else
				return false;
	}
}
