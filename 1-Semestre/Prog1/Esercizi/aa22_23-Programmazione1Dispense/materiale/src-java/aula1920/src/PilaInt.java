/** 
 * Realizza il tipo di dato astratto omonimo, permettendo la manipolazione
 * di sequenze di interi in accordo con la poitica LIFO.
 * <p>
 * La realizzazione ricalca {@link ArraySemipieni}. Tuttavia, da un lato
 * rende disponibili solo alcuni metodi, ridenominandoli opportunamente, 
 * in accordo con la terminologia standard delle operazioni su pile. Dall'altro
 * introduce alcuni metodi che sono peculiari del tipo di dato in questione.
 */
public class PilaInt {

	// CAMPI STATICI
	private static final int COSTANTE_DI_ESPANSIONE = 20;
	private static int[] stack;
	private static int top;

	// METODI PRIVATI
	private static void espande() {
		
		int[] tmp = new int[stack.length + COSTANTE_DI_ESPANSIONE];

		for (int i = 0; i < stack.length; i++)
			tmp[i] = stack[i];

		stack = tmp;
	}

	// METODI PUBBLICI
	/**
	 * Azzera qualsiasi contenuto in {@code stack}.
	 */
	public static void reset() {
		stack = new int[1]; // singola cella pronta per l'uso
		top = 0;
	}

	/**
	 * Determina la presenza, o meno, di elementi nello stack.
	 * 
	 * @return {@code true} se non ci sono elementi. {@code false} 
	 * altrimenti.
	 */
	public static boolean empty() {
		
		return top == 0;
	}

	/**
	 * Restituisce il valore presente in cima allo stack.
	 */
	public static int top() {
		
		return stack[top - 1];
	}

	/**
	 * Aggiunge l'elemento {@code e} in cima allo stack.
	 *
	 * @param e
	 *            elemento da inserire.
	 */
	public static void push(int e) {
		
		if (top >= stack.length)
			espande();
		stack[top] = e;
		top++;
	}

	/**
	 * Elimina l'elemento in cima allo stack, se lo stack non e' gia' vuoto.
	 *
	 * @return {@code true} se l'eliminazione ha avuto successo, cioe' se lo
	 * stack conteneva almeno un elemento. {@code false} altrimenti.
	 */
	public static boolean pop() {

		boolean elimina = top > 0;
		if (elimina)
			top--;

		return elimina;
	}

	/**
	 * Trasforma l'istanza chiamante in {@code String}, permettendo di scegliere
	 * il carattere separatore degli stack.
	 */
	public static String toStr() {

		String risultato = "";

		for (int i = 0; i < top; i++) 
			risultato = risultato + stack[i];

		return risultato;
	}

}
