/**Ejemplo de ejecución del bucle While y For.
 * 
 * Ejecuta la sentencia dentro del while mientras sea true,
 * si es false se salta esa sentencia y pasaría a la siguiente.
 * 
 * Calcular factorial por funciones (declaración de la función).
 * 
 * @author Alejandro Álvarez
 * @version 1.0
 * */

public class Factorial2 {
	
	/**Método calcularFactorial para calcular el factorial de un número mediante un while.
	 * 
	 * @param numero a calcular su factorial.
	 * @return resultado del factorial de numero. 
	 */ 
	public static long calcularFactorial ( int numero ) {
		int contador = 1;
		long factorial = 1;
		
		while ( contador <= numero ) {
		
			factorial *= contador;
			contador++;
		}
		
		return factorial;
	}
	/**Método calcularFactorial1 para calcular el factorial de un número mediante un for.
	 * 
	 * @param numero a calcular su factorial.
	 * @return resultado del factorial de numero. 
	 */ 
	public static long calcularFactorial1 ( int numero) {
		long factorial = 1;
		
		for (int i = 2; i <= numero; i++ ) //el contador se inicializa a 2 porque es el primer valor que cambia
										   //y nos ahorramos la entrada al for para el !1 que es 1 (el valor del factorial).
			factorial *= i;
			
		return factorial;
	}
}
