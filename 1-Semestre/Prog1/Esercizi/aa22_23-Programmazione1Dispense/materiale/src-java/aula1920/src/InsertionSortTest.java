/**
 *
 */
public class InsertionSortTest {

    public static void main(String[] args) {

        int[] a = { 10, 3, 1, 6, 90, 56 };
        int[] b = { 9, 67, 100, 5, 34, 123, 450 };
        int[] c = { 10, 3, 1, 6, 90, 56 };
        int[] d = { 9, 67, 100, 5, 34, 123, 450 };

        System.out.println("----- Array di partenza.");
        System.out.println(" a = " + LibreriaCreazioneStampaArray.toString(a)
                + ".");
        System.out.println(" b = " + LibreriaCreazioneStampaArray.toString(b)
                + ".");

        System.out
                .println("----- Array ordinati con insertionSortIter.");
        InsertionSortIter.insertionSort(a);
        InsertionSortIter.insertionSort(b);
        System.out.println(
                " a = " + LibreriaCreazioneStampaArray.toString(a) + ".");
        System.out.println(
                " b = " + LibreriaCreazioneStampaArray.toString(b) + ".");

        System.out.println("----- Array ordinati con insertionSortRic.");
        InsertionSortRic.insertionSort(c);
        InsertionSortRic.insertionSort(d);
        System.out.println(
                " c = " + LibreriaCreazioneStampaArray.toString(c) + ".");
        System.out.println(
                " d = " + LibreriaCreazioneStampaArray.toString(d) + ".");
    }
}
