/* 
 * Calcular factorial por funciones (llamada a la función). 
 * */

public class TestFactorial {

	public static void main ( String [] args ) {
		
		int numero = 35;
		
		if ( numero >= 0 ) { 
		
			long factorial1 = Factorial2.calcularFactorial( numero );
		
			System.out.println(  "El factorial de " + numero + " es " + factorial1 );
			
			long factorial2 = Factorial3.calcularFactorial( numero );	
	
			System.out.println(  "El factorial de " + numero + " es " + factorial2 );
		}
		else 
		
			System.out.println( "El factorial de un número negativo no existe" );
	}
	
}
