/**
 * Soluzione possibile a MIDP.
 * Ovvero, sottrazione di un numero naturale, contenuto nella
 * variabile {@code b} da uno contenuto nella variabile
 * {@code a}. E' realizzata come iterazione del predecessore, 
 * perche' assumiamo di non saper sottrarre che una sola unita'
 * da un qualsiasi numero dato.
 */
public class DifferenzaPredecessoreIterato {

	public static void main(String[] args) {

		int a = 3; // Minuendo
		int b = 2; // Sottraendo

		while (b > 0) {

			a = a - 1; 
			b = b - 1;
		}

		System.out.println("Risultato = " + a);
	}
}