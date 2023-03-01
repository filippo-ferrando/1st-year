/**
 * Quoziente della divisione tra dividendo {@code d} per mezzo del divisore 
 * positivo {@code s}, ottenuto come iterazione di sottrazioni successive.
 * <p>
 * Interpretare con:
 * 
 * <pre>
 *     {@code java -ea QuozienteDifferenzaIterata}
 * </pre>
 * 
 * dopo aver:
 * <ul>
 * <li>cambiato {@code dMS = dMS - 1;} in {@code dMS = dMS + 1;},
 * <li>o {@code qDS = qDS + 1;} in {@code qDS = qDS + 2;},
 * <li>o {@code rDS >= s} in {@code rDS > s}.
 * </ul>
 */
public class QuozienteDifferenzaIterata {
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
		assert (rDS < s) : "Condizione d'uscita non soddisfatta.";
		System.out.println("quoziente = " + qDS + ".");
	}
}