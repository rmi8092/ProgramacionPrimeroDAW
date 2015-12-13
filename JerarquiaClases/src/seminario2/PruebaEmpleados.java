package seminario2;


public class PruebaEmpleados {

	public static void main(String[] args) {
		
		Jefe jefe = new Jefe ("Juan",1000,2001,0.7f);
	
		Administrativo admin = new Administrativo("Enrique",900,2000,jefe);
		Administrativo copia = (Administrativo)admin.clone();		
		System.out.println(copia);
		System.out.println("Es el mismo jefe? " + (admin.getJefe()==copia.getJefe()));
		System.out.println("Iguales? " + admin.equals(copia));
	}
}
