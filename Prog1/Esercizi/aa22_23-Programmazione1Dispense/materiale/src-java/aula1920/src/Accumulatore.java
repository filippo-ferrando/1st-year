/**
 * Accumula in una variable la somma di tutti i naturali compresi
 * tra {@code 0} e ed il numero naturale contenuto in {@code n}.
 */
public class Accumulatore {

  public static void main(String[] args) {

    int n = 10;
    int accumulatore = 0;
    
    while (n > 0) {
      accumulatore = accumulatore + n;
      n = n - 1;
    }

    System.out.println("La somma dei primi " + n + " interi vale " + accumulatore + ".");
  }
}