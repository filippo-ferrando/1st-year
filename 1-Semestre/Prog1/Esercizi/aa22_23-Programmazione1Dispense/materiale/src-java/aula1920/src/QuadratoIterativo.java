/**
 * Calcola iterativamente il quadrato di un qualsiasi numero
 * naturale {@code x}, sfruttando i prodotti notevoli.
 * <p>
 * Il risultato è nella variabile {@code qX}.
 */
public class QuadratoIterativo {
  public static void main(String[] args) {
    int x = 4; // input
    int n = 0; 
    int qX = 0; // risultato
    while (n<x) {
      qX = qX + 2*n + 1;
       n = n + 1;
    }
    // System.out.println(x + "^2 == " + qX);
  }
}
