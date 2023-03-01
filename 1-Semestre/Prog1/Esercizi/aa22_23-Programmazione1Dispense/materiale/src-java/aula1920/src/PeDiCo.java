import java.util.Arrays;

/**
 * Fornisce metodi per la stampa delle permutazioni e delle disposizioni a
 * gruppi di dimensione prefissata, contententi interi di un array opportuno.
 * Fornisce anche un metodo che genera una matrice di interi con le combinazioni
 * a gruppi di dimensione prefissata, presi da un array opportuno.
 */
public class PeDiCo {

	/**
	 * Dato un array {@code a}, ne stampa tutte le permutazioni, in accordo con
	 * la visita in profondita' dell'albero che rappresenta lo spazio di
	 * ricerca.
	 * 
	 * @param a
	 *            di cui stampare tutte le permutazioni
	 */
	public static void perm(int[] a) {
		perm(a, 0);
	}

	/**
	 * Stampa ogni ramo nell'albero delle permutazioni di elementi in un array
	 * di interi. Ogni permutazione e' stampata al termine della visita di
	 * ciascun ramo. Individua il termine della visita quando il livello
	 * raggiunto coincide col numero di elementi da permutare.
	 * <p>
	 * {@link PeTest} e' la classe di testing per questo metodo.
	 * 
	 * @param a
	 *            array di interi di cui fornire le permutazioni
	 * @param l
	 *            livello raggiunto nel ramo che si sta visitando
	 */
	public static void perm(int[] a, int l) {
		if (l == a.length) // livello di visita pari al numero di elementi
			System.out.println(toString(a, 0, a.length));
		else {
			/*
			 * A profondita' l, gli elementi a[0]...a[l-1] sono fissati nel
			 * senso che costituiscono il prefisso di tutte le permutazioni da
			 * costruire con gli a.length-l elementi a[l]...a[a.length-1] non
			 * ancora considerati.
			 * 
			 * Il primo gruppo di permutazioni mancanti e' generato lasciando
			 * l'elemento a[l] dov'e'.
			 * 
			 * Il secondo gruppo di permutazioni mancanti e' generato scambiando
			 * a[l] con a[l+1].
			 * 
			 * Il terzo gruppo e' generato scambiando a[l] con a[l+2].
			 * 
			 * Cosi' via fino a scambiare a[l] con a[a.length-1].
			 * 
			 * E' quindi fondamentale creare una copia di a ad ogni chiamata
			 * affinche', al rientro, si possa scambiare a[l] con l'elemento
			 * desiderato.
			 */
			for (int j = l; j < a.length; j++) {
				scambia(a, l, j);
				int[] b = Arrays.copyOf(a, a.length);
				perm(b, l + 1);
			}
		}
	}

	/**
	 * Dato un array {@code a}, ne stampa tutte le disposizioni di dimensione
	 * {@code g}, in accordo con la visita in profondita' dell'albero con cui e'
	 * possibile rappresentare lo spazio di ricerca delle permutazioni da cui si
	 * parte.
	 * <p>
	 * {@link DiTest} e' la classe di testing per questo metodo.
	 * 
	 * @param a
	 *            di cui stampare tutte le disposizioni
	 * @param g
	 *            cardinalita' delle disposizioni
	 */
	public static void disp(int[] a, int g) {
		if (g <= a.length)
			disp(a, 0, g);
	}

	public static void disp(int[] a, int l, int g) {
		if (l == g) // livello di visita pari al numero di elementi
			System.out.println(toString(a, 0, g));
		else {
			/*
			 * A profondita' l, gli elementi a[0]...a[l-1] sono fissati nel
			 * senso che costituiscono il prefisso di tutte le disposizioni da
			 * costruire con gli a.length-l elementi a[l]...a[min{g,a.length-1}]
			 * non ancora considerati.
			 * 
			 * Il primo gruppo di disposizioni mancanti e' generato lasciando
			 * l'elemento a[l] dov'e'.
			 * 
			 * Il secondo gruppo di disposizioni mancanti e' generato scambiando
			 * a[l] con a[l+1].
			 * 
			 * Il terzo gruppo e' generato scambiando a[l] con a[l+2].
			 * 
			 * Cosi' via fino a scambiare a[l] con a[a.length-1].
			 * 
			 * E' quindi fondamentale creare una copia di a ad ogni chiamata
			 * affinche', al rientro, si possa scambiare a[l] con l'elemento
			 * desiderato.
			 */
			for (int j = l; j < a.length; j++) {
				scambia(a, l, j);
				int[] b = Arrays.copyOf(a, a.length);
				disp(b, l + 1, g);
			}
		}
	}

