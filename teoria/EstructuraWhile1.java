/*Ejemplo de ejecución del bucle While.
 * 
 * Ejecuta la sentencia dentro del while mientras sea true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * Prueba con boolean.
 * */
public class EstructuraWhile1 {
	public static void main ( String [] args ){
		boolean variable = true;
		
		while ( variable ) {
			
			System.out.println( "Dentro del While" );
			variable = false;
		
		}
		System.out.println( "Fuera del While" );
	}
}
