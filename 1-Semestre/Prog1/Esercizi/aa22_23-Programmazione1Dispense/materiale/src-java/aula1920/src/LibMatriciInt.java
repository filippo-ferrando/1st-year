import java.util.Arrays;

/**
 * Raccolta di metodi utili per la definizione delle classi {@link Permutazioni}
 * e {@link Disposizioni}.
 */
public class LibMatriciInt {

	// *******************************
	// *** Metodi su matrici di interi
	// *******************************

	/**
	 * Costruttore della lista di liste di interi vuota.
	 * 
	 * @return lista di liste di interi vuota.
	 */
	public static int[][] nilMatInt() {
		return new int[0][0];
	}

	/**
	 * Dati un array di interi {@code a} ed una matrice {@code m} di array di
	 * interi aggiunge {@code a} in ultima posizione di {@code m}.
	 * 
	 * @param a
	 *            array di interi.
	 * @param m
	 *            matrice di interi.
	 * @return m con a in ultima posizione.
	 */
	public static int[][] consMatInt(int[] a, int[][] m) {
		int[][] r = new int[m.length + 1][a.length];
		/*
		 * per ogni righa i, copia m[i].length elementi di m, partendo da 0, in
		 * r[i+1], partendo da 0.
		 */
		for (int i = 0; i < m.length; i++)
			System.arraycopy(m[i], 0, r[i], 0, m[i].length);

		// copia a nell'ultimo elemento di r.
		System.arraycopy(a, 0, r[r.length - 1], 0, a.length);
		return r;
	}

	/**
	 * Dati un array di interi {@code a} ed una matrice ragged 
	 * {@code m} di array di interi aggiunge {@code a} in ultima 
	 * posizione di {@code m}.
	 * 
	 * @param a
	 *            array di interi.
	 * @param m
	 *            matrice ragged di interi.
	 * @return matrice ragged di interi con a in ultima posizione.
	 */
	public static int[][] consMatRaggedInt(int[] a, int[][] m) {
		int[][] r = new int[m.length + 1][];

		/*
		 * per ogni riga di m, copia il puntatore m[i] in r[i].
		 */
		for (int i = 0; i < m.length; i++)
			r[i] = m[i];

		// copia a nell'ultimo elemento di r.
		r[r.length - 1] = a;
		return r;
	}	
	
	/**
	 * Dati un elemento {@code e} ed una matrice di interi {@code m} restituisce
	 * una copia di {@code m} in cui ogni riga è stata estesa con {@code e} in
	 * ultima posizione.
	 * 
	 * @param e
	 *            elemento intero.
	 * @param m
	 *            matrice di interi.
	 * @return copia di m in cui ogni riga è estesa con {@code e} in ultima
	 *         posizione.
	 */
	public static int[][] consElMatInt(int e, int[][] m) {
		if (m.length == 0)
			// costruisce una lista con e e poi una lista di una lista con e
			return consMatInt(LibListeArr.consInt(e,LibListeArr.nilInt()),nilMatInt());
		else {
			for(int i = 0;i < m.length; i++){
				m[i] = LibListeArr.consInt(e, m[i]);
			}
			return m;
		}
	}

	/**
	 * Dati un array {@code a} ed una matrice di interi {@code m} 
	 * anche ragged, verifica l'esistenza di {@code a} in {@code m}. 
	 * Metodo ricorsivo.
	 * 
	 * @param a
	 *            array di interi.
	 * @param m
	 *            matrice di interi.
	 * @return true de a occorre in m. false altrimenti.
	 */
	public static boolean inElMatInt(int[] a, int[][] m) {
		if (m.length == 0)
			return false;
		else {
			int[] mTesta = headMatInt(m);
			int[][] mCoda = tailMatInt(m);
			if(a.length==mTesta.length)
				return Arrays.equals(a, mTesta)
						|| inElMatInt(a, mCoda);
			else 
				return inElMatInt(a, mCoda);
		}
	}

