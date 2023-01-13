/**
 * Trasposizione ricorsiva di coda di {@code SommaSuccessoreIterato}.
 */
public class sXYRecCoda {

    /**
     * Somma di {@code x} e {@code y}.
     */
    public static int sXY(int x, int y) {
        return sXY(x, y, x, 0);
    }

    private static int sXY(int x, int y, int r, int k) {
        /*
         * l'ipotesi induttiva e' che i valori assegnati ai parametri formali x,
         * y, r e k soddisfino la seguente equazione: x + y == r + k
         */
        if (k == 0)
            /*
             * se k e' nullo allora x + y == r e possiamo restituire il valore
             * che esso contiene perche' quello cercato.
             */
            return r;
        else
            /*
             * se k non e' ancora nullo, ci comportiamo come nel caso iterativo:
             * riversiamo un 1 in r e lo togliamo (contemporaneamente) da k.
             * Quindi i valori che assumeranno i parametri x, y, r, e k nel
             * frame di sXY(x, y, 1 + r, k - 1) saranno ancora quelli corretti:
             * x + y == (r + 1) + (k - 1) == r + k
             */
            return sXY(x, y, 1 + r, k - 1);
    }

    public static void main(String[] args) {

        for (int x = 1; x < 10; x++)
            for (int y = 0; y < 10; y++)
                System.out.println(sXYRec.sXY(x, y) == sXY(x, y));
    }

}
