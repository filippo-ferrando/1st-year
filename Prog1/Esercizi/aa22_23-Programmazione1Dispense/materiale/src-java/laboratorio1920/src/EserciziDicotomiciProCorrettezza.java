public class EserciziDicotomiciProCorrettezza {

    /**
     * Restituisce il valore minimo dell'array {@code a} con almeno un elemento.
     * 
     * @param a
     *            array in cui cercare il minimo valore
     * @return valore minimo in a
     */
    public static int minimo(int[] a) {
        return a[minimo(a, 0, a.length)];
    }

    /**
     * Restituisce il puntatore al valore minimo nella porzione [{@code s} ...
     * {@code d}) di array {@code a}.
     * <p>
     * Visita l'array per determinare l'indice al valore minimo che sara'
     * condizione sufficiente per determinare anche il valore minimo.
     * 
     * @param a
     *            array in cui cercare
     * @param s
     *            limite inferiore della porzione di a in cui cercare
     * @param d
     *            limite superiore della porzione di a in cui cercare
     * @return valore minimo in a[s ... d)
     */
    private static int minimo(int[] a, int s, int d) {
        if (d - s == 1)
            /*
             * Se a e' senza elementi, non esistono indici sensati per
             * individuanre il minimo.
             */
            return s;
        else {
            /*
             * Numero degli elementi che nelle due porzioni di a in cui
             * risolvere il problema.
             */
            int numEl = (d - s) / 2;
            /*
             * Problema risolto nella porzione sinistra di a, individuata
             * dall'intervallo di indici [s ... s+numEl).
             */
            int mS = minimo(a, s, s + numEl);
            /*
             * Problema risolto nella porzione destra di a, individuata
             * dall'intervallo di indici [d-numEl ... d).
             */
            int mD = minimo(a, d - numEl, d);

            /*
             * Determina il risultato
             */
            int indiceAlMinimo = mS;

            if (a[indiceAlMinimo] > a[mD])
                indiceAlMinimo = mD;
            if (((d - s) % 2) == 1) { // numero dispari di elementi in a
                /*
                 * Indice all'elemento che non occorre ne' in [s ... s+numeEl),
                 * ne' in [d-numEl ... d).
                 */
                int escluso = s + numEl; // oppure d - numEl - 1

                if (a[indiceAlMinimo] > a[escluso])
                    indiceAlMinimo = escluso;
            }

            return indiceAlMinimo; // minimo relativo alla porzione a[s..d]
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
        return contaMaggioriDiK(a, k, 0, a.length);
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
     * @return numero di valori in a[s..d) superiori a k
     */
    private static int contaMaggioriDiK(int[] a, int k, int s, int d) {
        if (d - s == 1)
            return ((a[s] > k) ? 1 : 0);
        else {
            int numEl = (d - s) / 2;
            return contaMaggioriDiK(a, k, s, s + numEl)
                    + ((((d - s) % 2) == 1) ? ((a[s + numEl] > k) ? 1 : 0) : 0)
                    + contaMaggioriDiK(a, k, d - numEl, d);
        }
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
        return esistonoMaggioriDiK(a, k, 0, a.length);
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
     * @return true se in a[s..d) esiste un valore superiore a k, false
     *         altrimenti
     */
    private static boolean esistonoMaggioriDiK(int[] a, int k, int s, int d) {
        if (d - s == 1)
            return (a[s] > k);
        else {
            int numEl = (d - s) / 2;
            return esistonoMaggioriDiK(a, k, s, s + numEl)
                    || ((((d - s) % 2) == 1) ? ((a[s + numEl] > k) ? true
                            : false) : false)
                    || esistonoMaggioriDiK(a, k, d - numEl, d);
        }
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
        return tuttiMaggioriDiK(a, k, 0, a.length);
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
        if (d - s == 1)
            return (a[s] > k);
        else {
            int numEl = (d - s) / 2;
            return tuttiMaggioriDiK(a, k, s, s + numEl)
                    && ((((d - s) % 2) == 1) ? ((a[s + numEl] > k) ? true
                            : false) : true)
                    && tuttiMaggioriDiK(a, k, d - numEl, d);
        }
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
        return tuttiZeroUno(a, 0, a.length);
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
        if (d - s == 1)
            return a[s];
        else {
            int numEl = (d - s) / 2;
            int sx = tuttiZeroUno(a, s, s + numEl);
            int dx = tuttiZeroUno(a, d - numEl, d);
            if (sx == -1 || dx == -1 || sx != dx || sx != a[s + numEl]
                    || dx != a[s + numEl])
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
        return crescente(a, 0, a.length);
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
        if (d - s == 1)
            return true;
        else {
            int numEl = (d - s) / 2;
            return crescente(a, s, s + numEl)
                    && a[s + numEl - 1] <= a[s + numEl]
                    && ((((d - s) % 2) == 1) ? (a[s + numEl] <= a[s + numEl + 1])
                            : true) && crescente(a, d - numEl, d);
        }
    }

    /*
	 */
    public static void main(String[] args) {

        int[] z = { 0 };
        int[] w = { 0, -2 };
        int[] a = { 0, -2, -5 };
        int[] b = { 0, -2, 1 };
        int[] c = { 0, 2, 5 };
        int[] d = { 0, 2, 5, -1 };
        int[] e = { 0, 0, 0, 0 };
        int[] f = { 1, 1, 1, 1 };
        int[] g = { 1, 1, 0, 1 };

        /*
         * // testing min System.out.println(minimo(z));
         * System.out.println(minimo(w)); System.out.println(minimo(a));
         * System.out.println(minimo(b)); System.out.println(minimo(c));
         * System.out.println(minimo(d));
         * 
         * // testing contaMaggioriDiK System.out.println(contaMaggioriDiK(z,
         * -2)); System.out.println(contaMaggioriDiK(w, -2));
         * System.out.println(contaMaggioriDiK(z, 1));
         * System.out.println(contaMaggioriDiK(a, -2));
         * System.out.println(contaMaggioriDiK(b, -5));
         * System.out.println(contaMaggioriDiK(c, 6));
         * System.out.println(contaMaggioriDiK(d, 2));
         * 
         * // testing esistonoMaggioriDiK
         * System.out.println(esistonoMaggioriDiK(a, -2)); // true
         * System.out.println(esistonoMaggioriDiK(b, -5)); // true
         * System.out.println(esistonoMaggioriDiK(c, 6)); // false
         * System.out.println(esistonoMaggioriDiK(d, 2)); // true
         * 
         * // testing tuttiMaggioriDiK System.out.println(tuttiMaggioriDiK(a,
         * -2)); // false System.out.println(tuttiMaggioriDiK(b, -5)); // true
         * System.out.println(tuttiMaggioriDiK(c, 6)); // false
         * System.out.println(tuttiMaggioriDiK(d, 2)); // false
         * 
         * // testing tuttiZeroUno System.out.println(tuttiZeroUno(e)); // 0
         * System.out.println(tuttiZeroUno(f)); // 1
         * System.out.println(tuttiZeroUno(g)); // -1
         */

        // testing crescente
        System.out.println(crescente(c)); // true
        System.out.println(crescente(e)); // true
        System.out.println(crescente(g)); // false
        /*
		*/
    }

}
