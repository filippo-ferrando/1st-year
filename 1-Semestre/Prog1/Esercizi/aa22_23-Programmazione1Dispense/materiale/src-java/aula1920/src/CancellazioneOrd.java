import java.util.Arrays;

/**
 * Cancella un elemento da un array {@code int}, mantenendo
 * l'ordinamento, nel caso l'array sia ordianto.
 * <p>
 * La seguente immagine riassume il meccanismo di funzionamento
 * di due possibili meccanismi di eliminazione di un elemento da
 * un array:
 * <div>
 * <img src="doc-files/_0070EliminareElemento-01.png" width="40%" height="auto"> 
 * </div>
 */ 
public class CancellazioneOrd
{
  
  /**
   * Cancella l'elemento di posizione i, se l'elemento
   * di posizione i esiste. L'ordine degli elementi 
   * nell'array è preservato.
   * <p>
   * L'eliminazione avviene spostando nella posizione precedente
   * tutti gli elementi che seguono quello eliminato, 
   * decrementando anche il numero di elementi utili nell'array.
   *
   * @param a array di cui cancellare l'elemento.
   * @param i indice dell'elemento da cancellare.
   * @return array con elemento cancellato.
   */
  public static int[] cancellaElementoOrdinatoPosizione (int[] a, int i) {
    
    int[] risultato;

    if (0<=i && i<a.length) {
      // sposta nella posizione precedente ogni elemento 
      // a partire da quello cancellato 
      for (int j=i; j<a.length-1; j++)
        a[j] = a[j+1];
      risultato = Arrays.copyOf(a,a.length-1);
    } else 
        risultato = Arrays.copyOf(a,a.length);

    return risultato; 
  }
}