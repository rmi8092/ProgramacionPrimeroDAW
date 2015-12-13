package listaPersonas;

public enum Genero {
	MASCULINO, FEMENINO;
	
	static Genero obtenerMasculino(){
		return Genero.MASCULINO;
	}
	
	static Genero obtenerFemenino(){
		return Genero.FEMENINO;
	}
}
