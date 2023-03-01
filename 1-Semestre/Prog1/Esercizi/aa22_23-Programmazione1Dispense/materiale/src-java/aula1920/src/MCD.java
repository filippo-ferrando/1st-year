/**
 * Alcune possibili versioni di programmi per calcolare il Massimo Comun
 * Divisore di due numeri naturali {@code x} e {@code y}.
 * 
 */
public class MCD {
  /**
   * Sfrutta: {@code x>y ==> MCD(x,y)==MCD(x-y,y)} e {@code MCD(x,x)==x}
   */
  public static int mcdDifferenzeAlternate(int x, int y) {
    int a = x;
    int b = y;
    /* MCD(a,b)==MCD(x,y) */
    while (a != b) {
      
      /*
       * a!=b && MCD(a,b)==MCD(x,y) (invariante) implica (a>b || a<b) &&
       * MCD(a,b)==MCD(x,y)
       */      
      
      if (a > b) {
        /*
         * a>b implica MCD(a-b,b)==MCD(a,b)==MCD(x,y)
         */
        a = a - b;
        /* MCD(a,b)==MCD(x,y) */
      }      
      
      if (b > a) {
        /*
         * b>a implica MCD(a,b-a)==MCD(a,b)==MCD(x,y)
         */
        b = b - a;
        /* MCD(a,b)==MCD(x,y) */
      }
    }
    /*
    * a==b && MCD(a,a)==MCD(x,y) && MCD(a,a)==a implica a==MCD(x,y)
    */
    return a;
  }

  /**
   * Come mcdDifferenzeAlternate, sfrutta: x>y ==> MCD(x,y)==MCD(x-y,y)
   * MCD(x,x)==x utilizzando cicli interni tali che: se x>y, allora essi
   * trovano il minimo q tale che y>=x-q*y e MCD(x,y)==MCD(x-q*y,y)
   */
   public static int mcdDifferenzeInBlocco(int x, int y) {
     int a = x;
     int b = y;
     /* MCD(a,b)==MCD(x,y) */

     while (a != b) {
       /*
        * a!=b && MCD(a,b)==MCD(x,y) (invariante) implica (a>b || a<b) &&
        * MCD(a,b)==MCD(x,y)
        */
       while (a > b) {
         /*
          * a>b implica MCD(a-b,b)==MCD(a,b)==MCD(x,y)
          */
         a = a - b;
         /* MCD(a,b)==MCD(x,y) */
       }

       /* MCD(a,b)==MCD(x,y) && b>=a */
       while (b > a) {
         /*
          * b>a implica MCD(a,b-a)==MCD(a,b)==MCD(x,y)
          */
         b = b - a;
         /* MCD(a,b)==MCD(x,y) */
       }
       /*
        * MCD(a,b)==MCD(x,y) && a>=b che implica MCD(a,b)==MCD(x,y)
        */
     }

   /*
    * a==b && MCD(a,a)==MCD(x,y) && MCD(a,a)==a implica a==MCD(x,y)
    */
   return a;
}

  /**
   * In mcdDifferenzeInBlocco possiamo osservare che: "se x>y, allora cercare
   * il minimo q tale che y>=x-q*y e MCD(x,y)==MCD(x-q*y,y)" implichi le due
   * seguenti situazioni: 1) y==x-q*y, cioè x è multiplo di y e deve valere
   * MCD(x,y)==y 2) y>x-q*y, allora MCD(x%y,y)==MCD(x,y)
   */
  public static int mcdModulo00(int x, int y) {
        int a;
        int b;
        
        if (y > x) {
            a = y;
            b = x;
        } else {
            a = x;
            b = y;
        }

        /* MCD(a,b)==MCD(x,y) */
        while (a != b) {
           /*
            * a>b && MCD(a,b)==MCD(x,y) (invariante)
            * 
            * mcdDifferenzeInBlocco sottrae b da a finché possibile, ovvero
            * finché a>b è vero.
            * 
            * Al termine del primo ciclo abbiamo:) a==b se a è un multiplo di
            * b.) a<b se a non è un multiplo di b.
            */
           a = a % b;
           /* 0<=a<b */
           if (a == 0)
             /*
              * a è multiplo di b, quindi b==MCD(a,b)==MCD(x,y).
              */
             a = b;
             /*
              * a==MCD(a,a)==MCD(x,y).
              */
           else {
             /*
              * b>a implica MCD(b,a)==MCD(a,b)==MCD(x,y).
              */
             int t = a; // a e b scambiati
             a = b;
             b = t;
             /*
              * MCD(a,b)==MCD(x,y).
              */
           }
        }
        return a;
    }

    /**
     * In mcdModulo00 evitiamo di scambiare a con b non appena si verifica:
     * MCD(a,b)==MCD(x,y) con a multiplo di b; è possibile scambiare a con b e
     * terminare non appena b==0.
     */
    public static int mcdModulo01(int x, int y) {
      int a;
      int b;
      int t;

      if (y > x) {
         a = y;
         b = x;
      } else {
         a = x;
         b = y;
      }

      while (b != 0) {
          a = a % b;
          t = a; // a e b scambiati
          a = b;
          b = t;
      }
      return a;
     }

     /**
      * Wirth "Systematic Programming: An Introduction", Esercizio n.ro 7.5, pag.
      * 42.
      */
     
     /**
      * Wirth "Systematic Programming: An Introduction", Esercizio n.ro 7.6, pag.
      * 42: .
      */
}