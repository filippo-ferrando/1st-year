/**
 * La funzione fattoriale conta il numero delle permutazioni possibili di un
 * insieme di {@code n} elementi.
 */
public class FattorialeRec {

    /**
     * @param n
     *            intero di cui calcolare il fattoriale
     *
     * @return n!
     */
    public static int fatt(int n) {
        if (n == 0)
            return 1;
        else
            return n * fatt(n - 1);
    }

    /**
     * @param n
     *            intero di cui calcolare il fattoriale
     *
     * @return n!
     */
    public static int fattAlt(int n) {
        return (n == 0 || n == 1) ? 1 : n * fattAlt(n - 1);
    }

    public static void main(String[] args) {
        final int LIMITE = 10;

        System.out.println("--- fatt");
        int x = 0;
        while (x < LIMITE) {
            System.out.println(x + "! = " + fatt(x));
            x++;
        }

        System.out.println("--- fattAlt");
        x = 0;
        while (x < LIMITE) {
            System.out.println(x + "! = " + fattAlt(x));
            x++;
        }
    }
}
