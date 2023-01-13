/** 
 * Evidenzia la valutazione lazy dell'operatore ||.
 * <p>
 * In {@code exp_1 || exp_2 || .. || exp_n} si valuta sino 
 * alla prima espressione {@code exp_i} il cui valore sia 
 * {@code true}. Quindi, {@code exp_1 || exp_2 || .. || exp_n}
 * ha valore {@code false} solo se tutte le espressioni che
 * essa contiene hanno valore {@code false}.
 * <p>
 * Classe pensata per essere interpretata 
 * con <a target="_blank" href="http://www.cs.joensuu.fi/jeliot/">Jeliot</a>.
 */
public class LazyOr  {
  public static void main(String[] args) {

    /* La strategia per verificare la valutazione lazy
     * dell'operatore || è metterci nella condizione di
     * evitare la valutazione di una espressione che,
     * se valutata, produca un run-time error.
     * 
     * Assumiamo a = 1 e consideriamo l'espressione
     *
     *         b = 0 || a/b   (1)
     *
     * Se b vale 0, allora a/b è priva di senso.
     * Altrimenti, con b diverso da 0 il valore a/b
     * esiste. 
     * 
     * Poniamo quindi:
     */ 
    int a = 1;
    int b = 0;
    /* Se Java non valutasse (1) con una strategia lazy,
     * ovvero se valutasse entrambi gli argomenti b==0
     * e a/b in (1) avremmo un errore di 'divisione per 0'.
     */
    boolean  risultato = ((b == 0) || (a/b != 0));
    System.out.println("risultato vale " + risultato + ".");
    System.out.println("Valore atteso per risultato è true.");
    System.out.println("Nessun errore 'division by zero'.");
   /* Se, invece, definissimo
    *
    * boolean  risultato = ((a/b != 0) || (b = 0)); (2)
    *
    * la compilazione di (2) non genererebbe errore,
    * ma la sua interpretazione sì.
    * 
    * ESERCIZIO.
    * Verificare la previsione.
    */
  }
}
