/**
 * Fornisce un metodo ricorsivo per calcolare il numero
 * di combinazioni di un certo numeo di elementi, presi
 * da un insieme di elementi disponibili.
 */
public class CoeffBinomialeRec {

	/**
	 * Numero di combinazioni di {@code n} elementi
	 * presi ad insiemi di {@code k} elementi.
	 * 
	 * @param n
	 *            intero di cui calcolare il numero di combinazioni
	 * @param k
	 *            dimensione degli insiemi
	 * @return numero di combinazioni
	 */
	public static int binom(int n, int k) {
		if (k == 0 || n == k)
			return 1;
		else
			return binom(n - 1, k - 1) + binom(n - 1, k);
	}
}
