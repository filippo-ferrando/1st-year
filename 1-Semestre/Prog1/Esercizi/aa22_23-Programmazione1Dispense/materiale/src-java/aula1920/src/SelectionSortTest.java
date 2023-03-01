/**
 *
 */
public class SelectionSortTest {

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
                .println("----- Array ordinati con selectionSort iterativo.");
        int[] rA = SelectionSortIter.selectionSort(a);
        int[] rB = SelectionSortIter.selectionSort(b);
        System.out.println(" rA = " + LibreriaCreazioneStampaArray.toString(rA)
                + ".");
        System.out.println(" rB = " + LibreriaCreazioneStampaArray.toString(rB)
                + ".");

        System.out.println(
                "----- Array ordinati con selectionSort ricorsivo.");
        SelectionSortRec.selectionSort(c);
        SelectionSortRec.selectionSort(d);
        System.out.println(
                " rC = " + LibreriaCreazioneStampaArray.toString(c) + ".");
        System.out.println(
                " rD = " + LibreriaCreazioneStampaArray.toString(d) + ".");
    }
 }
