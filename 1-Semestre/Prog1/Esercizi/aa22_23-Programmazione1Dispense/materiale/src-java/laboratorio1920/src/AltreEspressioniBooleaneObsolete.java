/** 
 * Esperimenti di valutazione su espressioni booleane.
 */
public class AltreEspressioniBooleaneObsolete 
{
   public static void main(String[] args) {

     int a, b;
     boolean espressione, x, y;
     
     System.out.println("--------------------------------");
     a = 3;
     b = 2;
     System.out.println("a = " + a);
     System.out.println("b = " + b);
     espressione = a==b;
     System.out.println("Quanto vale a==b ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     a = 3;
     b = 3;
     System.out.println("a = " + a);
     System.out.println("b = " + b);
     espressione = a==b;
     System.out.println("Quanto vale a==b ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     b = 7;
     System.out.println("b = " + b);
     espressione = 3<=b && b<=5;
     System.out.println("Quanto vale (3<=b && b<=5) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     b = 6;
     System.out.println("b = " + b);
     espressione = (b<=5 && b>=3);
     System.out.println("Quanto vale (b<=5 && b>=3) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     a = 4;
     b = 6;
     System.out.println("a = " + a);
     System.out.println("b = " + b);
     espressione = (b<=5 || a>=3);
     System.out.println("Quanto vale (b<=5 || a>=3) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     a = 7;
     b = 6;
     System.out.println("a = " + a);
     System.out.println("b = " + b);
     espressione = (b<=5 || a>=3)==(a+1<9);
     System.out.println("Quanto vale (b<=5 || a>=3)==(a+1<9) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     x = true;
     y = false;
     System.out.println("x = " + x);
     System.out.println("y = " + y);
     espressione = (!(x & y) == !x | !y);
     System.out.println("Quanto vale (!(x & y) == !x | !y) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     x = true;
     y = false;
     System.out.println("x = " + x);
     System.out.println("y = " + y);
     espressione = (x | y == !(!x & !y));
     System.out.println("Quanto vale x | y == !(!x & !y) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     x = true;
     y = false;
     System.out.println("x = " + x);
     System.out.println("y = " + y);
     espressione = (x^y == (x & !y) | (!x & y));
     System.out.println("Quanto vale (x^y == (x & !y) | (!x & y)) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     x = false;
     y = false;
     System.out.println("x = " + x);
     System.out.println("y = " + y);
     espressione = (x^y == (x & !y) | (!x & y));
     System.out.println("Quanto vale (x^y == (x & !y) | (!x & y)) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     x = true;
     y = true;
     System.out.println("x = " + x);
     System.out.println("y = " + y);
     espressione = (x^y == (x & y) | (!x & !y));
     System.out.println("Quanto vale (x^y == (x & !y) | (!x & y)) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     a = 3;
     b = 7;
     x = false;
     System.out.println("a = " + a);
     System.out.println("b = " + b);
     System.out.println("x = " + x);
     espressione = (x = a <= b);
     System.out.println("Quanto vale (x = a <= b) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }

     System.out.println("--------------------------------");
     x = true;
     a = 7;
     b = 3;
     System.out.println("x = " + x);
     System.out.println("a = " + a);
     System.out.println("b = " + b);
     espressione = (x &&  (y = a<=b));
     System.out.println("Quanto vale (x &&  (y = a<=b)) ?");
     if (SIn.readLineBoolean()==espressione) {
       System.out.println("Esatto.");
     } else {
       System.out.println("Errato.");     
     }          
  }
}
