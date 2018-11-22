/*Ejemplo de ejecución del bucle While.
 * 
 * Ejecuta la sentencia dentro del while mientras sea true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * Prueba con números 2.
 * */
public class EstructuraWhile3 {
	public static void main ( String [] args ){
		int numero = 10;
		
		while ( numero <= 100 ) {
			
			System.out.println( "Dentro del While " + numero );
			numero += 10;
		
		}
		System.out.println( "Valor de número: " + numero );
	}
}
