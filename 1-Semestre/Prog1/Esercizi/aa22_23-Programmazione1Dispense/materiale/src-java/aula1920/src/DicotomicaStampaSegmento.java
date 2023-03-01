/**
 * Stampa dei primi n numeri naturali con metodi dicotomici.
 * 
 * @author rover
 */
public class DicotomicaStampaSegmento {

	private static int divSup(int n) {
		return (n % 2 == 0) ? n / 2 : n / 2 + 1;
	}

	private static void stampa(int s, int d) {
		if (s >= d) {}
		else if (s + 1 == d)
			System.out.print(s + " ");
		else {
			stampa(s, divSup(s + d));
			stampa(divSup(s + d), d);
		}
	}

	private static void stampa(int n) {
		stampa(0,n);
		System.out.println();
	}

	public static void main(String[] args) {
		for(int n = 0; n <= 10 ; n++)
		   stampa(n);
	}
}
