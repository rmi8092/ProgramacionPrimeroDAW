package sistemaAscensor;

/**
 *Crea una clase TestAscensor que simule el funcionamiento de un ascensor. 
 * Para ello, tendrás que crear un paquete sistemaAscensor que contenga las clases Ascensor y Puerta. 
 * Un ascensor podrá subir y bajar. Cada vez que se modifique el estado del objeto, se mostrarán todos los atributos.
 * Para ello sobreescribe el método toString() en la clase Ascensor.

 * Una puerta podrá abrir y cerrarse

 * Crea la clase TestAscensor fuera del paquete para probarlo. 
 * Una salida típica puede ser esta: 

 * Elige la altura del edificio (plantas en total): 
 * 6
 * Estás en la planta 1. 
 * Elige un destino: 
 * 5
 * Abriendo puerta
 * Cerrando puerta
 * Subiendo. Planta 2.
 * Subiendo. Planta 3.
 * Subiendo. Planta 4.
 * Subiendo. Planta 5.
 * Abriendo puerta
 * Estás en la planta 5. Destino conseguido
 * Cerrando puerta
 * Quieres dejar el ascensor ya? 
 * n
 * Estás en la planta 5. Elige un destino: 
 * 1
 * Abriendo puerta
 * Cerrando puerta
 * Bajando. Planta 4.
 * ...
 */
public class Ascensor {
	
	private int planta;
	private int plantasTotales;
	private int plantaUsuario;
	private int plantaDestino;
	private boolean subiendo = false;
	private Puerta puerta = new Puerta();
	
	Ascensor() {
		//this.puerta = new Puerta();
	}

	int getPlanta() {
		return planta;
	}

	int getPlantasTotales() {
		return plantasTotales;
	}

	void setPlantasTotales(int plantasTotales) throws plantasTotalesException {
		if (plantasTotales<1)
			throw new plantasTotalesException("Las plantas de tu edificio debe ser mayor de cero");
		this.plantasTotales = plantasTotales;
	}

	void setPlanta(int planta) {
		this.planta = planta;
	}
	
	int getPlantaDestino() {
		return plantaDestino;
	}

	void setPlantaDestino(int plantaDestino) throws plantaDestinoException{
		if (plantaDestino>getPlantasTotales() || plantaDestino<0)
			throw new plantaDestinoException("Tu planta de destino no puede ser mayor que las plantas totales ni menor de cero");
		this.plantaDestino = plantaDestino;
	}

	int getPlantaUsuario() {
		return plantaUsuario;
	}

	void setPlantaUsuario(int plantaUsuario) throws plantaUsuarioException {
		if (plantaUsuario>getPlantasTotales() || plantaUsuario<0)
			throw new plantaUsuarioException("Tu planta usuario no puede ser mayor que las plantas totales ni menor de cero");
		setPlanta(plantaUsuario);
		this.plantaUsuario = plantaUsuario;
	}
	boolean isSubiendo() {
		return subiendo;
	}

	void setSubiendo(boolean subiendo) {
		this.subiendo = subiendo;
	}

	void ascensorSubir(){
		this.planta = getPlanta()+1;
	}
	
	String abrirPuerta(){
		this.puerta.puertaAbrir();
		return puerta.toString();
	}
	
	String cerrarPuerta(){
		this.puerta.puertaCerrar();
		return puerta.toString();
	}
	
	void ascensorBajar(){
		this.planta = getPlanta()-1;
	}
	
	void ascensorMover(){
		if(getPlantaDestino() > getPlanta()){
			ascensorSubir();
			subiendo = false;
		}
		else if (getPlantaDestino() < getPlanta()){
			ascensorBajar();
			subiendo = true;
		}
		else{
			puerta.puertaAbrir();
		}
	}
	
	@Override
	public String toString() {
		if (isSubiendo())
			return "Bajando. Planta " + getPlanta();
		else{
			return "Subiendo. Planta " + getPlanta();
		}
	}
}
