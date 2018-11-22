/*Ejemplo de ejecución del bucle While.
 * 
 * Ejecuta la sentencia dentro del while mientras sea true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * Calcular factorial por funciones (llamada a la función). 
 * */

public class TestFactorial2 {

	public static void main ( String [] args ) {
		
		int numero = 4;
		
		if ( numero >= 0 ) { 
		
			long factorial1 = Factorial2.calcularFactorial( numero );
			System.out.println(  "El factorial \"while\" de " + numero + " es " + factorial1 );	
			
			long factorial2 = Factorial2.calcularFactorial1( numero );
			System.out.println(  "El factorial \"for\" de " + numero + " es " + factorial2 );	
		}
		else 
		
			System.out.println( "El factorial de un número negativo no existe" );
	}
	
}
