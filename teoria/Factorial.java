public class Factorial1 {
	public static void main ( String [] args ) {
		int numero = -4;
		int contador = 1;
		int factorial = 1;
		
		if ( numero >= 0 ){
			while ( ( contador <= numero ) && ( numero != 0 ) ) {
			
					factorial *= contador;
					contador++;
					
			}
			System.out.println( "El factorial de " + numero + " es " + factorial );
		}
		else
		System.out.println( "El Factorial de un Número Negativo no existe" );

	}
}
