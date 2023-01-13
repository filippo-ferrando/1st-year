/**
 * Scambia il valore di due variabili.
 */
public class ScambioVariabili  {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    System.out.println("Prima dello scambio:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    // scambio
    int tmp; // variabile temporanea di supporto
    tmp = a;
      a = b;
      b = tmp;
    
    System.out.println("A scambio avvenuto:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
   }
}
