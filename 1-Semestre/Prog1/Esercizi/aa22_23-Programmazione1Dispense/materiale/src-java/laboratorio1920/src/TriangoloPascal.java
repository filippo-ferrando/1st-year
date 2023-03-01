/**
 * Stampa il triangolo di Pascal, Tartaglia, etc, fissato
 * il livello massimo da raggiungere
 */
public class TriangoloPascal {

	public static void main(String[] args) {
		System.out.println("Livello massimo del triangolo? (l>=0)");
		int l = SIn.readInt();
		int n = 0;
		while (n <= l) {
			int k = 0;
			while (k <= n) {
				System.out.print(CoeffBinomialeRec.binom(n, k) + " ");
				k++;
			}
			System.out.println();
			n++;
		}
	}	
}