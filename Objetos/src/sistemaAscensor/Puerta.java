package sistemaAscensor;

public class Puerta {

	private boolean abierta = false;
	
	public Puerta() {
		setPuerta(false);
	}

	boolean isAbierta() {
		return abierta;
	}

	void setPuerta(boolean abierta) {
		this.abierta = abierta;
	}

	boolean puertaAbrir(){
		setPuerta(true);
		return isAbierta();
	}
	
	boolean puertaCerrar(){
		setPuerta(false);
		return isAbierta();
	}
	
	@Override
	public String toString() {
		if (isAbierta())
			return "Abriendo puerta";
		else
			return "Cerrando puerta";
	}
}
