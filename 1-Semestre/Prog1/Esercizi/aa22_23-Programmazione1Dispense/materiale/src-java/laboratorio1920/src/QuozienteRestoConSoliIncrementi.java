/**
 *  La calsse fornisce un paio di metodi che, dati un dividendo {@code D}
 *  ed un divisore {@code d}, restituiscono uno il quoziente, l'altro il resto,
 *  della divisione intera {@code D/d}, usando solo incrementi delle variabili
 *  coinvolte nell'algoritmo.
 *  
 *  Il principo di funzionamento e' riassumibile come segue:
 *  <ul>
 *  <li> Supponiamo di contare in {@code c} gli elementi distribuiti sino 
 *  ad un certo punto del processo di divisione.
 *  <li> Finche' il totale degli elementi distribuiti e' inferiore a 
 *  {@code D} continuiamo a distribuire elementi per gruppi di {@code d}
 *  come segue:
 *  <ul>
 *  <li> Suppongo di contare quanti elementi {@code t} distribuisco nell'attuale
 *  turno di distribuzione. 
 *  <li> Finche' rimangono elementi da distribuire e il turno di distribuzione 
 *  di {@code d} elementi non e' terminato, distribuiamo un elemento alla volta,
 *  tenendo conto che il turni di distribuzione avanze e ch il totale degli
 *  elementi distribuiti incementa.
 *  </ul>   
 *  </ul>
 */

public class QuozienteRestoConSoliIncrementi {

    /*
     * Dati il dividendo {@code D} ed il divisore {@code d}
     * restituisce il quoziente della divisione intera
     * {@code D/d}.
     */
    public static int quoziente(int D, int d){
        int q = 0;
        int c = 0;
        int t = 0;
        /* c == q*d + t */
        while (c < D) {
            /* c == q*d + t && c < D */
            while (c < D && t < d) {
                /* c == q*d + t && c < D && t < d 
                 * implica 
                 * c + 1 == q*d + t + 1 && c + 1 <= D && t + 1 <= d */
                c = c + 1;
                /* c == q*d + t + 1 && c <= D && t + 1 <= d */
                t = t + 1;
                /* c == q*d + t && c <= D && t <= d */
            }
            /* c == q*d + t && (c == D || t == d) 
             * implica 
             * c == q*d + t && (c <= D || t <= d) 
             * */
            if (t == d) {
                /* c == q*d + d && (c <= D || t == d)
                 * implica  
                 * c == q*(d+1) && (c <= D || t == d)*/
                q = q + 1;
                /* c == q*d && (c <= D || t == d)*/
                t = 0;
                /* c == q*d + t && (c <= D || t < d)*/
            }
            /* c == q*d + t && (c <= D || t < d)*/
        }
        /* (c == q*d + t && c == D && 0<= t < d) 
         * implica 
         * (D == q*d + t && 0<= t < d) 
         * che e' la classica relazione tra quoziente e resto. 
         * */
        return q;
    }
 
    /*
     * Dati il dividendo {@code D} ed il divisore {@code d}
     * restituisce il resto della divisione intera
     * {@code D/d}.
     */
    public static int resto( int D, int d){
        int q = 0;
        int c = 0;
        int t = 0;
        /* c == q*d + t */
        while (c < D) {
            /* c == q*d + t && c < D */
            while (c < D && t < d) {
                /* c == q*d + t && c < D && t < d 
                 * implica 
                 * c + 1 == q*d + t + 1 && c + 1 <= D && t + 1 <= d */
                c = c + 1;
                /* c == q*d + t + 1 && c <= D && t + 1 <= d */
                t = t + 1;
                /* c == q*d + t && c <= D && t <= d */
            }
            /* c == q*d + t && (c == D || t == d) 
             * implica 
             * c == q*d + t && (c <= D || t <= d) 
             * */
            if (t == d) {
                /* c == q*d + d && (c <= D || t == d)
                 * implica  
                 * c == q*(d+1) && (c <= D || t == d)*/
                q = q + 1;
                /* c == q*d && (c <= D || t == d)*/
                t = 0;
                /* c == q*d + t && (c <= D || t < d)*/
            }
            /* c == q*d + t && (c <= D || t < d)*/
        }
        /* (c == q*d + t && c == D && 0<= t < d) 
         * implica 
         * (D == q*d + t && 0<= t < d) 
         * che e' la classica relazione tra quoziente e resto. 
         * */
        return t;
    }

    public static void main (String[] args) {
        System.out.println("Test quoziente");
        System.out.println(quoziente(0,1) == 0);
        System.out.println(quoziente(1,1) == 1);
        System.out.println(quoziente(2,2) == 1);
        System.out.println(quoziente(3,2) == 1);
        System.out.println("Test resto");
        System.out.println(resto(0,1) == 0);
        System.out.println(resto(1,1) == 0);
        System.out.println(resto(2,2) == 0);
        System.out.println(resto(3,2) == 1);
    }
}
