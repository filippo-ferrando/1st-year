/**
 * Quoziente della divisione tra due numeri naturali, definita ricorsivamente,
 * applicando solo sottrazioni.
 */
public class QuozienteRec {

    /**
     * Quoziente della divisione intera {@code x} per {@code y}. Se
     * {@code y == 0} il programma non termina producendo stack overflow.
     */
    public static int qXY(int x, int y) {
        if (y > x)
            return 0;
        else
            /*
             * Per applicare l'ipotesi induttiva, occorrerebbe un alro
             * parametro, per non alterare il valore iniziale di x. L'intuizione
             * e' che l'unita' aggiunta al risultato qXY(x - y, y) ricorda la
             * ulteriore sottrazione di y applicata a x.
             */
            return 1 + qXY(x - y, y);
    }

    public static void main(String[] args) {
        final int LIMITE = 5;

        for (int x = 0; x < LIMITE; x++)
            for (int y = 1; y < LIMITE; y++)
                System.out.println(x + "/" + y + "=" + qXY(x, y));
    }
}
