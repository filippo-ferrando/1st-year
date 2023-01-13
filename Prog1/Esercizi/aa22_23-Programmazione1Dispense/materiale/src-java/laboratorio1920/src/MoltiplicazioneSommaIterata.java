/**
 * Moltiplicazione tra due numeri interi positivi {@code x} ed {@code y},
 * realizzata come iterazione di somme.
 * <p>
 * Interpretare con:
   <pre>   
    {@code java -ea MoltiplicazioneSommaIterata}
   </pre>
 * dopo aver:
 * <ul>
 *  <li> cambiato {@code mXY = mXY + x;} in {@code mXY = mXY - x;},
 *  <li> o {@code n = n - 1;} in {@code n = n + 1;}.
 *  <li> o {@code n > 0;} in {@code n >= 0;}.
 * </ul>
 */
public class MoltiplicazioneSommaIterata
{ 
  
  public static void main(String[] args) {

    System.out.println("Primo fattore:");
    int x = SIn.readInt();
    System.out.println("Secondo fattore:");
    int y = SIn.readInt();

    int mXY = 0;
    int n = y;
    while (n > 0) {
      assert (x*y==mXY+n*x): "Invariante non soddisfatto nel ciclo.";
      mXY = mXY + x; // accumula il risultato in mXY
      n = n - 1;
    }
    assert (n==0): "Condizione d'uscita non soddisfatta.";
    System.out.println(x+"*"+y+"="+mXY+".");
  }
}