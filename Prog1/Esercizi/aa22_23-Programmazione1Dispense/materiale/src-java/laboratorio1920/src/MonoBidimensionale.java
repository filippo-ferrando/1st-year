/**
 * Dato un array {@code a} e fissato un numero {@code nC}, restituisce matrici
 * bidimensionali con {@code nC} colonne ed un numero sufficiente di righe a
 * contenere tutti gli elementi di {@code a}.
 */
public class MonoBidimensionale {

	/**
	 * Trasforma a in una matrice bidimensionale con nroColonne, evitando di
	 * usare operazioni modulari per l'aggiornamento corretto degli indici
	 * di scorrimento sulla matrice.
	 * 
	 * @param a
	 *            array da trasformare in matrice bidimensionale
	 * @param nroColonne
	 *            della matrice bidimensionale da ottenere
	 * @return matrice bidimensionale con nroColonne ed abbastanza righe da
	 *         contenere tutti gli elementi di a
	 */
	public static int[][] monoBi(int[] a, int nroColonne) {
		
		int[][] m = new int[(a.length / nroColonne) 
		                        + ((a.length % nroColonne > 0)? 1: 0)][nroColonne];
		
		int r = 0;
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			m[r][c] = a[i];
			c++;
			if (c == nroColonne) {
				c = 0;
				r++;
			}
		}

		return m;
	}

	/**
	 * Trasforma a in una matrice bidimensionale con nroColonne, usando
	 * operazioni modulari per l'aggiornamento corretto degli indici
	 * di scorrimento sulla matrice.
	 * 
	 * @param a
	 *            array da trasformare in matrice bidimensionale
	 * @param nroColonne
	 *            della matrice bidimensionale da ottenere
	 * @return matrice bidimensionale con nroColonne ed abbastanza righe da
	 *         contenere tutti gli elementi di a
	 */
	public static int[][] monoBiMod(int[] a, int nroColonne) {
		
		int[][] m = new int[(a.length / nroColonne) 
	                        + ((a.length % nroColonne > 0)? 1: 0)][nroColonne];
		
		int r = 0;
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			m[r][c] = a[i];
			c = (c + 1) % nroColonne;
			if (c == 0)
				r++;
		}

		return m;
	}

	private static String toStringMat(int[][] m) {

		String s = "";

		for (int r = 0; r < m.length; r++) {
			s = s + "{ ";
			for (int c = 0; c < m[r].length; c++)
				s = s + m[r][c] + " ";
			s = s + "}\n";
		}

		return s;
	}

	public static void main(String[] args) {

		final int LUNGHEZZA = 10;
		int[] a = new int[LUNGHEZZA];

		for (int i = 0; i < LUNGHEZZA; i++)
			a[i] = i;


   		for (int nroCol = 3; nroCol < 6; nroCol++) {
 			System.out.println("----------");
			System.out.println(toStringMat(monoBi(a, nroCol)));
		}

		for (int nroCol = 3; nroCol < 6; nroCol++) {
			System.out.println("----------");
			System.out.println(toStringMat(monoBiMod(a, nroCol)));
		}


	}
}
