/**
 * Classe con metodo ad argomento in grado di restituire 
 * un risultato sullo operand stack.
 * <p>
 * Scopo della classe e' illustrare che i metodi possono restiure
 * risultati anche dipendenti da parametri di input.
 */
public class MetodoArgomentoRisultato
{
  public static int M (int b) {

    int a = b + 4;    
    System.out.println("a in M = " + a);

    return a;
  }
  
  public static void main (String[] args) {
  
    int a = 1;
    int b = 2;
    int c = M(b + 3) + 1;

    System.out.println("a nel main = " + a);    
    System.out.println("b nel main = " + b);    
    System.out.println("c nel main = " + c);    
  }          
} 
