/** 
 * Determina se un numero dato in {@code n} sia pari o dispari,
 * sfruttando l'operatore di modulo, o resto, della divisione intera.
 */
public class PariDispari  {

  public static void main (String[] args) {
  
    int n = 235671;
    if (n % 2 == 0) {
      System.out.println("Pari.");
    } 
    else {
      System.out.println("Dispari.");     
    }  
  }
}
