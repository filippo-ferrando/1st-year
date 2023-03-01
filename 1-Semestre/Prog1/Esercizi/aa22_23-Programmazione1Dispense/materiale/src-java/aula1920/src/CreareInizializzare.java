import java.util.Arrays;

/**
 * Creazione di array, equivalenza/eguaglianza, alias ed inizializzazione.
 */
public class CreareInizializzare {
	
	public static void main(String[] args) {
	
	    ///////////////////////////////////////////////////
	    //////////////////// PRIMA PARTE //////////////////
	    ///////////////////////////////////////////////////

		int[] a = new int[5]; // Array di 5 interi tutti inizializzati col valore 0.		
		a[1] = 2; // valore 5 assegnato all'elemento di indice 1
		int i = 3; 
		a[i] = 1;  // valore 1 assegnato all'elemento di indice 3
		a[a.length - 1] = a[i + 1] + 1; // incremento di una unita' dell'elemento di indice 4

		int[] b = { 0, 2, 0, 1, 1}; // estensionalmente diversa da a, ma intensionalmente uguale
		
		boolean uguali;
		
		int[] c = a;
		uguali = a == c; // true perche' a e c puntano alla stessa zona dello heap
		
		uguali = a == b; // false perche' a e b puntano a due zone distinte dello heap
		                 // pur avendo gli stessi elementi
		
		// blocco di codice che confronta intesionalmente a e b
		uguali = true; 
		i = 0; // per ogni k, se 0<= k < i allora a[k]==b[k] e' vero perche' la premessa e' vacua.
		while (i < a.length - 1 && uguali) {
		  // per ogni k, se 0<= k < i allora a[k]==b[k] (****)
		  uguali = a[i] == b[i];
		  if (uguali) {
		    // (per ogni k, se 0<= k < i allora a[k]==b[k]) e a[i]==b[i]
		    // implica che 
		    // per ogni k, se 0<= k < i+1 allora a[k]==b[k]
		    i = i + 1;;
		    // per ogni k, se 0<= k < i allora a[k]==b[k]
		    // che coincide con (****)
		  }
		}
		// se uguali == false, allora a[i]!=b[i]
		// se uguali == true, allora vale
		// per ogni k, se 0<= k < a.length allora a[k]==b[k], cioe' gli elmenti
		// in a e b di egual posizione sono uguali		
		
		uguali = Arrays.equals(a,b); // true perche' a e b hanno elementi uguali in di egual posizione
		
		/*
		 * ESEMPIO D'ERRORE. data ha dieci elementi individuabili con indici
		 * nell'intervallo [0,9]. Quindi data[10] non esiste ed il seguente
		 * codice genera un run-time error:
		 * 
		 * double[] data = new double[10]; 
		 * data[10] = 29.95;
		 */

		/*
		 * ESEMPIO D'ERRORE. Di seguito, l'accesso a values[0] produce un
		 * run-time error perche' per values e' stato allocato abbastanza spazio
		 * per contenervi un puntatore ad array, ma il valore di tale puntatore
		 * non esiste. Conseguentemente, non esiste alcun elemento values.
		 * 
		 * double[] values; 
		 * values[0] = 29.95;
		 */

	   /////////////////////////////////////////////////////
	   //////////////////// SECONDA PARTE //////////////////
       /////////////////////////////////////////////////////
		int[] f = new int[0];
		int[] g = new int[1];
		g[0] = 1;
		f = g;
		f[0] = 2;
		
		System.out.println("Quanti elementi ha l'array? ");
		
		/* Vale sempre la pena ricordare che e' buona norma assegnare un nome
		 * significativo a costanti da usare nel codice, invece di introdurre i
	     * cosiddetti 'magic number'.
		 */
		final int NUMBERS_LENGTH = SIn.readInt();
		
		/*
		 * La lunghezza di un array non deve essere fissata a priori con una
		 * costante, ma puo' essere specificata di volta in volta, immettendo,
		 * ad esempio, il valore tramite tastiera.
		 */
		int[] e = new int[NUMBERS_LENGTH];
		/*
		 * Tuttavia, una volta creata l'istanza, la sua lunghezza non puo'
		 * mutare. Se servono piu' elementi occorre creare una nuova istanza di
		 * dimensione opportuna.
		 */

		/*
		 * Riempie e
		 */
		System.out.println(NUMBERS_LENGTH + " valori per e?");
		for (int j = 0; j < NUMBERS_LENGTH; j++) {
			/* per ogni k, se 0<=k<j, allora e' stato letto il valore di e[k] */
			System.out.println("Intero di posizione " + j + ": ");
			e[j] = SIn.readInt();
		}

		/*
		 * Stampa e.
		 */
		System.out.print("---- e = { ");
		for (int j = 0; j < NUMBERS_LENGTH; j++) {
			/* per ogni k, se 0<=k<j, allora e' stato stampato il valore di e[k] */
			System.out.print(e[j] + " ");
		}
		System.out.println("}");
	}
}