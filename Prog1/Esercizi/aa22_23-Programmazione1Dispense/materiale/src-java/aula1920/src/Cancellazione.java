/**
 * Cancella un elemento in una data posizione da un array di {@code int},
 * distruggendo l'ordinamento, se l'array e' ordinato.
 */
public class Cancellazione {

    /**
     * Cancella l'elemento di posizione p, se esiste. Se la cancellazione ha
     * successo, l'ordine degli elementi muta.
     * <p>
     * L'eliminazione avviene sostituendo l'elemento eliminato con l'elemento in
     * ultima posizione, e creando un nuovo array con un elemento in meno
     * rispetto all'array iniziale. Se la cancellazione non avviene, allora non
     * viene creato alcun nuovo array.
     *
     * @param a
     *            array di cui cancellare l'elemento.
     * @param p
     *            indice dell'elemento da cancellare.
     * @return array con elemento eventualmente cancellato.
     */
    public static int[] cancellaElementoPosizione(int[] a, int p) {

        int[] b = a;

        if (0 <= p && p < a.length) {
            a[p] = a[a.length - 1];

            b = new int[a.length - 1];

            for (int i = 0; i < a.length - 1; i++)
                b[i] = a[i];
        }

        return b;
    }

    /**
     * Cancella l'elemento di posizione p, se esiste. La cancellazione preserva
     * l'ordine degli elementi.
     * <p>
     * L'eliminazione avviene spostando di un posto verso sinistra di tutti gli
     * elementi a destra di p.
     *
     * @param a
     *            array di cui cancellare l'elemento.
     * @param p
     *            indice dell'elemento da cancellare.
     * @return array con elemento cancellato.
     */
    public static int[] cancellaElementoPosizioneAlt(int[] a, int p) {

        int[] b = a;

        if (0 <= p && p < a.length) {
            b = new int[a.length - 1];

            for (int i = 0; i < p; i++)
                b[i] = a[i];

            for (int i = p; i < a.length - 1; i++)
                b[i] = a[i + 1];
        }

        return b;
    }
}