package usuario;

import utiles.Teclado;

public class TestUsuario {
	public static void main(String[] args){
		
		Usuario[] usuarios= new Usuario[3];
		int dni;
		
		for(int i=0; i<3; i++)
			usuarios[i]=new Usuario();
		
		usuarios[0].setDni(123);		
		usuarios[0].setNombre("Nombre1");
		usuarios[0].setApellidos("Apellidos1");
		usuarios[0].setDireccion("Mikasa1");
		
		usuarios[1].setDni(456);		
		usuarios[1].setNombre("Nombre4");
		usuarios[1].setApellidos("Apellidos4");
		usuarios[1].setDireccion("Mikasa4");

		usuarios[2].setDni(789);		
		usuarios[2].setNombre("Nombre7");
		usuarios[2].setApellidos("Apellidos7");
		usuarios[2].setDireccion("Mikasa7");
		
		do{
			do{
				dni=Teclado.leerEntero("Cual es el dni de tu usuario?");
			}while(!esValido(usuarios, dni));
		
			for(int i=0; i<3; i++)
				if(dni==usuarios[i].getDni())
					System.out.println(usuarios[i].toString());
		}while(deseaContinuar());
	}
	
	static boolean esValido(Usuario[] usuarios,int dni){
		if(dni==usuarios[0].getDni()||dni==usuarios[1].getDni()||dni==usuarios[2].getDni())
			return true;
		return false;
	}

	static boolean deseaContinuar(){
		char decision;

		do{
		System.out.println("\n¿Quieres continuar? s= continuar, n= salir");
		decision=Teclado.leerCaracter();
		if((decision=='s')||(decision=='S'))
			return (true);
		else
			if((decision=='n')||(decision=='N'))
				return (false);
			else
				System.out.println("ERROR, opción inválida");
		}while(true);
	}

}
