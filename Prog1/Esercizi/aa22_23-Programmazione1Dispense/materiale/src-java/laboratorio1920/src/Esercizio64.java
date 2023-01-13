import java.util.Arrays;

public class Esercizio64 {
  
  /* Punto 1. Per ipotesi a non è null. */
  public static int[][] init (int[] a) {
    int[][] b = new int[5][];
    int i = 0;
    while(i < 5) {
      if (i%2==0) {
        b[i] = Arrays.copyOf(a, a.length);
      }  else {
        b[i] = null;
      }
      i = i + 1;
    }
    return b;
  }  
  
  /* Punto 2. Per ipotesi m non è null. */
  public static int[] linR (int[][] m) {
    int[] a = new int[contaEl(m)];
    
    int i = 0;
    int k = 0;
    while(i < m.length) {
      if (m[i] != null) {
        int j = 0;
        while(j < m[i].length) {
          a[k] = m[i][j];
          j = j + 1;
          k = k + 1;
        }
      }
      i = i + 1;
    }
    return a;
  }  

  /* Punto 3. Per ipotesi m non è null.
     È ammesso che non abbia righe 
     tutte di medesima lunghezza. */
  public static int[] linC (int[][] m) {
    int[] a = new int[contaEl(m)];
    
    int maxLunR = maxLunR(m);
    int j = 0;
    int k = 0;
    while(j < maxLunR) {
      int i = 0;
      while (i < m.length) {
        if (m[i] != null && j < m[i].length) {
          a[k] = m[i][j];
          k = k + 1;
        }
        i = i + 1;
      }
      j = j + 1;
    }
    return a;
  }  

  /* Conta gli elementi in una matrice ragged. */
  public static int contaEl (int[][] m) {
    int c = 0;
    int i = 0;
    while(i < m.length) {
      if (m[i] != null) {
        c = c + m[i].length;
      }
      i = i + 1;
    }
    return c;
  }  

  /* Restituisce il valore massimo delle lunghezze
  delle righe in m. */
  public static int maxLunR (int[][] m) {
    int max = 0;
    int i = 0;
    while(i < m.length) {
      if (m[i] != null && max < m[i].length) {
        max = m[i].length;
      }
      i = i + 1;
    }
    return max;
  }  

  /* Punto 4. Per ipotesi m non è null.
     È ammesso che non abbia righe. */
  public static int[][] diagI (int[] a) {
    int[][] n = new int[a.length][a.length];
    
    int k = 0;
    while(k < a.length) {
      int i = k;
      while (i < n.length) {
        int j = k;
        while (j < n[i].length) {
             n[i][j] = a[k];
             n[j][i] = a[k];
            j = j + 1;
        }
        i = i + 1;
      }
      k = k + 1;
    }
    return n;
  }  

  /* Punto 5. Per ipotesi m non è null.
     È ammesso che non abbia righe. */
  public static int[][] diagF (int[] a) {
    int[][] n = new int[a.length][a.length];
    
    int i = 0;
    while (i < n.length) {
        int k = i;
        while(k < a.length) {
          n[i][k] = a[k];
          n[k][i] = a[k];
          k = k + 1;
        }
      i = i + 1;
    }
    return n;
  }  

  public static void main (String[] args) {

    int[] a = {12, 21, 33, 45, 73};
    int[][] m = init(a);
    
    /* Test Punto 1. */
    System.out.println(
      Arrays.deepEquals( new int[][] { {12, 21, 33, 45, 73}
                                     , null
                                     , {12, 21, 33, 45, 73}
                                     , null
                                     , {12, 21, 33, 45, 73}}
                       , m)
                      ); // atteso true

    /* Test Punto 2. */
    System.out.println(
      Arrays.equals( new int[] {12, 21, 33, 45, 73, 12, 21, 33, 45, 73, 12, 21, 33, 45, 73}
                   , linR(m))
                   ); // atteso true
  
    /* Test Punto 3. */
    System.out.println(
          Arrays.equals( new int[] {12, 12, 12, 21, 21, 21, 33, 33, 33, 45, 45, 45, 73, 73, 73}
                       , linC(m))
                       ); // atteso true
    System.out.println(
          Arrays.equals( new int[] {1, 2, 3}
                       , linC(new int[][] {{1}, null, {}, {2, 3}}))
                       ); // atteso true
  

    /* Test Punto 4. */
    System.out.println(
          Arrays.deepEquals( new int[][] {{12, 12, 12, 12, 12}
                                         ,{12, 21, 21, 21, 21}
                                         ,{12, 21, 33, 33, 33}
                                         ,{12, 21, 33, 45, 45}
                                         ,{12, 21, 33, 45, 73}}
                           , diagI(a))
                      ); // atteso true
                                   
    /* Test Punto 5. */
    System.out.println(
          Arrays.deepEquals( new int[][] {{12, 21, 33, 45, 73}
                                         ,{21, 21, 33, 45, 73}
                                         ,{33, 33, 33, 45, 73}
                                         ,{45, 45, 45, 45, 73}
                                         ,{73, 73, 73, 73, 73}}
                           , diagF(a))
                      ); // atteso true
  }
}