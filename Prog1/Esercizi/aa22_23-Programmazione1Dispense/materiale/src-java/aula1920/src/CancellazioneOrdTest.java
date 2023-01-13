/**
 * Dopo la creazione di un array permette di cancellarne
 * tre elementi, preservando l'ordinamento.
 */ 
public class CancellazioneOrdTest
{

  public static void main (String[] args) {

    System.out.println("----------------------------------------------");
    System.out.println("--- Cancellazione ordinata da array.");
    System.out.println("--- Inizializzare l'array con almeno 3 elementi. ");
    int[] a = LibreriaCreazioneStampaArray.initArray();
    System.out.println("    Array letto: " + LibreriaCreazioneStampaArray.toString(a) + ".");

    int numeroCancellazioniEseguite = 0;
    do {

      System.out.println("Indice elemento da cancellare? ");
      int i = SIn.readInt();
      a = CancellazioneOrd.cancellaElementoOrdinatoPosizione(a,i);
      System.out.println("    Array aggiornato: " + LibreriaCreazioneStampaArray.toString(a) + ".");
      numeroCancellazioniEseguite++;
    } while (numeroCancellazioniEseguite<3);
  }
} 