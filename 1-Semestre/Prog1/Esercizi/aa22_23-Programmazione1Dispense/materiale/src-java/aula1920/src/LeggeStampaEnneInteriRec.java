/**
 * Classe con metodo ricorsivo per leggere e stampare un numero fissato di
 * interi tramite tastiera.
 */
public class LeggeStampaEnneInteriRec {

    /**
     * Dopo aver stampato {@code x - 1} numeri, 
     * legge l'{@code x}-esimo e lo stampa.
     */
    public static void leggeStampaInteri(int x) {
        if (x == 0) {
        } else {
            leggeStampaInteri(x - 1);
            int numeroLetto = SIn.readInt();
            System.out.println(numeroLetto);
        }
    }

    public static void main(String[] args) {
        System.out.println("Quanti numeri leggere?");
        int n = SIn.readInt();
        leggeStampaInteri(n);
    }
}
