/**
 * Trasposizione ricorsiva di coda di {@code MoltiplicazioneSommaIterata}.
 */
public class mXYRecCoda {

    /**
     * Prodotto tra {@code x} e {@code y}.
     */
    public static int mXY(int x, int y) {
        return mXY(x, y, 0, y);
    }

    private static int mXY(int x, int y, int r, int k) {
        /*
         * l'ipotesi induttiva e' che i valori assegnati ai parametri formali x,
         * y, r e k soddisfino la seguente equazione: x * y == r + (x * k)
         */
        if (k == 0)
            /*
             * se k e' nullo allora x * y == r + (x * k) == r e possiamo
             * restituire il valore che esso contiene perche' quello cercato.
             */
            return r;
        else
            /*
             * se k non e' ancora nullo, ci comportiamo come nel caso iterativo:
             * riversiamo un x in r e togliamo (contemporaneamente) una unita'
             * da k. Quindi i valori che assumeranno i parametri x, y, r, e k
             * nel frame di sXY(x, y, r + x, k - 1) saranno ancora quelli
             * corretti: x + y == (r + x) + x*(k - 1) == r + (x * k)
             */
            return mXY(x, y, r + x, k - 1);
    }

    public static void main(String[] args) {

        for (int x = 1; x < 10; x++)
            for (int y = 0; y < 10; y++)
                System.out.println(mXYRec.mXY(x, y) == mXY(x, y));
    }
}
