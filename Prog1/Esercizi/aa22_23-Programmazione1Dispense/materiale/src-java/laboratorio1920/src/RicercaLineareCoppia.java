/**
 * Realizza la ricerca lineare del valore {@code k} nell'array di interi
 * {@code a}. Il risultato e' una coppia {@code (esiste,posizione)} tale che: 
 * </ol> 
 * <li> Se il {@code eiste} e' {@code true}, allora {@code posizione}
 * punta all'occorrenza di {@code x} in {@code a}. 
 * <li> Se {@code eiste} e' {@code false}, allora il valore
 * in {@code x} non esiste in {@code a}. 
 * </ol>
 */
public class RicercaLineareCoppia {
	
	public static boolean esiste;
	public static int     posizione;
	
	public static void inizializza() {
		esiste = false;
		posizione = -1;
	}
	
	public static void ricercaLineare(int[] a, int k) {
				
		while (posizione < a.length -1 && !esiste) {
			posizione++;
			esiste = (k == a[posizione]);
		}				
	}

	public static void main(String[] args) {
		
		int[] a = {-2,3,-1,0,2};
		
		System.out.println("Intero da cercare?");
		int daCercare = SIn.readInt();
		
		inizializza(); // necessaria per la consistenza dei campi
		ricercaLineare(a,daCercare);
		
		if (esiste)
			System.out.println(daCercare + " esiste in posizione " + posizione + ".");
		else
			System.out.println(daCercare + " non esiste.");	
	}
}
