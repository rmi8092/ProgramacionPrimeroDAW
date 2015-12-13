package seminario2;

public class Administrativo extends Empleado{

	private static final float FACTOR = 0.1f;
	private Jefe jefe;
	
	public Administrativo(String nombre, float salario, int anyoAlta, Jefe jefe) {
		super(nombre, salario, anyoAlta);
		this.jefe = jefe;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public float getSalario(){
		return super.getSalario() + super.getSalario() * jefe.getBonificacion() * FACTOR;
	}
	
	public Administrativo clone(){
		Empleado empleado = super.clone();
		Administrativo admin = (Administrativo)empleado;
		admin.jefe = (Jefe)this.jefe.clone();
		return admin;
	}
}
