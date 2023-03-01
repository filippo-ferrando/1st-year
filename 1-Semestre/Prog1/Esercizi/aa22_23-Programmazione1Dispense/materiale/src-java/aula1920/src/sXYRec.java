/**
 * Trasposizione ricorsiva di {@code SommaSuccessoreIterato}.
 */
public class sXYRec {

    /**
     * Somma di {@code x} e {@code y}.
     */
    public static int sXY(int x, int y) {
        if (y == 0)
            return x;
        else
            return 1 + sXY(x, y - 1);
    }

    public static void main(String[] args) {

        for (int x = 1; x < 10; x++)
            for (int y = 0; y < 10; y++)
                System.out.println(sXY(x, y));
    }
}