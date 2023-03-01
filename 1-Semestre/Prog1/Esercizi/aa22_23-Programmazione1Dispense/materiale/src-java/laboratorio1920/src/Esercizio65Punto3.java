import java.util.Arrays;

public class Esercizio65Punto3 {
	 
	/* Produrre un array in cui ogni elemento contiene la 
     somma degli elementi di ciascuna colonna in m. */
	public static int[] p3(int[][] m) {
    int maxLunR = maxLunR(m);
    int[] s = null;
    
		if (m != null) {
      s = new int[m.length];
		  int k = 0;
      int j = 0; 
		  while(j < maxLunR) {
        s[k] = 0;
			  int i = 0;
			  while(i < m.length) {
          if (m[i] != null && j < m[i].length) {
				    s[k] = s[k] + m[i][j];
          }
				  i = i + 1;
        }
        k = k + 1;
        j = j + 1;
      }
    }
	  return s;
	}
	
  /* Lunghezza della riga più lunga della matrice m. */
	public static int maxLunR(int[][] m) {
    int max = 0;
		if (m != null) {
		  int i = 0;
		  while(i < m.length) {
        if (m[i] != null && max < m[i].length) {
				  max = m[i].length;
        }
        i = i + 1;
      }
    }
	  return max;
	}

  public static void main (String[] args){
		 System.out.println(Arrays.equals(null, p3(null)));
		 System.out.println(Arrays.equals(new int[] {}, p3(new int[][] {})));
		 System.out.println(Arrays.equals(new int[] {0}, p3(new int[][] {null})));
		 System.out.println(Arrays.equals(new int[] {0}, p3(new int[][] {{}})));
		 System.out.println(Arrays.equals(new int[] {2,1,0,0}, p3(new int[][] {{1},null,{},{1,1}})));
		 System.out.println(Arrays.equals(new int[] {2,1,0,0}, p3(new int[][] {{1},null,{1,1},{}})));
		 System.out.println(Arrays.equals(new int[] {2,1,0,0}, p3(new int[][] {{1},null,{1,1},{}})));
  }
}