/*Ejemplo de ejecución del bucle While.
 * 
 * Ejecuta la sentencia dentro del while mientras sea true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * Prueba con números 1.
 * */
public class EstructuraWhile2 {
	public static void main ( String [] args ){
		int numero = 0;
		
		while ( numero < 3 ) {
			
			System.out.println( "Dentro del While " + numero );
			numero++;
		
		}
		System.out.println( "Valor de número: " + numero );
	}
}
