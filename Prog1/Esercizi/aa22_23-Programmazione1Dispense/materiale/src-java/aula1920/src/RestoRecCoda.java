/**
 * Resto della divisione tra due numeri naturali, definita ricorsivamente,
 * applicando solo sottrazioni.
 */
public class RestoRecCoda {
    /**
     * Resto della divisione intera {@code x} per {@code y}. Se {@code y == 0}
     * il programma non termina producendo stack overflow.
     */
    public static int rXY(int x, int y) {
        if (y > x)
            return x;
        else
            /*
             * Per applicare l'ipotesi induttiva, occorrerebbe un alro
             * parametro, per non alterare il valore iniziale di x. L'intuizione
             * e' che quando in x non rimane abbastanza 'materiale' da
             * distribuire tra le y destinazioni, x e' il resto.
             */
            return rXY(x - y, y);
    }

    public static void main(String[] args) {
        final int LIMITE = 5;

        for (int x = 0; x < LIMITE; x++)
            for (int y = 1; y < LIMITE; y++)
                System.out.println(x + "%" + y + "=" + rXY(x, y));
    }
}