	/**
	 * Dato un array {@code a}, produce una matrice di interi con tutte le
	 * combinazioni di dimensione {@code g}, in accordo con la visita in
	 * profondita' dell'albero con cui e' possibile rappresentare lo spazio di
	 * ricerca delle permutazioni da cui si parte.
	 * <p>
	 * {@link CoTest} e' la classe di testing per questo metodo.
	 * 
	 * @param a
	 *            di cui stampare tutte le combinazioni
	 * @param g
	 *            cardinalita' delle combinazioni
	 */
	public static int[][] comb(int[] a, int g) {
		int[][] risultato = new int[0][0];
		if (g <= a.length)
			risultato = comb(a, 0, g);
		return risultato;
	}

	public static int[][] comb(int[] a, int l, int g) {
		if (l == g) { /*
					 * percorsi g livelli si genera una disposizione di g
					 * elementi. Diciamo che e' una disposizione perche', a
					 * questo punto, non si sa se l'insieme degli elementi che
					 * essa contiene sia una combinazione gia' elencata tra
					 * quelle costruite sin qui. Se lo fosse non andrebbe
					 * inserita nuovamente.
					 */
			int[][] comb = new int[1][g];
			comb[0] = Arrays.copyOf(a, g);
			return comb;
		} else {
			/*
			 * A profondita' l, gli elementi a[0]...a[l-1] sono fissati nel
			 * senso che costituiscono il prefisso di tutte le combinazioni da
			 * costruire con gli a.length-l elementi a[l]...a[min{g,a.length-1}]
			 * non ancora considerati.
			 * 
			 * Il primo gruppo di combinazioni mancanti e' generato: (i)
			 * lasciando l'elemento a[l] dov'e', (ii) generando, appunto, tutte
			 * le combinazioni mancanti, (iii) inserendo solo quelle il cui
			 * insieme di elementi non compaia tra le combinazioni gia' inserite
			 * nell'elenco.
			 * 
			 * Il secondo gruppo di permutazioni mancanti e' generato: (i)
			 * scambiando a[l] con a[l+1], (ii) generando, appunto, tutte le
			 * combinazioni mancanti, (iii) inserendo solo quelle il cui insieme
			 * di elementi non compaia tra le combinazioni gia' inserite
			 * nell'elenco
			 * 
			 * Il secondo gruppo di permutazioni mancanti e' generato: (i)
			 * scambiando a[l] con a[l+2], (ii) generando, appunto, tutte le
			 * combinazioni mancanti, (iii) inserendo solo quelle il cui insieme
			 * di elementi non compaia tra le combinazioni gia' inserite
			 * nell'elenco
			 * 
			 * Cosi' via fino a scambiare a[l] con a[a.length-1].
			 * 
			 * E' quindi fondamentale creare una copia di a ad ogni chiamata
			 * affinche', al rientro, si possa scambiare a[l] con l'elemento
			 * desiderato.
			 */
			int[][] comb = new int[0][0];
			for (int j = l; j < a.length; j++) {
				scambia(a, l, j);
				int[] b = Arrays.copyOf(a, a.length);
				int[][] dispG = comb(b, l + 1, g);

				for (int d = 0; d < dispG.length; d++) {
					// ordino gli elementi della disposizione di posizione d
                    int[] dispOrd = null;
//                    int[] dispOrd = InsertionSortIter.insertionSort(dispG[d]);
					// aggiungo al risultato le disposizioni che non vi
					// appartengono
					if (!LibMatriciInt.inElMatInt(dispOrd, comb))
						comb = LibMatriciInt.consMatRaggedInt(dispOrd, comb);
				}
			}
			return comb;
		}
	}

	/**
	 * Metodo di supporto che scambia gli elementi di posizione {@code i} e
	 * {@code j} in un array di interi.
	 */
	public static void scambia(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	/**
	 * Metodo di supporto che produce la stringa di tutti gli elementi tra di
	 * posizione {@code i} e {@code j - 1} un array di interi.
	 */
	public static String toString(int[] a, int i, int f) {
		String string = "";

		if (f > a.length)
			f = a.length;
		for (int j = i; j < f; j++)
			string = string + a[j];
		return string;
	}
}