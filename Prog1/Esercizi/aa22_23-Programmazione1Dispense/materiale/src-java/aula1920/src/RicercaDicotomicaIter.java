/**
 * Fornisce qualche metodo iterativo per la ricerca dicotomica di un elemento in
 * un array ordinato.
 */
public class RicercaDicotomicaIter {
    /*
     * Metodo iterativo, che sfrutta il costrutto {@code do-while} E ricerca un
     * elemento un array ordinato.
     * <p>
     * INVARIANTE: Esiste i tale che, 
     * i se (s<=i<d) tale che (0<=i<a.length) && (a[i]==e) || -1 altrimenti. 
     * 
     * @param a
     *            array ordinato in cui cercare
     * @param e
     *            elemento da cercare
     * @return i se (s<=i<d) tale che (0<=i<a.length) && (a[i]==e) || -1 altrimenti
     */
    public static int ricercaDicotomica(int[] a, int e) {
        int s = 0;
        int d = a.length;
        int m = 0;
        boolean trovato = false;
        while (s < d && !trovato) {
            m = (d + s) / 2;
            trovato = (a[m] == e);
            if (e < a[m])
                d = m;
            if (a[m] < e)
                s = m + 1;
        }
        if (trovato)
            return m;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] b = { 9, 34, 123, 450 };
        int[] c = { 1, 2 };

        System.out.println("----------------------------.");
        System.out.println("----- ricercaDicotomica in b.");
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