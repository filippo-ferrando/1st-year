/**
 * Dati quattro interi in altrettante variabili {@code a}, 
 * {@code b}, {@code c}, {@code d}, ne scambia i valori
 * un numero sufficiente di volte, affinche', nello stato finale,
 * i valori siano ordinati. La strategia e' iterare l'emersione
 * del massimo gia' vista. Siccome l'emersione del massimo sposta via, via
 * verso destra, il massimo di un insieme sempre piu' piccolo di valori non ordinati,
 * alla fine i valori sono ordinati non decrescentemente.
 */
public class BubbleQuattroVars { 

  public static void main (String[] args) {
    
    int tmp = 0; // variabile temporanea di scambio
    
    int a = 6; // Primo intero
    int b = 2; // Secondo intero
    int c = 5; // Terzo intero
    int d = 4; // Quarto intero
    
    /* Primo gruppo di scambi */
    if (a > b) {
      tmp = a; a = b; b = tmp; 
    } 
    
    if (b > c) {
      tmp = b; b = c; c = tmp; 
    } 
    
    if (c > d) {
      tmp = c; c = d; d = tmp; 
    }
   
    /* Secondo gruppo di scambi */
    if (a > b) {
      tmp = a; a = b; b = tmp; 
    } 
    
    if (b > c) {
      tmp = b; b = c; c = tmp; 
    } 
       
    /* Terzo gruppo di scambi */
    if (a > b) {
      tmp = a; a = b; b = tmp; 
    } 
    
    System.out.println(a + " " + b + " " + c + " " + d);
  }
}
