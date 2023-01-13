import java.util.Arrays;

/**
 * Inserisce un elemento in un array di interi ordinato.
 * <p>
 * La seguente immagine riassume il meccanismo dell'inserimento
 * array ordinato e non.
 * <div>
 * <img src="doc-files/_0090InserireElemento-01.png" width="50%" height="auto"> 
 * </div> 
 */ 
public class InserimentoOrd
{

  /**
   * Inserisce un elemento nella posizione corretta, ovvero che
   * preservi l'ordinamento.
   * <p>
   * OSSERVAZIONE.
   * <br>
   * Siccome l'array è ordinata, stabiliamo che l'inserimento sia
   * sempre possibile siccome il nuovo elemento va posizionato al
   * più in ultima posizione.
   *
   * @param a array in cui inserire.
   * @param e elemento da inserire.
   * @return array potenzialmente modificata col nuovo elemento.
   */
  public static int[] inserisceElementoOrdinato (int[] a, int e) {
  
    // cerca la prima posizione il cui elemento sia maggiore o uguale ad e
    int posizione = 0;
    boolean nonTrovata = true;
    while (nonTrovata &&
            posizione < a.length) {
      if (a[posizione]>=e)
        nonTrovata = false;
      else // incrementa solo se non
           // conosce la posizione di inserimento
        posizione++; 
    }  
    
    a = Arrays.copyOf(a,a.length+1); // metodo statico non richiede
                                     // creazioni di array di appoggio
    
    // sposta una posizione in avanti ogni elemento
    // a partire da a.length
    for (int j=a.length-1; j>posizione; j--) {
      a[j] = a[j-1];
    }
    
    // inserisce il nuovo elemento
    a[posizione] = e;
    return a;
  }  
} 