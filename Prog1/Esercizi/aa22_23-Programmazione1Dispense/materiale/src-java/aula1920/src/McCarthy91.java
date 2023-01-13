/**
 * In matematica discreta, la Funzione 91 di McCarthy e' una funzione ricorsiva che vale 91 
 * per tutti gli argomenti n <= 100, mentre vale n − 10 per n >= 101.
 */
public class McCarthy91 {

	public static int MC91 (int n) {
		return (n > 100) ? n - 10 : MC91(MC91(n + 11));
	}
	
	public static void main(String[] args) {
		final int LIMITE = 200;
		
		for (int i = 0; i < LIMITE; i++) 
			System.out.println(MC91(i));
	}

}
