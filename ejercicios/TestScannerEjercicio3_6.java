import java.util.Scanner;

public class TestScannerEjercicio3_6 {
	
	public static void main( String [] args ) {
	
		System.out.printf( "Solucionador de ecuaciones: %n" );
		System.out.printf( "Introduce los valores que corresponden a las posiciones de las letras %n" );
		System.out.printf( "{ a·x + b·y = e %n" );
		System.out.printf( "{ c·x + d·y = f %n%n" );
		
		Scanner sc = new Scanner( System.in );
			
		System.out.printf( "Introduce \"a\": " );
		double a = sc.nextDouble();
		System.out.printf( "Introduce \"b\": " );
		double b = sc.nextDouble();
		System.out.printf( "Introduce \"e\": " );
		double e = sc.nextDouble();
		System.out.printf( "Introduce \"c\": " );
		double c = sc.nextDouble();
		System.out.printf( "Introduce \"d\": " );
		double d = sc.nextDouble();
		System.out.printf( "Introduce \"f\": " );
		double f = sc.nextDouble();
		
			
		if ( Ejercicio3_6.ecuacionResoluble( a, b, c, d ) ) {
			
			double x = Ejercicio3_6.resolverEcuacionX( a, b, c, d, e, f );
			
			double y = Ejercicio3_6.resolverEcuacionY( a, b, c, d, e, f );
			
			System.out.printf( "Solución x = %.2f e y = %.2f%n", x, y );
			
		}
		else {
		
			System.out.printf( "%nLa ecuación no es resoluble.%n%n" );
			//return;
		
		}
	}
}
