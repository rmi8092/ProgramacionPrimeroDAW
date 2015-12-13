package pruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	@Test
	public void testSumarPositivos() {
		Suma suma = new Suma (5,9);
		assertEquals(suma.sumar(),14);
		//assertTrue(suma.sumar()==14); es lo mismo que el de arriba
	}
	
	@Test
	public void testSumarNegativos() {
		Suma suma = new Suma (-5,-2);
		assertEquals(suma.sumar(),-7);
	}

	@Test
	public void testSumarPositivosNegativos() {
		Suma suma = new Suma (-5,3);
		assertEquals(suma.sumar(),-2);
	}
	
	@Test
	public void testSumarConCeros() {
		Suma suma = new Suma (-5,0);
		assertEquals(suma.sumar(),-5);
	}
}
