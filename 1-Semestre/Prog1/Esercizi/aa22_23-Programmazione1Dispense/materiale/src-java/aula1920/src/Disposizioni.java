public class Disposizioni
{
  /**
   * Dato un array di interi {@code a}, ed un intero {@code g},
   * stampa tutte le disposizioni di {@code a.length} elementi 
   * in {@code a} a gruppi di {@code g} elementi.
   */
  public static void dispVideo(int[] a,int g) {
    dispVideo(a,g,0,"");
  } // permVideo

  /**
   * Dato un array di interi {@code a}, due interi {@code g} e {@code liv},
   * una stringa {@code p}, stampa le disposizioni degli elementi in 
   * {@code a}, a gruppi di {@code g}, precedute dal prefisso {@code p}.
   * Il parametro {@code liv}, il cui valore non supera quello di {@code g},
   * limita al valore di {@code g}, la profondità della visita dell'albero 
   * delle permutazioni, da cui ricava le disposizioni.   
   * @param a array di cui generare le disposizioni.
   * @param g numero degli elementi nelle disposizioni.
   * @param liv è compreso tra 0 e g e determina il momento in cui
   * stiamo generando disposizioni di g elementi.
   * @param p accumulatore nel quale costuirre la disposizione da
   * stampare.
   */
  private static void dispVideo(int[] a, int g, int liv, String p) {
    if(a.length==0 || liv==g) 
      System.out.println(p);
    else {
      for(int ignora=0;ignora<a.length;ignora++) {
        int[] b = LibListeArr.cancellaPosInt(a,ignora);
        dispVideo(b,g,liv+1,p+a[ignora]);
      } 
    }
  }
  
  /**
   * Dato un array {@code a}, ed un intero {@code g}, restituisce 
   * una matrice di interi che ne contiene tutte le disposizioni con
   * {@code g} elementi, riga per riga.
   * Metodo ricorsivo.
   * @param a array di cui fornire le disposizioni.
   * @return matrice con le disposizioni di {@code a}, 
   * aventi {@code g} elementi.
   */
  public static int[][] dispMatInt(int[] a, int g) {
    if(a.length == 0 || g == 0) {
    	return LibMatriciInt.nilMatInt();
    } else { // a.length > 0
    	int[][] permA = LibMatriciInt.nilMatInt();
        // {@code a} ha {@code n+1} elementi
        for(int ignora=0;ignora<a.length;ignora++) {
        	/*	{@code a[ignora]} è uno degli elementi di {@code a}.
            	Costruiamo l'array {@code aSenzaIgnora} identico ad
            	{@code a} tranne che nell'elemento {@code a[ignora]}. */       
            int[] aSenzaIgnora = LibListeArr.cancellaPosInt(a,ignora);
        
            /* 	Per ipotesi induttiva {@code dispMatInt(aSenzaIgnora,g-1)} 
          		contiene le disposizioni di {@code aSenzaIgnora} con un 
          		elemento in meno rispetto a quelli che compongono le 
          		disposizinoi di a.   */
         int[][] permASenzaIngora = dispMatInt(aSenzaIgnora,g-1);

          /* Aggiungiamo {@code a[ignora]} ad ogni elemento di permASenzaIngora */          
          int[][] permConIgnora = LibMatriciInt.consElMatInt(a[ignora], permASenzaIngora);

          /* Estendiamo le disposizioni generate sino a questo punto */
          permA = LibMatriciInt.concatMatInt(permConIgnora,permA);
        } 
    	return permA; 
    }
  }   
} 
