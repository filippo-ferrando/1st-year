public class BubbleSortRec {

    /**
     * Versione ricorsiva de {@code BubbleSortIter}. Ordina un array {@code a}
     * di {@code int} facendo via via affiorare il massimo nella porzione non
     * ordinata, confrontando gli elementi a due a due. In questo caso
     * l'ordinamento avviene in-place, perche' il metodo non genera alcun clone
     * dell'array da ordinare.
     * <p>
     * La specifica e' che {@code sort} restituisce {@code a} in cui la porzione
     * ordinata e' {code a[0,...,i]}.
     * <p>
     * Dato un array {@code a[0,...,i]}, il meccanismo ricorsivo di ordinamento
     * e' il seguente:
     * <ol>
     * <li>faccio emergere il massimo contenuto in {@code a[0,...,i]},
     * <li>ordino i restanti elementi {@code a[0,...,i-1]}.
     * </ol>
     */
    public static void bubbleSort(int[] a) {
        if (a != null) 
            bubbleSort(a, a.length - 1);
    }

    private static void bubbleSort(int[] a, int i) {
        if (i > 0) {
            bubble(a, i);
            bubbleSort(a, i - 1);
        }
    }

    /**
     * Emersione del massimo nella porzione a[0]...a[i] di {@code a}: al
     * termine, {@code a[i]} non e' inferiore ad alcuno degli elementi che lo
     * precedono.
     */
    private static void bubble(int[] a, int i) {
        for (int j = 0; j < i; j++)
            scambia(a, j, j + 1);
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
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
