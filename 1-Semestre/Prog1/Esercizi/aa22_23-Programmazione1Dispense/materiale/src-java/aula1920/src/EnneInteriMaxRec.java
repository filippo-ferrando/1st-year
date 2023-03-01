/**
 * Legge {@code n} interi e, ricorsivamente, ne individua il massimo,
 * restituendolo.
 */
public class EnneInteriMaxRec {

    /**
     * Dopo aver individuato il massimo tra {@code n - 1} numeri, legge l'
     * {@code n}-esimo che, se maggiore del massimo individuato sinora, diventa
     * il nuovo massimo.
     */
    public static int max(int n) {
        if (n == 1) {
            System.out.println("Numero?");
            return SIn.readInt();
        } else {
            int maxAttuale = max(n - 1);
            System.out.println("Numero?");
            int forseNuovoMax = SIn.readInt();

            if (forseNuovoMax > maxAttuale)
                return forseNuovoMax;
            else
                return maxAttuale;
        }
    }

    public static void main(String[] args) {

        System.out.println("Quanti numeri leggere?");
        int m = max(SIn.readInt());
        System.out.println("Il massimo e' " + m + ".");
    }
}