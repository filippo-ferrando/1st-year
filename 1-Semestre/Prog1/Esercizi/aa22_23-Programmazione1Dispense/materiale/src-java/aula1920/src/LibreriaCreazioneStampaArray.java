/**
 * Metodi statici per creare e stampare array con elementi di tipo {@code int}.
 */
public class LibreriaCreazioneStampaArray {
    /**
     * Letto un naturale {@code n}, crea un array con {@code n} elementi letti
     * da tastiera.
     */
    public static int[] initArray() {

        System.out.println("Quanti elementi ha l'array da creare (n>0)? ");
        int n = SIn.readInt();

        // assert (0<n && n<=Integer.MAX_VALUE) :
        // "L'array di interi deve avere almeno un elemento.";

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Elemento di indice " + i + "? ");
            a[i] = SIn.readInt();
        }

        return a;
    }

    /**
     * Restituisce la stringa con la sequenza degli elementi dell'array di
     * {@code int}, ciascuno separato dall'altro con una virgola.
     *
     * @param a
     *            array di {@code int} di cui elencare gli elementi.
     * @return stringa che elenca gli elementi dell'array.
     */
    public static String toString(int[] a) {

        String separatore = "";
        String risultato = "";

        for (int k = 0; k < a.length; k++) {
            if (k > 0)
                separatore = ", ";
            risultato = risultato + separatore + a[k];
        }

        return risultato;
    }

    /**
     * Restituisce la stringa con la sequenza degli elementi dell'array di
     * {@code int}, ciascuno separato dall'altro con una virgola, e conclusa con
     * un punto.
     *
     * @param a
     *            array di {@code int} di cui elencare gli elementi.
     * @return stringa che elenca gli elementi dell'array.
     */
    public static String toStringPuntoFinale(int[] a) {

        String r = "";

        int k = 0;

        while (k < a.length) {
            /*
             * INVARIANTE 0 <= k < a.length e per ogni i, se 0 <= i < k, allora
             * r == "a[0],a[1],..,a[i],"
             */
            r = r + a[k] + ",";
            /*
             * per ogni i, se 0 <= i < k + 1, allora r == "a[0],a[1],..,a[i],"
             */
            k = k + 1; // rimpiazza k + 1 con k nel predicato precedente
            /*
             * INVARIANTE 0 <= k < a.length e per ogni i, se 0 <= i < k, allora
             * r == "a[0],a[1],..,a[i],"
             */
        }
        /*
         * 0 <= k == a.length e per ogni i, se 0 <= i < a.length, allora r ==
         * "a[0],a[1],..,a[i],". Cioe' r contiene la stringa
         * "a[0],a[1],..,a[a.length - 1],"
         */
        if (a.length > 0)
            /*
             * In a c'e' almeno un elemento cui fare seguire un punto.
             * 
             * Siccome r contiene la stringa "a[0],a[1],..,a[a.length - 1],"
             * occorre sostituire la virgola finale col punto.
             */
            r = r.substring(0, r.length() - 1) + ".";
        return r;
    }
}
