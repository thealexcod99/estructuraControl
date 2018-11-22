public class NoDivisores {

	public static void main( String [] args ) {
		int numero = 10;
		int contador = 0;
		
		for ( int i = 1; i <= numero; i++ ) {
			
			if ( numero % i == 0 ) {
	
				continue; //no se ejecutan las sentencias de abajo y continua con el bucle.
			}	
			
			contador++;
			System.out.println( "El número " + i + " no es divisor de " + numero );
		}
		
		System.out.println( "Nº de No divisores de " + numero + " son " + contador );
	}
}
