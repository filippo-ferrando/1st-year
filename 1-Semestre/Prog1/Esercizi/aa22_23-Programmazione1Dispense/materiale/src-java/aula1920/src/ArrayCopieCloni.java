import java.util.Arrays;

/**
 * Creazioni di copie o di cloni di array, che evidenziano il fenomeno dell'aliasing. 
 */
public class ArrayCopieCloni {
	/**
	 * Dati due puntatori a istanze {@code a} e {@code b} di tipo {@code int[]},
	 * copia il valore di ogni elemento in {@code b} nella cella di egual
	 * posizione di {@code a}. Il risultato è il puntatore ad {@code a}.
	 *
	 * @param a
	 *            puntatore ad un'istanza di tipo {@code int[]}.
	 * @param b
	 *            puntatore ad un'istanza di tipo {@code int[]}.
	 */
	public static void arrayClone(int[] a, int[] b) {

		for (int i = 0; i < b.length; i++)
			a[i] = b[i];
	}

	/**
	 * Dato un puntatore ad un'istanza {@code b} di tipo {@code int[]}, ne
	 * restituisce uno nuovo che punti ad un'array uguale a {@code b}, elemento
	 * per elemento.
	 *
	 * @param b
	 *            puntatore ad un'istanza di tipo {@code int[]}.
	 * @return puntatore ad un'istanza di tipo {@code int[]} identica, elemento
	 *         per elemento, all'array b.
	 */
	public static int[] arrayClone(int[] b) {

		int[] a = new int[b.length];
		arrayClone(a, b);
		return a;
	}


	private static void stampa(int[] a) {

		System.out.print("{ ");
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + " ");
		System.out.println("}");
	}

	public static void main(String[] args) {

		int[] b = { 1, 2, 3 };
		System.out.print("Array b: ");
		stampa(b);

		int[] a = new int[b.length];
		arrayClone(a, b);
		System.out.print("Array a: ");
		stampa(a);
		
		int[] c;
		c = arrayClone(b);
		System.out.print("Array c: ");
		stampa(c);

		System.out.println("Arrays.equals(a,b) e' " + Arrays.equals(a, b)
				+ ".");
		System.out.println("Arrays.equals(c,b) e' " + Arrays.equals(c, b)
				+ ".");
		System.out.println("Arrays.equals(a,c) e' " + Arrays.equals(a, c)
				+ ".");
		System.out.println("a == b e' " + (a == b)
				+ ".");
		System.out.println("c == b e' " + (c == b)
				+ ".");
		System.out.println("a == c e' " + (a == c)
				+ ".");
	}
}
