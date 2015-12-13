package ascensor;

public class Puerta {

	private boolean abierta = false;
	
	public Puerta(boolean abierta) {
		setAbierta(abierta);
	}

	private boolean isAbierta() {
		return abierta;
	}

	private void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}

	@Override
	public String toString() {
		return "Puerta " + abierta ;
	}	
	
	private String abrir(){
		setAbierta(true);
		return "abriendo puerta\n";
	}
	
	private String cerrar(){
		setAbierta(false);
		return "cerrando puerta\n";
	}
	
	public String usar(){
		if(isAbierta())
			return cerrar();
		else
			return abrir();
	}
}
