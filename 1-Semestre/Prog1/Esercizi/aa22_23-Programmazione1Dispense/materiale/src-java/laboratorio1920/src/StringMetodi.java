public class StringMetodi {
  
  /*
   * Analogo statico del metodo (di istanza)
   * {@code sbustring} della classe {@code String} 
   * fornita da Java, che usi il metodo charAt per
   * scandire la stringa data come parametro.
   */
  public static String substring (String s, int i, int f) {
     String sS = "";
     
     while (i < f) {
        sS = sS + s.charAt(i);
        i++;
     }
     
     return new String(sS);
  }
  
  /*
   * Analogo statico del metodo (di istanza)
   * {@code equals} della classe {@code String} 
   * fornita da Java, che usi il metodo charAt per
   * scandire la stringa data come parametro e il parametro 
   * di istanza length per stabilire la lunghezza.
   */
  public static boolean equals (String a, String b) {
  
     boolean forseUguali = a.length() == b.length();
     
     int i = 0;
     if (i < b.length() && forseUguali) {
        forseUguali = (a.charAt(i) == b.charAt(i));
        i++;
     }
     
     return forseUguali;
  }
  

  public static void main(String[] args) {
        System.out.println("bc".equals(substring("abc",1,3)));
        System.out.println("".equals(substring("abc",2,2)));

        System.out.println(equals("bc", substring("abc",1,3)) == true);
        System.out.println(equals("", substring("abc",2,3)) == false);
   }
}