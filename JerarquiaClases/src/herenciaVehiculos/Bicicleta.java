 /**  
  *  @author rafael miranda ibañez
  *  @version 1.0
  */

package herenciaVehiculos;

public class Bicicleta extends Vehiculo {

	private static final int ruedas = 2;
	private static final int pinnones =  2;
	private boolean cadena;
	private String combustible;
	private int cilindrada;
	private int deposito;
	private boolean motorRoto = false;
	private boolean consume = true;
	
	Bicicleta(int velMaxima) {
		super(ruedas, velMaxima);
		setCadena(true);
		setConsume(false);
	}

	Bicicleta(String combustible, int cilindrada, int velMaxima, int deposito) {
		super(ruedas, velMaxima);
		setCombustible(combustible);
		setCilindrada(cilindrada);
		setDeposito(deposito);
		setCadena(false);
	}
	
	protected void setCadena(boolean cadena) {
		this.cadena = cadena;
	}

	protected void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	protected boolean isCadena() {
		return cadena;
	}

	protected String getCombustible() {
		return combustible;
	}

	protected int getCilindrada() {
		return cilindrada;
	}

	protected int getDeposito() {
		return deposito;
	}

	protected boolean isMotorRoto() {
		return motorRoto;
	}

	boolean isConsume() {
		return consume;
	}

	protected void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	protected void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	protected void setMotorRoto(boolean motorRoto) {
		this.motorRoto = motorRoto;
	}

	protected void setConsume(boolean consume) {
		this.consume = consume;
	}
	
	protected String accionAcelerar(){
		if(consume){
			if(isMotorRoto())
				return "El camion tiene el motor roto y no puede acelerar";
			else{	
				return super.accionAcelerar();
			}
		}
		else
			return super.accionAcelerar();
	}
	
	protected String accionRepostar(int cantidad){
		if(consume){
			if(isMotorRoto())
				return "La bicicleta tiene el motor roto y no puede repostar";
			else{
				setDeposito(getDeposito() + cantidad);
				return "La bicicleta ha repostado y su deposito actual es de " + getDeposito();
			}
		}
		else
			return "La bicicleta no es motorizada con lo que no puede repostar combustible";
	}
	
	protected void romperMotor(){
		setMotorRoto(true);
	}

	@Override
	public String toString() {
		if(consume)
			return "Bicicleta: " + super.toString() + " combustible=" + combustible + ", cilindrada=" + cilindrada +
					", deposito=" + deposito +", cadena=" + cadena + ", pinnones=" + pinnones + "\n";
		else
			return "Bicicleta: " + super.toString() + ", cadena=" + cadena + ", pinnones=" + pinnones + "\n"; 
	}	
}
