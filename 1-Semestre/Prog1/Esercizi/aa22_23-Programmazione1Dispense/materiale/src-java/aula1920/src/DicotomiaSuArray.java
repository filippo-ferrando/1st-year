/**
 * Ricerca di un elemento in array non necessariamente ordinato,
 * usando la tecnica della divisione dell'array in parti di lunghezza
 * essenzialmente identica, ovvero dicotomica.
 */
public class DicotomiaSuArray {
    
    /* Restituisce {@code true} se {@code k} esiste in {@code a}.
     */
    public static boolean ricerca(int[] a, int k) {
        if (a != null)
            return ricerca(a, k, 0, a.length);
        else 
            return false;
    }

    /* La ricerca di {@code k} in {@code a} procede identificando
     * in {@code a} parti di lunghezza via via piu' corte, ma di
     * lunghezza esenzialmente identica.
     * Quando la parte contiene un singolo elemento si verifica se
     * esso sia {@code k}. Si ottiene {@code true} se esiste almeno
     * un'occorenza di {@code k} in {@code a}.
     */
    private static boolean ricerca(int[] a, int k, int l, int r) {
        if (l < r)
            if (r - l == 1)
                return a[l] == k;
            else {
                int m = (l + r)/2;
                return ricerca(a, k, l, m) || ricerca(a, k, m, r);
            }              
        else 
            return false;
    }
    
    /* Restituisce il numeor di occorrenze di {@code k} in {@code a}.
     */
    public static int conteggio(int[] a, int k) {
        if (a != null)
            return conteggio(a, k, 0, a.length);
        else
            return 0;
    }
    
    /* La ricerca di {@code k} in {@code a} procede identificando
     * in {@code a} parti di lunghezza via via piu' corte, ma di
     * lunghezza esenzialmente identica.
     * Quando la parte contiene un singolo elemento verifica se
     * esso sia {@code k}. In tal caso il conteggio e' 1. Altrimenti
     * e' zero.
     */
    private static int conteggio(int[] a, int k, int l, int r) {
        if (l < r)
            if (r - l == 1) {
                if (a[l] == k)
                    return 1;
                else 
                    return 0;
            } else {
                int m = (l+r)/2;
                return conteggio(a, k, l, m) + conteggio(a, k, m, r);
            }
        else 
            return 0;
    }
}