/**
 * Funzione di Fibonacci.
 */
public class FibonacciRec {

    /** 
     * @param n
     * @return fib(n)
     */
    public static int fib(int n) {
       if (n == 0 || n == 1)
          return 1;
       else
          return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
    
        final int LIMITE = 10;
        
        int x = 0;
        while (x < LIMITE) {
            System.out.println(x + "! = " + fib(x) );
            x++;
        }
    }
}
