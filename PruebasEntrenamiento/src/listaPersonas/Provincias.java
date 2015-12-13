package listaPersonas;

public enum Provincias {
	CORDOBA("14"),
	SEVILLA("41"),
	JAEN("23"),
	GRANADA("18"),
	MALAGA("29"),
	HUELVA("21"),
	CADIZ("11"),
	ALMERIA("04"),
	ZARAGOZA("50"),
	MELILLA("52");
		
	private String Cp;
	
	Provincias(String cp){
		setCp(cp);
	}

	public String getCp() {
		return Cp;
	}

	public void setCp(String cp) {
		Cp = cp;
	}
}
