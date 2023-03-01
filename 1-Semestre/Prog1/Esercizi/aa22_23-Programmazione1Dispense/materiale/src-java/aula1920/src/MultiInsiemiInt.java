/**
 * Multi-insiemi di naturali realizzati con array di interi.
 * <p>
 * Una possibile codifica di multi-insiemi di naturali, non la migliore
 * e' tale per cui ogni array {@code a} di interi rappresenta l'insieme 
 * formato dagli interi contenuti negli elementi nelle celle.
 * Siccome parliamo di multi-insiemi, e' ammesso ripetere lo stesso
 * naturrale in celle distinte di {@code a}. I metodi statici forniti 
 * implementano operazioni su multi-insiemi. Dovrebbe risultare evidente che la complessita'
 * dei metodi consegue dalla scelta non "ottimale" della codifica.
 */

public class MultiInsiemiInt {

	/**
	 * Metodo di supporto, usato in entrambe le codifiche, che conta il numero
	 * di occorrenze di un intero in un array di interi.
	 * 
	 * @param a
	 *            array in cui contare le occorrenze
	 * @param e
	 *            elemento di cui contare le occorrenze
	 * @return il numero di occorrenze di {@code e} in {@code a}
	 */
	public static int contaOccorrenze(int[] a, int e) {
		int occorrenze = 0;
		for (int j = 0; j < a.length; j++)
			if (e == a[j])
				occorrenze++;
		return occorrenze;
	}

	/**
	 * Metodo di supporto, usato in entrambe le codifiche, che determina
	 * l'esistenza di un elemento in un segmento specificato del multi-inisieme.
	 *
	 * @param a
	 *            multi-insieme in cui cercare
	 * @param i
	 *            indice in {@code a} da cui cominciare la ricarca di {@code e}
	 * @param f
	 *            indice in {@code a} cui terminare la ricarca di {@code e}
	 * @param e
	 *            elemento da cercare
	 * @return {@code true} se {@code e} occorre in {@code a} tra {@code i} ed
	 *         {@code f}, estremi includi. Restituisce {@code false} altrimenti.
	 */
	public static boolean esiste(int[] a, int i, int f, int e) {

		boolean entroIntervallo = (0 <= i) && (i <= a.length) && (0 <= f)
				&& (f <= a.length);
		boolean esiste = false;

		if (entroIntervallo)
			for (int j = i; j < f && !esiste; j++)
				esiste = e == a[j];

		return entroIntervallo && esiste;
	}

	/**
	 * Metodo di supporto, restituisce il massimo valore in un array di interi.
	 */
	public static int max(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}

	/**
	 * Metodo di supporto, restituisce il minimo valore in un array di interi.
	 */
	public static int min(int a[]) {
		int min = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] < min)
				min = a[i];
		return min;
	}

	/**
	 * Intersezione tra multi-insiemi.
	 *
	 * @param a
	 *            primo multi-insieme
	 * @param b
	 *            secondo multi-insieme
	 * @return multi-insieme intersezione tra {@code a} e {@code b}
	 */
	public static int[] inX(int[] a, int[] b) {

		// array con le frequanze degli elementi di a e b
		int maxA = max(a);
		int maxB = max(b);
		int max = maxA;
		if (maxB > maxA)
			max = maxB;

		// frequenze in a
		int[] frequenzeA = new int[max+1];
		for (int i = 0; i < a.length; i++)
			frequenzeA[a[i]]++;

		// frequenze in b
		int[] frequenzeB = new int[max+1];
		for (int i = 0; i < b.length; i++)
			frequenzeB[b[i]]++;

		// array delle frequenze minime
		int[] frequenzeMin = new int[max+1]; 
		for (int i = 0; i < max + 1; i++) {
			if (frequenzeA[i] < frequenzeB[i])
				frequenzeMin[i] = frequenzeA[i];
			else
				frequenzeMin[i] = frequenzeB[i];
		}

		// numero degli elementi nell'array intersezione
		int lunghezzaIntersezione = 0;
		for (int i = 0; i < max+1; i++) {
			lunghezzaIntersezione = 
					lunghezzaIntersezione + frequenzeMin[i];
		}

		// intersezione
		int[] intersezione = new int[lunghezzaIntersezione];
		int i = 0;
		for (int j = 0; j < max + 1; j++)
			for (int k = 0; k < frequenzeMin[j] ; k++) {
				intersezione[i] = j;
				i++;
			}
				
		return intersezione;
	}

	/**
	 * Unione tra multi-insiemi.
	 * 
	 * @param a
	 *            primo multi-insieme
	 * @param b
	 *            secondo multi-insieme
	 * @return multi-insieme unione tra {@code a} e {@code b}
	 */
	public static int[] unX(int[] a, int[] b) {

		// array con le frequanze degli elementi di a e b
		int maxA = max(a);
		int maxB = max(b);
		int max = maxA;
		if (maxB > maxA)
			max = maxB;

		// frequenze in a
		int[] frequenzeA = new int[max+1];
		for (int i = 0; i < a.length; i++)
			frequenzeA[a[i]]++;

		// frequenze in b
		int[] frequenzeB = new int[max+1];
		for (int i = 0; i < b.length; i++)
			frequenzeB[b[i]]++;

		// array delle frequenze massime
		int[] frequenzeMax = new int[max+1]; 
		for (int i = 0; i < max + 1; i++) {
			if (frequenzeA[i] > frequenzeB[i])
				frequenzeMax[i] = frequenzeA[i];
			else
				frequenzeMax[i] = frequenzeB[i];
		}

		// numero degli elementi nell'array unione
		int lunghezzaUnione = 0;
		for (int i = 0; i < max+1; i++) {
			lunghezzaUnione = 
					lunghezzaUnione + frequenzeMax[i];
		}

		// unione
		int[] unione = new int[lunghezzaUnione];
		int i = 0;
		for (int j = 0; j < max + 1; j++)
			for (int k = 0; k < frequenzeMax[j] ; k++) {
				unione[i] = j;
				i++;
			}
				
		return unione;
	}

	/**
	 * Determina se un multi-insieme e' incluso in un secondo.
	 *
	 * @param a
	 *            primo multi-inisme
	 * @param b
	 *            secondo multi-inisme
	 * @return {@code true} se ogni occorrenza di elemento in {@code a} occorre
	 *         anche in {@code b}, {@code false} altrimenti.
	 */
	public static boolean subX(int[] a, int[] b) {
		/*
		 * Verifica se ogni elemento in a compare anche in b
		 */
		boolean perOgniEsiste = true;
		for (int i = 0; i < a.length && perOgniEsiste; i++)
			perOgniEsiste = esiste(b, 0, b.length, a[i]);

		/*
		 * Se ogni elemento in a ha almeno un corrispondente in b, allora conta
		 * che il numero di occorrenze di ogni elemento di a non superi il
		 * numero di occorrenze dello stesso elemento in b.
		 */
		boolean occorrenzeInANonSuperiori = true;
		if (perOgniEsiste) {
			for (int i = 0; i < a.length && occorrenzeInANonSuperiori; i++) {
				// conta occorrenze di a[i] in a
				int occorrenzeA = contaOccorrenze(a, a[i]);
				// conta occorrenze di a[i] in b
				int occorrenzeB = contaOccorrenze(b, a[i]);
				occorrenzeInANonSuperiori = occorrenzeA <= occorrenzeB;
			}
		}
		return perOgniEsiste && occorrenzeInANonSuperiori;
	}

}