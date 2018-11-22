public class TestEjercicio2_1 {

	public static void main( String [] args ) {
		int n = 10;
		
		System.out.printf( "Números del 1 al 10%n" );
		Ejercicio2_1.imprimirDel1Al10();
		
		System.out.printf( "Números del 20 al 80 sumando 5%n" );
		Ejercicio2_1.imprimirSerie1();
		
		System.out.printf( "Números del 100 al 50 restando 2%n" );
		Ejercicio2_1.imprimirSerie2();
		
		Ejercicio2_1.sumaNNumeros( n );
		
		Ejercicio2_1.sumaCuadradoNNumeros( n );
		
		Ejercicio2_1.sumaParesEImparesNNumeros( n );
	}
}
