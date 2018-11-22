/* Ejemplo de estructura switch.
 * 
 * Con argumentos.
 * */

public class EstructuraSwitch1 {

	public static void main( String [] args ) {
		
		if ( args.length < 2 ) { //controlamos que se introduzcan al menos dos argumentos.
		
				System.out.println( "Faltan argumentos" );
				return;  //sale del método donde se encuentra.
		}
		
		// String dia = "lunes" (manera inicial sin argumentos) [.toLowerCase ();] sentencia usada para pasar todo a minúscula. 
		String dia = args[0];  							//primer argumento
		int intervaloDias = Integer.parseInt( args[1]);	//segundo argumento y clase para pasar un argumento de tipo string a tipo int.	
		int valorDia;
		
		switch (dia) {
			
			case "lunes":
		
				valorDia = 1;
				break;
			
			case "martes":
		
				valorDia = 2;
				break;
		
			case "miércoles":
		
				valorDia = 3;
				break;
	
			case "jueves":
		
				valorDia = 4;
				break;

			case "viernes":
		
				valorDia = 5;
				break;
	
			case "sábado":
		
				valorDia = 6;
				break;
		
			case "domingo":
				
				valorDia = 7;
				break;
				
			default:
				
				valorDia = -1;
				break;
		}
		
		

		
		if (valorDia >= 0) {
			
			System.out.println( "Al dia " + dia + " le corresponde " + valorDia );			
			System.out.println( "Dentro de " + intervaloDias + " le corresponde " + ((intervaloDias + valorDia) % 7) );
		}
		else
			
			System.out.println( "\"" + dia + "\"" + " no es un día de la semana" );
		
	}
}
