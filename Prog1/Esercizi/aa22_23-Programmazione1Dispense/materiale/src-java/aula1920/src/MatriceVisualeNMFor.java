/**
 * Modifica {@link MatriceVisualeNMWhile}: fissati due numeri naturali {@code m}
 * ed {@code n}, stampa una matrice di simboli {@code *} con {@code m} righe
 * ed {@code m} colonne, usando due cicli {@code for} annidati.
 * <p>
 * Calcolare il costo.
 */
public class MatriceVisualeNMFor {

	public static void main(String[] args) {

		int m = 5;
		int n = 7;

		for (int i = 0; i < m; i++) { 
			for (int j = 0; j < n; j = j + 1) 
				System.out.print("*");
			System.out.println();
		}
	}
}
