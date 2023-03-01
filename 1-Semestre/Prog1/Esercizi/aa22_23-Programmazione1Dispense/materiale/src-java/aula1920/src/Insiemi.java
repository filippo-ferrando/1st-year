public class Insiemi {

	/**
	 * Insieme vuoto.
	 * 
	 * @return array di booleani senza elementi.
	 */
	public static boolean[] vuoto() {
		return new boolean[0];
	}

	/**
	 * Dati due insiemi {@code x} e {@code y}, restituisce l'insieme unione. Il
	 * risultato ha tanti elementi quanti sono quelli dell'array piu' lungo tra
	 * {@code x} ed {@code y}.
	 * 
	 * @param x
	 *            primo insieme
	 * @param y
	 *            secondo insieme
	 * @return insieme unione di x e y
	 */
	public static boolean[] un(boolean[] x, boolean[] y) {
		// determina chi sia il piu' lungo
		int max = x.length;
		int min = y.length;
		if (y.length > max) {
			max = y.length;
			min = x.length;
		}

		// risultato sufficientemente capiente
		boolean[] u = new boolean[max];

		// unione della parte comune
		for (int i = 0; i < min; i++)
			u[i] = x[i] || y[i];

		// unione della parte non comune, se esiste
		if (x.length > y.length)
			for (int i = min; i < x.length; i++)
				u[i] = x[i];
		if (y.length > x.length)
			for (int i = min; i < y.length; i++)
				u[i] = y[i];

		return u;
	}

	/**
	 * Dati due insiemi {@code x} e {@code y}, restituisce l'insieme
	 * intersezione. Il risultato ha tanti elementi quanti sono quelli
	 * dell'array piu' corto tra {@code x} ed {@code y}.
	 * 
	 * 
	 * @param x
	 *            primo insieme.
	 * @param y
	 *            secondo insieme.
	 * @return insieme intersezione di x e y.
	 */
	public static boolean[] in(boolean[] x, boolean[] y) {
		// determina chi sia il piu' corto
		int max = x.length;
		int min = y.length;
		if (y.length > max) {
			max = y.length;
			min = x.length;
		}

		// risultato sufficientemente capiente
		boolean[] u = new boolean[min];

		// interszione della parte comune
		for (int i = 0; i < min; i++)
			u[i] = x[i] && y[i];

		return u;
	}

	/**
	 * Dato un insieme {@code x}, dato un indice di partenza {@code p} su
	 * {@code x} e data un'ampiezza {@code a} restituisce il numero di elementi
	 * {@code ==true} in {@code x} tra le posizioni {@code p} e
	 * {@code p + a - 1} estremi inclusi.
	 * 
	 * @param x
	 *            insieme
	 * @param p
	 *            posizione di partenza per contare
	 * @param a
	 *            ampiezza della porzione di x da visitare
	 * @return numero di elementi verio di x tra p e p+a-1.
	 */
	public static int numeroElTrue(boolean[] x, int p, int a) {
		int occorrenze = 0;
		for (int j = p; j < p + a && j < x.length; j++)
			if (x[j])
				occorrenze++;
		return occorrenze;
	}

	/**
	 * Dati un insieme {@code x}, un indice di partenza {@code p} su {@code x},
	 * un'ampiezza {@code a} ed un numero {@code n}, restituisce l'array con i
	 * primi {@code n} indici degli elementi {@code == true} di {@code x}
	 * compresi tra le posizioni {@code p} e {@code p+a-1}.
	 * 
	 * @param x
	 *            insieme.
	 * @param p
	 *            posizione di partenza.
	 * @param a
	 *            ampiezza della porzione di x da visitare.
	 * @param n
	 *            numero di elementi a true da contare.
	 * @return array di indici di elementi a true di x.
	 */
	public static int[] indiciSub(boolean[] x, int p, int a, int n) {
		// sottoinsieme degli indici degli elementi di x a true
		int[] sub = new int[n];
		int i = 0;
		for (int j = p; j < p + a && j < x.length; j++)
			if (x[j]) {
				sub[i] = j; // memorizzo l'indice di x[j]==true
				i++;
			}

		return sub;
	}

	/**
	 * Stampa tutti i sottoinsiemi dell'insieme di naturali rappresentato da
	 * {@code x}, in accordo con la Iverson notation.
	 * 
	 * @param x
	 *            insieme di cui produrre tutti i sottoinsiemi
	 */
	public static void powSet(boolean[] x) {
		powSet(x, 0);
	}

	public static void powSet(boolean[] x, int l) {
		if (l == x.length) {
			// stampa gli elementi di x che contengono true
			for (int i = 0; i < x.length; i++)
				if (x[i])
					System.out.print(i);
			System.out.println();
		} else {
			/*
			 * Inclusione di x[l] nell'insieme di insiemi che verranno
			 * costituiti combinando in tutti i modi possibili gli elementi
			 * restanti, ovvero x[l+1]...x[length-1].
			 */
			if (x[l])
				powSet(x, l + 1);
			/*
			 * Esclusione di x[l] dall'insieme di insiemi che verranno
			 * costituiti combinando in tutti i modi possibili gli elementi
			 * restanti, ovvero x[l+1]...x[length-1].
			 */
			boolean tmp = x[l];
			x[l] = false;
			powSet(x, l + 1);
			/*
			 * Ripristino del valore corretto di a[l].
			 */
			x[l] = tmp;
		}
	}
}