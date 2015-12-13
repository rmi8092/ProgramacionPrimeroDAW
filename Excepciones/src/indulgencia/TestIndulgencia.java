package indulgencia;

import java.util.Calendar;

/**
 * @author rafael miranda ibañez
 */

public class TestIndulgencia {

	public static void main(String[] args) {

		Calendar ahora = Calendar.getInstance();
		System.out.println(ahora.getClass());
		
		//ahora.setLenient(false);
		ahora.set(2004,32,32);
		System.out.println(ahora.getTime());
		
		ahora.set(2004,1,7,7,0,0);
		System.out.println(ahora.getTime());
	}
}
