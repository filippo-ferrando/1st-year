/**
 * Illustra con un esempio come i due costrutti {@code while-do} e
 * {@code do-while} possano essere interscambiabili.
 */
public class WhileDoDoWhile {

    public static void main(String[] args) {

        final int LIMITE = 1; // costante
        int n = 0;

        /*
         * Continua la lettura di n finche' il valore rimane al di soto del
         * valore in LIMITE.
         */
        System.out.println("Lettura di n con do-while.");
        do {
            System.out.println("Valore di n?");
            n = SIn.readInt();
        } while (n < LIMITE);

        /*
         * Continua la lettura di n finche' il valore rimane al di soto del
         * valore in LIMITE.
         */
        System.out.println("Lettura di n con while-do.");
        n = SIn.readInt();
        while (n < LIMITE) {
            System.out.println("Valore di n?");
            n = SIn.readInt();
        }

        System.out.println("Arrivederci.");
    }
}