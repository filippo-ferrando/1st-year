/**
 * Legge {@code n} interi e ne calcola la media, usando un metodo ricorsivo di
 * coda per restituire la media al termine della ricorisione.
 */
public class MediaRecCoda {

    public static float media(int k, int n, int somma) {
        if (k == 0) {
            return (float) somma / n;
        } else {
            System.out.println("Numero?");
            int numero = SIn.readInt();
            return media(k - 1, n, somma + numero);
        }
    }

    public static void main(String[] args) {

        System.out.println("Di quanti numeri calcolare la media?");
        int n = SIn.readInt();
        float media = media(n, n, 0);
        System.out.println("La media e' " + media + ".");
    }
}