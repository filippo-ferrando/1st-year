/**
 * Dati quattro interi in altrettante variabili {@code a}, 
 * {@code b}, {@code c}, {@code d}, la classe li 
 * scambia in modo da far emergere il massimo valore in {@code d}.
 * <p>
 * Scopo e' dimostrare l'importanza dello scambio di valori 
 * tra variabili. 
 * <p>
 * ESEMPI.
 * <br>
 * Se {@code a==6}, {@code b==2}, {@code c==5}, {@code d==4}
 * la classe riassegna opportunamente
 * i valori di {@code a}, {@code b}, {@code c}, {@code d} in modo 
 * che al termine {@code a==2}, {@code b==5}, {@code c==4}, {@code d==6}.
 * <br>
 * Un caso in cui servono tutte e tre le applicazioni del meccanismo 
 * illustrato in {@link BubbleQuattroVars} e':
 * <br>
 * Se {@code a==6}, {@code b==4}, {@code c==5}, {@code d==1} la classe 
 * riassegna opportunamente i valori di {@code a}, {@code b}, {@code c},
 * {@code d} in modo che al termine {@code a==4}, {@code b==5}, {@code c==1}, 
 * {@code d==6}.
 */
public class EmersioneDelMassimoQuattroVars
{ 
  public static void main (String[] args) {
    
    int temp = 0; // variabile temporanea di scambio
    
    int a = 6; // Primo intero
    int b = 2; // Secondo intero
    int c = 5; // Terzo intero
    int d = 4; // Quarto intero
    int tmp =0;
      
    if (a > b) {
      tmp = a; a = b; b = tmp; 
    } 
    
    if (b > c) {
      tmp = b; b = c; c = tmp; 
    } 
    
    if (c > d) {
      tmp = c; c = d; d = tmp; 
    }
   
    System.out.println(a + " " + b + " " + c + " " + d);
  }
}
