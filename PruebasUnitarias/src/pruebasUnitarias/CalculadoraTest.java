package pruebasUnitarias;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora miCalculadora = new Calculadora();
	
	/*Calculadora miCalculadora;
	
	@Before
	public void setUp() throws Exception {
		miCalculadora = new Calculadora();
	}*/
	
	@Test
	public void testSumar() {
		assertEquals(8, miCalculadora.sumar(8));
	}

	@Test
	public void testRestar1() {
		assertEquals(-5, miCalculadora.restar(5));
	}
	
	@Test
	public void testRestar2() {
		assertEquals(-20, miCalculadora.restar(20));
	}
	
	@Test
	public final void testGetResultado() {
		miCalculadora.sumar(9);
		miCalculadora.restar(-1);
		assertEquals(10, miCalculadora.getResultado());
	}
}
