/**
 * Approssimazione del Bubble sort su quattro variabili. 
 * <p>
 * Ordiniamo in maniera non decrescente i valori contenuti
 * in quattro variabili, facendo via via emergere il massimo
 * dell'insieme di valori non ancora ordinati.
 * <p>
 * La classe usa tre istanze del meccanismo illustrato in
 * {@link EmersioneDelMassimoQuattroVars} per dimostrare l'importanza 
 * dello scambio di valori tra variabili.  
 * <p>
 * La prima istanza del meccanismo in
 * {@link EmersioneDelMassimoQuattroVars} riduce la distanza
 * tra la posizione occupata dal massimo valore contenuto
 * in a, b, c, d e l'ultima posizione in cui esso deve finire.
 * <br>
 * Al termine, d contiene il massimo. Per ottenere l'ordinamento
 * di tutti i valori inizialmente in a, b, c, d sono rimasti da
 * ordinare quelli in a, b, c.
 * <p>
 * Riapplichiamo una seconda istanza del meccanismo in 
 * {@link EmersioneDelMassimoQuattroVars} che riduce la distanza
 * tra la posizione occupata dal massimo valore contenuto
 * in a, b, c e l'ultima posizione in cui esso deve finire.
 * <br>
 * Al termine, c contiene il massimo dei valori inzialmente in
 * a, b, c. 
 *  <br>
 * Per ottenere l'ordinamento di tutti i valori inizialmente 
 * in a, b, c, d sono rimasti da ordinare quelli in a, b.
 * <p>
 * Riapplichiamo una terza istanza del meccanismo in 
 * {@link EmersioneDelMassimoQuattroVars} che riduce la distanza
 * tra la posizione occupata dal massimo valore contenuto
 * in a, b e l'ultima posizione in cui esso deve finire.
 * <br>
 * Al termine, b contiene il massimo dei valori inzialmente in
 * a, b. 
 * <p>
 * Riassumendo, ogni istanza del meccanismo in 
 * {@link EmersioneDelMassimoQuattroVars} viene applicata ad una sequenza
 * di lunghezza inferiore di valori potenzialmente non ordinati.
 * <p>
 * Quando la sequenza di elementi da ordinare e' di due variabili a, b
 * una volta ordinati i loro due elementi tutti i valori lo sono.
 * <p>
 * ESEMPI.
 * <br>
 * Un caso in cui bastano due applicazioni del meccanismo illustrato
 * in {@link EmersioneDelMassimoQuattroVars} e':
 * <br>
 * Se a==6, b==2, c==5, d==4 la classe riassegna opportunamente
 * i valori di a, b, c, d in modo che al termine a==2, b==4, c==5, d==6.
 * <br>
 * Un caso in cui servono tutte e tre le applicazioni del meccanismo 
 * illustrato in {@link EmersioneDelMassimoQuattroVars} e':
 * <br>
 * Se a==6, b==4, c==5, d==1 la classe riassegna opportunamente
 * i valori di a, b, c, d in modo che al termine a==1, b==4, c==5, d==6.
 */
public class BubbleQuattroVarsVecchio
{ 
  public static void main (String[] args) {
    
    int temp = 0; // variabile temporanea di scambio
    
    int a = 6; // Primo intero
    int b = 2; // Secondo intero
    int c = 5; // Terzo intero
    int d = 4; // Quarto intero
        
    /* Prima serie di confronti. */
    if (a<=b)  { 
      if (b<=c) {    
        if (c<=d) { // a<=b<=c<=d
        } else { // c > d 
            temp = c; c = d; d = temp;
          }
      } else { // b > c
          temp = b; b = c; c = temp;
          if (c<=d) { 
          } else { // c > d 
              temp = c; c = d; d = temp;
            }
        }
    } else { // a > b
      temp = a; a = b; b = temp;
      if (b<=c) {
        if (c<=d) {
        } else { // c > d
           temp = c; c = d; d = temp;    
          }
      } else { // b > c
        temp = b; b = c; c = temp;
        if (c<=d) {
        } else { // c > d
          temp = c; c = d; d = temp;
        }        
      }
    }

    /* La situazione raggiunta e' caratterizzata
     * dall'aver fatto 'emergere' nella variabile
     * d il valore più grande tra tutti quelli
     * contenuti inizialmente in a, b, c, d.
     */ 
    System.out.println("------------------------------");
    System.out.println("Valori ordinati dopo la prima serie"
                           + " di confronti.");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    
    /* Seconda serie di confronti. */
    if (a<=b)  { 
      if (b<=c) {    
      } else { // b > c
          temp = b; b = c; c = temp;
        }
    } else { // a > b
      temp = a; a = b; b = temp;
      if (b<=c) {
      } else { // b > c
        temp = b; b = c; c = temp;
      }
    }
    
    /* La situazione raggiunta e' caratterizzata
     * dall'aver fatto 'emergere' nella variabile
     * c il secondo valore più grande tra tutti quelli
     * contenuti inizialmente in a, b, c, d.
     */ 
    System.out.println("------------------------------");
    System.out.println("Valori ordinati dopo la seconda serie"
                           + " di confronti.");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    
    /* Terza serie di confronti. */
    if (a<=b)  { 
    } else { // a > b
      temp = a; a = b; b = temp;
    }
    
    /* La situazione raggiunta e' caratterizzata
     * dall'aver fatto 'emergere' nella variabile
     * b il terzo valore più grande tra tutti quelli
     * contenuti inizialmente in a, b, c, d.
     */ 
    System.out.println("------------------------------");
    System.out.println("Valori ordinati dopo la terza serie"
                           + " di confronti.");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);

  }
}