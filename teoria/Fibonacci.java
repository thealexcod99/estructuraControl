public class Fibonacci {
	
	public static long calcularFibonacci( int numero ) {
		
		//casos base
		if ( numero == 0 )
			return 0;
		
		if ( numero == 1 )
			return 1;
			
		//recursividad (se llama a la propia función)
		else 
			return calcularFibonacci( numero - 1 ) + calcularFibonacci( numero - 2 );
	}
	/*//manera más eficiente
	public static long getFibonacci( int numero ) {
		
		
		
	} */
}
