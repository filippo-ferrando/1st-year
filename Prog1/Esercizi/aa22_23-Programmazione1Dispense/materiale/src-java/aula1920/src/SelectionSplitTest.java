/**
 * Verifica dei metodi in {@link SelectionSplit}.
 */
public class SelectionSplitTest {

    private static void stampa(int[] a) {

        System.out.print("{ ");
        for (int k = 0; k < a.length; k++)
            System.out.print(a[k] + " ");
        System.out.println("}");
    }

    public static void main(String[] args) {

        int[] a      = {0,1,2,3,4,5,6,7,8,9};
        int[] aPrime = {10,11,12,13,14,15,16,17,18,19};

        System.out.print("0. Array iniziale: ");
        stampa(a);

        System.out.print("1. Riorganizzazione array con pari prima dei dispari iter: ");
        SelectionSplit.pariPrimaDeiDispariIter(a);
        stampa(a);

        System.out.print("2. Array iniziale: ");
        stampa(aPrime);

        System.out.print("3. Riorganizzazione array con pari prima dei dispari: ");
        SelectionSplit.pariPrimaDeiDispariRic(aPrime);
        stampa(aPrime);
    }
}