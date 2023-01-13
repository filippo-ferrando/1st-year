public class Fattoriale {
   public static void main(String[] args) {
       int n = 3; // valore di cui calcolare il fattoriale
       int i = 0;
       int f = 1; // conterra' n!
       while (i <= n) {
          // (f == (i-1)! && i < n) <==> (f * i == (i-1)! * i  && i < n)
          //                        <==> (f * i == i!   && i < n)
          //                        <==> (f * i == (i+1-1)!   && i < n)
          f = f * i;
          // (f == (i+1-1)!   && i < n)
          i = i + 1;
          // f == (i-1)! && i <= n
       } // (f == (i-1)! && i == n + 1) ==> f == (n + 1 -1)! == n!
   }
}
