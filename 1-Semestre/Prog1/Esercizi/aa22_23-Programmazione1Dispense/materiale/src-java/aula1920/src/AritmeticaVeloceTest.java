public class AritmeticaVeloceTest
{
  public static void main(String[] args) {
   
/*
   System.out.println(AritmeticaVeloce.RussianPeasantMult(2,3));
   System.out.println(AritmeticaVeloce.RussianPeasantExp(2,3));
   System.out.println(AritmeticaVeloce.RussianPeasantSum(2,3));
   System.out.println(AritmeticaVeloce.RussianPeasantMult(5,5));
   System.out.println(AritmeticaVeloce.RussianPeasantExp(5,5));
   System.out.println(AritmeticaVeloce.RussianPeasantSum(5,5));
*/

   /* Codice che evidenzia la relazione tra numero di 
      cicli percorsi in RussianPeasantMult all'aumentare
      del primo fattore.                                 */
   /*
   for(int a=2;a<50;a++) 
     for(int b=2;b<50;b++) 
       System.out.println("  "+a+"*"+b+"="+AritmeticaVeloce.RussianPeasantMult(a,b)
                           + "  ((int)log2("+a+"))+1="+((int)(Math.log(a)/Math.log(2))+1));
    */
   
   /* Codice che evidenzia la relazione tra numero di 
      cicli percorsi in RussianPeasantExp all'aumentare
      dell'esponente.                                     */
   /*
   for(int b=2;b<4;b++) 
     for(int e=0;e<17;e++) 
       System.out.println("  "+b+"^"+e+"="+AritmeticaVeloce.RussianPeasantExp(b,e+1)
                           + "  ((int)log2("+e+"))+1="+((int)(Math.log(e+1)/Math.log(2))+1));
    */
   
   /* Codice che evidenzia la relazione tra numero di 
      cicli percorsi in RussianPeasantSum all'aumentare
      del secondo addendo.                                */
  
   for(int a=2;a<4;a++) 
     for(int b=1;b<17;b++) 
       System.out.println("  "+a+"+"+b+"="+AritmeticaVeloce.RussianPeasantSum(a,b)
                           + "  ((int)log2("+b+"))+1="+((int)(Math.log(b)/Math.log(2))+1));
  
  }
}