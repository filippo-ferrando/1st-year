/**
 * Inserisce un elemento in un array di interi alla posizione specificata.
 */
public class Inserimento {

    /**
     * Inserisce un elemento alla posizione specificata, se possibile.
     * <p>
     * OSSERVAZIONE. <br>
     * Stabiliamo che l'inserimento sia ammissibile se la posizione indicata per
     * l'inserimento sia nell'intervallo degli indici disponibili, ovvero tra
     * {@code 0} e {@code a.length-1}.
     *
     * @param a
     *            array in cui inserire.
     * @param e
     *            elemento da inserire.
     * @param p
     *            posizione in cui inserire l'elemento.
     * @return array potenzialmente modificato col nuovo elemento.
     */
    public static int[] inserisceElementoPosizione(int[] a, int e, int p) {

        if (0 <= p && p <= a.length - 1) { // p e' nell'intervallo stabilito

            // array piu' lungo di un elemento
            int[] tmp = new int[a.length + 1];

            // copia a in tmp
            for (int i = 0; i < a.length; i++) {
                tmp[i] = a[i];
            }

            // in tmp, sposta in avanti di una posizione
            // tutti gli elementi a partire da p
            for (int i = tmp.length - 1; i > p; i--) {
                tmp[i] = tmp[i - 1];
            }

            // inserisce il nuovo elemento
            tmp[p] = e;

            // rimpiazza a con tmp
            a = tmp;
        }

        return a;
    }

    /**
     * Inserisce un elemento alla posizione specificata, se possibile.
     * <p>
     * OSSERVAZIONE. <br>
     * Stabiliamo che l'inserimento sia ammissibile se la posizione indicata per
     * l'inserimento sia nell'intervallo degli indici disponibili, ovvero tra
     * {@code 0} e {@code a.length-1},.
     *
     * @param a
     *            array in cui inserire.
     * @param e
     *            elemento da inserire.
     * @param p
     *            posizione in cui inserire l'elemento.
     * @return array potenzialmente modificato col nuovo elemento.
     */
    public static int[] inserisceElementoPosizioneAlt(int[] a, int e, int p) {

        if (0 <= p && p <= a.length - 1) { // p e' nell'intervallo stabilito

            // array piu' lungo di un elemento
            int[] tmp = new int[a.length + 1];

            /*
             * copia a[0] ... a[p - 1] nelle posizioni corrispondenti di tmp
             */
            for (int i = 0; i < p; i++) {
                tmp[i] = a[i];
            }

            /*
             * copia a[p] ... a[a.length - 1] nelle posizioni tmp[p + 1] ..
             * tmp[a.length]
             */
            for (int i = p; i < a.length; i++) {
                tmp[i + 1] = a[i];
            }

            // inserisce il nuovo elemento
            tmp[p] = e;

            // rimpiazza a con tmp
            a = tmp;
        }

        return a;
    }

}