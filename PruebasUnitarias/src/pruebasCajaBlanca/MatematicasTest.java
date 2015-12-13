package pruebasCajaBlanca;

/**
 * Amplía la clase Matematicas con los siguientes métodos. Para cada uno de ellos diseña el conjunto de
 * casos de prueba mediante la técnica del camino básico:
 * 1. static int menorDeTres(int a, int b, int c) {},
 * 2. static Respuesta positivoNegativoCero(int numero) {},
 * 3. static boolean esPar(int a) {}
 * 
 * @author Rafael Miranda Ibañez
 * @version 1.0
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class MatematicasTest {

	@Test
	public void testEuclides() {
		Matematicas.euclides(2,1);
		Matematicas.euclides(1,2);
		Matematicas.euclides(4,3);
	}
	
	@Test
	public void testMenorDeTres(){
		Matematicas.menorDeTres(1,2,3);
		Matematicas.menorDeTres(2,1,3);
		Matematicas.menorDeTres(2,3,1);
		Matematicas.menorDeTres(3,2,1);
		//PRUEBAS CAJA NEGRA
		assertEquals(1, Matematicas.menorDeTres(1,2,3));
		assertEquals(1, Matematicas.menorDeTres(1,1,3));
	}
	
	@Test
	public void testPositivoNegativoCero(){
		Matematicas.positivoNegativoCero(7);
		Matematicas.positivoNegativoCero(0);
		Matematicas.positivoNegativoCero(-4);
	}
	
	@Test
	public void testEsPar(){
		Matematicas.esPar(5);
		Matematicas.esPar(8);
	}
}
