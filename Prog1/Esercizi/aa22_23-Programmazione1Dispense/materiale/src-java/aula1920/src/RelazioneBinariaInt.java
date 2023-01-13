/**
 * Rappresentazione di una relazione binaria tra interi
 * per mezzo di una matrice i cui elementi siano array
 * di interi di due elementi e metodi
 * per verificare proprieta'. 
 */
public class RelazioneBinariaInt 
{
  /**
   * Per ogni coppia {@code r[i]} della relazione {@code r}  
   * verifica l'esistenza di una coppia {@code r[j]}, con 
   * {@code 0<= j <= r.lenght}, per cui si abbia sia
   * {@code r[i][0]==r[j][0]}, sia {@code r[j][0]==r[j][1]}.
   *
   * @param r relazione.
   * @return {@code true} se la relazione e' riflessiva, 
   * {@code false} altrimenti.
   */  
   public static boolean riflessiva (int[][] r) {
    
    boolean perOgniEsisteIdentico = true;
    
    for (int i=0;i<r.length && perOgniEsisteIdentico; i++) {
      perOgniEsisteIdentico = false;
      for (int j=0;j<r.length && !perOgniEsisteIdentico; j++)
        if (r[i][0]==r[j][0])
          perOgniEsisteIdentico = r[j][0]==r[j][1];
    }
    
    return perOgniEsisteIdentico;    
  }

  public static void main (String[] args) {
    
    // Relazione binaria riflessiva
    int[][]  rRifl = {{0,0},{0,1},{0,2},
                      {1,0},{1,1},{1,2},
                      {2,0},{2,1},{2,2} };
    System.out.println(riflessiva(rRifl)); // Atteso true
    
    // Relazione binaria non riflessiva
    int[][]  rNonRifl = {{0,0},{0,1},{0,2},
                         {1,0},{1,1},{1,2},
                         {2,0},{2,1}       };
    System.out.println(riflessiva(rNonRifl)); // Atteso false
  } 
}
