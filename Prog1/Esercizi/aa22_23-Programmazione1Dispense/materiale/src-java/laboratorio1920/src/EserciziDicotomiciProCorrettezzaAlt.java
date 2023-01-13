
public class EserciziDicotomiciProCorrettezzaAlt {

	/**
	 * Restituisce il valore minimo dell'array {@code a} che assumiamo non sia
	 * vuoto. L'ipotesi e' che {@code a} abbia almeno un elemento.
	 * 
	 * @param a
	 *            array in cui cercare
	 * @return valore minimo in a
	 */
	private static int minimo(int[] a) {
		if (a.length - 1 == 0)
			return a[a.length - 1]; // con un solo elemento il minimo e' unico
		else {
			int[] aSx = new int[(int)Math.ceil(a.length - 1)];
			int[] aDx = new int[(int)Math.floor(a.length - 1) + 1]; 
			
			for (int i = 0; i < aSx.length; i++)
				aSx[i] = a[i];
			
			for (int i = 0; i < aDx.length; i++)
				aDx[i] = a[aSx.length + i];
			
			int mS = minimo(aSx); 
			int mD = minimo(aDx); 
			return ((mS < mD) ? mS : mD); // minimo relativo alla porzione a[s..d]
		}
	}

	/**
	 * Conta il numero di elementi di {@code a} il cui valore sia maggiore di
	 * {@code k}. L'ipotesi e' che {@code a} abbia almeno un elemento.
	 * 
	 * @param a
	 *            array in cui contare gli elementi con valore oltre un certo
	 *            limite
	 * @param k
	 *            limite da superare
	 * @return numero di valori in a superiori a k
	 */
	public static int contaMaggioriDiK(int[] a, int k) {
		return contaMaggioriDiK(a, k, 0, a.length - 1);
	}

	/**
	 * Conta il numero di elementi in una porzione di {@code a} il cui valore
	 * sia maggiore di {@code k}. L'ipotesi e' che la porzione di {@code a}
	 * abbia almeno un elemento.
	 * 
	 * @param a
	 *            array in cui contare gli elementi con valore oltre un certo
	 *            limite
	 * @param k
	 *            limite da superare
	 * @param s
	 *            indice inferiore di a in cui contare gli elementi
	 * @param d
	 *            indice superiore di a in cui contare gli elementi
	 * @return numero di valori in a[s..d] superiori a k
	 */
	private static int contaMaggioriDiK(int[] a, int k, int s, int d) {
		if (s == d)
			return ((a[s] > k) ? 1 : 0);
		else
			return contaMaggioriDiK(a, k, s, (s + d) / 2)
					+ contaMaggioriDiK(a, k, (s + d) / 2 + 1, d);
	}

	/**
	 * Verifica l'esistenza di valori maggiori di {@code k} in {@code a}.
	 * L'ipotesi e' che {@code a} abbia almeno un elemento.
	 * 
	 * @param a
	 *            array in cui cercare
	 * @param k
	 *            limite inferiore da superare
	 * @return true se in a esiste un valore superiore a k, false altrimenti
	 */
	public static boolean esistonoMaggioriDiK(int[] a, int k) {
		return esistonoMaggioriDiK(a, k, 0, a.length - 1);
	}

	/**
	 * Verifica l'esistenza di valori maggiori di {@code k} nella porzione di
	 * {@code a} compresa tra due estremi. L'ipotesi e' che la porzione di
	 * {@code a} abbia almeno un elemento.
	 * 
	 * @param a
	 *            array in cui cercare
	 * @param k
	 *            limite inferiore da superare
	 * @param s
	 *            indice inferiore di a da cui cercare
	 * @param d
	 *            indice superiore di a da cui cercare
	 * @return true se in a[s..d] esiste un valore superiore a k, false
	 *         altrimenti
	 */
	private static boolean esistonoMaggioriDiK(int[] a, int k, int s, int d) {
		if (s == d)
			return (a[s] > k);
		else
			return esistonoMaggioriDiK(a, k, s, (s + d) / 2)
					|| esistonoMaggioriDiK(a, k, (s + d) / 2 + 1, d);
	}

	/**
	 * Verifica che tutti i valori di {@code a} siano maggiori di {@code k}.
	 * L'ipotesi e' che {@code a} abbia almeno un elemento.
	 * 
	 * @param a
	 *            array in cui cercare
	 * @param k
	 *            limite inferiore da superare
	 * @return true se in a tutti i valori sono superiori a k
	 */
	public static boolean tuttiMaggioriDiK(int[] a, int k) {
		return tuttiMaggioriDiK(a, k, 0, a.length - 1);
	}

	/**
	 * Verifica che tutti i valori in una data porzione di {@code a}, compresa
	 * tra due estremi, siano maggiori di {@code k} L'ipotesi e' che {@code a}
	 * abbia almeno un elemento.
	 * 
	 * @param a
	 *            array in cui cercare
	 * @param k
	 *            limite inferiore da superare
	 * @param s
	 *            indice inferiore di a da cui cercare
	 * @param d
	 *            indice superiore di a da cui cercare
	 * @return true se in a[s..d] tutti i valori sono superiori a k
	 */
	private static boolean tuttiMaggioriDiK(int[] a, int k, int s, int d) {
		if (s == d)
			return (a[s] > k);
		else
			return tuttiMaggioriDiK(a, k, s, (s + d) / 2)
					&& tuttiMaggioriDiK(a, k, (s + d) / 2 + 1, d);
	}

