/**
 * Esercizio suggerito nel Wirth 
 * "Systematic Programming: An Introduction" e derivati.
 */
public class AritmeticaVeloce
{
  /**
   * Esercizio n.ro 5.1, pag. 24: moltiplicazione del
   * contadino russo.
   */
  public static int RussianPeasantMult(int x, int y) {

    int m = 0; // risultato
    int u = x;
    int v = y;
    int c = 0; // per valutazioni di costo
    
    /* x*y==m+u*v */
    while (u!=0) {
      c++;
      /* u!=0 &&
           x*y==m+u*v (invariante) 
         implica 
           x*y==m+((u div 2)*2+(u mod 2))*v
              ==m+(u div 2)*2*v+(u mod 2)*v
       */
      if (u%2==1)  {
        /* x*y==m+(u div 2)*2*v+1*v
              ==m*v+(u div 2)*2*v
         */
        m = m+v;
        /* x*y==m+(u div 2)*2*v
              ==m+(u div 2)*2*v+0*v (per uscire
                                     agevolmente dalla selezione)
         */
      }

      /* x*y==m+(u div 2)*2*v+0*v
            ==m+(u div 2)*2*v
       */
      u = u/2;
      /* x*y==m+u*2*v
       */      
      v = v*2;
      /* x*y==m+u*v (invariante)
       */      
    }
    /* u==0 &&
       x*y==m+u*v
          ==m
     */      

   /* Decommentare l'istruzione seguente: */
      System.out.print("cicli="+c);
   /* per stampare il numero di cicli percorsi */
   return m;
  }
  
  /**
   * Esercizio n.ro 5.2, pag. 25: esponenziazione del
   * contadino russo(?!?!?).
   */
  public static int RussianPeasantExp(int x  // base
                                     ,int y  // esponente
                                     ) {

    int e = 1; // risultato
    int u = x;
    int v = y;
    int c = 0; // per valutazioni di costo
    
    /* x^y==e*u^v */
    while (v!=0) {
      c++;
      /* u!=1 &&
           x^y==e*u^v (invariante) 
         implica 
           x^y==e*u^((v div 2)*2+(v mod 2))
              ==e*u^((v div 2)*2)*u^((v mod 2))
       */
      if (v%2==1)  {
        /* x^y==e*u^((v div 2)*2)*u^((v mod 2))
              ==e*u^((v div 2)*2)*u^1
              ==(e*u)*u^((v div 2)*2)
         */
        e = e*u;
        /* x^y==e*u^((v div 2)*2)
              ==e*u^((v div 2)*2)*u^0 (per uscire agevolmente
                                       dalla selezione)
         */
      }

      /* x^y==e*u^((v div 2)*2)*u^0
            ==e*u^((v div 2)*2)*1
            ==e*u^((v div 2)*2)
       */
      v = v/2;
      /* x^y==e*u^(v*2)
            ==e*((u^2))^v
       */
      u = u*u;
      /* x^y==e*u^v
       */
    }
    /* v==0 &&
       x^y==e*u^0
          ==e*1
          ==e
     */     

   /* Decommentare l'istruzione seguente:
      System.out.print("cicli="+c);
      per stampare il numero di cicli percorsi
    */
   return e;
  }
  
  /**
   * Somma del contadino russo(?!?!?).
   */
  public static int RussianPeasantSum(int x  // addendo
                                     ,int y  // addendo
                                     ) {

    int a = x; // risultato
    int b = y;
    int c = 0; // per valutazioni di costo
    
    /* x+y==a+b */
    while (b>0) {
      c++;
      /* b>0 &&
           x+y==a+b (invariante) 
       */
      if (b%2==0)  {
        /* x+y==a+b
              ==a+b/2+b/2  divisione intera
         */
        a = a+b/2;
        /* x+y==a+b/2
         */
      } else {
          /* x+y==a+b
                ==a+1+b/2+b/2 // divisione intera
           */
           a = a+1+b/2;
          /* x+y==a+b/2
           */
      }
      /* x+y==a+b/2  // divisione intera
       */
      b = b/2;
      /* x+y==a+b
       */
    }
    /* b==0 &&
       x+y==a+b
          ==a
     */     

   /* Decommentare l'istruzione seguente:
      System.out.print("cicli="+c);
      per stampare il numero di cicli percorsi
    */
   return a;
  }
}
