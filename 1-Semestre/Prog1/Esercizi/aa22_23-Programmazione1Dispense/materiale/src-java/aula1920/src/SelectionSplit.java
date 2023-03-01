/**
 * Alcuni esempi di algoritmi che seguono lo schema di riorganizzazione 
 * dell'algoritmo di Selection sort.
 */
public class SelectionSplit {

    /**
     * Riorganizza un array scambiandone gli elementi in modo che ogni valore
     * pari occorra prima di ogni valore dispari.
     * <p>
     * L'ordine finale dei numeri pari e dispari non e' rilevante.
     * <p>
     * ESEMPIO. <br>
     * Array iniziale: {3,4,7,8,2,0,1}. Array riorganizzato: {4,8,2,0,3,7,1}.
     *
     * @param a
     *            array da riorganizzare.
     */
    public static void pariPrimaDeiDispariIter(int[] a) {

        int prossimoPari = 0; // indice in cui mettere il prossimo pari
        int daEsaminare = 0; // indice all'elemento da esaminare
        int temp = 0;
        /*
         * (prossimoPari <= daEsaminare <= a.length) e (per ogni i, se 0 <= i <
         * prossimoPari allora a[i] e' pari) e (per ogni j, se prossimoPari <= j
         * < daEsaminare allora a[j] e' dispari)
         */
        while (daEsaminare < a.length) {
            /*
             * (prossimoPari <= daEsaminare < a.length) e (per ogni i, se 0 <= i
             * < prossimoPari allora a[i] e' pari) e (per ogni j, se
             * prossimoPari <= j < daEsaminare allora a[j] e' dispari)
             */
            if (a[daEsaminare] % 2 == 0) {
                /*
                 * (prossimoPari <= daEsaminare < a.length) e (per ogni i, se 0
                 * <= i < prossimoPari allora a[i] e' pari) e (per ogni j, se
                 * prossimoPari <= j < daEsaminare allora a[j] e' dispari) e
                 * (a[daEsaminare] e' pari)
                 */
                scambia(a, daEsaminare, prossimoPari);
                /*
                 * (prossimoPari <= daEsaminare < a.length) e (per ogni i, se 0
                 * <= i < prossimoPari + 1 allora a[i] e' pari) e (per ogni j,
                 * se prossimoPari <= j < daEsaminare + 1 allora a[j] e'
                 * dispari)
                 */
                prossimoPari++;
                /*
                 * (prossimoPari <= daEsaminare < a.length) e (per ogni i, se 0
                 * <= i < prossimoPari allora a[i] e' pari) e (per ogni j, se
                 * prossimoPari <= j < daEsaminare + 1 allora a[j] e' dispari)
                 */
            }
            daEsaminare++;
            /*
             * (prossimoPari <= daEsaminare < a.length) e (per ogni i, se 0 <= i
             * < prossimoPari allora a[i] e' pari) e (per ogni j, se
             * prossimoPari <= j < daEsaminare allora a[j] e' dispari)
             */
        }
        /*
         * (prossimoPari <= daEsaminare == a.length) e (per ogni i, se 0 <= i <
         * prossimoPari allora a[i] e' pari) e (per ogni j, se prossimoPari <= j
         * < daEsaminare allora a[j] e' dispari)
         */
    }
    
    public static void pariPrimaDeiDispariRic(int[] a) {
        pariPrimaDeiDispariRic(a, 0, 0);
    }
    
    private static void pariPrimaDeiDispariRic(int[] a, int prossimoPari, int daEsaminare) {
        if (daEsaminare < a.length)
            if (a[daEsaminare] % 2 == 0) {
                scambia(a, prossimoPari, daEsaminare);
                pariPrimaDeiDispariRic(a, prossimoPari + 1, daEsaminare + 1);
            } else
                pariPrimaDeiDispariRic(a, prossimoPari    , daEsaminare + 1);                
    }

    
    /*
     * Riorganizza l'array {@code a} come indicato dal nome
     * implementando una parte iterativa ed una ricorsiva dell'algoritmo.
     */
    public static void pariPrimaDeiDispariIbrida(int[] a) {
        pariPrimaDeiDispariIbrida(a, 0);
    }

    public static void pariPrimaDeiDispariIbrida(int[] a, int i) {
        if (i < a.length) {
            /*
             * La porzione a[i]...a[a.length - 1] non è vuota e deve ancora
             * essere riorganizzata come desiderato, con i valori pari che
             * precedono quelli dispari.
             */

            if (a[i] % 2 == 1) {
                /*
                 * Siccome a[i] è dispari, esso va rimpiazzato con un valore
                 * pari che si trovi tra gli elementi a[i + 1]..a[a.length - 1],
                 * se esiste.
                 */
                int j; // cerca il primo pari a destra di a[i]
                boolean trovato = false;
                for (j = i + 1; j < a.length && !trovato; j++)
                    trovato = (a[j] % 2 == 0);
                if (trovato) {// se trovato == true, allora a[j - 1] ha valore pari
                    // scambio valore pari con valore dispari
                    int tmp = a[j - 1];
                    a[j - 1] = a[i];
                    a[i] = tmp;
                    /*
                     * IPOTESI INDUTTIVA. riorganizza a[i + 1]...a[a.length - 1]
                     * con i valori pari che precedono quelli dispari.
                     */
                    pariPrimaDeiDispariIbrida(a, i + 1);
                    /*
                     * Siccome a[i] è pari, e tutti i pari in a[i +
                     * 1]..a[a.lenght - 1], se esistono, cominciano in a[i + 1]
                     * e continuano nelle posizioni adiacenti, senza soluzione
                     * di continuità, allora in a[i], a[i + 1]..a[a.lenght - 1]
                     * tutti i valori pari cominciano in a[i] e continuano nelle
                     * posizioni adiacenti, senza soluzione di continuità
                     */
                } else {
                    /*
                     * RAMO INUTILE. trovato == false implica che non esistono
                     * più elementi pari a destra dell'elemento che stiamo
                     * analizzando e non c'è più nulla da riorganizzare.
                     */
                }
            }
        }
    }


    /*
     * Riorganizza l'array {@code a} come indicato dal nome
     * con due indici che si muovono in direzioni opposte:
     * l'indice {@code i} sale, estendendo la parte di array
     * con i numeri pari. Invece, {@code j} cala, estendendo
     * la parte di array con i valori dispari.
     */
    public static void pariPrimaDeiDispariSimmetrica(int[] a) {
        pariPrimaDeiDispariSimmetrica(a, 0, a.length - 1);
    }

    public static void pariPrimaDeiDispariSimmetrica(int[] a, int i, int j) {
        if (i < j) {
            if (a[j] % 2 == 0) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                pariPrimaDeiDispariSimmetrica(a, i + 1, j);
            }
            if (a[j] % 2 == 1) {
                pariPrimaDeiDispariSimmetrica(a, i, j - 1);
            }
        }
    }    
    
    /* Scambia gli elementi di posizione {@code i} e {@code j} in {@code a},
     * sfruttando il fatto che {@code a} e' un puntatore ad array.
     *
     * @param i
     *            posizione di un elemento da scambiare.
     * @param j
     *            posizione di un elemento da scambiare.
     * @param a
     *            array in cui scambiare elementi.
     */
    private static void scambia(int[] a, int i, int j) {
        int tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}