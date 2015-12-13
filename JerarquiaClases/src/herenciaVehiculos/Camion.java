 /**  
  *  @author rafael miranda ibañez
  *  @version 1.0
  */

package herenciaVehiculos;

public class Camion extends Vehiculo {

	private int ruedas;
	private int tara;
	private String combustible;
	private int cilindrada;
	private int deposito;
	private boolean motorRoto = false;
	private boolean consume = true;
	
	public Camion(int ruedas, String combustible, int cilindrada, int velMaxima, int deposito, int tara) {
		super(numeroRuedas(ruedas), velMaxima);
		setCombustible(combustible);
		setCilindrada(cilindrada);
		setDeposito(deposito);
		setConsume(false);
		setTara(tara);
	}

	protected void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	protected void setTara(int tara) {
		this.tara = tara;
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
	
	protected int getRuedas() {
		return ruedas;
	}

	protected int getTara() {
		return tara;
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

	private static int numeroRuedas(int ruedas){
		if(ruedas<4)
			return 4;
		else
			return ruedas;
	}
	
	protected String accionAcelerar(){
		if(isMotorRoto())
			return "El camion tiene el motor roto y no puede acelerar";
		else{	
			return super.accionAcelerar();
		}
	}
	
	protected String accionRepostar(int cantidad){
		if(isMotorRoto())
			return "El camion tiene el motor roto y no puede repostar";
		else{
			setDeposito(getDeposito() + cantidad);
			return "El camion ha repostado y su deposito actual es de " + getDeposito();
		}
	}
	
	protected void romperMotor(){
		setMotorRoto(true);
	}
	
	@Override
	public String toString() {
		return "Camion: " + super.toString() + " combustible=" + combustible + ", cilindrada=" + cilindrada +
				", deposito=" + deposito + ", tara=" + tara + "\n";
	}
}
