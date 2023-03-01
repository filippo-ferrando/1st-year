/**
 * La funzione binom calcola il numero di combinazioni di {@code n} elementi
 * presi ad insiemi di {@code k} elementi.
 */
public class CoeffBinomialeRec {

	/**
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

	public static void main(String[] args) {

		final int LIMITE = 3;
		
		int n = 0;
		while (n <= LIMITE) {

			int k = 0;
			while (k <= n) {
				System.out.println("C(" + n + " " + k + ") = " + binom(n, k) );
				k++;
			}
			n++;
		}
	}
}