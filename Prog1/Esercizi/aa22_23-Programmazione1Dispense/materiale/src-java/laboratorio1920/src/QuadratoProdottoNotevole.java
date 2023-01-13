/**
 * Dato {@code x}, calcola {@code x*x} assumendo di poter utilizzare solo somme
 * e di poter raddoppiare valori. Il programma sfrutta la proprieta':
 * 
 * <div> {@code (n+1)*(n+1) == n*n+2*n+1} </div>
 *
 */
public class QuadratoProdottoNotevole {
	public static void main(String[] args) {

		int x = 12; // valore da elevare al quadrato

		int n = 0;
		int qX = 0;
		assert (n * n == qX) : "Invariante falso prima del ciclo.";
		while (n < x) {
			assert (n * n == qX) : "Invariante falso ad inizio ciclo.";
			n = n + 1;
			assert (n * n == qX + 2 * n - 1) : "Invariante falso a meta' ciclo.";
			qX = qX + 2 * n - 1;
			assert (n * n == qX) : "Invariante falso a fine ciclo.";
		}
		assert (n == x) : "Condizione d'uscita falsa.";
		System.out.println(x + "^2 = " + qX + ".");
	}
}