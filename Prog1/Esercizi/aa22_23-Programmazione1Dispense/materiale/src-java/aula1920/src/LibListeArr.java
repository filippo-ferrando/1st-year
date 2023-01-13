public class LibListeArr {
	
	/**************************************/
	/** Operazioni su array di booleani ***/
	/**************************************/

	/**
	 * Per convenzione, un array di booleani vuoto
	 * rappresenta una lista vuota di interi.  
	 * @return array di booleani vuoto
	 */
	public static boolean[] nilBool() {
		return new boolean[0];
	}

	/**
	 * Dati un booleano {@code e} ed un array {@code a} di booleani
	 * aggiunge {@code e} in ultima posizione. Se, ad esempio, 
	 * {@code a} è {@code {true,true,true}}, allora
	 * {@code consBool(false,a)} punta a {@code {true,true,true,false}}.     
	 * @param e elemento.
	 * @param a array.
	 * @return a con e in ultima posizione.
	 */
	public static boolean[] consBool(boolean e, boolean[] a) {
		boolean[] r = new boolean[a.length + 1];
		// copia a.length elementi di a, partendo da 0, in r, partendo da 0.
		System.arraycopy(a, 0, r, 0, a.length);
		r[r.length-1] = e;
		return r;
	}

	/**
	 * Dato un array {@code a} di booleani
	 * elimina l'elemento in ultima posizione di {@code a}.  
	 * @param a array
	 * @return a senza il suo ultimo elemento
	 */
	public static boolean[] tailBool(boolean[] a) {
		if (a.equals(nilBool())) {
			return nilBool();
		} else {
			// copia a.length-1 elementi di a, partendo da 1, in r, partendo da 0.
			boolean[] r = new boolean[a.length - 1];
			System.arraycopy(a, 0, r, 0, a.length - 1);
			return r;
		}
	}

	/**
	 * Dato un array {@code a} di booleani
	 * restituisce l'elemento in prima posizione.  
	 * @param a array
	 * @return primo elemento di a
	 */
	public static boolean headBool(boolean[] a) {
		return a[a.length-1];
	}

	/**
	 * Dati un array di booleani {@code a}, un booleano {@code e}, 
	 * ed un intero {@code p}, restituisce {@code a} esteso con 
	 * {@code e} in posizione {@code p}, 
	 * se {@code 0<=p<=a.length}. Metodo ricorsivo.
	 */
	public static boolean[] consPosBool(boolean[] a, boolean e, int p) {
		if (p < 0 || a.length < p) {
			return a;
		} else { // 0 <= p && p <= a.length
			if (p == 0) {
				return consBool(e, a);
			} else {
				boolean aTesta = headBool(a);
				boolean[] aCoda = tailBool(a);
				boolean[] aCodaConE = consPosBool(aCoda, e, p - 1);
				return consBool(aTesta, aCodaConE);
			}
		}
	}

	/**
	 * Dato un array di booleani ed una posizione {@code p}, 
	 * restituisce un array identico a quello dato senza 
	 * l'elemento di posizione {@code p}.
	 * Metodo ricorsivo.
	 * @param a array da cui cancellare l'elemento di posizione p.
	 * @param p posizione dell'elemento da cancellare.
	 * @return a senza elemento in posizione p.
	 */
	public static boolean[] cancellaPosBool(boolean[] a, int p) {
		if (p < 0 || a.length <= p) {
			return a;
		} else { // 0 <= p && p < a.length
			if (p == a.length - 1)
				return tailBool(a);
			else {
				boolean aTesta = headBool(a);
				boolean[] aCoda = tailBool(a);
				boolean[] aCodaSenzaP= cancellaPosBool(aCoda, p);
				return  consBool(aTesta, aCodaSenzaP);
			}
		}
	}
	
	
	/**************************************/
	/** Operazioni su array di interi *****/
	/**************************************/
	
	/**
	 * Per convenzione, un array di interi vuoto
	 * rappresenta una lista vuota di booleani.  
	 * @return array di booleani vuoto
	 */
	public static int[] nilInt() {
		return new int[0];
	}
	
	/**
	 * Dati un intero {@code e} ed un array {@code a} di interi
	 * aggiunge {@code e} in prima posizione di {@code a}.  
	 * Se, ad esempio, 
	 * {@code a} è {@code {1,2,3}}, allora
	 * {@code consBool(4,a)} punta a {@code {1,2,3,4}}.
	 * @param e elemento.
	 * @param a array.
	 * @return a con e in ultima posizione.
	 */
	public static int[] consInt(int e, int[] a) {
		int[] r = new int[a.length + 1];
		// copia a.length elementi di a, partendo da 0, in r, partendo da 1.
		System.arraycopy(a, 0, r, 0, a.length);
		r[r.length-1] = e;
		return r;
	}

	/**
	 * Dato un array {@code a} di interi
	 * elimina l'elemento in prima posizione di {@code a}.  
	 * @param a array
	 * @return a senza il suo primo elemento
	 */
	public static int[] tailInt(int[] a) {
		if (a.equals(nilInt())) {
			return nilInt();
		} else {
			// copia a.length-1 elementi di a, partendo da 1, in r, partendo da 0.
			int[] r = new int[a.length - 1];
			System.arraycopy(a, 0, r, 0, a.length - 1);
			return r;
		}
	}

	/**
	 * Dato un array {@code a} di interi
	 * restituisce l'elemento in prima posizione.  
	 * @param a array
	 * @return primo elemento di a
	 */
	public static int headInt(int[] a) {
		return a[a.length-1];
	}

	/**
	 * Dati un array di interi {@code a}, un intero {@code e}, ed un intero
	 * {@code p}, restituisce {@code a} esteso con {@code e} in posizione
	 * {@code p}, se {@code 0<=p<=a.length}. Metodo ricorsivo.
	 */
	public static int[] consPosInt(int[] a, int e, int p) {
		if (p < 0 || a.length < p) {
			return a;
		} else { // 0 <= p && p <= a.length
			if (p == a.length) {
				return consInt(e, a);
			} else {
				int aTesta = headInt(a);
				int[] aCoda = tailInt(a);
				int[] aCodaConE = consPosInt(aCoda, e, p);
				return consInt(aTesta, aCodaConE);
			}
		}
	}

	/**
	 * Dato un array di interi ed una posizione {@code p}, restituisce un array
	 * identico a quello dato senza l'elemento di posizione {@code p}.
	 * Metodo ricorsivo.
	 * @param a array da cui cancellare l'elemento di posizione p.
	 * @param p posizione dell'elemento da cancellare.
	 * @return a senza elemento in posizione p.
	 */
	public static int[] cancellaPosInt(int[] a, int p) {
		if (p < 0 || a.length <= p) {
			return a;
		} else { // 0 <= p && p < a.length
			if (p == a.length - 1)
				return tailInt(a);
			else {
				int aTesta = headInt(a);
				int[] aCoda = tailInt(a);
				int[] aCodaSenzaP= cancellaPosInt(aCoda, p);
				return  consInt(aTesta, aCodaSenzaP);
			}
		}
	}
}