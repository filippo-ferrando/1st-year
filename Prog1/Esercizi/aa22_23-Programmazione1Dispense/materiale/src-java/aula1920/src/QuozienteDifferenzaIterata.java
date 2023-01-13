/**
 * Dati due naturali {@code d} e {@code s}, restituisce il
 * quoziente di {@code d} per {@code s}, iterando solo differenza
 * e predecessore.
 */
public class QuozienteDifferenzaIterata
{
  public static void main (String[] args) {
  
      int d = 8; // Dividendo
      int s = 2; // diviSore
      
      int qDS = 0;
      int rDS = d;

      while (rDS >= s) {
        qDS = qDS + 1; // accumula il quoziente
        rDS = rDS - s; // accumula il resto
      }

      System.out.println("quoziente = " + qDS + ".");
    }
}