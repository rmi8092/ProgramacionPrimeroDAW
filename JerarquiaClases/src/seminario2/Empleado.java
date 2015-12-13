package seminario2;

import java.util.Date;

public class Empleado implements Cloneable {

	private String nombre;
	private float salario;
	private int anyoAlta;
	private static final int INICIO_EMPRESA = 1980;
	
	public Empleado(String nombre, float salario, int anyoAlta){
		this.nombre = nombre;
		this.salario = salario;
		this.anyoAlta = anyoAlta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public int getAnyoAlta() {
		return anyoAlta;
	}
	
	public void incSalario(float subida){
		salario += subida;
	}
	
	protected void setAnyoAlta(int anyoAlta){
		int anyoActual = 1900 + new Date().getYear();
		if(anyoAlta >= INICIO_EMPRESA && anyoAlta <= anyoActual)
			this.anyoAlta = anyoAlta;
		else
			this.anyoAlta = anyoActual;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [" + "nombre=" + nombre + ", salario=" + salario
				+ ", anyoAlta=" + anyoAlta + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado empleado = (Empleado) obj;
		return this.nombre.equals(empleado.nombre) &&
			this.salario == empleado.salario &&
			this.anyoAlta == empleado.anyoAlta;		
	}
	
	public Empleado clone(){
		Object obj = null;
		try{
			obj = super.clone();
		}
		catch (CloneNotSupportedException e){
			assert false: "El objeto no puede ser clonado";
		}
		return (Empleado)obj;
	}
	
}
