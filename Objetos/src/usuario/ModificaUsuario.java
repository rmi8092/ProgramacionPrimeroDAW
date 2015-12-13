package usuario;

public class ModificaUsuario {
	public static void main(String [] args){
		Usuario us1=new Usuario();
		
		us1.setDni(123);
		us1.setNombre("Rompetechos");
		us1.setApellidos("Apellidos1");
		us1.setDireccion("Mikasa1");
		
		System.out.println(us1.toString());
		//modifico direccion
		us1.setDireccion("Num. 13 de la rue del percebe");
		System.out.println(us1.toString());		
	}

}
