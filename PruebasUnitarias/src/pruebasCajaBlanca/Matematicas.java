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

public class Matematicas {
    /**
     * Devuelve el máximo común divisor de dos números
     * 
     * @param a
     *            número para hallar el MCD
     * @param b
     *            número para hallar el MCD
     * @return Máximo común divisor de los dos números
     */
    static int euclides(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int resto;
        // Ahora en a estará el mayor
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
