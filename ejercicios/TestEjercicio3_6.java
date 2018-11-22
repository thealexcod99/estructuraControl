public class TestEjercicio3_6 {
	
	public static void main( String [] args ) {
		
		if ( args.length < 6 ) {
			
			System.out.printf( "Faltan argumentos%n" );
			System.exit(1);
			
		}	
		else if ( args.length > 6 ) {
			
			System.out.printf( "Sobran argumentos%n" );
			System.exit(2);
			
		}
		else {
			
			double a = Double.parseDouble( args[0] );
			double b = Double.parseDouble( args[1] );
			double e = Double.parseDouble( args[2] );
			double c = Double.parseDouble( args[3] );
			double d = Double.parseDouble( args[4] );
			double f = Double.parseDouble( args[5] );
			
			
		/*	Forma de declarar las variables si no se introducen por argumentos
		 * 
		 * 	double a = 2;
			double b = 1;
			double c = -1;
			double d = 2;
			double e = 7;
			double f = -1; */
			
				
			if ( Ejercicio3_6.ecuacionResoluble( a, b, c, d ) ) {
			
				double x = Ejercicio3_6.resolverEcuacionX( a, b, c, d, e, f );
				
				double y = Ejercicio3_6.resolverEcuacionY( a, b, c, d, e, f );
				
				System.out.printf( "Solución x = %.2f e y = %.2f%n", x, y );
				
			}
			else 
			
				System.out.printf( "La ecuación no es resoluble.%n%n" );
		
		}
	}
}
