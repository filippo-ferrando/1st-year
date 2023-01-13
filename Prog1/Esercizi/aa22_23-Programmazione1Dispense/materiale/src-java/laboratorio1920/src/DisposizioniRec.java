/**
 * Fornisce un metodo completamente ricorsivo, che segue la definizione:
 * 
 * <pre>
 * {@code d(n,k) = n/(n-k) * d(n-1,k)}
 * </pre>
 *
 * per calcolare il numero di disposizioni semplici di {@code n} elementi presi
 * a sequenze di {@code k} elementi.
 */

public class DisposizioniRec {

    /**
	 * La funzione disp calcola il numero di disposizioni semplici di {@code n}
	 * elementi presi a sequenze di {@code k} elementi.
	 * <p>
	 * Il metodo non puo' essere considerato completamente
	 * ricorsivo, perche' non segue la definizione:
	 * <pre>
	 * {@code d(n,k) = n/(n-k) * d(n-1,k)}
	 * </pre>
	 * 
	 * @param n
	 *            intero di cui calcolare il numero di disposizioni
	 * @param k
	 *            dimensione delle sequenze
	 * @return numero di disposizioni
	 */
	public static int disp(int n, int k) {
		int r = 1;
		if (n == k)
			return fatt(k);
		else {
			/* e' fondamentale rispettare l'ordine di applicazione
			 * delle operazioni che segue. Ad esempio, scrivendo
			 * return n/(n-k) * disp(n-1,k)
			 * in generale il risultato non e' corretto perche' si
			 * applicano le operazioni in modo da introdurre approssimazioni.
			 */
			int frazioneIntera = disp(n - 1, k)/(n-k);
			r = n * frazioneIntera;
			return r; 
		}
	}

	private static int fatt(int n) {
		if (n == 0)
			return 1;
		else
			return n * fatt(n - 1);
	}

	public static void main(String[] args) {

		System.out.println("disp(3,2) = " + disp(3, 2) + ", atteso 6.");
		System.out.println("disp caso " + disp(8, 5) + ", atteso 6720.");
	}
}
