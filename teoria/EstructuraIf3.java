/*Ejemplo de ejecución del ámbito if.
 * 
 * Ejecuta la sentencia dentro del if porque es true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * If + else if + else
 * */

public class EstructuraIf3 {
	public static void main ( String [] args ){
	
		int numero = 100;
		
		if ( numero >= 10 && numero <= 100 ){  //la llaves ( {} ) son obligatorias para más de una sentencia
			
			System.out.println( numero + " --> número mayor o igual que 10 y menor o igual que 100" );
			System.out.println( "Esta sería la segunda sentencia por lo que el if necesita dos llaves ( {} )" );
		}
		else if ( numero > 100 ) //aqui solo hay una sentencia por lo que se podrían omitir las llaves ( {} ) 
			
			System.out.println( numero + " --> número mayor que 100" );
		
		else{
			
			System.out.println( numero + " --> número menor que 10" );
		}
		
		System.out.println( "Fuera del ámbito del if-else" );
	}
}
