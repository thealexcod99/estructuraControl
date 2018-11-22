public class ComputaArea {
	public static void main ( String [] args ){
		
		int radio = 5;
		
		//si es negativo, no calculamos area, mostramos mensaje
		
		if ( radio > 0 ) {
			double area = Math.PI * Math.pow( radio, 2.0 ); //Para ciertos calculos accedemos a la libreria Math
			System.out.println( "El area del circulo de radio " + radio + " vale " + area );
			
		}	else {
				System.out.println( "No calculo areas de radio negativo" );
			
			}
			
	}
}
