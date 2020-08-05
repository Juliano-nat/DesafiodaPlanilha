package desafiodaplanilha;

public class Funcoes {
	
	public static Double jopsoma(Double x) {
		Double num = 0.0;
		Double num2 = 0.0;		
		x = num + num2;	
		return x;		
	}

	public static void main(String[] args) {
		
		 int[] numbers = { 4500, 5040, 5696, 6250, 7000, 7910, 3300, 12341 };
	        int min = 0, max = 0, total = 0;
		

	        for ( int n: numbers ) {
	            if ( n < min ) min = n;

	            if ( n > max ) max = n;

	            if ( n > 0 ) total += n;
	        }
		
	        System.out.printf( "Min: %d\nMax: %d\nTotal: %d\n", min, max, total );
		
	}
	
}
