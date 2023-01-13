/**
 * Tavola pitagorica
 */
public class PitagoricaRec {

    public static final int LIMITE = 10;

    public static void stampaElementi(int r, int c) {
        if (c == 0) {
            // non stampa nulla
        } else {
            stampaElementi(r, c - 1); // stampato r*1 ... r*(c-1)
            System.out.print(r * c + " "); // stampa r * c
        }
    }

    public static void stampaRighe(int r) {
        if (r == 0) {
            // non stampa nulla
        } else {
            stampaRighe(r - 1); // stampato righe 1 ... r-1
            stampaElementi(r, LIMITE); // stampa r*1...r*10
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stampaRighe(LIMITE);
    }
}
