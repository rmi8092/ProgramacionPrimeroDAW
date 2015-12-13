 /**  
  *  @author rafael miranda ibañez
  *  @version 1.0
  */

package herenciaVehiculos;

public class Coche extends Vehiculo {

	private static final int ruedas = 4;
	private String combustible;
	private int cilindrada;
	private int deposito;
	private boolean motorRoto = false;
	private boolean consume = true;
	
	public Coche(String combustible, int cilindrada, int velMaxima, int deposito) {
		super(ruedas, velMaxima);
		setCombustible(combustible);
		setCilindrada(cilindrada);
		setDeposito(deposito);
		setConsume(false);
	}
	
	protected void setCombustible(String combustible) {
		this.combustible = combustible;
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

	protected boolean isConsume() {
		return consume;
	}

	protected String accionAcelerar(){
		if(isMotorRoto())
			return "El coche tiene el motor roto y no puede acelerar";
		else{	
			return super.accionAcelerar();
		}
	}
	
	protected String accionRepostar(int cantidad){
		if(isMotorRoto())
			return "El coche tiene el motor roto y no puede repostar";
		else{
			setDeposito(getDeposito() + cantidad);
			return "El coche ha repostado y su deposito actual es de " + getDeposito();
		}
	}
		
	protected void romperMotor(){
		setMotorRoto(true);
	}
	
	@Override
	public String toString() {
		return "Coche: " + super.toString() + " combustible=" + combustible + ", cilindrada=" + cilindrada + ", deposito=" + deposito + "\n";
	}
}
