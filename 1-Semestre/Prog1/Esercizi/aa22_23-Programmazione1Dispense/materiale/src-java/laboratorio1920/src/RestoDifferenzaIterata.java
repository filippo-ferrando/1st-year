/**
 * Resto della divisione del dividendo {@code d} per mezzo del divisore positivo
 * {@code s}, ottenuto come iterazione di sottrazioni successive.
 * <p>
 * Questo e' un programma che evidenzia come il testing associato 
 * all'uso delle {@code assertion} non sia sufficiente
 * a dimostrare la correttezza parziale di un programma.
 * <p>
 * Interpretare con:
 * 
 * <pre>
 *     {@code java -ea QuozienteDifferenzaIterata}
 * </pre>
 * 
 * dopo aver modificato {@code rDS >= s} in {@code rDS > s}.
 * <p>
 * Non sara' difficile trovare valori di input, ad esempio
 * 87 e 23, che non generano errore, pur avendo casi, come
 * 87 e 1, in cui l'errore e' segnalato.
 * 
 */
public class RestoDifferenzaIterata {
	public static void main(String[] args) {

		System.out.println("Dividendo:");
		int d = SIn.readInt();
		System.out.println("Divisore:");
		int s = SIn.readInt();

		int qDS = 0;
		int rDS = d;
		assert (d == qDS * s + rDS) : "Invariante: non soddisfatto in ingresso.";
		while (rDS >= s) {
			assert (d == qDS * s + rDS) : "Invariante non soddisfatto nel ciclo.";
			qDS = qDS + 1;
			rDS = rDS - s;
		}
		assert (rDS < s && (d == qDS * s + rDS)) : "Condizione d'uscita non soddisfatta.";
		System.out.println("resto = " + rDS + ".");
	}
}