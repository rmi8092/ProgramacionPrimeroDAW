package pruebasTDDconCuenta;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * No queremos más ceros gratuitos.
 *
 *
 * @author Emanuel Galván Fontalba
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */
public class CuentaTest {
	private static final int SALDO_ORIGINAL = 1000;
	private static final int CANTIDAD_NEGATIVA = -1000;
	private static final int CANTIDAD_CERO = 0;
	private static Cuenta cuenta;
	private static Cuenta cuentaDestino;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cuenta = new Cuenta(SALDO_ORIGINAL);
		cuentaDestino = new Cuenta(SALDO_ORIGINAL);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorSaldoNegativo() {
		cuenta = new Cuenta(CANTIDAD_NEGATIVA);
		assertNotNull(cuenta);
		assertEquals(CANTIDAD_CERO, cuenta.getSaldo());
	}

	@Test
	public void testConstructorSaldoPositivo() {
		assertNotNull(cuenta);
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
	}

	@Test
	public void testConstructorSaldoNeutro() {
		cuenta = new Cuenta(CANTIDAD_CERO);
		assertNotNull(cuenta);
		assertEquals(CANTIDAD_CERO, cuenta.getSaldo());
	}

	@Test
	public void testIngresoPositivo() {
		cuenta.ingreso(SALDO_ORIGINAL);
		assertEquals(SALDO_ORIGINAL + SALDO_ORIGINAL, cuenta.getSaldo());
	}

	@Test
	public void testIngresoNegativo() {
		cuenta.ingreso(CANTIDAD_NEGATIVA);
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
	}

	@Test
	public void testIngresoNeutro() {
		cuenta.ingreso(CANTIDAD_CERO);
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
	}

	@Test
	public void testTransferenciaPositiva() {
		cuenta.transferencia(SALDO_ORIGINAL, cuentaDestino);
		assertEquals(CANTIDAD_CERO, cuenta.getSaldo());
		assertEquals(SALDO_ORIGINAL + SALDO_ORIGINAL, cuentaDestino.getSaldo());
	}

	@Test
	public void testTransferenciaNegativa() {
		cuenta.transferencia(CANTIDAD_NEGATIVA, cuentaDestino);
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
		assertEquals(SALDO_ORIGINAL, cuentaDestino.getSaldo());
	}

	@Test
	public void testTransferenciaNeutra() {
		cuenta.transferencia(CANTIDAD_CERO, cuentaDestino);
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
		assertEquals(SALDO_ORIGINAL, cuentaDestino.getSaldo());
	}

	@Test
	public void testTransferenciaPositivaARojos() {
		cuenta = new Cuenta(CANTIDAD_CERO);
		cuenta.transferencia(SALDO_ORIGINAL, cuentaDestino);
		assertEquals(CANTIDAD_CERO, cuenta.getSaldo());
		assertEquals(SALDO_ORIGINAL, cuentaDestino.getSaldo());
	}

	@Test
	public void testTransferenciaDestinoNull() {
		cuenta.transferencia(SALDO_ORIGINAL, null);
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
	}

	@Test
	public void testGetSaldo() {
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
	}

	@Test
	public void testReintegroPositivo() {
		cuenta.reintegro(SALDO_ORIGINAL);
		assertEquals(CANTIDAD_CERO, cuenta.getSaldo());
	}

	@Test
	public void testReintegroNegativo() {
		cuenta.reintegro(CANTIDAD_NEGATIVA);
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
	}

	@Test
	public void testReintegroNeutro() {
		cuenta.reintegro(CANTIDAD_CERO);
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
	}

	@Test
	public void testReintegroPositivoARojos() {
		cuenta.reintegro(SALDO_ORIGINAL+1);
		assertEquals(SALDO_ORIGINAL, cuenta.getSaldo());
	}

}