	/**
	 * Date due matrici di interi {@code m} ed {@code n} restituisce una nuova
	 * matrice risultante dall'accodamento di (@code n} ad {@code m}. Metodo
	 * ricorsivo sul secondo elemento.
	 * 
	 * @param m
	 *            matrice di interi.
	 * @param n
	 *            matrice di interi.
	 * @return matrice con n accodata ad m.
	 */
	public static int[][] concatMatInt(int[][] m, int[][] n) {
		if (n.length == 0) {
			return m;
		} else {
			int[] nTesta = headMatInt(n);
			int[][] nCoda = tailMatInt(n);
			int[][] mNCoda = concatMatInt(m,nCoda);
			return consMatInt(nTesta, mNCoda);
		}
	}

	/**
	 * Date due matrici ragged di interi {@code m} ed {@code n}
	 * restituisce la matrice ragged ottenuta concatenando
	 * la seconda alla prima.
	 * 
	 * @param m
	 *            array ragged di interi.
	 * @param n
	 *            array ragged di interi.
	 * @return concatenazione di n ad m.
	 */
	public static int[][] concatMatRaggedInt(int[][] m, int[][] n) {
		int[][] r = new int[m.length + n.length][];
		int rR = 0;
		/*
		 * per ogni riga di m, copia il puntatore m[i] in r[rR].
		 */
		for (int i = 0; i < m.length; i++) {
			r[rR] = m[i];
			rR++;
		}

		/*
		 * per ogni riga di n, copia il puntatore n[i] in r[rR].
		 */
		for (int i = 0; i < n.length; i++) {
			r[rR] = n[i];
			rR++;
		}
		
		return r;
	}
	
	/**
	 * Data una matrice non vuota {@code m} di aray si interi 
	 * elimina l'array in ultima posizione di {@code m}.
	 * È scritta per funzionare anche su matrici ragged.
	 * @param m
	 *            array
	 * @return m senza il suo primo elemento
	 */
	public static int[][] tailMatInt(int[][] m) {
		int[][] r = new int[m.length - 1][];
		
		for (int i = 0; i < r.length; i++)
			r[i] = m[i];
		return r;
	}

	/**
	 * Data una matrice non vuota {@code m} di array di interi
	 * restituisce l'array in ultima posizione.
	 * 
	 * @param m
	 *            matrice
	 * @return primo array di m
	 */
	public static int[] headMatInt(int[][] m) {
		return m[m.length - 1];
	}

	/**
	 * Data una matrice di interi ed un indice {@code c}, restituisce una
	 * matrice identica a quella data senza la colonna di posizione {@code c}.
	 * Metodo ricorsivo.
	 */
	public static int[][] cancellaColMatInt(int[][] m, int c) {
		if (m.length == 0) {
			return m;
		} else { // m.length > 0
			int[] mTesta = headMatInt(m);
			int[][] mCoda = tailMatInt(m);
			int[][] mCodaSenzaC = cancellaColMatInt(mCoda, c);
			int[] mTestaSenzaC = LibListeArr.cancellaPosInt(mTesta, c);
			return consMatInt(mTestaSenzaC, mCodaSenzaC);
		}
	}

	// ************************
	// *** Metodi 'di servizio'
	// ************************

	public static String toStringMatInt(int[][] m) {
		String s = "";
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				s = s + m[r][c];
			s = s + "\n";
		}
		return s;
	}

	public static String toString(int[] a) {
		String s = "";
		for (int r = 0; r < a.length; r++)
			s = s + a[r];
		return s;
	}
	
	public static boolean equalsMatInt(int[][] a, int[][] b) {
		boolean uguali = a.length==b.length;
		if(uguali) {
			for(int r=0;r<a.length && uguali;r++) {
				uguali = Arrays.equals(a[r],b[r]);
			}
		}
	  	return uguali;
	}
}