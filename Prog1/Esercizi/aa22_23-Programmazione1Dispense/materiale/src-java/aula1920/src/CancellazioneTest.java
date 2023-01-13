/**
 * Dopo la creazione di un array permette di cancellarne
 * tre elementi, eventualmente non preservando l'ordinamento.
 */ 
public class CancellazioneTest
{

  public static void main (String[] args) {

    int[] a;
    
    System.out.println("--------------------------------------------------");
    System.out.println("--- Cancellazione non ordinata da array.");
    System.out.println("--- Inizializzare l'array con almeno 3 elementi. ");
    a = LibreriaCreazioneStampaArray.initArray();
    System.out.println("    Array letta: " + LibreriaCreazioneStampaArray.toString(a) + ".");
    
    int numeroCancellazioniEseguite = 0;
    int i;
    do {
        System.out.println("Indice elemento da cancellare? ");
        i = SIn.readInt();
        a = Cancellazione.cancellaElementoPosizione(a,i);
        System.out.println("    Array aggiornato: " + LibreriaCreazioneStampaArray.toString(a) + ".");
        numeroCancellazioniEseguite++;
    } while (numeroCancellazioniEseguite<3);

  }
}