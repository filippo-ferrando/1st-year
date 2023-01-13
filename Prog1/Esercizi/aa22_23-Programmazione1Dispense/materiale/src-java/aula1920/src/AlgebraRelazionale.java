/**
 * Rappresentazione di relazioni tra interi
 * per mezzo di matrici i cui elementi siano array
 * di interi e forniamo metodi tipici 
 * delle algebre relazionali, modelli di <i>data base</i>.
 */
public class AlgebraRelazionale 
{
  /**
   * Per ogni coppia {@code r[i]} della relazione {@code r}  
   * verifica l'esistenza di una coppia {@code r[j]}, con 
   * {@code 0<= j <= r.lenght}, per cui si abbia sia
   * {@code r[i][0]==r[j][0]}, sia {@code r[j][0]==r[j][1]}.
   *
   * @param a relazione di tipo {@code int[][]}
   * @param b relazione di tipo {@code int[][]}
   * @return una relazione {@code j} di tipo {@code int[][]} in cui
   * {@code j[k]=={a[i][0],a[i][1],b[j][1]}} se, e solo se,
   * {@code a[i][0]==b[j][0]} per un qualche {@code i} e {@code j}.
   */  
   public static int[][] equiJoin (int[][] a, int[][] b) {
   
    // Calcola la dimesione dell'array join   
    int dimensioneJoin = 0;  
    for (int i=0;i<a.length; i++)
      for (int j=0;j<b.length; j++)
        if (a[i][0]==b[j][0])
          dimensioneJoin++;

    // Alloca il numero di elementi necessari al join
    int[][] join = new int[dimensioneJoin][3];
    
    // Costruisce il join
    int k = 0;
    for (int i=0;i<a.length; i++)
      for (int j=0;j<b.length; j++)
        if (a[i][0]==b[j][0]) {
          join[k][0]=a[i][0];
          join[k][1]=a[i][1];
          join[k][2]=b[j][1];
          k++;
        }
        
    return join;
  }
  
  public static String toString(int[][] r) {
    String risultato = "";
    for (int i=0;i<r.length; i++)
      risultato = risultato + "{" 
                            + r[i][0] + "," + r[i][1] + "," + r[i][2]
                            + "} ";      
    return risultato;
  }

  public static void main (String[] args) {
    
    int[][]  a = {{0,10},{1,20}};
    int[][]  b = {{0,100},{0,200},{2,300}};
    System.out.println("{" + toString(equiJoin(a,b)) + "}"); // Atteso {{0,10,100},{0,10,200}}

    int[][]  c = {{2,100},{2,200},{2,300}};
    System.out.println("{" + toString(equiJoin(a,c)) + "}"); // Atteso { }
  } 
}
