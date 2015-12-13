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
		return "El vehiculo est� acelerando" + accionDesplazar();
	}

	@Override
	public String toString() {
		return " ruedas=" + ruedas + ", velocidad=" + velocidad + ", velMaxima=" + velMaxima;
		}
}