	/**
	 * Dato {@code a}, vettore di cifre binarie, determina se tutti gli elementi
	 * siano uguali. L'ipotesi e' che {@code a} abbia almeno un elemento.
	 * 
	 * @param a
	 *            vettore di soli zeri o uni
	 * @return 0 se tutti gli elementi di a sono 0, 1 se tutti gli elementi di a
	 *         sono 1, -1 altrimenti
	 */
	public static int tuttiZeroUno(int[] a) {
		return tuttiZeroUno(a, 0, a.length - 1);
	}

	/**
	 * Dato {@code a}, vettore di cifre binarie, determina se tutti gli elementi
	 * compresi in un intervallo siano uguali. L'ipotesi e' che la porzione di
	 * {@code a} abbia almeno un elemento.
	 * 
	 * @param a
	 *            vettore di soli zeri o uni
	 * @param s
	 *            estremo inferiore della porzione di vet nella quale verificare
	 *            la proprieta'
	 * @param d
	 *            estremo superiore della porzione di vet nella quale verificare
	 *            la proprieta'
	 * @return 0 se tutti gli elementi di a sono 0, 1 se tutti gli elementi di a
	 *         sono 1, -1 altrimenti
	 */
	private static int tuttiZeroUno(int[] a, int s, int d) {
		if (s == d)
			return a[s];
		else {
			int sx = tuttiZeroUno(a, s, (s + d) / 2);
			int dx = tuttiZeroUno(a, (s + d) / 2 + 1, d);
			if (sx == -1 || dx == -1 || sx != dx)
				return -1;
			else
				return sx;
		}
	}

	/**
	 * Dato {@code a}, verifica che i valori siano in ordine (debolmente)
	 * crescente. L'ipotesi e' che {@code a} abbia almeno un elemento.
	 * 
	 * @param a
	 *            vettore su cui verificare la proprieta'
	 * @return true se il a e' ordinato in maniera (debolmente) crescente, false
	 *         altrimenti
	 */
	static boolean crescente(int[] a) {
		return crescente(a, 0, a.length - 1);
	}

	/**
	 * Dato {@code a}, verifica che i valori in una porzione di {@code a} siano
	 * in ordine (debolmente) crescente. L'ipotesi e' che la porzione di
	 * {@code a} abbia almeno un elemento.
	 * 
	 * @param a
	 *            vettore su cui verificare la proprieta'
	 * @param s
	 *            estremo inferiore della porzione di a nella quale verificare
	 *            la proprieta'
	 * @param d
	 *            estremo superiore della porzione di a nella quale verificare
	 *            la proprieta'
	 * @return true se il a e' ordinato in maniera (debolmente) crescente, false
	 *         altrimenti
	 */
	static boolean crescente(int[] a, int s, int d) {
		if (s == d)
			return true;
		else
			return crescente(a, s, (s + d) / 2)
					&& a[(s + d) / 2] <= a[(s + d) / 2 + 1]
					&& crescente(a, (s + d) / 2 + 1, d);
	}

	/*
	 */
	public static void main(String[] args) {

		int[] a = { 0, -2, -5 };
		int[] b = { 0, -2, 1 };
		int[] c = { 0, 2, 5 };
		int[] d = { 0, 2, 5, -1 };
		int[] e = { 0, 0, 0, 0 };
		int[] f = { 1, 1, 1, 1 };
		int[] g = { 1, 1, 0, 1 };

		// testing min
		System.out.println(minimo(a));
		System.out.println(minimo(b));
		System.out.println(minimo(c));
		System.out.println(minimo(d));

		// testing min
		System.out.println(contaMaggioriDiK(a, -2));
		System.out.println(contaMaggioriDiK(b, -5));
		System.out.println(contaMaggioriDiK(c, 6));
		System.out.println(contaMaggioriDiK(d, 2));

		// testing esistonoMaggioriDiK
		System.out.println(esistonoMaggioriDiK(a, -2)); // true
		System.out.println(esistonoMaggioriDiK(b, -5)); // true
		System.out.println(esistonoMaggioriDiK(c, 6)); // false
		System.out.println(esistonoMaggioriDiK(d, 2)); // true

		// testing tuttiMaggioriDiK
		System.out.println(tuttiMaggioriDiK(a, -2)); // false
		System.out.println(tuttiMaggioriDiK(b, -5)); // true
		System.out.println(tuttiMaggioriDiK(c, 6)); // false
		System.out.println(tuttiMaggioriDiK(d, 2)); // false

		// testing tuttiZeroUno
		System.out.println(tuttiZeroUno(e)); // 0
		System.out.println(tuttiZeroUno(f)); // 1
		System.out.println(tuttiZeroUno(g)); // -1

		// testing crescente
		System.out.println(crescente(c)); // true
		System.out.println(crescente(e)); // true
		System.out.println(crescente(g)); // false
	}

}
