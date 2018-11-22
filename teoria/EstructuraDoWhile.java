/* Ejemplo de estructura de do-while
 * 
 * El programa calcula la suma: 1 + 2 + 3 + 4 .... + 9 + 10
 * */
public class EstructuraDoWhile {
	
	public static void main( String [] args ) {
		
		
		int numero = 3;
		int contador = 0;
		int suma = 0;
		
		do {
			
			suma += contador;
			contador++;
		}
		while ( contador <= 3 );
	
		System.out.println( "La suma de los " + numero + " primeros números vale " + suma );
	}
}
