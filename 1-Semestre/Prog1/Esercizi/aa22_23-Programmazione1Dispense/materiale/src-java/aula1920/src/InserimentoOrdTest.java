/**
 * Dopo la creazione di un array ordinato, iterativamente,
 * richiede tre valori che inserirà presrvando l'ordinamento.
 */ 
public class InserimentoOrdTest
{

  public static void main(String[] args) {
    final int NUMERO_ITERAZIONI = 3;
    
    System.out.println("--------------------------------------------------------------");
    System.out.println("--- Inserimento in array che per ipotesi deve essere ordinato.");
    int[] a = LibreriaCreazioneStampaArray.initArray();
    System.out.println("    Array potenzialmente modificato: " + LibreriaCreazioneStampaArray.toString(a) + ".");
    
    int numeroInserimenti = 0;
    do {
        System.out.println("Elemento da inserire? ");
        int elemento = SIn.readInt();
      a = InserimentoOrd.inserisceElementoOrdinato(a,elemento);
      System.out.println("    Array modificato: " + LibreriaCreazioneStampaArray.toString(a) + ".");
      numeroInserimenti++;
    } while (numeroInserimenti<NUMERO_ITERAZIONI);
  }
} 