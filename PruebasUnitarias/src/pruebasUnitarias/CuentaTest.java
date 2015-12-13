package pruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CuentaTest {
	Cuenta cuenta;

	@Before
	public void setUp() throws Exception {
		cuenta = new Cuenta(100);
	}

	@After	// se podria eliminar este metodo completo porque cuanto vuelve a crear una cuenta ...
	public void tearDown() throws Exception {
		cuenta = null;
	}

	@Test
	public void testSaldoInicial() {
		assertEquals(100, cuenta.getSaldo());
	}

	@Test
	public void testReintegro() {
		cuenta.reintegro(50);
		assertEquals(50, cuenta.getSaldo());
	}
	
	@Test
	public void testIngreso() {
		cuenta.ingreso(70);
		assertEquals(170, cuenta.getSaldo());
	}
	
	@Test
	public void testTransferencia() {
		Cuenta otracuenta = new Cuenta(200);
		
		cuenta.transferencia(50, otracuenta);
		assertEquals(50, cuenta.getSaldo());
		assertEquals(250, otracuenta.getSaldo());
	}
}
