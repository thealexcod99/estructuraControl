public class TestFibonacci {

	public static void main( String [] args ) {
	
		int numero = 5;
		if ( numero < 0 ) {
				System.out.print( "No se puede calcular fibonacci de números negativos" ); 
				System.exit(1);
		}
		
		//long fibonacci2 = Fibonacci.getFibonacci( numero );	
		long fibonacci1 = Fibonacci.calcularFibonacci( numero );

		//System.out.println( "Ef.Valor del elemento " + numero + " vale " + fibonacci2 );
		System.out.println( "Valor del elemento " + numero + " vale " + fibonacci1 );
	}
}
