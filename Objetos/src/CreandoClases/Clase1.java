package CreandoClases;

public class Clase1 {
	private int campo1;
	private String campo2;
	private Clase2 campo3;
	
	Clase1(int campo1, String campo2, Clase2 campo3){
		setCampo1(campo1);//this.campo1=campo1;
		setCampo2(campo2);//this.campo2=campo2;
		setCampo3(campo3);//this.campo3=campo3;
	}
	
	private void setCampo1(int campo1) {
		this.campo1 = campo1;
	}

	private void setCampo2(String campo2) {
		this.campo2 = campo2;
	}

	private void setCampo3(Clase2 campo3) {
		this.campo3 = campo3;
	}
	
	int getCampo1() {
		return campo1;
	}

	String getCampo2() {
		return campo2;
	}

	Clase2 getCampo3() {
		return campo3;
	}

	void metodo1(){
		System.out.println("En ObjetoDeClase1.metodo1");
	}
	
	void metodo2(){
		System.out.println("En ObjetoDeClase1.metodo2");
	}
	
	void metodo3(){
		System.out.println("En ObjetoDeClase1.metodo3");
	}
	
	StringBuilder mostrarCampo3(){
		int[][]matriz = campo3.getCampo1();
		StringBuilder cadena = new StringBuilder();
		
		for(int i=0; i<matriz.length; i++){
			cadena.append("\n");
			for(int j=0; j<matriz[i].length; j++)
				cadena.append(matriz[i][j]+"\t");
		}
		return cadena;
	}

	@Override
	public String toString() {
		char caracter = campo3.getCampo2();
		return "\n"+caracter+mostrarCampo3();
	}
	
	
}