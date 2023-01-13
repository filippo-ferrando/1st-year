/**
 * Legge, ricorsivamente, una sequenza di caratteri da tastiera, che contiene
 * solo parentesi aperte '(' o chiuse ')' ed e' terminata dal carattere 'f'.
 * Restituisce {@code true} se la sequenza e' correttamente parentesizzata.
 * restituisce {@code false} altrimenti.
 * <p>
 * Grazie all'uso di {@code SIn.readChar()} e' possibile scrivere, ad esempio,
 * {@code ( ( ) ( ( ) ( ) ) ) f} su una stessa riga, facendo attenzione a
 * separare i caratteri con uno spazio.
 */
public class ParentesiOKRec {

	private static char leggeChar() {
		char c;

		do {
			System.out.println("Parentesi? (f x fine)");
			c = SIn.readLineNonwhiteChar();
		} while (c != 'f' && c != '(' && c != ')');

		return c;
	}

	public static boolean pIbrido(int l) {

		boolean errore = false;
		char c = ' ';

		do {
			c = leggeChar();
			if (c == '(')
				errore = pIbrido(l + 1);
			else if (c == ')' && l > 0)
				return false;
			else if (c == ')' && l == 0)
				errore = true;
			else if (c == 'f' && l > 0)
				errore = true;
			else
				errore = false;
		} while (c != 'f' && !errore);

		return errore;
	}

	public static boolean pRec(int l) {

		boolean errore = false;
		char c = ' ';

		c = leggeChar();
		if      (c == '(')
			errore = pRec(l + 1);
		else if (c == ')' && l > 0)
			return false;
		else if (c == ')' && l == 0)
			errore = true;
		else if (c == 'f' && l > 0)
			errore = true;
		else
			errore = false;
		
		if (c != 'f' && !errore)
			return pRec(l);
		else
			return errore;
	}

	public static void main(String[] args) {

		System.out.println("Scrivere una sequenza di ( e ) che termini con f.");
		// if (pIbrido(0))
		if (pRec(0))
			System.out.println("Errore");
		else
			System.out.println("Parentesi corrette.");
	}
}
