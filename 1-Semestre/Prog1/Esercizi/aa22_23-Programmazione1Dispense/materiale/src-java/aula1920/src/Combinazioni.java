public class Combinazioni {

	/**
	 * Stampa delle combinazioni di {@code k} elementi presi da un insieme di
	 * {@code n} elementi.
	 * <p>
	 * Le combinazioni di {@code k} elementi scelti tra {@code n} sono i
	 * sottoinsiemi degli {@code n} dati, ciascuno con {@code k} elementi. E'
	 * naturale immaginare una restrizione opportuna di {@code powSet}.
	 * <p>
	 * Il metodo {@code combOvvie} qui sotto definito, e' una prima restrizione
	 * "ovvia" di {@code powSet}: genera comunque tutti i sottoinsiemi di
	 * {@code x}, ma si stampa solo quelli con {@code k} elementi.
	 * 
	 * @param x
	 *            insieme di cui stampare le combinazioni
	 * @param k
	 *            ampiezza delle combinazioni
	 */
	public static void combOvvie(boolean[] x, int k) {
		combOvvie(x, 0, k);
	}

	public static void combOvvie(boolean[] x, int l, int k) {
		if (l == x.length) {
			// conta gli elementi di x che contengono true
			int cont = 0;
			for (int i = 0; i < x.length; i++)
				if (x[i])
					cont++;
			// stampa gli elementi di x che contengono true
			if (cont == k) {
				for (int i = 0; i < x.length; i++)
					if (x[i])
						System.out.print(i);
				System.out.println();
			}
		} else {
			/*
			 * stampera' x[l] seguito da tutte le combinazioni di x.length-(l+1)
			 * elementi dei quali k - 1 dovranno essere uguali a true
			 */
			if (x[l])
				combOvvie(x, l + 1, k);
			/*
			 * non stampera' x[l], ma stampera' x[l+1] seguito da tutte le
			 * combinazioni di x.length-(l+1) elementi, dei quali k dovranno
			 * essere uguali a true e di cui x[l+1] e' parte
			 */
			boolean tmp = x[l];
			x[l] = false;
			combOvvie(x, l + 1, k);
			x[l] = tmp;
		}
	}

	/**
	 * Stampa delle combinazioni di {@code k} elementi presi da un insieme di
	 * {@code n}.
	 * <p>
	 * Le combinazioni di {@code k} elementi scelti tra {@code n} sono i
	 * sottoinsiemi degli {@code n} dati, ciascuno con {@code k} elementi. E'
	 * naturale immaginare di sfruttare il meccanismo offerto da
	 * {@code Insiemi.powSet} per generare i sottoinsiemi, tuttavia stampando
	 * solo quelli opportuni.
	 * <p>
	 * La strategia per individuare i sottoinsiemi opportuni e' indicata dalla
	 * seguente formula quantitativa che, ricorsivamente, definisce il valore
	 * {@code C(n,k}) in funzione di combinazioni su {@code n-1} elementi:
	 * 
	 * <pre>
	 * {@code C(n,k) = C(n-1,k-1) + C(n-1,k)}   (*)
	 * </pre>
	 * 
	 * Il metodo {@code comb} qui sotto definito e' costruito su
	 * {@code Insiemi.powSet}, ma introduce due ulteriori parametri {@code n} e
	 * {@code k}. Lo scopo e' rileggere (*) in termini costruttivi. La rilettura
	 * costruttiva "afferma" che la stampa di tutte le configurazioni di
	 * {@code k} elementi con valore {@code true}, scelti tra gli {@code n}
	 * disponibili, si scompone nello stampare due insiemi distinti di
	 * configurazioni. Per apprezzare come, assumiamo di essere nella generica
	 * situazione in cui:
	 * 
	 * <pre>
	 * {@code x[0]...x[l-1]}
	 * </pre>
	 * 
	 * contengano al piu' {@code l} elementi con valore {@code true} e che
	 * rimanga da assegnare il valore {@code true} a {@code k} elementi scelti
	 * tra i rimanenti:
	 * 
	 * <pre>
	 * {@code x[l]...x[x.length-1]}
	 * </pre>
	 * 
	 * i quali, convenzionalmente, assumiamo siano {@code n}.
	 * <p>
	 * Dimostriamo che la situazione generica e' invariante perche'
	 * trasformabile in una formalmente identica. Seguiamo la scomposizione di
	 * {@code C(n,k)} in {@code C(n-1,k-1)} e {@code C(n-1,k)}:
	 * <ol>
	 * <li>se assegnamo ad {@code x[l]} il valore {@code true}, allora:
	 * 
	 * <pre>
	 * {@code x[0]...x[l-1] x[l]}
	 * </pre>
	 * 
	 * contiene un certo numero di elementi con valore {@code true} e in:
	 * 
	 * <pre>
	 * {@code x[l]...x[x.length-1]}
	 * </pre>
	 * 
	 * ci sono {@code n-1} elementi dei quali solo {@code k-1} dovranno assumere
	 * valore {@code true} per completare una combinazione. Quindi, l'estensione
	 * del segmento iniziale di {@code x} con {@code x[l]==true} equivale a
	 * ridurre il problema iniziale in accordo con {@code C(n-1,k-1)};
	 * 
	 * <li>
	 * invece, se assegnamo a {@code x[l]} il valore {@code false}, allora:
	 * 
	 * <pre>
	 * {@code x[0]...x[l-1] x[l]}
	 * </pre>
	 * 
	 * contiene un certo numero di elementi con valore {@code true}. Quindi,
	 * occorrera' scegliere tra i rimanenti:
	 * 
	 * <pre>
	 * {@code x[l]...x[x.length-1]}
	 * </pre>
	 * 
	 * il cui numero si e' ridotto a {@code n-1}, i {@code k} elementi con
	 * valore {@code true}. In questo secondo caso, l'estensione del segmento
	 * iniziale di {@code x} con {@code x[l]==false} equivale a ridurre il
	 * problema in accordo con {@code C(n-1,k)}.
	 * </ol>
	 * </ul>
	 * 
	 * @param x
	 *            insieme di cui stampare le combinazioni
	 * @param k
	 *            ampiezza delle combinazioni
	 */
	public static void comb(boolean[] x, int k) {
		comb(x, 0, x.length, k);
	}

	public static void comb(boolean[] x, int l, int n, int k) {
		if (k == 0) {
			/*
			 * abbiamo esaurito la costruzione della combinazione nel segmento
			 * iniziale di x, identificato da l
			 */
			for (int i = 0; i < l; i++)
				if (x[i])
					System.out.print(i);
			System.out.println();
		} else if (n == k) {
			/*
			 * il numero degli elementi tra i quali sceglierne k da sistemare a
			 * true sono proprio k. Quindi la combinazione e' contenuta
			 * nell'intero x
			 */
			for (int i = 0; i < x.length; i++)
				if (x[i])
					System.out.print(i);
			System.out.println();
		} else {
			/*
			 * siamo nella situazione generica in cui x[0] ... x[l-1] contiene
			 * un certo numero di elementi a true e tra gli n rimanenti da
			 * sistemare, ne dobbiamo scegliere k
			 */
			if (x[l])
				/*
				 * In x[0] ... x[l-1] x[l] c'e' un nuovo elemento con valore
				 * true. Quindi ne rimangono n-1 tra i quali poterne scegliere
				 * k-1 con valore true.
				 */
				comb(x, l + 1, n - 1, k - 1);
			/*
			 * Facciamo in modo che in x[0] ... x[l-1] x[l] non ci sia un nuovo
			 * elemento con valore true. Quindi ne rimangono n-1 tra i quali
			 * poterne scegliere k con valore true.
			 */
			boolean tmp = x[l];
			x[l] = false;
			comb(x, l + 1, n - 1, k);
			x[l] = tmp;
		}
	}
}
