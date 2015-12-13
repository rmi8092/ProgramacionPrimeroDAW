package codigosPostales;

/**
 * Crea un programa en Java que reconozca los c�digos postales. Para ello:
 * Valida el c�digo postal mediante una expresi�n regular
 * 52001 (v�lido)
 * 14014 (v�lido)
 * 53001 (inv�lido)
 * 14000 (inv�lido)
 * Extrae mediante grupos de expresiones regulares la provincia (dos primeros d�gitos)
 * Muestra la provincia en cuesti�n y a la comunidad aut�noma a la que pertenece (ha de reconocer al menos 10 provincias) Utiliza enumeraciones con al menos dos atributos y un m�todo.
 * Utiliza la p�gina de correos.
 * 
 * @author rafael miranda iba�ez
 * @version 1.0
 */

public enum Provincias {
	ALMERIA("pertenece a Andalucia", "04"),
	BADAJOZ("pertenece a Extremadura", "06"),
	CADIZ("pertenece a Andalucia", "11"),
	CORDOBA("pertenece a Andalucia", "14"),
	GRANADA("pertenece a Andalucia", "18"),
	MADRID("pertenece a Madrid", "28"),
	JAEN("pertenece a Andalucia", "23"),
	MALAGA("pertenece a Andalucia", "29"),
	MURCIA("pertenece a Murcia", "30"),
	HUESCA("pertenece a Aragon", "22");
	
	private String ccaa;
	private String inicioCodigo;
	
	private Provincias(String ccaa, String inicioCodigo){
		setInicioCodigo(inicioCodigo);
		setCCAA(ccaa);
	}

	public String getInicioCodigo() {
		return inicioCodigo;
	}

	private void setInicioCodigo(String inicioCodigo) {
		this.inicioCodigo = inicioCodigo;
	}

	String getCCAA() {
		return ccaa;
	}

	private void setCCAA(String ccaa) {
		this.ccaa = ccaa;
	}
	
	public static void esProvincia(String codigoProvincia){ //Esta cadena es la que se extrae con matcher.group(1)
		for(Provincias prov: Provincias.values()){
			if(codigoProvincia.equals(prov.getInicioCodigo()))
				System.out.println("El codigo postal introducido es de la provincia " + prov.name() + " y " + prov.getCCAA()+ "\n");
		}
	}
}
