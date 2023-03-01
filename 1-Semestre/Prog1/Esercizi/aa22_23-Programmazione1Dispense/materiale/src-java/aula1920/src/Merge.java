import java.util.Arrays;

/**
 * Fornisce due metodi per fondere due arry ordinati un solo, ordinato.
 * <p>
 * ESEMPIO. <br>
 * Array di partenza: {5 67 100}, {9 34 123 450}. <br>
 * Array risultante : {5 9 34 67 100 123 450}.
 */
public class Merge {

    /**
     * Fonde i due array {@code a} e {@code b}, che assumiamo essere ordinati,
     * in un array ordinato.
     * <p>
     * INVARIANTE. 
     * Sort(a,a.length) && Sort(b,0,b.length) && Sort(b,0,i+j) &&
     * Sup(i,j) && Esistono f:{0..i-1} --> {0..i+j-1} e g:{0..j-1} -->
     * {0..i+j-1} iniettive tali che InjF(i) && InjG(j) && Merge(i,j) in cui:
     * Sort(x,l) = (Per ogni k. se 0 <= k < l-1, allora c[k] <= c[k+1]), 
     * Sup(i,j) = se i+j-1 >= 0, allora c[i+j-1] <= a[i] && c[i+j-1] <= b[j], 
     * InjF(i) = (Per ogni k. se 0 <= k < i, allora a[k] == c[f(k)]), 
     * InjG(j) = (Per ogni k. se 0 <= k < j, allora b[k] == c[g(k)]), 
     * Merge(i, j) = (Per ogni h, k. se 0 <= h < i e 0 <= k < j, allora f(h) != g(k)).
     * 
     * @param a
     *            primo array ordinato da fondere
     * @param b
     *            secondo array ordinato da fondere
     * @return array con gli elementi di a e b mescolati in ordine
     */
    public static int[] merge(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) { // NON || !!!!!!!

            if (a[i] < b[j]) {
                c[i + j] = a[i];
                i++;
            } else {
                c[i + j] = b[j];
                j++;
            }
        }

        // inserisce elementi restanti di a in c
        while (i < a.length) {
            c[i + j] = a[i];
            i++;
        }

        // inserisce elementi restanti di b in c
        while (j < b.length) {
            c[i + j] = b[j];
            j++;
        }
        return c;
    }

    /*
     * Fonde i due array {@code a} e {@code b}, che assumiamo essere ordinati,
     * in un array ordinato {@code c}, anch'esso passato come parametro.
     * 
     * @param a
     *            primo array ordinato da fondere
     * @param b
     *            secondo array ordinato da fondere
     * @param c
     *            array con i primi due fusi ordinatamente
     * @param i
     *            primo parametro induttivo
     * @param j
     *            secondo parametro induttivo
     */
    private static void mergeRec(int[] a, int[] b, int[] c, int i, int j) {
      if (i < a.length && j < b.length) 
         if (a[i] < b[j]) {
            c[i + j] = a[i];
            mergeRec(a, b, c, i + 1, j);
         } else {
            c[i + j] = b[j];
            mergeRec(a, b, c, i, j + 1);
         }
      else if (i < a.length) {
         c[i + j] = a[i];
         mergeRec(a, b, c, i + 1, j);
      }
      else if (j < b.length) {
         c[i + j] = b[j];
         mergeRec(a, b, c, i, j + 1);
      }
    }
    
    /**
     * Fonde i due array {@code a} e {@code b}, che assumiamo essere ordinati,
     * in un array ordinato.
     * 
     * @param a
     *            primo array ordinato da fondere
     * @param b
     *            secondo array ordinato da fondere
     * @return array con gli elementi di a e b mescolati in ordine
     */
    public static int[] mergeRec(int[] a, int[] b) {
       int[] c = new int[a.length + b.length];
       mergeRec(a, b, c, 0, 0);
       return c;
    }
    
    public static void main(String[] args) {
        int[] a = { 5, 67, 100 };
        int[] b = { 9, 34, 123, 450 };
        System.out.println(Arrays.toString(merge(a,b)));
        System.out.println(Arrays.toString(mergeRec(a,b)));
    }
}