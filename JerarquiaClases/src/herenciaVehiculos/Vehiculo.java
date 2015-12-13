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

package herenciaVehiculos;

public class Vehiculo {
	
	private int ruedas;
	private int velocidad;
	private int velMaxima;
	
	public Vehiculo (int ruedas, int velMaxima) {
		setRuedas(ruedas);
		setVelMaxima(velMaxima);
	}

	protected int getVelocidad() {
		return velocidad;
	}

	protected void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	protected int getRuedas() {
		return ruedas;
	}

	protected int getVelMaxima() {
		return velMaxima;
	}
	
	protected void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	protected void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}
	
	protected String accionDesplazar(){
		return "El vehiculo se desplaza.";
	}
	
	protected String accionParar(){
		velocidad = 0;
		return "El vehiculo se para.";
	}
	
	protected String accionAcelerar(){
		setVelocidad(getVelocidad()+1);
		return "El vehiculo está acelerando" + accionDesplazar();
	}

	@Override
	public String toString() {
		return " ruedas=" + ruedas + ", velocidad=" + velocidad + ", velMaxima=" + velMaxima;
		}
}
