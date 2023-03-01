/** 
 * Determina se un numero e' pari o dispari
 * iterando la sottrazione.
 */
public class PariDispariIterativo
{
  public static void main (String[] args) {
  
      int n = 236485; 
      while (n >= 2) {
        n = n - 2;
      }
      if  (n == 0) {
        System.out.println("Pari.");     
      } 
      else {
        System.out.println("Dispari.");     
      }    
  }
}
