import java.util.Scanner;

public class Escaner1 {

	public static void main( String [] args ) {
	
	Scanner sc = new Scanner( System.in );
	
	System.out.println( "Introduce una frase" );
	String linea = sc.nextLine();
	System.out.printf( "Linea leida en mayúsculas %S%n", linea );
	
	System.out.println( "Introduce una serie de números" );
	
	int numeroLeido = 0;
	int acumulador = 0;
	
	while ( sc.hasNextInt() ) {
	
		numeroLeido = sc.nextInt();
		acumulador += numeroLeido;
	}
	System.out.printf( "El valor del acumulador es %d%n", acumulador );
	
	}
}

