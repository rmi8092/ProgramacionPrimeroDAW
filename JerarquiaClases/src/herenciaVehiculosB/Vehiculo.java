/**
 * Implementa la siguiente jerarquía de clases:
 *  - Vehículo. Según la rae, un vehículo es "Medio de transporte de personas o cosas"
 *  - Coche. Según la rae, un coche es "Vehículo automóvil de tamaño pequeño o mediano, destinado al
 * transporte de personas y con capacidad no superior a nueve plazas." Un coche contendrá un motor,
 * que puede ser de gasolina, de gasóleo o eléctrico. Según el tipo, el motor consume gasolina, gasóleo
 * u electricidad (batería)
 *  - Bicicleta. Según la rae, un vehículo es "Vehículo de dos ruedas de igual tamaño cuyos pedales
 * transmiten el movimiento a la rueda trasera por medio de dos piñones y una cadena." También podemos
 * contemplar una bicicleta con motor, como en la especificación anterior de coche.
 *  - Camión. Según la rae, un vehículo es "Vehículo de cuatro o más ruedas que se usa para transportar grandes cargas". Un camión tiene una tara.
 * La funcionalidad debe reflejar:
 *  + Desplazarse
 *  + Consumir
 *  + Parar
 *  + Acelerar, que consumirá combustible o batería eléctrica
 *  + Repostar combustible o cargar batería.
 *  + Al superar la velocidad máxima, el vehículo a motor se quedará sin él, no pudiéndose arrancar más.
 * El estado puede reflejar:
 *  - Ruedas
 *  - Piñones
 *  - Cadena
 *  - Velocidad, que puede variar conforme se acelera el vehículo
 *  - Velocidad máxima
 *  - Combustible
 *  - Cilindrada del motor
 * Implementa la clase TestVehiculos que realice mediante menús:
 *  + Creación y almacenamiento de bicicletas, camiones y coches en un ArrayList
 *  + Manejo de cada uno de los vehículos, mostrando en todo momento su cambio de estado mediante toString()
 *  
 *  @author rafael miranda ibañez
 *  @version 1.0
 */

package herenciaVehiculosB;

public class Vehiculo {
	
	private int ruedas;
	private String combustible;
	private int cilindrada;
	private int velocidad;
	private int velMaxima;
	private int deposito;
	private boolean motorRoto = false;
	private boolean consume = true;

	public Vehiculo (int ruedas, String combustible, int cilindrada, int velMaxima, int deposito) {
		setRuedas(ruedas);
		setCombustible(combustible);
		setCilindrada(cilindrada);
		setVelMaxima(velMaxima);
		setDeposito(deposito);
	}

	public Vehiculo (int ruedas, int velMaxima) {
		setRuedas(ruedas);
		setVelMaxima(velMaxima);
		setConsume(false);
	}

	protected void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	protected void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	protected void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	protected void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}

	protected void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	
	protected void setConsume(boolean consume) {
		this.consume = consume;
	}
	
	protected String accionDesplazar(){
		if(motorRoto){
			return "El vehiculo tiene el motor roto. " + accionParar();
		}
		else
			return "El vehiculo se desplaza.";
	}
	
	protected String accionParar(){
		velocidad = 0;
		return "El vehiculo se para.";
	}
	
	protected String accionAcelerar(){
		if(motorRoto)
			return "El vehiculo tiene el motor roto y no puede acelerar";
		else{
			if(velocidad>=velMaxima)
				return "El vehiculo no puede acelerar porque ha llegado a la velocidad maxima";
			else{
				if(consume){
					velocidad++;
					deposito--;
					return "El vehiculo está acelerando";
				}
				else{
					velocidad++;
					return "El vehiculo está acelerando";
				}
			}
		}
	}
	
	protected String accionRepostar(int cantidad){
		if(consume){
			deposito += cantidad;
			return "El depósito actual es: " + deposito;
		}
		else
			return "El vehículo no puede repostar ya que no es motorizado";
	}
	
	protected String accionRomper(int velocidad){
		if(consume){
			if(velocidad>velMaxima);{
				motorRoto = true;
				return "El vehiculo ha roto el motor.";
			}
		}
		else
			return "El vehiculo no puede romper el motor ya que no es motorizado.";
	}

	@Override
	public String toString() {
		if(consume)
			return " ruedas=" + ruedas + ", combustible=" + combustible + ", cilindrada=" + cilindrada +
					", velocidad=" + velocidad + ", velMaxima=" + velMaxima + ", deposito=" + deposito;
		else{
			return " ruedas=" + ruedas + ", velocidad=" + velocidad + ", velMaxima=" + velMaxima;
		}
	}
}
