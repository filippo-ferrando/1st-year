public class BubbleSortRecLaboratorioTest {
	
	public static void stampa(int[] vet, int i) {
		if (i < vet.length) {
			System.out.print(vet[i]);
			stampa(vet, i + 1);
		}
	}

	public static void main(String args[]) {
		System.out.println("Scrivi la lunghezza del vettore: ");
		int l = SIn.readLineInt();
		int[] dati = new int[l];
		System.out.println("Scrivi " + dati.length
				+ " numeri interi su righe diverse");
		for (int i = 0; i < dati.length; i++)
			dati[i] = SIn.readLineInt();
		
		BubbleSortRecLaboratorio.sort(dati, 0);
		
		stampa(dati,0);
	}
}
