/**
 * Soluzione approssimata del problema SIDP,
 * ottenuta sfruttando i soli costrutti sequenza e
 * selezione della programmazione strutturata.
 * Lo scopo e' evidenziare in maniera naturale l'utilita'
 * del costrutto iterativo.
 * Per rendersi conto che la soluzione non puo' essere
 * che approssimata, modificare il valore di {@code b}.
 * Se esso e' maggiore di 2, allora la somma  sara' inferiore
 * al valore atteso. Invece, se esso e' inferiore a 2, allora
 * il valore sara' superiore. 
 */
public class SIDPSequenzaSelezione {

    public static void main (String[] args) {
        
        int a = 4;
        int b = 2;
        int r = a;
        int c = b;
        if (c > 0) {
            r = r + 1;
            c = c - 1;
          }
        if (c > 0) {
            r = r + 1;
            c = c - 1;
          }
        System.out.println("a + b = " + r);
    }
}
