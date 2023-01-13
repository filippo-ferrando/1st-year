/**
 * Insertion sort con metodi esclusivamente ricorsivi.
 */
public class InsertionSortRic {
    public static void insertionSort(int[] a) {
        if (a != null)
            insertionSort(a, 1);
    }

    private static void insertionSort(int[] a, int i) {
        if (i < a.length) {
            insert(a, i);
            insertionSort(a, i + 1);
        }
    }

    private static void insert(int[] a, int i) {        
        if (i > 0 && a[i] < a[i - 1]) {
            scambia(a, i, i - 1);
            insert(a, i - 1);
        }
    }
    
    private static void scambia(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}