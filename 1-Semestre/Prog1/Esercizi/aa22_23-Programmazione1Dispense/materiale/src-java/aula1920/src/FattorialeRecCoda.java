/**
 * La funzione fattoriale conta il numero delle permutazioni possibili di un
 * insieme di {@code n} elementi. La classe mostra come poter overloading e
 * visibilita' ridotta possano essere sfruttati per evitare che un metodo sia
 * chiamato assegnando un qualche valore errato ai suoi parametri.
 */
public class FattorialeRecCoda {

    /**
     * @param n
     *            intero di cui calcolare il fattoriale
     * 
     * @return n!
     */
    public static int fatt(int n) {

        return fatt(n, 1);
    }

    /*
     * Metodo visibile, cioe' utilizzabile solo all'interno di questa classe. Il
     * secondo parametro accumula il risultato. La dimostrazione di correttezza
     * e' identica a quella per la versione iterativa. Il solo valore corretto
     * per il secondo paramero con cui invocare questo metodo e' 1.
     */
    private static int fatt(int x, int f) {
        if (x == 0)
            return f;
        else
            return fatt(x - 1, x * f);
    }

    public static void main(String[] args) {

        final int LIMITE = 10;

        int x = 0;
        while (x < LIMITE) {
            System.out.println(x + "! = " + fatt(x));
            x++;
        }
    }
}
