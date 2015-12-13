package listaPersonas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FechaNacimiento {

	private String fecha;
	private static final String reGex = "^(0\\d|1\\d|2\\d|3[0-1])/(0\\d|1[0-2])/([0-1]\\d\\d\\d|200\\d|201[0-5])";
	
	public FechaNacimiento(String fecha) {
		setFecha(fecha);
	}

	private String getFecha() {
		return fecha;
	}

	private void setFecha(String fecha) {
		Pattern patron = Pattern.compile(reGex);
		Matcher motor = patron.matcher(fecha);
		if(motor.matches())
			this.fecha = fecha;
		this.fecha = null;
	}
}
