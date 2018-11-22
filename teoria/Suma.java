/*Ejemplo de ejecución del bucle While.
 * 
 * Ejecuta la sentencia dentro del while mientras sea true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * Calcular suma.
 * */
public class Suma {
	public static void main ( String [] args ){
		int numero   = 4;
		int suma     = 0;
		int contador = 0;

		while ( contador <= numero ){
			
			suma += contador;  // suma = suma + contador
			contador++; //System.out.println ( "Valor del contador en el bucle " + contador++ ); 
						//mostraría el contador sin incrementar y posteriormente lo incrementaría
		
		}	
			System.out.println( "Valor del número " + numero );
			System.out.println( "Valor del contador " + contador );
			System.out.println( "Valor del suma " + suma );
		
	}
}
