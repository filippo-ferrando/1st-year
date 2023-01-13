public class Permutazioni {

	/**
	 * Dato un array {@code a}, ne stampa tutte le permutazioni, in accordo con
	 * la visita in profondità dell'albero con cui è possibile rappresentare lo
	 * spazio di ricerca delle permutazioni.
	 * 
	 * @param a
	 *            di cui stampare tutte le permutazioni.
	 */
	public static void permVideo(int[] a) {
		permVideo(a, "");
	} // permVideo

	/**
	 * Dati un array {@code a} ed un accumulatore {@code p}, visita in preordine
	 * l'albero che rappresenta tutte le permutazioni di {@code a}. Lungo la
	 * visita di ogni ramo dell'albero, accumula in {@code p} gli elementi della
	 * permutazione corrispondente. Al termine del ramo stampa {@code p} con la
	 * permutazione corrispondente.
	 * 
	 * @param a
	 *            array di interi di cui produrre le permutazioni.
	 * @param p
	 *            permutazione da stampare all termine della visita di ogni
	 *            ramo.
	 */
	private static void permVideo(int[] a, String p) {
		if (a.length == 0)
			// Al termine di ogni ramo p contiene la permutazione
			System.out.println(p);
		else {
			/*
			 * {@code a} contiene {@code n+1} elementi.
			 */
			for (int ignora = 0; ignora < a.length; ignora++) {
				/*
				 * {@code a[ignora]} è uno degli elementi di {@code a}. L'array
				 * {@code aEnneMenoUno} è identico a {@code a} tranne che
				 * nell'elemento {@code a[ignora]}.
				 */
				int[] aEnneMenoUno = LibListeArr.cancellaPosInt(a, ignora);

				/*
				 * Per ipotesi induttiva {@code permVideo(b,prefix+a[ignora])}
				 * stampa tutte le permutazioni di {@code aEnneMenoUno},
				 * ciascuna preceduta da {@code p+a[ignora]}, siccome {@code
				 * aEnneMenoUno} ha {@code n} elementi.
				 */
				permVideo(aEnneMenoUno, p + a[ignora]);
			}
		}
	}

	/**
	 * Dato un array {@code a}, restituisce una stringa che ne raccoglie tutte
	 * le permutazioni, in accordo con la visita in profondità dell'albero con
	 * cui è possibile rappresentare lo spazio di ricerca delle permutazioni.
	 * 
	 * @param a
	 *            array di interi di cui calcolare pe permutazioni.
	 * @return stringa con tutte le permutazioni di a.
	 */
	public static String permString(int[] a) {
		return permString(a, "");
	} // perm

	/**
	 * Dati un array {@code a} ed un accumulatore {@code p}, visita in preordine
	 * l'albero che rappresenta tutte le permutazioni di {@code a}. Lungo la
	 * visita di ogni ramo dell'albero, accumula in {@code p} gli elementi della
	 * permutazione corrispondente. Al termine del ramo accatasta {@code p} nel
	 * risultato, senza alcuna stampa.
	 * 
	 * @param a
	 *            array di interi di cui produrre le permutazioni.
	 * @param p
	 *            permutazione da accatastare nel risultato finale al termine di
	 *            ogni ramo.
	 */
	private static String permString(int[] a, String p) {
		String permutazioni = "";
		if (a.length == 0)
			/*
			 * {@code a} non contine alcun elemento, quindi non esistono
			 * permutazioni. Il risultato è {@code p}, ovvero il prefisso
			 * seguito da nessuna permutazione.
			 */
			permutazioni = p + "\n";
		else {
			/*
			 * {@code a} contiene {@code n+1} elementi.
			 */
			for (int ignora = 0; ignora < a.length; ignora++) {
				/*
				 * {@code a[ignora]} è uno degli elementi di {@code a}. L'array
				 * {@code b} è identico a {@code a} tranne che nell'elemento
				 * {@code a[ignora]}.
				 */

				int[] b = LibListeArr.cancellaPosInt(a, ignora);

				/*
				 * Per ipotesi induttiva {@code permVideo(b,prefix+a[ignora])}
				 * stampa tutte le permutazioni di {@code b}, ciascuna preceduta
				 * da {@code p+a[ignora]}, siccome {@code b} ha {@code n}
				 * elementi.
				 */
				permutazioni = permutazioni + permString(b, p + a[ignora]);
			} // for
		} // else
		return permutazioni;
	} // permVideo

	/**
	 * Dato un array {@code a}, restituisce una matrice di interi che ne
	 * contiene tutte le permutazioni, riga per riga. Metodo ricorsivo.
	 * 
	 * @param a
	 *            array di cui fornire le permutazioni.
	 * @return matrice con le permutazioni di a.
	 */
	public static int[][] permMatInt(int[] a) {
		if (a.length == 0) {
			return LibMatriciInt.nilMatInt();
		} else { // a.length > 0
			int[][] permA = LibMatriciInt.nilMatInt();
			// {@code a} ha {@code n+1} elementi
			for (int ignora = 0; ignora < a.length; ignora++) {
				/*
				 * {@code a[ignora]} è uno degli elementi di {@code a}.
				 * Costruiamo l'array {@code aSenzaIgnora} identico ad {@code a}
				 * tranne che nell'elemento {@code a[ignora]}.
				 */
				int[] aSenzaIgnora = LibListeArr.cancellaPosInt(a, ignora);

				/*
				 * Per ipotesi induttiva {@code permMatInt(aSenzaIgnora)}
				 * contiene le permutazioni di {@code aSenzaIgnora}.
				 */
				int[][] permASenzaIngora = permMatInt(aSenzaIgnora);

				/*
				 * Aggiungiamo {@code a[ignora]} ad ogni elemento di
				 * permASenzaIngora
				 */
				int[][] permConIgnora = LibMatriciInt.consElMatInt(
						a[ignora], permASenzaIngora);

				/* Estendiamo le permutazioni generate sino a questo punto */
				permA = LibMatriciInt.concatMatInt(permA, permConIgnora);
			}
			return permA;
		}
	}
}
