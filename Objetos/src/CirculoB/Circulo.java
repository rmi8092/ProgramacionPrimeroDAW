package CirculoB;

public class Circulo {
	
	private Punto centro;
	private int radio;
	
	public Circulo(Punto centro, int radio) throws RadioException {
		setRadio(radio);
		setCentro(centro);
	}

	private void setRadio(int radio) throws RadioException{
		if (!esValido(radio))
			throw new RadioException("El radio debe ser mayor que cero.");
		this.radio=radio;
	}
	
	private boolean esValido(int radio){
		if(radio<=0)
			return false;
		else
			return true;
	}

	private void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	private Punto getCentro() {
		return centro;
	}

	private int getRadio() {
		return radio;
	}

	@Override
	public String toString() {
		return "Circulo [centro=" + getCentro().toString() + ", radio=" + getRadio()+ "]";
	}
}
