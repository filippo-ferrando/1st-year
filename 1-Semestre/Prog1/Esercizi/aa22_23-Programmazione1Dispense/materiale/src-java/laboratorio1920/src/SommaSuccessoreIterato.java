/**
 * Addizione tra due numeri interi positivi {@code x} ed {@code y},
 * realizzata come iterazione del succesore.
 * <p>
 * Interpretare con:
   <pre>   
    {@code java -ea SommaSuccessoreIterato}
   </pre>
 * dopo aver:
 * <ul>
 *  <li> cambiato {@code sXY = sXY + 1;} in {@code sXY = sXY - 1;},
 *  <li> o {@code n = n - 1;} in {@code n = n + 1;}.
 *  <li> o {@code n > 0;} in {@code n >= 0;}.
 * </ul>
 */
public class SommaSuccessoreIterato
{ 
  
  public static void main(String[] args) {

    System.out.println("Primo addendo:");
    int x = SIn.readInt();
    System.out.println("Secondo addendo:");
    int y = SIn.readInt();

    int sXY = x;
    int n = y;

    while (n > 0) {
      assert (x+y==sXY+n): "Invariante non soddisfatto nel ciclo.";
      sXY = sXY + 1; // accumula il risultato in sXY
      n = n - 1;
    }
    assert (n==0): "Condizione d'uscita non soddisfatta.";
    System.out.println(x+"+"+y+"="+sXY+".");
  }
}