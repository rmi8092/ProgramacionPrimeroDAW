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

import java.util.ArrayList;

import utiles.Menu;
import utiles.Teclado;

public class TestVehiculo {
	
	static Menu menuVehiculos = new Menu("Menu creacion y almacenamiento de vehiculos", new String[]{"Crear bicicleta","Crear camion",
			"Crear coche","Manejar vehiculo","Salir"});
	static Menu tipoBicicleta = new Menu("Menu eleccion tipo bicicleta", new String[]{"Basica","Motorizada","Salir"});
	static ArrayList<Vehiculo> catalogoVehiculos = new ArrayList<Vehiculo>();
	static Menu manejarVehiculo = new Menu("Menu manejar vehiculo", new String[]{"Acelerar","Parar","Repostar","Salir"});
	
	public static void main(String[] args) {

		int opcion;
		do{
			opcion = menuVehiculos.gestionar();
			ejecutarMenu(opcion);
		}while(opcion != 4);
	}

	private static void ejecutarMenu(int opcion) {
		switch(opcion){
			case 1:
				almacenar(crearBicicleta());
				break;
			case 2:
				almacenar(crearCamion());
				break;
			case 3:
				almacenar(crearCoche());
				break;
			case 4:
				manejarVehiculo();
				break;
			case 5:
				return;
		}		
	}

	private static Bicicleta crearBicicleta(){
		int opcion = tipoBicicleta.gestionar();
		if(opcion == 1){
			Bicicleta bicicleta = new Bicicleta(Teclado.leerEntero("Cual es la velocidad maxima de su bicicleta: 15, 25 o 35 km/h?"));
			return bicicleta;
		}
		if(opcion == 2){
			Bicicleta bicicleta = new Bicicleta(Teclado.leerCadena("El motor de su bicileta es de gasoleo, gasolina o electrico?"),
					Teclado.leerEntero("Cual es la cilindrada del motor: 100, 200 o 300 cc?"),
					Teclado.leerEntero("Cual es la velocidad maxima de su bicicleta: 15, 25 o 35 km/h?"),
					Teclado.leerEntero("Cual es la capacidad del deposito: 10, 12 o 14 litros?"));
			return bicicleta;
		}
		else
			return null;
	}
	
	private static Camion crearCamion(){
		Camion camion = new Camion(Teclado.leerEntero("Cuantas ruedas tiene su camion: 6, 8 o 10 ruedas?"),
					Teclado.leerCadena("El motor de su camion es de gasoleo, gasolina o electrico?"),
					Teclado.leerEntero("Cual es la cilindrada del motor: 1000, 2000 o 3000 cc?"),
					Teclado.leerEntero("Cual es la velocidad maxima de su camion: 100, 125 o 150 km/h?"),
					Teclado.leerEntero("Cual es la capacidad del deposito: 100, 120 o 140 litros?"),
					Teclado.leerEntero("Cual es la tara del camion: 10000, 12000 o 14000 kg?"));
		return camion;
	}
	
	private static Coche crearCoche(){
		Coche coche = new Coche(Teclado.leerCadena("El motor de su coche es de gasoleo, gasolina o electrico?"),
					Teclado.leerEntero("Cual es la cilindrada del motor: 500, 600 o 700 cc?"),
					Teclado.leerEntero("Cual es la velocidad maxima de su coche: 150, 180 o 210 km/h?"),
					Teclado.leerEntero("Cual es la capacidad del deposito: 50, 60 o 70 litros?"));
		return coche;
	}
	
	private static void almacenar(Vehiculo vehiculo) {
		catalogoVehiculos.add(vehiculo);
	}
	
	private static void manejarVehiculo() {
		int opcion=0;
		do{
			opcion = manejarVehiculo.gestionar();
				switch(opcion){
			case 1:
				acelerar();
				break;
			case 2:
				parar();
				break;
			case 3:
				repostar();
				break;
			case 4:
				return;
			}
		}while(opcion != 4);
	}

	private static void repostar() {
		System.out.println(catalogoVehiculos);
		int vehicu = Teclado.leerEntero("Cual es el vehiculo que quiere repostar?");
		System.out.println(catalogoVehiculos.get(vehicu-1).accionRepostar(Teclado.leerEntero("Que cantidad quieres repostar?")));
		System.out.println(catalogoVehiculos);
	}

	private static void parar() {
		System.out.println(catalogoVehiculos);
		int vehicul = Teclado.leerEntero("Cual es el vehiculo que quiere parar?");
		System.out.println(catalogoVehiculos.get(vehicul-1).accionParar());
		System.out.println(catalogoVehiculos);
	}

	private static void acelerar() {
		System.out.println(catalogoVehiculos);
		int vehiculo = Teclado.leerEntero("Cual es el vehiculo que quiere acelerar?");
		System.out.println(catalogoVehiculos.get(vehiculo-1).accionAcelerar());
		System.out.println(catalogoVehiculos);
	}
}
