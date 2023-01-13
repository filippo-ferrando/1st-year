/**
 * Moltiplicazione tra due numeri naturali positivi {@code x} ed {@code y},
 * realizzata come iterazione di somme e di predecessori.
 */
public class MoltiplicazioneSommaIterata
{ 
  
  public static void main(String[] args) {

    int x = 2; // Primo fattore
    int y = 3; // Secondo fattore

    int r = 0;
    int n = y;
    while (n > 0) {

      r = r + x; // accumula il risultato in r
      n = n - 1;
    }

    System.out.println("Risultato = " + r);
  }
}