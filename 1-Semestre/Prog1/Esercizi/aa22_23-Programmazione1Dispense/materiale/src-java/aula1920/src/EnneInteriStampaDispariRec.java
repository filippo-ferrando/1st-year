/**
 * Classe con metodo ricorsivo per leggere e stampare solo i dispari presi
 * nell'insieme di un numero prefissati di interi letti tramite tastiera.
 */
public class EnneInteriStampaDispariRec {

    /**
     * Dopo aver stampato solo i numeri dispari scelti tra gli {@code n - 1}
     * letti, legge l'{@code n}-esimo e lo stampa se anch'esso e' dispari.
     */
    public static void nISD(int n) {
        if (n == 0) {
        } else {
            nISD(n - 1); // ha letto e stampato n - 1 numeri
            System.out.println("Numero?");
            int x = SIn.readInt(); // legge l'n-esimo
            if (x % 2 == 1) // se l'n-esimo e' dispari
                System.out.println(x); // stampa l'n-esimo
        }
    }

    public static void main(String[] args) {
        System.out.println("Quanti numeri leggere?");
        int n = SIn.readInt();
        nISD(n);
        System.out.println("Arrivederci.");
    }
}
