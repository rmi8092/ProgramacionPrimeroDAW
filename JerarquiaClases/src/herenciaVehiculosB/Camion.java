 /**  
  *  @author rafael miranda ibañez
  *  @version 1.0
  */

package herenciaVehiculosB;

public class Camion extends Vehiculo {

	private int ruedas;
	private int tara;
	
	public Camion(int ruedas, String combustible, int cilindrada, int velMaxima, int deposito, int tara) {
		super(numeroRuedas(ruedas), combustible, cilindrada, velMaxima, deposito);
		setTara(tara);
	}

	private void setTara(int tara) {
		this.tara = tara;
	}

	private static int numeroRuedas(int ruedas){
		if(ruedas<4)
			return 4;
		else
			return ruedas;
	}
	
	@Override
	public String toString() {
		return "Camion: " + super.toString() + ", tara=" + tara + "\n";
	}
}
