/*Ejemplo de ejecución del bucle While.
 * 
 * Ejecuta la sentencia dentro del while mientras sea true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * Calcular factorial todo en la misma clase.
 * */

public class Factorial1 {
	public static void main ( String [] args ) {
		int numero = 8;
		int contador = 1;
		long factorial = 1; //también llamado acumulador porque acumula el resultado de cada bucle.
		
		/*
		if ( numero >= 0 ){
			while ( ( contador <= numero ) && ( numero != 0 ) ) {
			
					factorial *= contador;
					contador++;
					
			}
			System.out.println( "El factorial de " + numero + " es " + factorial );
		}
		else
		System.out.println( "El Factorial de un Número Negativo no existe" );
		*/ 
		
		//manera del profesor, con un System.exit(1); el numero sirve para identificar de donde viene el error.
		if ( numero < 0 ){
			
			System.out.println( "El Factorial de un Número Negativo no existe" );
			System.exit(1); //forzamos al programa a cerrarse.
			
		}
		while ( ( contador <= numero ) && ( numero != 0 ) ) {
		
				factorial *= contador;
				contador++;
				
		}
		System.out.println( "El factorial de " + numero + " es " + factorial );
	}
}
