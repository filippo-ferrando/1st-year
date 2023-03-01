/**
 * Produce l'emersione del valore massimo tra {@code a}, 
 * {@code b} e {@code c} nella variabile {@code c}.
 */
public class EmersioneMaxTreElementi {
	public static void main(String[] args) {
		int a = 5; // inizializzazioni
		int b = 4;
		int c = 3;

		if (a > b) { // scambio a con b
			int t = a;
			a = b;
			b = t;
			if (b > c) { // scambio b con c
				t = b;
				b = c;
				c = t;
			} else { // non scambio b con c
			}
		} else { // non scambio a con b
			if (b > c) { // scambio b con c
				int t = b;
				b = c;
				c = t;
			} else { // non scambio b con c
			}
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
