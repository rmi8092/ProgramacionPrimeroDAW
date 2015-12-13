package seminario2;


public class Jefe extends Empleado {

	private float bonificacion;
	
	public Jefe(String nombre, float salario, int anyoAlta, float bonificacion) {
		super(nombre, salario, anyoAlta);
		this.bonificacion = bonificacion;
	}

	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}

	public float getSalario(){
		return super.getSalario() + super.getSalario()*bonificacion;
	}
	
	public void setAnyoAlta(int anyoAlta){
		super.setAnyoAlta(anyoAlta);
	}
	
	public String getDescripcion(){
		return "Soy " + getNombre() + "y gano " + getSalario();
	}

	@Override
	public String toString() {
		return super.toString() + "[bonificacion=" + bonificacion + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj) == false)
			return false;
		Jefe jefe = (Jefe) obj;
		return this.bonificacion == jefe.bonificacion;
	}
	
	
}
