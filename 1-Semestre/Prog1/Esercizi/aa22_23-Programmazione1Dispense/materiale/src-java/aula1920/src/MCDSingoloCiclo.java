/**
 * Calcolo del Massimo Comun Divisore di due numeri naturali {@code x} e {@code y}.
 * sfruttando iterativamente le proprieta' {@code x>y ==> MCD(x,y)==MCD(x-y,y)} e 
 * {@code MCD(x,x)==x} in cun sol ciclo.
 */
public class MCDSingoloCiclo {

	public static void main(String[] args) {
		
		System.out.println("Primo fattore? (x>0)");
	    int x = SIn.readInt();
		System.out.println("Secondo fattore? (y>0)");
		int y = SIn.readInt();
		int a = x;
		int b = y;
		
		/* MCD(a,b)==MCD(x,y) */
		while (a != b) {
		  /*
		   * a!=b && MCD(a,b)==MCD(x,y) (invariante) implica (a>b || a<b) &&
	   	   * MCD(a,b)==MCD(x,y)
		  */

		  if (a > b) {
			/*
			 * a>b implica MCD(a-b,b)==MCD(a,b)==MCD(x,y)
			 */
			a = a - b;
			/* MCD(a,b)==MCD(x,y) */
		  }

		  if (b > a) {
			/*
			 * b>a implica MCD(a,b-a)==MCD(a,b)==MCD(x,y)
			 */
			b = b - a;
			/* MCD(a,b)==MCD(x,y) */
		  }
		}
		/*
		 * a==b && MCD(a,a)==MCD(x,y) && MCD(a,a)==a implica a==MCD(x,y)
		 */
		 System.out.println("L'MCD tra " + x + " e " + y + " e' " + a + ".");
	}
}
