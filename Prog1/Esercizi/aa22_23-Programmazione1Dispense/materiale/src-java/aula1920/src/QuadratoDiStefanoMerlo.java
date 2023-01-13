/**
 * Quadrato di un numero per iterazioni successive
 * che sfruttano i prodotti notevoli.
 * <p>
 * Usato come propgramma di cui, per esercizio,
 * scrivere l'invariante di ciclo.
 * 
 * @author Stefano Merlo aa 14/15
 */
public class QuadratoDiStefanoMerlo {

	public static void main(String[] args) {
	    int dato = 728;         // Scrivere qui il dato di cui calcolare il quadrato
	    int mCando = 0;         // moltiplicando utilizzato nel ciclo
	    int mTore = 0;          // moltiplicatore utilizzato nel ciclo
	    int risultato = 0;      // Risultato finale
	    int numIterazioni = 0;  // Contatore del numero di iterazioni
	   
	    // Aggiustamento del segno
	    if (dato < 0) dato = dato * (-1);
	    
	    // Setup del moltiplicando e del moltiplicatore
	    mCando = dato;
	    mTore = dato;
	    
	    // Ciclo di calcolo
	    while (mTore > 0) {
	      if ((mTore % 2) == 1) {
	        risultato = risultato + mCando;
	      }
	      mTore = mTore / 2;
	      mCando = mCando * 2;
	      numIterazioni = numIterazioni + 1;
	    }
	    
	    // Visualizzazione risultato
	    System.out.println("Risultato " + risultato);
	    System.out.println("Ottenuto in " + numIterazioni + " iterazioni");
	    
	    // Verifica della corretteza
	    if (risultato == dato * dato) {
	      System.out.println("Il risultato e' corretto");
	    }
	    else {
	      System.out.println("Il risultato e' sbagliato");
	    }
	}
}
