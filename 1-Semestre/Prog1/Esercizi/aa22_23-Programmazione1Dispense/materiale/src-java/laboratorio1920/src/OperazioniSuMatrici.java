/**
 * Raccolta di alcune potenziali soluzioni (scritte di getto)
 * ad esercizi proposti su matrici.
 * @author rover
 *
 */
public class OperazioniSuMatrici {
	
	/**
	 * Riversa l'intero contenuto della matrice in una stringa.
	 *
	 * @return serializzazione.
	 */
	public static String toString(int[][] m) {

		String m2String = "";

		for (int i = 0; i < m.length; i++) {
			m2String = m2String + "{";
			for (int j = 0; j < m[i].length; j++) {
				if (j == m[i].length - 1)
					m2String = m2String + m[i][j];
				else
					m2String = m2String + m[i][j] + ",";
			}
			if (i == m.length - 1)
				m2String = m2String + "}";
			else
				m2String = m2String + "},\n";
		}
		return m2String;
	}


	/**
	 * Determina se {@code m} e' quadrata.
	 *
	 * @return {@code true} se {@code m} e' quadrata. {@code false}
	 * altrimenti.
	 */
	public static boolean quadrata(int[][] m) {

        boolean quadrata = true;

		for (int r = 0; r < m.length && quadrata; r++)
				quadrata = (m.length == m[r].length);

		return quadrata;
	}

	/**
	 * Determina se {@code m} e' ragged, ovvero sfrangiata.
	 *
	 * @return {@code true} se {@code m} e' ragged. {@code false}
	 * altrimenti.
	 */
	public static boolean ragged(int[][] m) {

        boolean ragged = false;

		for (int rPrimo = 0; rPrimo < m.length - 1 && !ragged; rPrimo++)
			for (int rSecondo = rPrimo + 1; rSecondo < m.length && !ragged; rSecondo++)
				ragged = (m[rPrimo].length != m[rPrimo].length);

		return ragged;
	}

	/**
	 * Restituisce un'array {@code int[]} con i valori della diagonale
	 * principale di {@code m}, se possibile
	 *
	 * @return array con gli elementi della diagonale principale,
	 *         se {@code m} e' una matrice quadrata. 
	 *         Altrimenti, il risultato e' un puntatore ad un array vuoto.
	 */
	public static int[] diagonalePrincipale(int[][] m) {

		int[] dP = new int[0];
		
		if (quadrata(m)) {
			dP = new int[m.length];
			for (int i = 0; i < m.length; i++)
				dP[i] = m[i][i];
		}

		return dP;
	}
	
	/**
	 * Restituisce un'array {@code int[]} con i valori della diagonale 
	 * secondaria di {@code m}, se possibile.
	 *
	 * @return array con gli elementi della diagonale secondaria,
	 *         se {@code m} è una matrice quadrata. Altrimenti, 
	 *         il risultato e' un puntatore ad un array vuoto.
	 */
	public static int[] diagonaleSecondaria(int[][] m) {

		int[] dS = new int[0];

		if (quadrata(m)) {
			// la matrice è quadrata.
			dS = new int[m.length];

			int c = m[0].length - 1;
			for (int r = 0; r < m.length; r++) {
				dS[r] = m[r][c];
				c--;
			}
		}
		return dS;
	}

	
	/**
	 * Calcola la matrice prodotto tra {@code a} e {@code b}. 
	 * L'ipotesi e' che {@code a} sia {@code n x p} e {@code b} 
	 * sia {@code p x m}.
	 *
	 * @return matrice {@code n x m} prodotto tra {@code a} e {@code b}.
	 */
	public static int[][] per(int[][] a, int[][] b) {

		int[][] p = new int[a.length][b[0].length];

		for (int r = 0; r < a.length; r++)
			for (int c = 0; c < b[0].length; c++) {

				int v = 0;
				for (int i = 0; i < a[0].length; i++) {
					v = v + a[r][i] * b[i][c];
				}

				p[r][c] = v;
			}

		return p;
	}
}
