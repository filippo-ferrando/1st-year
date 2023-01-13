/**
 * Fornisce un metodo ricorsivo per la ricerca dicotomica di un elemento in un
 * array ordinato.
 */
public class RicercaDicotomicaRec {

    /**
     * Metodo che ricerca un elemento dato in un array ordinato.
     * 
     * @param a
     *            array ordinato in cui cercare
     * @param e
     *            elemento da cercare
     * @return -1 se e non compare in a. Altrimenti l'indice alla prima
     *         occorrenza di e in a.
     */
    public static int ricercaDicotomica(int[] a, int e) {
        return ricercaDicotomica(a, e, 0, a.length);
    }

    /**
     * Metodo ricorsivo che ricerca un elemento dato solo in uno specifico
     * intervallo di elementi che appartengano ad un array ordinato.
     * <p>
     * INVARIANTE: 
     * -1 se e non esiste in a[s..d-1] i se (s<=i<d)&&(a[i]==e).
     * 
     * @param a
     *            array ordinato in cui cercare
     * @param e
     *            elemento da cercare
     * @param s
     *            estremo seriore dell'intervallo in cui cercare
     * @param d
     *            estremo deriore dell'intervallo in cui cercare
     * @return -1 se e non compare in a tra s e d. Altrimenti l'indice, incluso
     *         tra s e d, alla prima occorrenza di e in a.
     */
    private static int ricercaDicotomica(int[] a, int e, int s, int d) {
        if (s < d) {
            int m = (s + d) / 2;
            if (e == a[m])
                /* Percorrendo questo ramo vale a[m]==e. 
                 * Quindi, esiste i==m tale che (s<=i<d) && (a[i]==e). 
                 * 
                 * E' possibile indebolire il predicato, con il disgiunto falso
                 * che concorre a formalizzare il predicato invariante: 
                 * -1 se e non esiste in a[s..d-1] || 
                 *   esiste i tale che (s<=i<d) && (a[i]==e).
                 */
                return m;
            else if (e > a[m])
                /*
                 * Siccome s<m<m+1, abbiamo -s>-m>-(m+1). Quindi 
                 * d-s>d-m>d-(m+1) permette di applicare l'ipotesi induttiva: 
                 * -1 se e non esiste in a[m+1..d-1] || i se (m+1<=i<d) && (a[i]==e).
                 * 
                 * E' possibile indebolire il preicato, con il disgiunto falso
                 * che concorre a formalizzare il predicato invariante:
                 * -1 se e non esiste in a[s..d-1] || i se (s<=i<d) && (a[i]==e).
                 */
                return ricercaDicotomica(a, e, s, m);
            else // e < a[m]
                /*
                 * Siccome m-s<d-s vale l'ipotesi induttiva: 
                 * -1 se e non esiste in a[s..m] || i se (s<=i<m) && (a[i]==e)
                 * che implica il seguente predicato, allargando l'intervallo 
                 * di elementi in a cui e potrebbe appartenere:
                 * -1 se e non esiste in a[s..d-1] || i se (s<=i<d) && (a[i]==e).
                 */
                return ricercaDicotomica(a, e, m + 1, d);
        } else
            /*
             * Percorrendo questo ramo sappiamo di non poter trovare e tra gli
             * elementi di a. Il risultato deve essere 
             * -1 perche' non esiste in a[s..d-1] che implica:
             * -1 se e non esiste in a[s..d-1] || i tale che (s<=i<d) && (a[i]==e).
             */
            return -1;
    }

    public static void main(String[] args) {
        int[] b = { 9, 34, 123, 450 };
        int[] c = { 1, 2 };

        System.out.println("----- Ricerca dicotomica in b.");
        int p = ricercaDicotomica(b, b[3]);
        System.out.println(" b[3] ha posizione " + p + " in b.");
        int v = 91;
        p = ricercaDicotomica(b, v);
        System.out.println(v + " ha posizione " + p + " in b.");
        System.out.println(" Atteso: -1.");
        v = -2;
        p = ricercaDicotomica(b, v);
        System.out.println(v + " ha posizione " + p + " in b.");
        System.out.println(" Atteso: -1.");
        p = ricercaDicotomica(c, c[1]);
        System.out.println("c[1] ha posizione " + p + " in c.");
    }
}
