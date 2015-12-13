package DiseñandoUnaMatriz;
/**
 * Lourdes no me a dado tiempo a terminarlo, me queda ponerle las excepciones y hacer el menu.
 * Pero como puedes ver en el test, comprueba todo el objeto.
 * 
 * @author Emanuel Galvan Fontalba
 *
 */

public class Matriz {
	//campos
	private int[][]matriz;
	private int tamFil;
	private int tamCol;
	private boolean cuadrada;
	
	public Matriz(int fil, int col){
		setTamFil(fil);
		setTamCol(col);
		setMatriz(matrizCeros());
		setCuadrada(esCuadrada());
	}
	public Matriz(int fil, int col, int max, int min){
		setTamFil(fil);
		setTamCol(col);
		setMatriz(matrizAleatorio(max,min));
		setCuadrada(esCuadrada());
	}
	
	//set & get
	private int[][] getMatriz() {
		return matriz;
	}

	private void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	private int getTamFil() {
		return tamFil;
	}

	private void setTamFil(int tamFil) {
		this.tamFil = tamFil;
	}

	private int getTamCol() {
		return tamCol;
	}

	private void setTamCol(int tamCol) {
		this.tamCol = tamCol;
	}

	private boolean isCuadrada() {
		return cuadrada;
	}

	private void setCuadrada(boolean cuadrada) {
		this.cuadrada = cuadrada;
	}
	
	//comportamiento
	private int[][] matrizCeros(){
		int[][] matrizDeCeros= new int[getTamFil()][getTamCol()];
		for(int i=0; i<getTamFil(); i++)
			for(int j=0; j<getTamCol(); j++)
				matrizDeCeros[i][j]=0;
		return matrizDeCeros;
	}
	private int[][] matrizAleatorio(int max, int min){
		int[][] matrizAleatorio= new int[getTamFil()][getTamCol()];
		
		for(int i=0; i<getTamFil(); i++)
			for(int j=0; j<getTamCol(); j++)
				matrizAleatorio[i][j]=(int)(Math.random()*max-min+1)+min;
		
		return matrizAleatorio;
	}
	private int filas(){
		return getMatriz().length;
	}
	private int columnas(){
		return getMatriz()[0].length;
	}
	private boolean esCuadrada(){
		if(getTamFil()==getTamCol())
			return true;
		return true;
	}
	private boolean mismoTamaño(Matriz m){
		if(m.filas() == filas() && m.columnas() == columnas())
			return true;
		return false;
	}
	public Matriz suma(Matriz m1){
		//falta crear exception.
		
		if(!mismoTamaño(m1))
			System.out.println("excep");
		
		Matriz suma= new Matriz(filas(),columnas());
		
		for(int i=0; i<filas(); i++)
			for(int x=0; x<columnas(); x++)
				suma.getMatriz()[i][x]= getMatriz()[i][x]+m1.getMatriz()[i][x];
		return suma;
		
	}
	public Matriz resta(Matriz m1){
		//falta crear exception.
		
		if(!mismoTamaño(m1))
			System.out.println("excep");
		
		Matriz suma= new Matriz(filas(),columnas());
		
		for(int i=0; i<filas(); i++)
			for(int x=0; x<columnas(); x++)
				suma.getMatriz()[i][x]= getMatriz()[i][x]-m1.getMatriz()[i][x];
		return suma;
		
	}
	
	public Matriz trasponer(){
		int[][] traspuesta=new int[getTamCol()][getTamFil()];
		Matriz fin= new Matriz(getTamCol(), getTamFil());
		
		for(int i=0; i<getTamCol(); i++)
			for(int x=0; x<getTamFil(); x++)
				traspuesta[i][x]= getMatriz()[x][i];
		
		fin.setMatriz(traspuesta);
		return fin;
	}
	
	
	public Matriz multiplicacion(Matriz m1){
		//falta crear exception
		
		if(!m1.isCuadrada()||!isCuadrada()||!mismoTamaño(m1))
			System.out.println("excep");
		
		Matriz total = new Matriz(filas(), columnas());
		
		for(int i=0; i<filas(); i++)
			for(int x=0; x<columnas(); x++)
				for(int k=0; k<filas(); k++){
					total.getMatriz()[i][x]+=(getMatriz()[i][k]*m1.getMatriz()[k][x]);
				}
		return total;
	}
	
	private StringBuilder matrizCadena(int[][] m){
		StringBuilder matriz= new StringBuilder();
		
	
		for(int i=0; i<filas(); i++){
			matriz.append("\n");
			for(int j=0; j<columnas(); j++)
				matriz.append("\t"+m[i][j]);
		}
		return matriz;	
	}
	@Override
	public String toString() {
		return "Matriz:" + matrizCadena(getMatriz());
	}
	
}