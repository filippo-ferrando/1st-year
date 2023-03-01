/**
 * Crivello di Eratostene. Dato un array di naturali di lunghezza {@code n}, che
 * rappresenta l'insieme dei primi {@code n-1} numeri naturali, via via elimina
 * tutti i multipli di un numero fissato.
 */
public class CrivelloEratostene {

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

		for (int numero = 2; numero <= nMax; numero++) {
			
			/**
			 * 	IPOTESI INDUTTIVA
			 * per ogni k, se 2 <= k <= numero, allora primi[k] == true sse k e' primo
			 */
		
			// if (primi[numero]) controllo utile a velocizzare l'eliminazione
			for (int multiplo = numero * 2; multiplo <= nMax; multiplo += numero) {
				
				/** preserva l'ipotesi, assegnando false ad ogni multiplo di numero
				 * che, in quanto multiplo di un numero != 1 non puo' esser primo
				 */
				
				primi[multiplo] = false;
			}
		}

		// segnala l'esistenza di un non-primo tra i numeri "rimasti"
		boolean trovatoNonPrimo = false;
		int numero;
		for (numero = 2; numero <= nMax && primi[numero] && !trovatoNonPrimo; numero++) 
			for (int divisore = 2; divisore <= numero / 2; divisore++)
				trovatoNonPrimo = (numero % divisore == 0) && (divisore != numero);
		
		// scrittura del risultato
		if (!trovatoNonPrimo) {
			System.out.println("I numeri primi fino a " + nMax + " sono:");
			for (numero = 1; numero <= nMax; numero++)
				// se il numero è primo allora visualizzalo
				if (primi[numero])
					System.out.println(numero);
		}
		else 
			System.out.println("Un non primo trovato e' " + numero);
	}
}
