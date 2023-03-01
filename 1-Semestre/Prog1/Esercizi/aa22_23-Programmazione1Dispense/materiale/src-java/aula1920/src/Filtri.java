/**
 * Libreria con metodi statici, <b>talvolta contenenti proprieta invarianti</b>,
 * che restituiscono array di {@code int} i cui elementi siano ottenuti
 * filtrando quelli di altri array.
 */
public class Filtri {

    /**
     * Dato un array di {@code int} ne costruisce un nuovo che possa contenere i
     * soli elementi di posizione pari. (Prima versione).
     * <p>
     * Deve ovviamente funzionare con lunghezze sia pari che dispari del campo
     * privato di tipo int[].
     */
    public static int[] elementiPosizionePari00(int[] a) {

        int[] r;

        // dimensionamento corretto di r.
        if (a.length % 2 == 0)
            r = new int[a.length / 2];
        else
            r = new int[(a.length / 2) + 1];

        // copia degli elementi corretti
        int j = 0;
        int k = 0;
        while (k < a.length) {
            r[j] = a[k];
            j = j + 1;
            k = k + 2;
        }

        return r;
    }

    /**
     * Dato un array di {@code int} ne costruisce uno nuovo che possa contenere
     * i soli elementi di posizione pari. (Seconda versione).
     * <p>
     * Deve ovviamente funzionare con lunghezze sia pari che dispari del campo
     * privato di tipo int[].
     */
    public static int[] elementiPosizionePari01(int[] a) {

        // r ha dimensione essenziale
        int[] r = new int[(a.length + 1) / 2];

        int j = 0;
        for (int k = 0; k < a.length; k = k + 2) {
            r[j] = a[k];
            j++;
        }

        return r;
    }

    /**
     * Dato un array di {@code int} ne costruisce uno nuovo che possa contenere
     * i soli elementi di posizione pari. (Seconda versione).
     * <p>
     * Deve ovviamente funzionare con lunghezze sia pari che dispari del campo
     * privato di tipo int[].
     */
    public static int[] elementiPosizionePari02(int[] a) {

        // r ha dimensione essenziale
        int[] r = new int[(a.length / 2) + (a.length % 2)];

        for (int k = 0, j = 0; k < a.length; k = k + 2, j++)
            r[j] = a[k];

        return r;
    }

    /**
     * Dato un array di {@code int} ne costruisce uno nuovo che contiene i soli
     * elementi che abbiano valore pari.
     * 
     * @param a
     *            array di {@code int} di cui filtrare gli elementi.
     * @return nuovo array con i soli elementi pari di a
     */
    public static int[] elementiValorePari(int[] a) {

        // conta il numero di elementi pari in a.
        int numeroDiPari = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                numeroDiPari++;
        }

        // nuovo array r con lunghezza necessaria e sufficiente.
        int[] r = new int[numeroDiPari];

        int primoLibero = 0; // indice del primo elemento libero in r.
        int daEsaminare = 0;

        while (daEsaminare < a.length) {

            /*
             * IPOTESI INDUTTIVA r[0]..r[primoLibero-1] cotengono tutti e soli i
             * valori pari che leggiamo da sinistra a destra in
             * a[0]..a[daEsaminare-1].
             */

            if (a[daEsaminare] % 2 == 0) {

                /*
                 * r[0]..r[primoLibero-1] cotengono tutti e soli i valori pari
                 * che leggiamo da sinistra a destra in a[0]..a[daEsaminare-1] e
                 * a[daEsaminare] ha un nuovo valore pari di cui tenere conto in
                 * r.
                 */

                r[primoLibero] = a[daEsaminare];

                /*
                 * r[0]..r[primoLibero-1], r[primoLibero] cotengono tutti e
                 * soli i valori pari che leggiamo da sinistra a destra in
                 * a[0]..a[daEsaminare-1], a[daEsaminare]
                 */

                primoLibero++;

                /*
                 * r[0]..r[primoLibero-1] cotengono tutti e soli i valori pari
                 * che leggiamo da sinistra a destra in 
                 * a[0]..a[daEsaminare-1], a[daEsaminare]
                 */
            }

            daEsaminare++;

            /*
             * INVARIANTE identico alla IPOTESI INDUTTIVA r[0]..r[primoLibero-1]
             * cotengono tutti e soli i valori pari che leggiamo da sinistra a
             * destra in a[0]..a[daEsaminare-1]
             */
        }

        return r;
    }

    /**
     * Dato un array di {@code int} ne costruisce uno nuovo che contiene i soli
     * elementi pari.
     * <p>
     * Ad ogni pari incontrato nella array originale, si genera un nuovo array
     * piu' lungo di un elemento che ospiti tutti gli elementi del vecchio piu'
     * il nuovo pari appena incontrato. (Terza versione).
     * 
     * @param a
     *            array di {@code int} di cui filtrare gli elementi.
     * @return nuovo array con i soli elementi pari di a
     */
    public static int[] elementiValorePariConEstensione(int[] a) {

        int[] r = new int[0];
        int[] s; // array di supporto per 'estendere' r.

        for (int daEsaminare = 0; daEsaminare < a.length; daEsaminare++) {

            if (a[daEsaminare] % 2 == 0) { // trovato un nuovo pari da inserire.

                s = new int[r.length + 1]; // array con una posizione in più

                for (int j = 0; j < r.length; j++)
                    // copia in s gli elementi di r
                    s[j] = r[j];

                s[s.length - 1] = a[daEsaminare]; // pari appena trovato in
                                                  // posizione daEsaminare

                r = s;
            }

        }
        return r;
    }

    /**
     * Senza produrre un nuovo array, lo riorganizza scambiando gli elementi in
     * posizione simmetrica rispetto al centro.
     *
     * @param a
     *            array da riorganizzare.
     */
    public static void inverte(int[] a) {

        int tmp = 0;
        int i = 0;

        /*
         * 0 <= i <= a.length/2 e per ogni k, se 0 <= k < i allora a[k]
         * scambiato con a[a.length-1-k]
         */
        while (i < a.length / 2) {

            /*
             * 0 <= i < a.length/2 e per ogni k, se 0 <= k < i allora a[k]
             * scambiato con a[a.length-1-k]
             */

            tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;

            /*
             * 0 <= i < a.length/2 e per ogni k, se 0 <= k <= i allora a[k]
             * scambiato con a[a.length-1-k]
             */

            i++;

            /*
             * 0 <= i <= a.length/2 e per ogni k, se 0 <= k < i allora a[k]
             * scambiato con a[a.length-1-k]
             */
        }

        /*
         * i = a.length/2 e per ogni k, se 0 <= k < i allora a[k] scambiato con
         * a[a.length-1-k]
         */
    }

 }