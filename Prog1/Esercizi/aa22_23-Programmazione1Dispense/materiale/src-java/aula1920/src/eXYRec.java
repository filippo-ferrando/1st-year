/**
 * Trasposizione ricorsiva di {@code PotenzaMoltiplicazioneIterata}.
 */
public class eXYRec {

    public static int eXY(int x, int y) {
        if (y == 0)
            return 1;
            /*
             * eXY(x, 0) ==  1 per proprieta' potenze
             */
        else
            return x * eXY(x, y - 1);
            /*
             * eXY(x, y) ==  x*eXY(x, y - 1) per definizione metodo
             *           ==  x*x^(y-1)       per ipotesi induttiva
             *           ==  x^y             per proprieta' potenze
             */
    }

    public static void main(String[] args) {

        for (int x = 1; x < 10; x++)
            for (int y = 0; y < 10; y++)
                System.out.println(eXY(x, y));
    }

}
