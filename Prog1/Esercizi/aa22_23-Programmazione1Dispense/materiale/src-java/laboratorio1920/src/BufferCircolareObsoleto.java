/**
 * Codifica con un solo array {@code b} di interi un buffer circolare.
 * L'array di interi e' suddiviso in quattro zone:
 * <ul>
 *   <li> fino a {@code b[b.length-4]} puo' contenere
 *   elementi del buffer.
 *   <li> {@code b[b.length-3]} e' il puntatore al 
 *   primo elemento da utilizzare/eleminare,
 *   <li> {@code b[b.length-2]} e' il puntatore al
 *   primo elemento vuoto in cui inserire il prossimo elemento
 *   del buffer,
 *   <li> {@code b[b.length-1]} indica se gli elementi utili del
 *   buffer sono contenuti tra {@code b[b[b.length-3]]...b[b[b.length-2]]} 
 *   oppure nell'intevallo 
 *   {@code b[b[b.length-3]]...b[b.length-4]
 *         ,b[0]...b[b[b.length-2]]}.
 * </ul>
 * 
 */
public class BufferCircolareObsoleto {
	/**
	 * Restituisce l'indice al primo elemento
	 * del buffer da usare o da togliere.
	 * 
	 * @param b buffer
	 * @return indice del primo elemento nell'ordine FIFO
	 */
 	public static int primo(int[] b) {
		return b[b.length-3];
	}

 	/**
	 * Restituisce l'indice alla posizione del
	 * prossimo elemento da inserire nel buffer.
	 * 
	 * @param b buffer
	 * @return indice del primo posto libero per inserire un elemento
 	 */
	public static int ultimo(int[] b) {
		return b[b.length-2];
	}

	/**
	 * Segnala che il prossimo elemento del buffer
	 * avra' un indice inferiore a quello del primo.
	 * 
	 * @param b buffer
	 * @return {@code true} se il prossimo elemento sara'
	 * a sinistra del primo, {@code false} altrimenti
	 */
	public static boolean inversione(int[] b) {
		return b[b.length-1]==1;
	}

	public static boolean inizializza(int[] b) {
		boolean abbastanzaCapiente = b.length >= 4;
		if(abbastanzaCapiente) {
			b[b.length-3] = 0; // elemento da estrarre
			b[b.length-2] = 0; // posizione libera per inserire 
			b[b.length-1] = 0; // nessuna inversione			
		}
		return abbastanzaCapiente;
	}
	
	/**
	 * Indica quando il buffer e' pieno.
	 * 
	 * @param b buffer
	 * @return {@code true} se non si possono aggiungere elementi,
	 * {@code false} altrimenti
	 */
	public static boolean pieno(int[] b) {
		return b[primo(b)]==b[ultimo(b)] && inversione(b);
	}

	/**
	 * Indica quando il buffer e' vuoto.
	 * 
	 * @param b buffer
	 * @return {@code true} se non esistono elementi nel buffer,
	 * {@code false} altrimenti
	 */
	public static boolean vuoto(int[] b) {
		return b[primo(b)]==b[ultimo(b)] && !inversione(b);
	}

	/**
	 * Se il buffer non e' pieno vi inserisce l'elemento
	 * {@code e} in ultima posizione.
	 * 
	 * @param b buffer
	 * @param e elemento da inserire rispettando l'ordine FIFO
	 * @return {@code true} se l'inserimento e' possibile,
	 * {@code false} altrimenti
	 */
	public static boolean in(int[] b, int e) {
		boolean inserire = !pieno(b);
		if (inserire) {
			b[ultimo(b)] = e;
			int nuovoUltimo = (ultimo(b)+1) % (b.length-3);
			if(nuovoUltimo==0)
				b[b.length-1] = 1 - b[b.length-1]; // inversione
			b[b.length-2] = nuovoUltimo;
		}
		return inserire;
	}

	/**
	 * Se il buffer non e' vuoto elimina il primo elemento.
	 * 
	 * @param b buffer
	 * @return {@code true} se l'eliminazione e' possibile,
	 * {@code false} altrimenti
	 */
	public static boolean out(int[] b) {
		boolean togliere = !vuoto(b);
		if (togliere) {
			int nuovoPrimo = (primo(b)+1) % (b.length-3);
			if(nuovoPrimo==0)
				b[b.length-1] = 1 - b[b.length-1]; // inversione
			b[b.length-3] = nuovoPrimo;
		}
		return togliere;
	}
}