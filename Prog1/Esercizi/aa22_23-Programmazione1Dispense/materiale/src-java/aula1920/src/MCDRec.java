/**
 * Calcolo del MCD tra {@code a} e {@code b}.
 */
public class MCDRec {

   /**
    * Metodo definito in accordo con:
    * <ul>
    * <li>MCD(a,a)==a,
    * <li>se a>b allora MCD(a,b)==MCD(a-b,b),
    * <li>se b>a allora MCD(a,b)==MCD(a,b-a).
    * </ul>
    */
   public static int mcdRec(int a, int b) {

      if (a == b)
         return a;
      else if (a > b)
         return mcdRec(a - b, b);
      else
         return mcdRec(a, b - a);
   }

   /**
    * Metodo definito in accordo con:
    * <ul>
    * <li>MCD(a,0)==a,
    * <li>se a>b allora MCD(a,b)==MCD(b, a % b),
    * <li>se b>a allora MCD(a,b)==MCD(a, b % a).
    * </ul>
    */
   public static int mcdRecAlt(int a, int b) {
        return (b == 0) ? a : ((a > b) ? mcdRecAlt(b, a % b) : mcdRecAlt(a, b % a));
   }
}