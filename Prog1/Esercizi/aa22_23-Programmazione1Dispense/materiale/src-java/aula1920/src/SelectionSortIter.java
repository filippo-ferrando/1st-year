import java.util.Arrays;

/**
 * SelectionSortIter ordina l'array {@code a} di {@code int}, restituendone un clone
 * con elementi in ordine non decrescente.
 */
public class SelectionSortIter {

    public static int[] selectionSort(int[] a) {
        int[] r;
        int min, i, j, l;
        r = Arrays.copyOf(a, a.length);
        l = r.length;
        i = 0;
        /*
         * per ogni i, se 0<=i<l allora (a) per ogni k, se 0<=k<i allora
         * r[k]<=r[k+1] (b) per ogni k, se i<=k<l allora r[i-1]<=r[k].
         */
        while (i < l - 1) {
            /*
             * per ogni i, se 0<=i<l allora (a) per ogni k, se 0<=k<i allora
             * r[k]<=r[k+1] (b) per ogni k, se i<=k<l allora r[i-1]<=r[k].
             */
            min = select(r, i, l);
            /*
             * per ogni i, se 0<=i<l allora (a) per ogni k, se 0<=k<i allora
             * r[k]<=r[k+1] (b) per ogni k, se i<=k<l allora r[i-1]<=r[k] (c)
             * per ogni k, se i<=k<l allora r[posMin]<=r[k].
             */
            scambia(r, i, min);
            /*
             * per ogni i, se 0<=i<l allora (a) per ogni k, se 0<=k<i allora
             * r[k]<=r[k+1] (b) per ogni k, se i<=k<l allora r[i-1]<=r[k] (c)
             * per ogni k, se i<=k<l allora r[i]<=r[k].
             * 
             * Quindi: per ogni i, se 0<=i<l allora (a) per ogni k, se 0<=k<i+1
             * allora r[k]<=r[k+1] (b) per ogni k, se i+1<=k<l allora
             * r[i-1]<=r[k].
             */
            i++;
            /*
             * per ogni i, se 0<=i<l allora (a) per ogni k, se 0<=k<i allora
             * r[k]<=r[k+1] (b) per ogni k, se i<=k<l allora r[i-1]<=r[k].
             */
        }
        /*
         * i=l-1 e (a) per ogni k, se 0<=k<i allora r[k]<=r[k+1] (b) per ogni k,
         * se i<=k<=l-1 allora r[i-1]<=r[k].
         * 
         * Quindi:
         * 
         * (a) per ogni k, se 0<=k<l-1 allora r[k]<=r[k+1]
         * 
         * che equivale a:
         * 
         * r[0]<=r[1]...r[l-2]<=r[l-1].
         */

        return r;
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
    private static int select(int[] a, int i, int j) {
        int p = i;
        for (int k = p + 1; k < j; k++) {
            if (a[k] < a[p])
                p = k;
        }
        return p;
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
