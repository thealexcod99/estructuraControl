import java.util.Scanner;

public class Escaner {

	public static void main(String [] args ) {
	
		Scanner sc = new Scanner( System.in );
		
		System.out.println( "Dame un número entero" );
		int numero = sc.nextInt();
		System.out.printf( "El número leído es %d%n", numero );
		
		System.out.println( "Dame una palabra" );
		String palabra = sc.next();
		System.out.printf( "La palabra leída es %s%n", palabra );
		
		System.out.println( "Dame un número real" );
		double numeroReal = sc.nextDouble();
		System.out.printf( "El número leído es %.2f%n", numeroReal );
		
		System.out.println( "Dame tres números enteros" );
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		System.out.printf( "Los números enteros leídos son %d--%d--%d%n", numero1, numero2, numero3 );
		
		//vamos a estar leyendo nº enteros hasta que aparezca un nº negativo
		
		sc.close(); //se cierra el Scanner Porque ya no lo voy a seguir usando
		//continuación del código por debajo
		
		System.out.println( "Vamos a sumar números:" );
		int suma = 0;
		int valorLeido = 0;
		int contadorPares = 0;
		
		
		while ( true ) {
		
			valorLeido = sc.nextInt();
			
			if ( valorLeido < 0 ) {

				break;
				
			}
			if ( valorLeido % 2 == 0 ) {
				
				contadorPares++;
				suma += valorLeido;
			}
			System.out.printf( "El valor de la suma de los nº leídos vale %d%n", suma );
			System.out.printf( "Nº pares leídos %d%n", contadorPares );
		}
		
		
		
	}
}
