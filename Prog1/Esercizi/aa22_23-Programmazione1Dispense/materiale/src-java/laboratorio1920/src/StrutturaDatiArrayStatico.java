/**
 * Esempio essenziale per comprendere come rappresentare 
 * una struttura dati che necessiti anche (almeno) di un 
 * campo statico array di interi. 
 */

public class StrutturaDatiArrayStatico {
	  public static int i = 0;
	  public static int[] a = {0,1,2,3,4,5,6};
	  
	  public static void aggiungi(int delta) {
	    if(i < a.length) {
	      a[i] = a[i] + delta;
	      i++;
	    }
	  }
	  
	  public static void stampaA() {
	    for(int j = 0; j < a.length; j++)
	      System.out.print(a[j] + ((j == a.length - 1) ? "" : ",")); 
	    System.out.println();
	  }
}
