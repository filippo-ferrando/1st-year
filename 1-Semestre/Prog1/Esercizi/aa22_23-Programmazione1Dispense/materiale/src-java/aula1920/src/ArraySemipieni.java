/**
 * Classe le cui istanze sono {@code int[]} nelle quali e' possibile utilizzare
 * solo una parte degli elementi disponibili.
 * <p>
 * Ad ogni inserimento di un elemento:
 * <ul>
 * <li>lo si inserisce nel primo elemento non utilizzato, se esso esiste,
 * <li>altrimenti, non lo si inserisce.
 * </ul>
 * L'eliminazione, se esistono elementi, avviene sovrascrivendo l'elemento da
 * cancellare con quello di indice maggiore, e restringendo di un elemento la
 * porzione di array usata.
 */
public class ArraySemipieni {

	// CAMPI STATICI
	private static final int COSTANTE_DI_ESPANSIONE = 20;
	private static int[] elementi;
	/**
	 * nElementi ha doppio significato coincidente: 
	 * -) conta il numero di posizioni occupate nel campo elementi, 
	 * -) e' indice delle prima posizione utilizzabile nel campo 
	 * elementi per inserirne uno nuovo.
	 */
	private static int nElementi;

	// METODI PRIVATI
	private static void espande() {
		
		int[] tmp = new int[elementi.length + COSTANTE_DI_ESPANSIONE];

		for (int i = 0; i < elementi.length; i++)
			tmp[i] = elementi[i];

		elementi = tmp;
	}

	// METODI PUBBLICI
	/**
	 * Azzera qualsiasi contenuto in {@code elementi}.
	 */
	public static void resetArraySemipieni() {
		elementi = new int[1]; // singola cella pronta per l'uso
		nElementi = 0;
	}

	/**
	 * Accessor che restuisce il numero degli elementi utili.
	 */
	public static int getNumeroElementi() {
		
		return nElementi;
	}

	/**
	 * Accessor che restuisce la disponibilita' totale di elementi.
	 */
	public static int getDisponibilitaElementi() {
		
		return elementi.length;
	}

	/**
	 * Mutator che aggiunge l'elemento {@code e}, estendendo, se necessario,
	 * l'array {@code elementi}.
	 *
	 * @param e
	 *            elemento da inserire nell'array.
	 */
	public static void aggiungeElemento(int e) {
		
		if (nElementi >= elementi.length)
			espande();
		elementi[nElementi] = e;
		nElementi++;
	}

	/**
	 * Mutator che sostituisce l'elemento in posizione {@code p} con il nuovo
	 * elemento {@code e}.
	 * <p>
	 * Il vincolo iniziale sull'intervallo in cui debba cadere, e' conseguenza
	 * del nome del metodo che sostituisce un elemento, il quale,
	 * necessariamente deve essere tra quelli esistenti.
	 *
	 * @param p
	 *            posizione dell'elemento da sostituire.
	 * @param e
	 *            valore da usare per la sostituzione.
	 * @return {@code true} se la sostituzione e' andata a buon termine.
	 *         {@code false} altrimenti.
	 */
	public static boolean sostituisce(int p, int e) {

		boolean sostituisce = (0 <= p && p < nElementi);
		if (sostituisce)
			elementi[p] = e;

		return sostituisce;
	}

	/**
	 * Mutator che cancella, se possibile, l'elemento in poszione {@code p}.
	 * <p>
	 * La cancellazione avviene sostituendo l'elemento in posizione {@code p}
	 * con l'ultimo elemento dell'array.
	 *
	 * @param p
	 *            posizione dell'elemento da eliminare.
	 * @return {@code true} se la cancellazione ha avuto successo. {@code false}
	 *         altrimenti.
	 */
	public static boolean cancellaElementoInPosizione(int p) {

		boolean sostituito = sostituisce(p, elementi[nElementi - 1]);
		if (sostituito)
			nElementi--;

		return sostituito;
	}

	/**
	 * Verifica l'esistenza del valore {@code e}.
	 *
	 * @param e
	 *            elemento da cercare.
	 * @return {@code true} se l'elemento esiste. {@code false} altrimenti.
	 */
	public static boolean esiste(int e) {
		
		boolean trovato = false;
		for (int i = 0; i < nElementi && !trovato; i++)
			trovato = (elementi[i] == e);

		return trovato;
	}

	/**
	 * Cerca la posizione del valore {@code e}.
	 *
	 * @param e
	 *            elemento da cercare.
	 * @return valore della posizione dell'elemento {@code e}. -1 altrimenti.
	 */
	public static int esisteInPosizione(int e) {

		boolean trovato = false;
		int i = 0;
		while (i < nElementi && !trovato) {
			trovato = (elementi[i] == e);
			i++;
		}

		return (trovato)? i - 1: - 1;
	}

	/**
	 * Cancella, se esiste, la prima occorrenza di {@code e}.
	 *
	 * @param e
	 *            elemento da eliminare.
	 * @return {@code true} se la cancellazione ha avuto successo. {@code false}
	 *         altrimenti.
	 */
	public static boolean cancellaElemento(int e) {

		int p = esisteInPosizione(e);
		return cancellaElementoInPosizione(p);
	}

	/**
	 * Trasforma l'istanza chiamante in {@code String}, permettendo di scegliere
	 * il carattere separatore degli elementi.
	 *
	 * @param separatore
	 *            carattere con cui separare tra loro gli elementi della lista.
	 */
	public static String toString(String separatore) {

		String risultato = "";

		for (int i = 0; i < nElementi; i++) {
			if (i == nElementi - 1)
				separatore = "";
			risultato = risultato + elementi[i] + separatore;
		}

		return risultato;
	}
}
