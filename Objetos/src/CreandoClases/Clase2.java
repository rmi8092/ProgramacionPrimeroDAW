package CreandoClases;

public class Clase2 {
	private int[][] campo1;
	private char campo2;
	
	Clase2(int[][] campo1, char campo2){
		setCampo1(campo1);//this.campo1=campo1;
		setCampo2(campo2);//this.campo2=campo2;
	}

	private void setCampo1(int[][] campo1) {
		this.campo1 = campo1;
	}

	private void setCampo2(char campo2) {
		this.campo2 = campo2;
	}
	
	int[][] getCampo1() {
		return campo1;
	}

	char getCampo2() {
		return campo2;
	}

	void metodo1(){
		System.out.println("En ObjetoDeClase2.metodo1");
	}
	
	void metodo2(){
		System.out.println("En ObjetoDeClase2.metodo2");
	}
	
	void metodo3(){
		System.out.println("En ObjetoDeClase2.metodo3");
	}
	
	private StringBuilder convertirACadena(){
		StringBuilder cadena = new StringBuilder();
		for(int i=0; i<campo1.length; i++){
			cadena.append("\n");
			for(int j=0; j<campo1[i].length; j++)
				cadena.append(campo1[i][j]+"\t");
		}
		return cadena;
	}

	@Override
	public String toString() {
		return "\n"+campo2+convertirACadena();
	}
}
