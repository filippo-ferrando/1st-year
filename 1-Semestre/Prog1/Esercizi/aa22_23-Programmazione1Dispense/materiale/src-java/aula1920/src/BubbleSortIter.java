import java.util.Arrays;

/**
 * BubbleSort ordina un array {@code a} di {@code int}, restituendo un
 * clone con elementi in ordine non decrescente.
 * <p>
 * Per comprendere la strategia di ordinamento, supponiamo che l'array
 * {@code a} da ordinare abbia lunghezza {@code l}. L'ordinamento assume una
 * situazione generica tale che:
 * <ul>
 * <li>la sequenza {@code a[i+1,...,l]} di {@code a} e' ordinata, ovvero
 * tale che {@code a[i+1]<=a[i+2],a[i+2]<=a[i+3] ... a[l-1]<=a[l]},
 * <li> {@code a[0] ... a[i-1] a[i]} e' ancora da ordinare,
 * <li>ogni elemento della parte ordinata non e' inferiore a nessun elemento
 * nella porzione non ordinata:
 * {@code a[0]<=a[i+1],a[1]<=a[i+1] ... a[i]<=a[i+1]}.
 * </ul>
 * L'obiettivo e' estendere di un elemento alla volta la parte ordinata,
 * includendovi l'elemento opportuno, preso da quella non ordinata.
 * L'elemento opportuno e' il massimo valore della parte non ordinata.
 * <p>
 * La peculiarita' dell'algoritmo e' che il massimo in
 * {@code a[0] ... a[i-1] a[i]} viene fatto emergere, confrontando a due a
 * due gli elementi.
 * <p>
 * Al termine del processo di affioramento la situazione della porzione non
 * ordinata e':
 * <ul>
 * <li>  {@code a[0]<=a[i],a[1]<=a[i] ... a[i-1]<=a[i]},
 * <li>  {@code a[i]<=a[i+1],a[i]<=a[i+2] ... a[i]<=a[l]}.
 * </ul>
 * Quindi, {@code a[i]} può essere incluso nella parte ordinata,
 * riconducendoci alla situazione generica, in cui la parte ordinata
 * contiene un elemento in piu', e quella non ordinata, uno in meno.
 * <p>
 * Dopo aver studiato il codice e' possibile analizzare il costo in tempo
 * del bubbleSort. Risultera' che, all'allungarsi dell'array, il tempo per
 * completare l'ordinamento potra' crescere.
 * <p>
 * La situazione generica implica, che il metodo {@code emersioneDelMassimo}
 * sia usato per cercare il massimo sugli intervalli via via decrescenti
 * {@code a[0,...,l-1]}, {@code a[0,...,l-2]}, ... , {@code a[0,1]}. Per
 * ogni {@code i} tale che {@code 0<=i<=l-1},
 * {@code emersioneDelMassimo(0,i,r)} cerca il massimo tra {@code i+1}
 * elementi eseguendo {@code i} confronti. Quindi, al primo richiamo di
 * {@code emersioneDelMassimo} saranno eseguiti {@code l-1} confronti, al
 * secondo {@code l-2}, al terzo {@code l-3}, all'ultimo
 * {@code l-(l-1)-1 = 0} confronti.
 * <p>
 * In totale il numero di confronti e' dato dalla somma
 * {@code (l-1)+(l-2)+...+2+1} che vale {@code (l-1)((l-1)+1)/2}.
 * <p>
 * Si conclude che il tempo di ordinamento cresca proporzionalmente al
 * quadrato della lunghezza. Ovvero, se {@code a} e' lunga {@code l} allora
 * il tempo per produrre {@code r} e' proporzionale a {@code l*l}.
 * <p>
 * NOTA. <br>
 * Esiste una variante che interrompe l'ordinamento quando
 * {@code emersioneDelMassimo} non esegue piu' scambi, ma non e'
 * interessante ai fini del corso.
 */

public class BubbleSortIter {

    /**
     * Riorganizza l'array dato come input, ordinandolo in ordine non
     * decrescente.
     * 
     * @param a
     *            array da ordinare.
     * @return array permutazione di {@code a} con elementi in ordine non
     *         decrescente.
     */
    public static int[] bubbleSort(int[] a) {
        int[] r = Arrays.copyOf(a, a.length);
        int j = r.length;
        while (0 < j) {
            bubble(r, 0, j - 1);
            j = j - 1;
        }
        return r;
    }

    /**
     * Data un array {@code a} di {@code int} e due indici legali
     * {@code min<=max} su di essa, la riorganizza in modo che il massimo valore
     * sia spostato in posizione {@code max}.
     * <p>
     * La riorganizzazione procede confrontando coppie consecutive di elementi
     * di {@code a}. La prima coppia confrontata e' {@code a[0],a[1]}. Se
     * {@code a[0]>a[1]} scambia i valori. Indifferentemente dal fatto che lo
     * scambio sia avvenuto, si continua confrontando {@code a[1],a[2]}. Se
     * {@code a[1]>a[2]} scambia i valori. Indifferentemente dal fatto che lo
     * scambio sia avvenuto, si continua confrontando {@code a[2],a[3]}. Se
     * {@code a[2]>a[3]} scambia i valori, etc..
     *
     * @param a
     *            array nella quale far emergere il massimo.
     * @param min
     *            posizione da cui partire.
     * @param max
     *            posizione cui terminare.
     */
    public static int[] bubble(int[] a, int min, int max) {
        /*
         * Per ogni min <= i <= max e per ogni k, se min <=k < i allora
         * a[k]<=a[k + 1]
         */
        int i = min;
        while (i < max) {
            if (a[i] > a[i + 1]) 
                scambia(a, i, i + 1);
            i++;
        }
        /*
         * i == max e a[min] <= a[min + 1]...a[max - 1] <= a[max]
         */
        return a;
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
