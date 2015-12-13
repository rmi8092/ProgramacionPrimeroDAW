package pruebasCajaBlanca;

/**
 * Ampl�a la clase Matematicas con los siguientes m�todos. Para cada uno de ellos dise�a el conjunto de
 * casos de prueba mediante la t�cnica del camino b�sico:
 * 1. static int menorDeTres(int a, int b, int c) {},
 * 2. static Respuesta positivoNegativoCero(int numero) {},
 * 3. static boolean esPar(int a) {}
 * 
 * @author Rafael Miranda Iba�ez
 * @version 1.0
 */

public class Matematicas {
    /**
     * Devuelve el m�ximo com�n divisor de dos n�meros
     * 
     * @param a
     *            n�mero para hallar el MCD
     * @param b
     *            n�mero para hallar el MCD
     * @return M�ximo com�n divisor de los dos n�meros
     */
    static int euclides(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int resto;
        // Ahora en a estar� el mayor
        while ((resto = a % b) != 0) {
            a = b;
            b = resto;
        }
        return b;
    }
    
    static int menorDeTres(int a, int b, int c) {
		if(a<=b && a<=c)
	        return a;  
		if(b<a && b<=c)  
           	return b;  
        return c;
    }
    
/*    static int menorDeTres(int a, int b, int c) {
		if(a<=b){
			if(a<=c)
				return a;
			else
				return c;
		}
		if(b<=a)
			if (b<=c)
				return b;
		return c;
	}*/
    
    static Respuesta positivoNegativoCero(int numero) {
    	Respuesta respuesta = new Respuesta();
    	
    	if(numero<0)
    		respuesta.setNegativo(true);
    	else if(numero>0)
    		respuesta.setPositivo(true);
    	else
    		respuesta.setCero(true);

    	return respuesta;
    }
    
    static boolean esPar(int a) {
		if ((a%2)==0)
			return true;
		else
			return false;
    }
}
