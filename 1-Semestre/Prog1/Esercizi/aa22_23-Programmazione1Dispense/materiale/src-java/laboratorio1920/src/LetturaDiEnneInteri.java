/**
 * Sfrutta la classe {@code SIn} ed il costrutto {@code do-while} per leggere
 * almene {@code n >= 1} numeri interi tramite tastiera.
 */
public class LetturaDiEnneInteri {

    public static void main(String[] args) {

        int n = 0;

        do {
            System.out.println("Quanti numeri leggere?");
            n = SIn.readInt();
        } while (n <= 0);

        while (n > 0) {
            System.out.println("Numero?");
            int numero = SIn.readInt();
            System.out.println("Ho letto il numero:" + numero);
            n = n - 1;
        }

        System.out.println("Arrivederci.");
    }
}
