 /**  
  *  @author rafael miranda ibañez
  *  @version 1.0
  */

package herenciaVehiculosB;

public class Coche extends Vehiculo {

	private static final int ruedas = 4;
	
	public Coche(String combustible, int cilindrada, int velMaxima, int deposito) {
		super(ruedas, combustible, cilindrada, velMaxima, deposito);
	}
	
	@Override
	public String toString() {
		return "Coche: " + super.toString() + "\n";
	}
}
