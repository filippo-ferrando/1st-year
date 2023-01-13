/**
 * Realizza una ricerca lineare esaustiva del valore {@code k} nell'array 
 * di interi {@code a}. Il risultato e' una terna 
 * {@code (esiste, indicePos, posizioni)} tale che: 
 * </ol> 
 * <li> Se il {@code esiste} e' {@code true}, allora gli elementi
 * nell'intervallo {@code [0...indicePos-1]} di {@code posizioni}
 * contengono tutte le posizioni del valore 
 * {@code x} in {@code a}. 
 * <li> Se {@code esiste} e' {@code false}, allora il valore
 * in {@code x} non esiste in {@code a}.
 * </ol>
 */
public class RicercaLineareEsaustivaCoppia {

	public static boolean esiste;
	public static int     indicePos;
	public static int[]   posizioni;
	
	public static void inizializza(int[] a) {
		esiste = false;
		indicePos = 0;
		posizioni = new int[a.length];
	}
	
	public static void ricercaLineare(int[] a, int k) {
		int valoreInizialeDiIndicePos = indicePos; 
		
		int i = 0; 
		while (i < a.length) {
			boolean trovatoK = (k == a[i]);
			if (trovatoK) {
				posizioni[indicePos] = i;
				indicePos++;
			}
			i++;
		}
		
		esiste = (indicePos != valoreInizialeDiIndicePos);
	}

	public static String leggePos() {
		String risultato = "";
		
		for (int i = 0; i < indicePos; i++)
			risultato = risultato + posizioni[i] + ((i == indicePos - 1)? ".": ", ");

		return risultato;
	}

	public static void main(String[] args) {
		
		int[] a = {3,-2,3,-1,0,2,3};
		
		System.out.println("Intero da cercare?");
		int daCercare = SIn.readInt();
		
		inizializza(a); // necessaria per la consistenza dei campi
		ricercaLineare(a,daCercare);
		
		if (esiste) {
			System.out.println(daCercare + " esiste nelle posizioni:");
			System.out.println(leggePos());			
		}
		else
			System.out.println(daCercare + " non esiste.");	
	}
}
