package calendar;

public class FechaNoValida extends Exception {

	public FechaNoValida(String string) {
		System.err.println(string);
	}
}
