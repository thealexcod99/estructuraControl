/** 
 * Métodos para calcular la solución de la ecuación
 * 
 * <br> {a·x + b·y = e
 * <br> {c·x + d·y = f
 * 
 * @author "Alejandro A."
 **/

public class Ejercicio3_6 {
	
	/** Método que comprueba si la ecuación recibida es resoluble.
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * <br><br>
	 * @return devuelve un boolean indicando si es resoluble o no
	 */
	public static boolean ecuacionResoluble( double a, double b, double c, double d ) {
		
	/*  if ( ((a * d) - (b * c)) != 0 ) 
			return true;
		else 
			return false;  */
		
		// pasar de la forma de arriba a la de abajo se llama refactorizar.
		
		return ((a * d) - (b * c)) != 0.0 ; // se pone 0.0 para asegurar que no da errores al trabajar con doubles
			
	}
	
	/** Método que resuelve la incógnita x de la ecuación.
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 * <br><br>
	 * @return devuelve un double con el valor de la x obtenida mediante la fórmula matemática de Cramer.
	 */	
	public static double resolverEcuacionX( double a, double b, double c, double d, double e, double f) {	
		
	//  x = ((e*d - b*f) / (a*d - b*c));
	//  System.out.printf( "El resultado de la ecuación es x = %.2f", x );
		
		return ((e*d - b*f) / (a*d - b*c));
	
	}
	
	/** Método que resuelve la incógnita y de la ecuación.
	 * @param a 
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 * <br><br>
	 * @return devuelve un double con el valor de la y obtenida mediante la fórmula matemática de Cramer.
	 */
	public static double resolverEcuacionY( double a, double b, double c, double d, double e, double f ) {	
		
	//  double y = ;
	//	System.out.printf( " e y = %.2f%n", y );
		
		return ((a*f - e*c) / (a*d - b*c));
	
	}
}
