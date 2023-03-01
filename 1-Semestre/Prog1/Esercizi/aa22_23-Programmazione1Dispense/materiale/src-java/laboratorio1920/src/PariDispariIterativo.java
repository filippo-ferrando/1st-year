/** 
 * Determina se un numero è pari o dispari
 * iterando la sottrazione.
 */
public class PariDispariIterativo
{
  public static void main (String[] args) {
  
      int n = 236485; // numero
      // QUANDO
      while (n >= 2) { // ESEGUI
        // Decrementa l'attuale valore di 'n' di 2
        n = n - 2;
      } // RIPETI
      // SE
      if  (n == 0) { // ALLORA 
        // Stampa "pari"
        System.out.println("Pari.");     
      } 
      else { // ALTRIMENTI 
        // Stampa "dispari"
        System.out.println("Dispari.");     
      }    
  }
}
