import java.util.Arrays;

/**
 * InsertionSortIter ordina l'array {@code a} di {@code int}, restituendone un clone
 * con elementi in ordine non decrescente.
 */
public class InsertionSortIter {
    /**
     * Ordina a in maniera accademica, individuando l'operazione fondamentale da
     * iterare.
     * 
     * @param a
     *            array da ordinare
     * @return clone di a ordinato
     */
    public static void insertionSort(int[] a) {
        if (a != null) {
            int i = 1;
            while (i < a.length) {
                /*
                 * INVARIANTE. a[0..i-1] e' in ordine.
                 */
                insert(a, i);
                /*
                 * a[0..i] e' in ordine. Ma a[0..i] si puo' riscrivere come
                 * a[0..(i+1)-1]
                 */
                i = i + 1;
                /*
                 * a[0..i-1] e' in ordine.
                 */
            }
            /*
             * i==a.length && a[0..i-1] e' in ordine. Quindi a[0 .. (r.length-1)] e'
             * totalmente ordinato.
             */            
        }
    }

    /**
     * Sposta verso sinistra l'elemento di {@code a}, che assumiamo essere
     * ordinato, e che sta in posizione {@code p}, fino a posizionarlo in modo
     * che l'elemento che lo precede non sia maggiore.
     * 
     * @param a
     *            array in cui spostare l'elemento
     * @param p
     *            posizione iniziale dell'elemento da spostare
     */
    private static void insert(int[] a, int p) {
        int i = p;
        while (i > 0 && a[i - 1] > a[i]) { // lazy && fondamentale!
            /*
             * i > 0 && a[i-1]>a[i] && A(p, i) && B(p, i) in cui 
             * A(p, i) && B(p,i) e' l'INVARIANTE dove:
             * A(p, i) definito. come 
             * (forall k. 0 <= k < i-1 ==> a[k] <= a[k+1]) 
             * B(p, i) definito come 
             * (forall j. i <= j < p ==> a[j] <= a[j+1])
             */
            scambia(a, i, i - 1);
            /*
             * i > 0 && a[i-1]<a[i] && A(p, i-1) && B(p, i-1) in cui 
             * A(p, i-1) def. come (forall k. 0 <= k < (i-1)-1 ==> a[k] <= a[k+1]) 
             * B(p, i-1) def. come (forall j. i-1 <= j < p ==> a[j] <= a[j+1])
             */
            i = i - 1;
            /*
             * i >= 0 && A(p, i) && B(p, i) in cui 
             * A(p, i) def. come (forall k. 0 <= k < i-1 ==> a[k] <= a[k+1]) 
             * B(p, i) def. come (forall j. i <= j < p ==> a[j] <= a[j+1])
             */
        }
        /*
         * (i==0 || (i>0 && a[i-1]<=a[i])) && A(p, i) && B(p, i)
         * 
         * Sia i==0. Allora B(p, 0) vero indica che tutti gli elementi a[0..p]
         * sono in ordine. Si può osservare che A(p, 0) e' vero grazie alla
         * premessa vacua.
         * 
         * Sia i>0 && a[i-1]<=a[i]). 
         * Sviluppando A(p, i) && a[i-1]<=a[i] && B(p,
         * i) possiamo scrivere: a[0]<=a[1] &&..&& a[i-2]<=a[i-1] && (da A(p,
         * i)) a[i-1]<=a[i] && a[i]<=a[i+1] &&..&& a[p-1]<=a[p] && (da B(p, i)).
         * Quindi, a[0..p] sono in ordine.
         */
    }

    private static void scambia(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * Migliora di qualche passo il meccanismo di scambio.
     * 
     * @param a
     *            array da ordinare
     * @return clone di a ordinato
     */
    public static int[] insertionSortOttimizzato(int[] a) {
        int[] r;
        r = Arrays.copyOf(a, a.length);
        for (int p = 1; p < r.length; p++) {
            int daInserire = r[p];
            int i = p;
            while (i > 0 && r[i - 1] > daInserire) {
                r[i] = r[i - 1];
                i--;
            }
            r[i] = daInserire;
        }
        return r;
    }
}