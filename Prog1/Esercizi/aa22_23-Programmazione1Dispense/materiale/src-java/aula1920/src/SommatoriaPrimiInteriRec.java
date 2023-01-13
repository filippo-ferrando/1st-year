/**
 * Fissato {@code n}, restituisce la somma, calcolata ricorsivamente, dei primi
 * {@code n} numeri interi.
 */
public class SommatoriaPrimiInteriRec {

    /**
     * @param x
     *            intero che fissa il limite sup. della sommatoria
     * @return sommatoria 0 + 1 + ... + n
     */
    public static int sommatoriaTraZeroEd(int x) {
        if (x == 0)
            return 0;
        else
            return x + sommatoriaTraZeroEd(x - 1);
    }

    /**
     * @param x
     *            intero che fissa il limite sup. della sommatoria
     * @return sommatoria 0 + 1 + ... + n
     */
    public static int sommatoriaAltTraZeroEd(int x) {
        return (x == 0) ? 0 : x + sommatoriaAltTraZeroEd(x - 1);
    }

    public static void main(String[] args) {
        final int LIMITE = 10;

        System.out.println("--- sommatoria");
        int x = 0;
        while (x < LIMITE) {
            System.out.println("0+...+" + x + " = " + sommatoriaTraZeroEd(x));
            x++;
        }

        System.out.println("--- sommatoria alternativa");
        x = 0;
        while (x < LIMITE) {
            System.out
                    .println("0+...+" + x + " = " + sommatoriaAltTraZeroEd(x));
            x++;
        }
    }
}
