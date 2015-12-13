package ascensor;

import utiles.Teclado;

/**
 * Crea una clase TestAscensor que simule el funcionamiento de un ascensor. 
 * Para ello, tendr�s que crear un paquete sistemaAscensor que contenga las clases Ascensor y Puerta. 
 * Un ascensor podr� subir y bajar. Cada vez que se modifique el estado del objeto, se mostrar�n todos los atributos.
 * Para ello sobreescribe el m�todo toString() en la clase Ascensor.
 * Una puerta podr� abrir y cerrarse.
 * Crea la clase TestAscensor fuera del paquete para probarlo. 
 * Una salida t�pica puede ser esta: 
 * Elige la altura del edificio (plantas en total): 
 * 6
 * Est�s en la planta 1. 
 * Elige un destino: 
 * 5
 * Abriendo puerta
 * Cerrando puerta
 * Subiendo. Planta 2.
 * Subiendo. Planta 3.
 * Subiendo. Planta 4.
 * Subiendo. Planta 5.
 * Abriendo puerta
 * Est�s en la planta 5. Destino conseguido
 * Cerrando puerta
 * Quieres dejar el ascensor ya? 
 * n
 * Est�s en la planta 5. Elige un destino: 
 * 1
 * Abriendo puerta
 * Cerrando puerta
 * Bajando. Planta 4.
 * ...
 */

public class Ascensor {

	private int plantasTotales;
	private int plantaActual;
	private int plantaDestino;
	private Puerta puerta;
		
	public Ascensor(int plantasTotales, int plantaActual) {
		setPlantasTotales(plantasTotales);
		setPlantaActual(plantaActual);
		setPuerta(new Puerta(false));
	}

	private int getPlantasTotales() {
		return plantasTotales;
	}

	private void setPlantasTotales(int plantasTotales) {
		this.plantasTotales = plantasTotales;
	}

	int getPlantaActual() {
		return plantaActual;
	}

	private void setPlantaActual(int plantaActual) {
		this.plantaActual = plantaActual;
	}

	int getPlantaDestino() {
		return plantaDestino;
	}

	void setPlantaDestino(int plantaDestino) {
		this.plantaDestino = plantaDestino;
	}

	private Puerta getPuerta() {
		return puerta;
	}

	private void setPuerta(Puerta puerta) {
		this.puerta = puerta;
	}
	
	String Subir(){
		setPlantaActual(getPlantaActual()+1);
		return "Ascensor subiendo. Planta " + getPlantaActual();
	}
	
	String Bajar(){
		setPlantaActual(getPlantaActual()-1);
		return "Ascensor bajando. Planta " + getPlantaActual();
	}
	
	String ascensorViajar(int destino){
		String cadena = "";
		setPlantaDestino(destino);
		if(getPlantaDestino()>getPlantaActual()){
			cadena += puerta.usar();
			cadena += puerta.usar();
				do{
					cadena += Subir()+"\n";
				}while(getPlantaDestino()!=getPlantaActual());
			cadena += puerta.usar();
			cadena += "Destino conseguido, est�s en la planta " + getPlantaActual()+"\n";
			cadena += puerta.usar();
		}
		else{
			do{
				cadena += Bajar()+"\n";
			}while(getPlantaDestino()!=getPlantaActual());
			cadena += puerta.usar();		
			cadena += "Destino conseguido, est�s en la planta " + getPlantaActual()+"\n";
			cadena += puerta.usar();		
		}
		return cadena;
	}

	/*@Override
	public String toString() {
		return "Ascensor [plantasTotales=" + plantasTotales + ", plantaActual="
				+ plantaActual + ", plantaDestino=" + plantaDestino
				+ ", puerta=" + puerta + "]";
	}*/
}
