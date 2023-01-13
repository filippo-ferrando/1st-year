/**
 * Fornisce varie versioni di metodi che, applicati ad un array di interi,
 * spostano il valore massimo nella cella di indice maggiore.
 * <p>
 * Lo scopo e' evidenziare l'aliasing.
 */
public class EmersioneDelMassimo {

	private static void stampa(int[] a) {

		System.out.print("{ ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("}");
	}

	private static void scambia(int[] a, int i, int j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;
	}

	public static void emersioneMaxVoid(int[] a) {
		for (int i = 0; i < a.length - 1; i++)
			if (a[i] > a[i + 1])
				scambia(a, i, i + 1);
	}

	public static int[] emersioneMax(int[] a) {
		for (int i = 0; i < a.length - 1; i++)
			if (a[i] > a[i + 1])
				scambia(a, i, i + 1);
		return a;
	}

	public static void emersioneMaxRec(int[] a) {
		emersioneMaxRec(a, a.length - 1);
	}

	private static void emersioneMaxRec(int[] a, int l) {
		if (l == 0) {
		} else {
		        /* La chiamata seguente equivale ad assumere che l'elemento
		         * a[l-1] sia maggiore o uguale ad ogni elemento alla sua sinistra.
		         */
			emersioneMaxRec(a, l - 1);
			/* Siamo quindi di fronte a due casi possibili:
			 * 1) Se a[l - 1] > a[l], allora a{l - 1] e' anche il massimo 
			 *    della porizione di array estesa si un elmento, cioe'
			 *    e' maggiore o uguale a tutti gli elmenti a[0] ... a[l]
			 *    ed occorre scambiarlo proprio con a[l] per preservare
			 *    il fatto che il massimo della porzione di array visitata
			 *    sinora sia nella cella piu' a destra.
			 * 2) Se a[l - 1] <= a[l] allora il massimo della porzione
			 *    d'array visitata sinora e' a[l] che si trova all'estrema
			 *    destra della porzione stessa. Non occorre, percio' alcuno
			 *    scambio
			 */
			if (a[l - 1] > a[l])
				scambia(a, l, l - 1); /* scambia per preservare
				                       * l'invariante che impone d'avere
				                       * il massimo valore nella cella piu' a destra
				                       * della porzione d'array visitata sinora.
				                       */
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 4, 1, 2 };
		emersioneMaxVoid(a);
		stampa(a);

		int[] b = { 5, 4, 1, 2 };
		stampa(emersioneMax(b));

		int[] c = { 5, 4, 1, 2 };
		emersioneMaxRec(c);
		stampa(c);
	}
}
