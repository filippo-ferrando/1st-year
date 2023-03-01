/**
 * Legge una sequenza di caratteri da tastiera, che contiene
 * solo parentesi aperte '(' o chiuse ')' ed e' terminata dal
 * carattere 'f'. Restituisce {@code true} se la sequenza e'
 * correttamente parentesizzata. restituisce {@code false}
 * altrimenti.
 * <p>
 * Grazie all'uso di {@code SIn.readChar()} e' possibile scrivere,
 * ad esempio, {@code ( ( ) ( ( ) ( ) ) ) f} su una stessa riga,
 * facendo attenzione a separare i caratteri con uno spazio.
 */
public class ParentesiOKPilaChar {

	private static char leggeChar() {
		char c;

		do {
			System.out.println("Parentesi? (f x fine)");
			c = SIn.readLineNonwhiteChar();
		} while (c != 'f' && c != '(' && c != ')');

		return c;
	}

	public static void main(String[] args) {
		
		PilaChar.reset();
		
		char c;
		boolean errore = false;
		
		do {
			c = leggeChar();
	
			if (c == '(')
				PilaChar.push(c);
			if (c == ')' && !PilaChar.empty()) 
				errore = '(' != PilaChar.top();	
			
		} while (c != 'f' && !errore);
		
		
		if (errore)
			System.out.println("Errore");
		else
			System.out.println("Parentesi corrette.");
	}
	
	/**
	 * Prototipo non ancora debuggato
	public static boolean pRec(int l) {

		boolean errore = false;
		char c = ' ';
		do {
			c = leggeChar();
			if      (c == '(')
				PilaChar.push(c);
			else if (c == ')' && PilaChar.top() == '(')
				errore = false;
			else if (c == ')' && PilaChar.top() != '(')
				errore = true;
			else if (c == 'f' && !PilaChar.empty())
				errore = true;
			else
				errore = false;
		
		} while (c != 'f' && !errore);
	}
	 */

}
