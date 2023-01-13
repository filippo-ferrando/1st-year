/**
 * Calcolo del Massimo Comun Divisore di due numeri naturali 
 * {@code x} e {@code y}.
 */
public class MCDTriploCiclo {

  public static void main(String[] args) {
		
	int a = 18;
	int b = 12;
	/* MCD(a,b)==MCD(x,y) */

	while (a != b) {
	  /*
	   * a!=b && MCD(a,b)==MCD(x,y) (invariante) implica (a>b || a<b) &&
	   * MCD(a,b)==MCD(x,y)
	   */

	  while (a > b) {
		/*
		 * a>b implica MCD(a-b,b)==MCD(a,b)==MCD(x,y)
		 */
		a = a - b;
		/* MCD(a,b)==MCD(x,y) */
	  }
	  /* MCD(a,b)==MCD(x,y) && b>=a */

	  while (b > a) {
		/*
		 * b>a implica MCD(a,b-a)==MCD(a,b)==MCD(x,y)
		 */
		b = b - a;
		/* MCD(a,b)==MCD(x,y) */
	  }

	  /*
	   * MCD(a,b)==MCD(x,y) && a>=b che implica MCD(a,b)==MCD(x,y)
	   */
	 }
	 /*
	  * a==b && MCD(a,a)==MCD(x,y) && MCD(a,a)==a implica a==MCD(x,y)
	  */
	 System.out.println("L'MCD tra " + a + " e " + b + " e' " + a + ".");
	}
}
