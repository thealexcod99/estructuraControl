import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main( String [] args ) {
	
		Scanner sc = new Scanner( System.in );
		
		System.out.print( "Introduce tu nombre con apellidos: " );
		String nombreLeido = sc.nextLine();
		sc.close();
		System.out.printf( "%n Hola %s%n", nombreLeido );
		
	}
}
