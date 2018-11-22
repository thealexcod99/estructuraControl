public class Ejercicio2_1 {

	public static void imprimirDel1Al10() {
		
		for ( int i = 1; i <= 10; i++ ) 
			
			System.out.printf( "%d ", i );
		
		System.out.printf( "%n%n" );
	}
	
	public static void imprimirSerie1() {
		int numero1 = 20;
		
		do {
			
			System.out.printf( "%d ", numero1 );
			numero1 += 5;
			
		}
		while ( numero1 <= 80 );
		
		System.out.printf( "%n%n" );
	}
	
	public static void imprimirSerie2() {
		int numero2 = 100;
		
		while ( numero2 >= 50 ) {
		
			System.out.printf( "%d ", numero2 );
			numero2 -= 2;
			
		}
		System.out.printf( "%n%n" );
	}
	
	public static int sumaNNumeros( int n ) {
		int suma = 0;
		int i = 0;
		
		while ( i <= n ) {
			
			suma += i;
			i++;
		
		}
		System.out.printf( "La suma de los %d primeros números es %d%n%n", n, suma );

		return 0;
	}

	public static int sumaCuadradoNNumeros( int n ) {
		int suma = 0;
		int i = 0;
		
		do {
			
			suma += i*i;
			i++;
		
		}
		while ( i <= n );
			
		System.out.printf( "La suma de los cuadrados de los %d primeros números es %d%n%n", n, suma );

		return 0;
	}

	public static int sumaParesEImparesNNumeros( int n ) {
		int sumaPares = 0;
		int sumaImpares = 0;
		
		for ( int i = 0; i <= n; i++ ) {
		
			if ( i % 2 == 0 ) 
				
				sumaPares += i;
				
			else 
			
				sumaImpares += i;

		}
		System.out.printf( "La suma de los %d números pares es %d%n", n, sumaPares );
		System.out.printf( "La suma de los %d números impares es %d%n", n, sumaImpares );
		
		return 0;
	
	}
}
