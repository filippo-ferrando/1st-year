/**
 * Fornisce un metodo che, dato {@code n} naturale,
 * restituisce {@code true} se {@code n} e' pari e
 * {@code false} altrimenti, decrementando {@code n}
 * a due a due, finche' il resto non sia minore od
 * uguale a 1. Il codice e' commentato con la 
 * dimostrazione di correttezza parziale. 
 */
public class PDMPDecrementiDue {
    
    /**
     * La dimostrazione di correttezza del seguente metodo
     * consegue da due fatti.
     * 
     * Il primo e' che per ogni n naturale esistono
     * q ed r tali che n==2q*+r && r<=1
     * La proprieta' si dimostra per induzione su n.
     * Sia n == 0. Allora q==r==0 perche' 0==2*0+0.
     * Per induzione, supponiamo che n== 2*q + r.
     * Caso 1) Sia r==0. 
     * Allora abbiamo n==2*q che implica n+1==2*q+1. 
     * Quindi, per il numero naturale n+1 esistono q ed r 
     * tali che n+1==2*q+r && r<=1.
     * Caso 2) Sia r==1.
     * Allora abbiamo n==2*q+1 che implica n+1==2*q+2==2*(q+1)==2*q'+0.
     * Quindi, per il numero naturale n+1 esistono q' ed r 
     * tali che n+1==2*q'+r && r<=1, in cui, ovviamente q'
     * puo' essere ridenominata in q.
     * 
     * Il secondo e' che, per definizione, 
     * n e' pari    se n==2*q+r && r==0 ed 
     * n e' dispari se n==2*q+r && r==1.
     */    
    public static boolean pari(int n) {
        int r = n;
        /* Esiste q, r. n==2*q+r */
        while (r >= 2) {
            /* Assumiamo che
             * Esiste q, r. n==2*q+r && r==0 && r>=2.
             * Allora 
             * Esiste q, r. n==2*q + 2 + r - 2 && r-2>=0. */
            r = r - 2;
            /* Esiste q, r. n==2*(q + 1) + r && r>=0 diventa vero
             * ed equivale a 
             * Esiste q, r. n==2*q + r && r>=0 */
        }
        /* Esiste q, r. n==2*q + r && r<=0 e' vero. 
         * Per scoprire se n sia pari o dispari, basta guardare
         * al valore del resto r.*/
        return r == 0;
    }
}