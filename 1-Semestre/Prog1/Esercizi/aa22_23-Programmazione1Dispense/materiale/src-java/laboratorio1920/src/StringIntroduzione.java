import java.util.Arrays;

public class StringIntroduzione {
  public static void main(String[] args) {
         String str0 = "abc";
         char[] data = {'a', 'b', 'c'};
         String str1 = new String(data); // Notare le parentesi tonde!
         String cde  = "cde";
         String cde1 = "cde";
         
         System.out.println("------ Concatenazione.");
         System.out.println("Concatenazione tra la stringa \"abc\" e la variabile di nome 'cde':" + "abc" + cde);  
         
         System.out.println("------ Sottostringhe.");
         String c = "abc".substring(2,3); // metodo d'istanza: dal 2do elemento incluso al 3zo escluso
         System.out.println("Variabile di nome 'c': " + c);
         String d = cde.substring(1,3); // metodo d'istanza: dal 1mo elemento incluso al 3zo escluso
         System.out.println("Variabile di nome 'd': " + d);
         
         System.out.println("------ Lunghezza.");
         System.out.println("Lunghezza della stringa \"abc\": " + "abc".length());
         System.out.println("Lunghezza della variabile di nome 'cde': " + cde.length());
         System.out.println("Lunghezza della variabile di nome 'd': " + d.length());
         
         System.out.println("------ Eguaglianza.");
         System.out.println("cde.substring(0,1).equals(str0.substring(2,3)) restituisce: " 
               + cde.substring(0,1).equals(str0.substring(2,3)));
         System.out.println("cde.equals(cde1) restituisce 'true' come atteso: " + cde.equals(cde1));
         System.out.println("cde == cde1 restituisce inaspettatamente 'true': " + (cde == cde1));
                         
         System.out.println("------ Trasformazione di array in stringhe.");
         int[] a = {1, 2, 3};
         System.out.println(Arrays.toString(a)); 
                         
   }
}