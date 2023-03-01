/**
 * Trasposizione ricorsiva di {@code MoltiplicazioneSommaIterata}.
 */
public class mXYRec {

    /**
     * Prodotto tra {@code x} e {@code y}.
     */
    public static int mXY(int x, int y) {
        if (y == 0)
            return 0;
            /*
             * mXY(x, 0) == 0 per proprieta' moltiplicazione
             */
        else
            return x + mXY(x, y - 1);
        /*
         * mXY(x,y) == x+mXY(x,y-1) per definizione metodo
         *          == x+x*(y-1)    per ipotesi induttiva
         *          == x*y          per prop0rieta' somme
         */
    }

    public static void main(String[] args) {

        for (int x = 1; x < 10; x++)
            for (int y = 0; y < 10; y++)
                System.out.println(mXY(x, y));
    }
}