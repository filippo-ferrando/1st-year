/**
 * Differenza tra due numeri interi positivi {@code m} ed {@code s}, realizzata
 * come iterazione del predecessore.
 * <p>
 * Interpretare con:
 * <pre>
 *     {@code java -ea DifferenzaPredecessoreIterato}
 * </pre>
 * dopo aver:
 * <ul>
 * <li>cambiato {@code r = r - 1;} in {@code r = r + 1;},
 * <li>o {@code n = n - 1;} in {@code n = n + 1;},
 * <li>o {@code n > 0} in {@code n >= 0}.
 * </ul>
 */
public class DifferenzaPredecessoreIterato {

  public static void main(String[] args) {

    int m = 5;
    int s = 3;
    int n = 0; // da dichiarare qui per sfruttare assert
    int r = 0;
    if (m > s) {
      r = m;
      n = s;
      while (n > 0) {
        // assert (m - s == r - n) : "Invariante non soddisfatto nel ciclo.";
        r = r - 1; // accumula il risultato in r
        n = n - 1;
      }
    }
    // assert (n == 0) : "Condizione d'uscita non soddisfatta.";
    System.out.println(m + "-" + s + "=" + r + ".");
  }
}