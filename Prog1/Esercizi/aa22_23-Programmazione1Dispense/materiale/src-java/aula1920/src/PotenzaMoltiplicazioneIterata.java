/**
 * Eleva a potenza il valore in {@code a} per
 * quello in {@code b}.
 * E' realizzata come iterazione di moltiplicazioni.
 */
public class PotenzaMoltiplicazioneIterata  {
  public static void main(String[] args) {
    int a = 3; // base
    int b = 2; // esponente
    
    int r = 1;
    while (b > 0) {
      r = r * a;
      b = b - 1;
    }
    System.out.println(a + "^" + b + " == " + r);
  }
}