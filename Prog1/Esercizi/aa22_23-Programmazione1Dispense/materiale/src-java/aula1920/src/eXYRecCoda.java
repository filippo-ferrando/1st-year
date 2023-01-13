/**
 * Trasposizione ricorsiva di coda di {@code PotenzaMoltiplicazioneIterata}.
 */
public class eXYRecCoda {

    public static int eXY(int x, int y) {
        return eXY(x, y, 1, 0);
    }

    private static int eXY(int x, int y, int r, int k) {
        if (y - k == 0)
            return r;
        else
            return eXY(x, y, x * r, k + 1);
    }

    public static void main(String[] args) {

        for (int x = 1; x < 10; x++)
            for (int y = 0; y < 10; y++)
                System.out.println(eXYRec.eXY(x, y) == eXY(x, y));
    }
}
