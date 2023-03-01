/**
 * Fissati due numeri naturali {@code m} ed {@code n}, 
 * usando il simbolo {@code *}, stampa un triangolo equilatero di base {@code m}, 
 * se {@code m<=n}. Altrimenti, stampa un trapezio con base maggiore di {@code m} 
 * righe e base minore di {@code m - n} righe.
 */
public class TrapezioDiStelle {
  public static void main(String[] args) {
   int m = 8; 
   int n = 5;

   int i = 0;
   int j = 0; 
   // Inserire commento che arogmenti sulla sensatezza dell'invariante proposto
   while (i < m) {
        // Inserire commento che arogmenti sulla sensatezza dell'invariante proposto
     while (j < i && j < n) {
        /* Nel caso piu' generale con m>n stiamo stampando un trapezio che ha forma:
         *
         *       *            riga 1
         *       **           riga 2
         *       ***          riga 3
         *       .....
         *       ******       riga i-1  con i-1 asterischi
         *       ********     riga i==n con n asterischi
         *       ********     riga n+1  con n asterischi
         *       .....
         *       ********     riga i-1 con n asterischi
         *       ***          riga i   con j asterischi
         *
         * ed e', quindi, descritto da:
         *
         * se i<=n, allora
         *    per ogni k,
         *    se 0<=k<i, allora 
         *       k-esima riga ha k occorrenze di *
         *       && i-esima riga ha j occorrenze di * 
         * && se n<i, allora
         *       per ogni k, 
         *       se 0<=k<n, allora 
         *          k-esima riga ha k occorrenze di *
         *          && se n<=k<i, allora k-esima riga ha n occorrenze di *
         *          && i-esima riga ha j occorrenze di *         
         */
        System.out.print("*");
        /* Il trapezio e' diventato:
         *       *            riga 1
         *       **           riga 2
         *       ***          riga 3
         *       .....
         *       ******       riga i-1  con i-1 asterischi
         *       ********     riga i==n con n asterischi
         *       ********     riga n+1  con n asterischi
         *       .....
         *       ********     riga i-1 con n asterischi
         *       ****         riga i   con j+1 asterischi
         *
         * ed e', quindi, descritto da:
         *
         * se i<=n, allora
         *   per ogni k, 
         *   se 0<=k<i, allora k-esima riga ha k occorrenze di *
         *      && i-esima riga ha j+1 occorrenze di * 
         * && se n<i, allora
         *       per ogni k, 
         *          se 0<=k<n, allora k-esima riga ha k occorrenze di *
         *          && se n<=k<i, allora k-esima riga ha n occorrenze di *
         *          && i-esima riga ha j+1 occorrenze di *         
         */
        j = j + 1;
        /* j rappresenta l'espressione j+1. Riotteniamo:
         * se i<=n, allora
         *   per ogni k, 
         *   se 0<=k<i, allora 
         *      k-esima riga ha k occorrenze di *
         *      && i-esima riga ha j occorrenze di * 
         * && se n<i, allora
         *       per ogni k, 
         *       se 0<=k<n, allora 
         *          k-esima riga ha k occorrenze di *
         *          && se n<=k<i, allora k-esima riga ha n occorrenze di *
         *          && i-esima riga ha j occorrenze di *         
         * senza modificare il trapezio.
         */
     }
     /* Almeno uno dei due casi descritti da j == i || j == n e' vero.
      * Assumiamo j == i, quindi i<=n.
      * Il predicato che descrive la configurazione ottenuta diventa:
      * se i<=n, allora
      *    per ogni k, 
      *    se 0<=k<i+1, allora 
      *       k-esima riga ha k occorrenze di *
      *       && i-esima riga ha j occorrenze di * 
      * && se n<i, allora
      *       per ogni k, 
      *       se 0<=k<n, allora k-esima riga ha k occorrenze di *
      *          && se n<=k<i+1, allora k-esima riga ha n occorrenze di *
      *          && i-esima riga ha j occorrenze di *         
      * senza modificare il trapezio. Esso e' vero perche' la prima
      * implicazione e' soddisfatta dalla forma del trapezio stampato e la
      * seconda implicazione e' vera perche' la premessa e' falsa.
      *
      * Assumiamo j == n, quindi n<i.
      * Il predicato che descrive la configurazione ottenuta diventa:
      * se i<=n, allora
      *    per ogni k, 
      *    se 0<=k<i+1, allora 
      *       k-esima riga ha k occorrenze di *
      *       && i-esima riga ha j occorrenze di * 
      * && se n<i, allora
      *       per ogni k, 
      *       se 0<=k<n, allora 
      *          k-esima riga ha k occorrenze di *
      *          && se n<=k<i+1, allora k-esima riga ha n occorrenze di *
      *          && i-esima riga ha j occorrenze di *         
      * senza modificare il trapezio. Esso e' vero perche' la seconda
      * implicazione e' soddisfatta dalla forma del trapezio stampato e la
      * prima implicazione e' vera perche' la premessa e' falsa.
      */
     i = i + 1; 
     /* i e' diventato un nome per l'espressione i+1.
      * Il predicato diventa:
      * se i<=n, allora
      *    per ogni k, 
      *    se 0<=k<i, allora 
      *       k-esima riga ha k occorrenze di *
      *       && (i-1)-esima riga ha j occorrenze di * 
      * && se n<i, allora
      *       per ogni k, 
      *       se 0<=k<n, allora 
      *          k-esima riga ha k occorrenze di *
      *          && se n<=k<i, allora k-esima riga ha n occorrenze di *
      *          && (i-1)-esima riga ha j occorrenze di *         
      */      
     System.out.println();
     // Nulla cambia
     j = 0;
     /* La parte stampata del trapezio rimane immutata.
      * Ci si predispone a riempire daccapo una riga:
      *       *            riga 1
      *       **           riga 2
      *       ***          riga 3
      *       .....
      *       ******       riga i-1  con i-1 asterischi
      *       ********     riga i==n con n asterischi
      *       ********     riga n+1  con n asterischi
      *       .....
      *       ********     riga i-2 con n asterischi
      *       ********     riga i-1 con n asterischi
      *                    riga i   con 0 asterischi
      *
      * Il predicato vero, quindi, riassume la forma iniziale:
      * se i<=n, allora
      *    per ogni k,
      *    se 0<=k<i, allora 
      *      k-esima riga ha k occorrenze di *
      *       && i-esima riga ha j occorrenze di * 
      * && se n<i, allora
      *       per ogni k, 
      *       se 0<=k<n, allora 
      *          k-esima riga ha k occorrenze di *
      *          && se n<=k<i, allora k-esima riga ha n occorrenze di *
      *          && i-esima riga ha j occorrenze di *         
      */
   }
  }
  /* i == m && (j == i || j == n) implica che il trapezio ha forma:
   *
   *       *            riga 1
   *       **           riga 2
   *       ***          riga 3
   *       .....
   *       ******       riga i-1  con i-1 asterischi
   *       ********     riga i==n con n asterischi
   *       ********     riga n+1  con n asterischi
   *       .....
   *       ********     riga i-1 con n asterischi
   *       ********     riga m   con m asterischi
   *
   * Il disegno rappresenta in effetti il caso in cui n<m.
   * Esso è descritto dal secondo ramo sell'invariante:
   * se n<m, allora
   *       per ogni k, 
   *       se 0<=k<n, allora 
   *          k-esima riga ha k occorrenze di *
   *          && se n<=k<m, allora k-esima riga ha n occorrenze di *
   *          && m-esima riga ha 0 occorrenze di *
   * e la base contiene proprio m-n righe.
   * Un discroso analogo, vale per il triangolo che si otterrebbe con 
   * n>=m.
   */
}










