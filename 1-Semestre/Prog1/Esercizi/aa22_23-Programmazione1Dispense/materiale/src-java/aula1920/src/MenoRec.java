/**
 * Sottrazione tra due numeri naturali, definita ricorsivamente, applicando solo
 * predecessori.
 */
public class MenoRec {

    /**
     * Sottrazione di {@code y} da {@code x}.
     */
    public static int mXY(int x, int y) {
        if (y > x)
            return 0;
        else if (y == 0)
            return x;
        else
            /*
             * Per ipotesi induttiva, mXY(x, y - 1) == x - (y - 1) == x - y + 1.
             * Sotraendo 1 in entrambi i lati, otteniamo mXY(x, y - 1) - 1 == x
             * - y + 1 - 1 == x - y che e' esattamente il risultato che vogliamo
             * ottenere.
             */
            return mXY(x, y - 1) - 1;
    }

    public static void main(String[] args) {
        final int LIMITE = 5;

        for (int x = 0; x < LIMITE; x++)
            for (int y = 0; y < LIMITE; y++)
                System.out.println(x + "-" + y + "=" + mXY(x, y));
    }
}