import java.util.Arrays;

public class Esercizio65Punto2 {

	/* Produrre un array in cui ogni elemento contiene la somma
     degli elementi di ciascuna riga in m.                   */
	public static int[] p2(int[][] m) {
		int[] s = null;
		if (m != null) {
      s = new int[m.length];
		  int i = 0;
      int k = 0;
		  while(i < m.length) {
        s[k] = 0;
        if (m[i] != null) {
			    int j = 0;
			    while(j < m[i].length) {
				    s[k] = s[k] + m[i][j];
				    j = j + 1;
		      }
        }
        k = k + 1;
        i = i + 1;
      }
    }
	  return s;
	}

	 public static void main (String[] args){
		 System.out.println(Arrays.equals(null, p2(null)));
		 System.out.println(Arrays.equals(new int[] {}, p2(new int[][] {})));
		 System.out.println(Arrays.equals(new int[] {0}, p2(new int[][] {null})));
		 System.out.println(Arrays.equals(new int[] {0}, p2(new int[][] {{}})));
		 System.out.println(Arrays.equals(new int[] {1,0,0,2}, p2(new int[][] {{1},null,{},{1,1}}))); 
   }
}
