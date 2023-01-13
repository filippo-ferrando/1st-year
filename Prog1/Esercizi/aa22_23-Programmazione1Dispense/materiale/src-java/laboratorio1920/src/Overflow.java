/**
 * Overflow con numeri interi.
 */
public class Overflow {
  public static void main(String[] args){

    int massimo = Integer.MAX_VALUE;
    System.out.println("Valore intero massimo = " + massimo);
    massimo = massimo + 3;
    /* L'elaborazione prosegue anche in caso di overflow, 
     * ma con risultato scorretto.
     */
    System.out.println("Valore intero massimo + 3 = " + massimo);
  }
}
