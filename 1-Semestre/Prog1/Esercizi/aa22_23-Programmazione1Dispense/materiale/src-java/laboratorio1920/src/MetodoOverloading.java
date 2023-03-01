/**
 * Classe che illustra il meccanismo di overloading di metodi
 * e relativo meccanismo di disambiguazione basato sulla 
 * discriminazione delle signatures che non include il tipo
 * del risultato.
 * <p>
 * L'aspetto rilevante e' la presenza di due definizioni
 * di metodi con lo stesso nome. Non e' un'ambiguita'
 * perche' essi sono distinti grazie alla loro signature.
 * La signature e' composta dal nome del metodo e dalla
 * sequenza dei tipi degli argomenti. La signature non
 * contiene il tipo del risultato restituito.
 */
public class MetodoOverloading {

  public static int M () {
    int a = 1;
    System.out.println("a in M() = " + a);
    return a;
  }

  public static int M (int a, boolean b) {
    int c = (b) ? a + 1 : a - 1;    
    System.out.println("c in M(int " + a + ", boolean " + b + ") = " + c);
    c = c + M();
    return c;
  }
  
  public static int M (float a, boolean b) {
    int c = (int)((b) ? a + 10 : a - 10);
    System.out.println("c in M(float " + a + ", boolean " + b + ") = " + c);
    return c;
  }
  
  public static void main (String[] args) {
  
    int a = 2;
    boolean b = false;
    int c = M(a + 1, true && b);
    System.out.println("a in main = " + a);
    M(1000f, true && b);
  }          
}