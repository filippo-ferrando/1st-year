public class BubbleSortRecLaboratorio {

	static void sort(int[] a, int i) {
		if (i < a.length) {
			sort(a, i + 1);
			bubble(a, i);
		}
	}

	static void bubble(int[] vet, int i) {
		for (int j = 0; j < i; j++)
			if (vet[j] > vet[j + 1]) { // scambio
				int z;
				z = vet[j];
				vet[j] = vet[j + 1];
				vet[j + 1] = z;
			}
	}

}
