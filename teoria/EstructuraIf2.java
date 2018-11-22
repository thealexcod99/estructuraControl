/*Ejemplo de ejecución del ámbito if.
 * 
 * Ejecuta la sentencia dentro del if porque es true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * If + else
 * */

public class EstructuraIf2 {
	public static void main ( String [] args ){
	
		int numero = 12;
		
		//para numero > 10 es true, por lo que se ejecuta la sentencia del if
		//para numero > 100 es false, por lo que se ejecuta la sentencia del else
		if ( numero > 10 ) {
			
			System.out.println( "Dentro del ámbito del if" );
		}
		else{
			
			System.out.println( "Dentro del ámbito del else" );
		}
		
		System.out.println( "Fuera del ámbito del if-else" );
	}
}
