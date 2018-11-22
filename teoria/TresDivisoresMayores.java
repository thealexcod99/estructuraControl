/* Encontrar los tes numeros mayores divisibles entre el numero dado.
 * */
public class TresDivisoresMayores {
	
	public static void main( String [] args ) { 
		int numero = 1_000_000;
		int contador = 0;
		
		System.out.println( "Divisores de 100" );
		
		for ( int i = numero / 2; i > 1; i-- ) { //se inicializa i a la mitad de numero para mejorar el rendimiento.
			
			if ( numero % i == 0 ) {
				
				System.out.print( i + " " );
				contador++;
			
			}
			if ( contador == 3 )
				
				break; //se sale del bucle actual y se ejecutan el resto de sentencias.
			  //return;  se sale del método y el resto de sentencias por debajo de el y dentro del main no se ejecutan.
		}
		
		System.out.println();
	}
}
