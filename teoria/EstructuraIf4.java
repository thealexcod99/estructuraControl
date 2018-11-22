/*Ejemplo de ejecución del ámbito if.
 * 
 * Ejecuta la sentencia dentro del if porque es true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * If anidados.
 * */

public class EstructuraIf4 {
	public static void main ( String [] args ){
	
		int numero = -3;
		
		if ( numero >= 10 && numero <= 100 ){
			
			System.out.println( numero + " --> número mayor o igual que 10 y menor o igual que 100" );
			
			if ( numero % 2 == 0 ){ //ámbito if anidado de otro ámbito if
				
				System.out.println( numero + " es par" );
			}
			else {
				
				System.out.println( numero + " es impar" );
			}
		}
		else if ( numero > 100 ){ 
			
			System.out.println( numero + " --> número mayor que 100" );
			
			if ( numero < 1000 ){
					
				System.out.println( numero + " --> número menor que 1000" );
			}
			else {
				
				System.out.println( numero + " --> número mayor que 1000" );
			}
		}
		else {
			
			System.out.println( numero + " --> número menor que 10" );
			
			if ( numero < 0 ){
					
				System.out.println( numero + " es negativo" );
			}
			else {
				
				System.out.println( numero + " es positivo" );
			}
			if ( numero % 2 != 0 ){
				
				System.out.println( numero + " es impar" );
				
				if ( numero % 3 == 0 ){
					
					System.out.println( numero + " es divisible por 3" );
				}
			}
		}
		
		System.out.println( "Fuera del ámbito del if-else" );
	}
}
