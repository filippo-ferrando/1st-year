/**
 * Crivello di Eratostene con cilo alternativo, rispetto
 * a quello studiato a lezione.
 */
public class EratosteneAlternativo {

	public static void main(String[] args) {

		boolean[] primi;

		// lettura
		System.out.println("*** Calcolo numeri primi ***");
		System.out.println("Valore massimo nell'insieme di interi?");
		int nMax = SIn.readInt();

		// creazione e inizializzazione array
		primi = new boolean[nMax + 1];
		for (int x = 1; x <= nMax; x++)
			primi[x] = true;

		/*
		 * Nella situazione generica, assumiamo di aver eliminato dall'insieme
		 * tutti i multipli di numero-1. Se numero e' ancora nell'insieme,
		 * allora non e' multiplo di alcun numero che lo precede e che non sia
		 * 1. Allora, numero e' primo e lo conserviamo nell'insieme. Se numero
		 * non e' piu' nell'insieme, allora era multiplo di qualche intero
		 * strettamente inferiore e diverso da 1. Quindi, numero non e' primo.
		 */
		for (int numero = 2; numero <= nMax; numero++)
			// se numero è primo allora tutti i suoi multipli non sono primi
			if (primi[numero])
				for (int fattore = 2; fattore * numero <= nMax; fattore++)
					primi[fattore * numero] = false;

		// scrittura del risultato
		System.out.println("I numeri primi fino a " + nMax + " sono:");
		for (int numero = 1; numero <= nMax; numero++)
			// se il numero è primo allora visualizzalo
			if (primi[numero])
				System.out.println(numero);
	}
}
