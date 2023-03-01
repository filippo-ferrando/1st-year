public class BufferCircolare {

	public static int primo;
	public static int ultimo;
	public static boolean inversione;

	public static void inizializza(int[] b) {
		primo = 0; // elemento da estrarre
		ultimo = 0; // posizione libera per inserire
		inversione = false; // nessuna inversione
	}

	/**
	 * Indica quando il buffer e' pieno.
	 * 
	 * @param b
	 *            buffer
	 * @return {@code true} se non si possono aggiungere elementi, {@code false}
	 *         altrimenti
	 */
	public static boolean pieno(int[] b) {
		return primo == ultimo && inversione;
	}

	/**
	 * Indica quando il buffer e' vuoto.
	 * 
	 * @param b
	 *            buffer
	 * @return {@code true} se non esistono elementi nel buffer, {@code false}
	 *         altrimenti
	 */
	public static boolean vuoto(int[] b) {
		return primo == ultimo && !inversione;
	}

	/**
	 * Se il buffer non e' pieno vi inserisce l'elemento {@code e} in ultima
	 * posizione.
	 * 
	 * @param b
	 *            buffer
	 * @param e
	 *            elemento da inserire rispettando l'ordine FIFO
	 * @return {@code true} se l'inserimento e' possibile, {@code false}
	 *         altrimenti
	 */
	public static boolean in(int[] b, int e) {
		boolean inserire = !pieno(b);
		if (inserire) {
			b[ultimo] = e;
			int nuovoUltimo = (ultimo + 1) % (b.length);
			if (nuovoUltimo == 0)
				inversione = !inversione;
			ultimo = nuovoUltimo;
		}
		return inserire;
	}

	/**
	 * Se il buffer non e' vuoto elimina il primo elemento.
	 * 
	 * @param b
	 *            buffer
	 * @return {@code true} se l'eliminazione e' possibile, {@code false}
	 *         altrimenti
	 */
	public static boolean out(int[] b) {
		boolean togliere = !vuoto(b);
		if (togliere) {
			int nuovoPrimo = (primo + 1) % (b.length);
			if (nuovoPrimo == 0)
				inversione = !inversione;
			primo = nuovoPrimo;
		}
		return togliere;
	}
}
