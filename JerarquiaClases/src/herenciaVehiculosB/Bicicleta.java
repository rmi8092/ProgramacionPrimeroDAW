 /**  
  *  @author rafael miranda ibañez
  *  @version 1.0
  */

package herenciaVehiculosB;

public class Bicicleta extends Vehiculo {

	private static final int ruedas = 2;
	private static final int pinnones =  2;
	private boolean cadena;
	
	Bicicleta(int velMaxima) {
		super(ruedas, velMaxima);
		setCadena(true);
	}

	Bicicleta(String combustible, int cilindrada, int velMaxima, int deposito) {
		super(ruedas, combustible, cilindrada, velMaxima, deposito);
		setCadena(false);
	}
	
	private void setCadena(boolean cadena) {
		this.cadena = cadena;		
	}

	@Override
	public String toString() {
		return "Bicicleta: " + super.toString() + ", cadena=" + cadena + "\n"; 
	}	
}
