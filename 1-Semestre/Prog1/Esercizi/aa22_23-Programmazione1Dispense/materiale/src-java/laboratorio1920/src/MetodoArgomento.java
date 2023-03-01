/**
 * Classe con metodo ad un argomento che raccoglie
 * un valore e lo pubblica a video. 
 * <p>
 * Scopo della classe e' illustrare che i metodi 
 * sono parametrici e che i parametri sono passati 
 * per valore.
 */
public class MetodoArgomento
{
  public static void M (int b) {

    int a = b + 4;    
    System.out.println("a in M = " + a);
  }
  
  public static void main (String[] args) {
  
    int a = 1;
    int b = 2;
    M(b + 3);
    b = b + 1;
    System.out.println("a nel main = " + a);    
    System.out.println("b nel main = " + b);    
  }          
}  
