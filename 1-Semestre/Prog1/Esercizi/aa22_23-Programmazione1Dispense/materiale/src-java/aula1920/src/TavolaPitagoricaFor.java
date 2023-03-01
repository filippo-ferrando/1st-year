/** 
 * Stampa della tavola pitagorica col costrutto 'for'
 * adatto a descrivere  cicli di lunghezza nota.
 */
public class TavolaPitagoricaFor
{
  public static void main(String[] args) {

    System.out.println("   Tavola Pitagorica (costrutto for) -----------");
    
    for (int i=0; i<10; i=i+1) {
      for (int j=0; j<10; j++) {
        
        if (i<10) 
	  System.out.print("   ");
        else if (i<100) 
               System.out.print("  ");
             else 
               System.out.print(" ");

        System.out.print(i*j);

      }
      
      System.out.println();
    }
  }
}
