/**
 * Implementa il problema QRSP dati due interi {@code n} e 
 * {@code d} non negativi. 
 * Restituisce quoziente {@code q} e resto {@code r} della 
 * divsione intera di {@code n} per {@code d}, iterando differenze.
 */
public class QuozienteRestoDifferenzaIterata {
  public static void main (String[] args) {
  
      int n = 8; // Numeratore
      int d = 2; // Denominatore
      
      int q = 0;
      int r = d;

      while (r >= d) {
        q = q + 1;
        r = r - d;
      }

      System.out.println("quoziente = " + q + ".");
      System.out.println("resto = " + r + ".");
   }
}