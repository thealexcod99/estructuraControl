/*Ejemplo de ejecución del bucle While.
 * 
 * Ejecuta la sentencia dentro del while mientras sea true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * Prueba con números y puertas lógicas.
 * */
public class EstructuraWhile4 {
	public static void main ( String [] args ){
		int numero = 7;
		
		while ( !(( numero <= 100 ) && ( numero % 2 == 0 )) ){
			
			System.out.println( "Dentro del While " + numero );
			numero += 19;
		
		}
		System.out.println( "Valor de número: " + numero );
	}
}
