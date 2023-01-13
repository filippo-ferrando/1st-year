/**
 * Il merge sort divide in due un array, ne ordina le due parti separatamente le
 * fonde ordinatamente.
 */
public class MergeSort {

	public static int[] mergeSort(int[] a) {
		if (a.length > 1) {
			int centro = a.length / 2;
			int[] aSx = clona(a, 0, centro);
			int[] aDx = clona(a, centro, a.length);
			int[] rSx = mergeSort(aSx);
			int[] rDx = mergeSort(aDx);
			return Merge.merge(rSx, rDx);
		} else
			return a;
	}
	
	private static int[] clona(int[] a, int inizio, int fine) {
	    int[] r = new int[fine - inizio];
	    for (int i = 0; i < r.length ; i++)
	       r[i] = a[i + inizio];
	    return r;
	}
		
	public static void main(String[] args) {

		int[] a = { 450, 5, 123, -1, 34, 67, 9, 200, 100, -4 };
		System.out.println(LibreriaCreazioneStampaArray.toString(mergeSort(a)));
		int[] b = { 450, 5, 123, -1, 34, 67, 9, 200, 100 };
		System.out.println(LibreriaCreazioneStampaArray.toString(mergeSort(b)));
	}
}