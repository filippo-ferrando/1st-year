/**
 * Dati due interi x e y non negativi, la classe calcola
 * sia il quoziente, sia il resto della divisione
 * intera di x per y, assumendo di poter eseguire solo la differenza.
 * <p>
 * I commenti di questa classe contengono proprietà invarianti
 * <p>
 * <p>
 * DOMANDA ed ESERCIZIO.
 * <ol>
 *  <li> La divisione funziona anche con y = 0? 
 * </ol>
 */
public class QuozienteRestoIterandoDifferenzeCorr
{
  public static void main (String[] args) {
  
      System.out.println("----------------------------------------------------------");
      System.out.println("Quoziente e resto della divisione di x per y non negativi.");

      int x = 8; // Dividendo
      int y = 2; // Divisore
      /* Assumiamo che valga il vincolo di progettazione.
       * PROPRIETÀ.
       * x>=0,
       * y>=0.
       *
       * Supponiamo di indicare con qXY il quoziente della divisione 
       * intera tra x e y e con rXY il resto.
       * Ad esempio, se x==5 e y==2 allora qXY==2 ed il rXY==1.
       *
       * Quindi, in ogni punto del programma vorremo far valere che:
       *
       *      x == qXY*y + rXY,   (A)
       *
       * o, equivalentemente:
       *
       *      x == (y+...+y con qXY occorrenze) + rXY   (B)
       *
       * Supponiamo di imporre:
       */
      int qXY = 0 ; // quoziente
      int rXY = x ; // resto
      
      /* Abbiamo appena assunto:
       *
       *    qXY==0
       *    rXY==x
       *
       * che permettono di soddisfare (B):
       *
       *      x == (y+...+y con 0 occorrenze) + x .     (C)
       * 
       * Volendo dividere x con y, usando la sottrazione, occore togliere
       * iterativamente y da x fino a quando quel che rimane da togliere
       * è una quantità uguale o superiore a y.
       * 
       * Il meccanismo iterativo può essere applicato a (C) come segue.
       *
       * Immaginimo sia di sottrarre y da quel che rimane da sottrarre, 
       * ovvero da x==rXY sia di ricordare nel quoziente che abbiamo
       * applicato una sottrazione.
       *
       * Quindi (C) diventa:
       *
       *      x == (y+...+y con 1 occorrenza) + (x-y) .     (D)
       * 
       * Riapplichiamo lo stesso principio a (D).
       * Immaginimo sia di sottrarre y da quel che rimane da sottrarre, 
       * ovvero da x-y==rXY sia di ricordare nel quoziente che abbiamo
       * applicato una sottrazione.
       *
       * Quindi (D) diventa:
       *
       *      x == (y+...+y con 2 occorrenze) + (x-y-y) .     (E)
       * 
       * Ripetendo il procedimento, arriveremo ad una situazoine in cui:
       *
       *      x == (y+...+y con qXY occorrenze) + (x-y-y-...-y) 
       *
       * in cui (x-y-y-...-y)==rXY è inferiore ad y e non è più ammesso
       * sottrarre y da rXY.
       */
      while (rXY>=y) {
        /* PROPRIETÀ.
         * rXY >= y,
         * x == (y+...+y con qXY occorrenze di y) + rXY.
         *
         * Equivalentemente:
         *      x == qXY*y + rXY
         *        == (qXY+1)*y + (rXY-y).      (F)
         */
        qXY = qXY + 1; 
        /* PROPRIETÀ.
         * rXY >= y,
         * x == (y+...+y con qXY occorrenze di y) + (rXY - y)
         *
         * Equivalentemente:
         *      x == qXY*y + (rXY-y).
         */
        rXY = rXY - y;
        /* PROPRIETÀ.
         * Non so più che relazione possa esistere tra rXY e y
         * dato che ora può anche essere  rXY < y,
         * Inoltre:
         *
         * x == (y+...+y con qXY occorrenze di y) + rXY.
         *
         * Equivalentemente:
         *      x == qXY*y + rXY.              (G)
         *
         * (G) ed (A) coincidono quindi abbiamo determinato
         * la proprietà invariante di ciclo.
         */
      }
      /* PROPRIETÀ.
       * rXY < y ,
       * x == (y+...+y con qXY occorrenze di y) + rXY.
       *
       * Equivalentemente:
       *      x == qXY*y + rXY.
       */
      System.out.println("quoziente = " + qXY + ".");
      System.out.println("resto = " + rXY  + ".");     
    }
}