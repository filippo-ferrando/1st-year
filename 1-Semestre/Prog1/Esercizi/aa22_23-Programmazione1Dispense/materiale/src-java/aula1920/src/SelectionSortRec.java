/**
 * Selection sort con metodi esclusivamente ricorsivi.
 */
public class SelectionSortRec {
    
    public static void selectionSort(int[] a) {
        if (a != null)
            selectionSort(a, 0);
    }

    private static void selectionSort(int[] a, int i) {
        if (i < a.length) {
            int min = select(a, i); // indice del minimo tra 0 e a.length-1
            scambia(a, min, i);
            selectionSort(a, i + 1);
        }
    }

    /**
     * Individua la posizione tra {@code i} e {@code j}, entrambe incluse,
     * dell'elemento di valore minimo in {@code a}.
     *
     * @param i
     *            posizione da cui cominciare la ricerca.
     * @param j
     *            posizione cui terminare la ricerca.
     * @param a
     *            array in cui cercare.
     */
    private static int select(int[] a, int i) {
        if (i < a.length - 1) {
            int m = select(a, i + 1);
            if (a[m] > a[i])
                return i;
            else
                return m;
        } else
            return i;
    }
    
    /**
     * Scambia gli elementi di posizione {@code i} e {@code j} in {@code a},
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
