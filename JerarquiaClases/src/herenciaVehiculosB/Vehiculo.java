/**
 * Implementa la siguiente jerarqu�a de clases:
 *  - Veh�culo. Seg�n la rae, un veh�culo es "Medio de transporte de personas o cosas"
 *  - Coche. Seg�n la rae, un coche es "Veh�culo autom�vil de tama�o peque�o o mediano, destinado al
 * transporte de personas y con capacidad no superior a nueve plazas." Un coche contendr� un motor,
 * que puede ser de gasolina, de gas�leo o el�ctrico. Seg�n el tipo, el motor consume gasolina, gas�leo
 * u electricidad (bater�a)
 *  - Bicicleta. Seg�n la rae, un veh�culo es "Veh�culo de dos ruedas de igual tama�o cuyos pedales
 * transmiten el movimiento a la rueda trasera por medio de dos pi�ones y una cadena." Tambi�n podemos
 * contemplar una bicicleta con motor, como en la especificaci�n anterior de coche.
 *  - Cami�n. Seg�n la rae, un veh�culo es "Veh�culo de cuatro o m�s ruedas que se usa para transportar grandes cargas". Un cami�n tiene una tara.
 * La funcionalidad debe reflejar:
 *  + Desplazarse
 *  + Consumir
 *  + Parar
 *  + Acelerar, que consumir� combustible o bater�a el�ctrica
 *  + Repostar combustible o cargar bater�a.
 *  + Al superar la velocidad m�xima, el veh�culo a motor se quedar� sin �l, no pudi�ndose arrancar m�s.
 * El estado puede reflejar:
 *  - Ruedas
 *  - Pi�ones
 *  - Cadena
 *  - Velocidad, que puede variar conforme se acelera el veh�culo
 *  - Velocidad m�xima
 *  - Combustible
 *  - Cilindrada del motor
 * Implementa la clase TestVehiculos que realice mediante men�s:
 *  + Creaci�n y almacenamiento de bicicletas, camiones y coches en un ArrayList
 *  + Manejo de cada uno de los veh�culos, mostrando en todo momento su cambio de estado mediante toString()
 *  
 *  @author rafael miranda iba�ez
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
					return "El vehiculo est� acelerando";
				}
				else{
					velocidad++;
					return "El vehiculo est� acelerando";
				}
			}
		}
	}
	
	protected String accionRepostar(int cantidad){
		if(consume){
			deposito += cantidad;
			return "El dep�sito actual es: " + deposito;
		}
		else
			return "El veh�culo no puede repostar ya que no es motorizado";
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
