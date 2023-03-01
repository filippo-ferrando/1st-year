/**
 * Dato un array di interi ed un valore, restituisce {@code true} se il valore
 * occorre nell'array.
 */
public class RicercaLineare {

    public static int p = 0; // campo statico che indica la posizione
                             // dell'elemento

    // cercato, se esso esiste

    public static boolean ricercaLineare(int[] a, int k) {
        // ASSUNZIONE!
        p = 0;

        boolean trovato = false;
        // se 0 <= i < p, allora k!=a[i]
        while (p < a.length && !trovato) {
            // se 0 <= i < p, allora k!=a[i]
            trovato = (k == a[p]);
            if (!trovato) {
                // se 0 <= i < p, allora k!=a[i]
                // e k!=a[p]
                // implica
                // se 0 <= i < p + 1, allora k!=a[i]
                p = p + 1;
                // se 0 <= i < p, allora k!=a[i]
            }
        }
        // Se !trovato allora
        // (p == a.length) e (se 0 <= i < a.length , allora k!=a[i])
        // che implicano la non esistenza di k in a.
        // Se trovato allora
        // (p < a.length) e (k == a[p]).

        return trovato;
    }

    public static void main(String[] args) {

        int[] a = { -2, 3, -1, 0, 2 };

        System.out.println("Intero da cercare?");
        int daCercare = SIn.readInt();

        boolean esiste = ricercaLineare(a, daCercare);
        if (esiste)
            System.out.println(daCercare + " esiste in p " + p + ".");
        else
            System.out.println(daCercare + " non esiste.");
    }
}
