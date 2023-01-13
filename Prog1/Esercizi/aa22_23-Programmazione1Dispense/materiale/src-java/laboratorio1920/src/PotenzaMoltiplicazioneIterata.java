/**
 * Elevamento di {@code x} ad {@code y},
 * realizzata come iterazione di moltiplicazioni.
 */
public class PotenzaMoltiplicazioneIterata 
{
  public static void main(String[] args) {

    int x = 2;
    int y = 3;
    
    int r = 1;
    int n = y;
    while (n > 0) {
      // assert (Math.pow(x,y)==r*Math.pow(x,n)): "Invariante non soddisfatto nel ciclo.";
      r = r * x;
      n = n - 1;
    }
    // assert (n==0): "Condizione d'uscita non soddisfatta.";
    System.out.println(x + "^" + y + "==" + r + ".");
  }
}