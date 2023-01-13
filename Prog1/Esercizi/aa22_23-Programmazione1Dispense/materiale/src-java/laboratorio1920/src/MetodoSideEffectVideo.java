/**
 * Classe con metodo senza argomenti il cui unico 'risultato'
 * e' pubblicare un messaggio a video.
 * <p>
 * Scopo della classe e' illustrare la possibilita' assegnare un nome
 * a linee di codice che possano essere richiamate in un sol colpo
 * in piu' punti del programma.
 */
public class MetodoSideEffectVideo
{

  public static void M () {
    int a = 2;
    System.out.println("a in M = " + a);
  }
  
  public static void main (String[] args) {
  
    int a = 3;
    
    M();
    a++; // equivale ad a = a + 1
         // e non influenza il valore
         // della variabile a in M
    M();
    System.out.println("a nel main = " + a);    
  }          
} 
