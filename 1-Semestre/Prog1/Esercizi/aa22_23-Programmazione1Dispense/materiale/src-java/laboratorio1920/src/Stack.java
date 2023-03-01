/**
 * Implementazione essenziale della struttura 'Stack'.
 * @author rover
 *
 */
public class Stack {
	
	// CAMPI STATICI
	public static int[] elementi;
	public static int cima;
	
	// METODI PUBBLICI
	public static boolean push (int e) {
		boolean inserire = cima < elementi.length;
		if (inserire) {
			elementi[cima] = e;
			cima++;
		}
		return inserire; 
	}

	public static boolean pop () {
		boolean eliminare = cima > 0;
		if (eliminare) 
			cima--;
		return eliminare; 
	}

	public static int top () {
		return elementi[cima]; 
	}

	public static boolean swap () {
		boolean scambiare = cima > 0;
		if (scambiare) {
			int tmp = elementi[cima];
				elementi[cima] = elementi[cima - 1];
				elementi[cima - 1] = tmp;
		}
		return scambiare; 
	}
}
