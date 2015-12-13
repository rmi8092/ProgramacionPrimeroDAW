package listaPersonas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodigoPostal {

	private String codigo;
	private static final String reGex = "^((0[1-9][1-9][\\d]{2}|0[1-9]0[1-9][\\d]|0[1-9]00[1-9])|([1-4][\\d][1-9][\\d]{2}|[1-4][\\d]0[1-9][\\d]|[1-4][\\d]00[1-9])|(5[0-2][1-9][\\d]{2}|5[0-2]0[1-9][\\d]|5[0-2]00[1-9]))$";
	private String provincia;
	
	public CodigoPostal(String codigo) {
		setCodigo(codigo);
		setProvincia();
	}

	private void setCodigo(String codigo) {
		Pattern patron = Pattern.compile(reGex);
		Matcher motor = patron.matcher(codigo);
		if(motor.matches())
			this.codigo = codigo;
		else
			this.codigo = null;
	}

	private String getProvincia() {
		return provincia;
	}

	private void setProvincia() {
		Pattern patron = Pattern.compile("^\\d\\d");
		Matcher motor = patron.matcher(getCodigo());
		for(Provincias prov: Provincias.values())
			if(motor.group().equals(prov.getCp()))
				this.provincia = prov.name();
	}

	private String getCodigo() {
		return codigo;
	}
}
