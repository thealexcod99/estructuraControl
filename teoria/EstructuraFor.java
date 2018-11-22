public class EstructuraFor {

	public static void main( String [] args ) {
	
		int numero = 5;
		int suma = 0;
		
		for ( int contador = 0; contador <= numero; contador++ ) { //contador esta definida solo dentro del for.
		//  ( int i = 0; i <= numero; i++ ) es el estandar de definición para los for.
			suma += contador;
		}
		
		System.out.println( "La suma de los " + numero + " primeros números vale " + suma );
	}
}
