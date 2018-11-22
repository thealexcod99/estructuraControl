/*Ejemplo de ejecución del ámbito if.
 * 
 * Ejecuta la sentencia dentro del if porque es true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * */

public class EstructuraIf1 {
	public static void main ( String [] args ){
	
		int numero = 12;
		
		//para numero > 0 es true, pero para numero > 100 es false.
		if ( numero > 100 ) {
			
			System.out.println( "Dentro del ámbito del if" );
		}
		
		System.out.println( "Fuera del ámbito if" );
	}
}
