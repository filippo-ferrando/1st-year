/**
 * Date due variabili a valori interi {@code a} e {@code b}, scrive in {@code max}
 * il valore massimo contenuto in {@code a} e {@code b}, distinguendo
 * i tre casi possibili.
 */
public class Massimo {
  public static void main (String[] args) {
    
    int a = 3;
    int b = 5;
    int max = 0;

    if (a<b) {
      max = b;
      System.out.println("Il massimo tra " + a + " e " + b + " è " + max + ".");
    } else {
       if (b<a) {
         max = a;
        System.out.println("Il massimo tra " + a + " e " + b + " è " + max + ".");
       } else {
         max = a;
         System.out.println("I valori " + a + " e " + b + " sono uguali.");
       }
    }   
  }
}