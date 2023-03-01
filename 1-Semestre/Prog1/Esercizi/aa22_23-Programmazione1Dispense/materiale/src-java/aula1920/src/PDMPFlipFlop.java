/**
 * Fornisce un metodo che, dato {@code n} naturale,
 * restituisce {@code true} se {@code n} e' pari e
 * {@code false} altrimenti, con un meccanismo di incremento
 * che tiene traccia della parita' raggiunta. Il codice e' 
 * commentato con la dimostrazione di correttezza parziale. 
 */

public class PDMPFlipFlop {

    public static boolean pari(int n) {
        boolean p = true;
        int i = 0;
        /* p == true <==> i pari && i == 0 
         * equivale a
         * true == true <==> 0 pari, che e' vero */
        while (i < n) {
            /* Assumiamo 
             * p == true <==> i pari && i < n.
             * Sono possibile due casi.
             * Caso 1) Supponiamo che p sia true con i pari. 
             * Quindi !p == false <==> i+1 dispari.
             * Caso 2) Supponiamo che p sia false con i dispari. 
             * Quindi !p == true <==> i+1 pari.
             **/
            p = !p;
            /* Caso 1) p == false <==> i+1 dispari
             * Caso 2) p == true  <==> i+1    pari */
            i = i + 1;            
            /* Caso 1) p == false <==> i dispari
             * Caso 2) p == true  <==> i    pari 
             * Nel caso 2 il predicato coincide con l'invariante
             * ipotizzato. Il caso 1 e' LOGICAMNETE EQUIVALENTE 
             * al caso 2. Quindi 
             * p == true <==> i pari && i <= n */
        }
        /* p == true <==> i pari && i == n 
         * equivale a
         * p == true <==> n pari */
        return p;
    }
}
