/** 
 * Fissati due numeri naturali {@code m} ed {@code n},
 * stampa una matrice di simboli {@code *}
 * con {@code m} righe ed {@code n} colonne.
 */
public class MatriceVisualeNMWhile
{
  public static void main(String[] args) {
    
    int m = 5; 
    int n = 7;

    int i = 0;
    while (i<m) {
    
      int j = 0; 
      while (j<n) {
        System.out.print("*");
        j = j + 1;
      }
      
      i++; System.out.println();
    }
  }
}
