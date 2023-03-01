/**
 * Verifica sulla valutazione di espressioni booleane.
 * <p>
 * La classe propone, una alla volta, espressioni
 * booleane e chiede di fornirne il risultato della
 * valutazione. Non conferma l'esattezza della risposta. 
 * Si limita a contare il numero di risposte esatte.
 */
public class EspressioniBooleaneObsolete
{
  public static void main(String[] args) {
    int MAX_RISPOSTE_CORRETTE = 5;

    int risposteCorrette = 0;
    boolean espressioneLetta;
    
    System.out.println("--------------------------------");
    System.out.println("Valore di 'false || 5 < 10'?");
    if (SIn.readLineBoolean() 
          == (false || 5 < 10) ) 
      risposteCorrette++;

    System.out.println("--------------------------------");
    System.out.println("Valore di '3>5 || 10 == 7+3'?");    
     if (SIn.readLineBoolean() 
           == (3>5 || 10 == 7+3) ) {}
      risposteCorrette++;

    System.out.println("--------------------------------");
    System.out.println("Valore di '3 != 5 && (6 < 2 || 5+2 == 10 - 3)'?");
    if (SIn.readLineBoolean() 
          == (3 != 5 && (6 < 2 || 5+2 == 10 - 3)) ) 
      risposteCorrette++;

    System.out.println("--------------------------------");
    System.out.println("Valore di '3 < 5 && 5 < 7'?");
    if (SIn.readLineBoolean() 
          == (3 < 5 && 5 < 7) ) 
      risposteCorrette++;

    System.out.println("--------------------------------");
    System.out.println("Valore di '3 < 5 || 7 < 5'?");
    if (SIn.readLineBoolean() 
          == (3 < 5 || 7 < 5) ) 
      risposteCorrette++;
      
    System.out.println("--------------------------------");
    System.out.println("--------------------------------");
    System.out.println("Risposte corrette: " + risposteCorrette + " su " + MAX_RISPOSTE_CORRETTE);
 }
}
