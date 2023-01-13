public class CountingSort {

	public static int[] countingSortNaive(int[] a) {

		int max = massimo(a);
		int[] r = new int[a.length];
		int[] f = new int[max + 1]; // frequenze

		for (int i = 0; i < a.length; i++)
			f[a[i]]++;

		int k = 0;
		for (int i = 0; i < f.length; i++)
				for (int j = 0; j < f[i]; j++) {
					r[k] = i;
					k++;
				}
		return r;
	}

	static int[] countingSort(int[] a) {

		int m = massimo(a);

		int[] r = new int[a.length]; // risultato
		int[] f = new int[m + 1];  // frequenze

		// conta frequenze di ogni valore 
		for (int i = 0; i < a.length; i++)
			f[a[i]]++;

		for (int i = 1; i < f.length; i++)
			f[i] = f[i] + f[i - 1]; 
		/* Al termine del ciclo, il numero di elementi che 
		 * nell'array ordinato r saranno minori o uguali ad i
		 * coincide col valore f[i]. 
		 */

		for (int i = a.length - 1; i >= 0; i--) {
			
			/* preso a[i], il valore di f[a[i]] indica
			 * sia quante occorrenze di a[i] debbano ancora
			 * essere piazzate in r, ed f[a[i]]-1 la posizione
			 * in r in cui a[i] vada piazzato
			 */
			r[f[a[i]] - 1] = a[i];

			/* dopo aver piazzato a[i] nella posizione f[a[i]]-1
			 * di r, rimangono solo f[a[i]]-1 occorrenze di a[i]
			 * da mettere
			 */	
			f[a[i]]--;
		}

		return r;
	}

	private static int massimo(int[] a) {
		int max = a[0];

		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];

		return max;
	}

	public static void main(String args[]) {
		int[] a = { 10, 2, 10, 8, 10, 2, 8 };
		
		int[] x = countingSortNaive(a);
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");

		System.out.println();
		x = countingSort(a);
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
	}
}