import java.lang.Math;

/** 
 ******** Dall'Esercizio 66, Parte II, Sezione 2.13 ******
 * 
 * Classe con metodi la cui specifica coinvolge l'uso di quantificatori
 * esistenziali o universali.
 **/
 public class Quantificatori {
	
	/* Sia a un array di interi.
	 * Scrivere un metodo iterativo almenoDue che restituisce true se in 
	 * a esiste almeno un elemento a[i] per cui si puo' verificare che ogni 
	 * altro elemento a[j] di a e' tale che il valore assoluto di a[i]-a[j]
	 * vale almeno due. Deve restituire false in ogni altro caso.
	 * */
	 public static boolean almenoDue(int[] a) {
		 boolean esisteR = false;
		 if (a != null) {
			 int i = 0;
			 while(!esisteR && i < a.length - 1) {
				 boolean ogniC = true;
				 int j = 0;
				 while(ogniC && j < a.length) {
					 if (j != i)
					     ogniC = Math.abs(a[j] - a[i]) >= 2;
					 j = j + 1;
				 }
				 esisteR = ogniC;
				 i = i + 1;
			 }
		 }
		 return esisteR;
	 }
	 
	 /* Sia a un array di interi.
	  * Scrivere un metodo multiploDx che restituisce true nel caso in
	  * cui in a esiste almeno un elemento che e' multiplo di tutti gli 
	  * elementi alla sua destra in a. Deve restituire false in ogni 
	  * altro caso.
	  * */
	  public static boolean multiploDx(int[] a) {
		 boolean esisteR = false;
		 if (a != null) {
			 int i = 0;
			 while(!esisteR && i < a.length) {
				 boolean ogniC = true;
				 int j = i + 1;
				 while(ogniC && j < a.length) {
					 ogniC = a[i]%a[j] == 0;
					 j++;
				 }
				 esisteR = ogniC;
				 i++;
			 }
		 }
		 return esisteR;
	  }
	  
	   /* Siano a e b due array di interi.
	    * Scrivere un metodo sommaDueCons che restituisce true se per ogni 
	    * elemento di a esistono due elementi consecutivi in b la cui 
	    * somma e' pari ad a. Deve restituire false in ogni altro caso.
	    * */
	   public static boolean sommaDueCons(int[] a, int[] b) {
		   boolean ogniR = a != null && b != null
		                         && a.length >= 1 && b.length >= 2;
		   if (ogniR) {
			   int i = 0;
			   while(ogniR && i < a.length) {
			      boolean esisteC = false;
			      int j = 0;
			      while(!esisteC && j < b.length -1) {
			           esisteC = (a[i] == b[j] + b[j+1]);
			           j++;
			      }
			      ogniR = esisteC;
			      i++;
			  }
		   }
		   return ogniR;
	   }

     // Possibili testing
	 public static void main (String[] args){
		 System.out.println("Testing per almenoDue");
		 int[] t0 = {    0};         
		 int[] t1 = {-1, 0,  1};     
		 int[] t2 = { 1, 0, -1};     
		 int[] t3 = { 2, 0, -2};     
		 int[] t4 = { 3, 0,  1, -3}; 
		 int[] t5 = {-3, 0,  1,  3}; 
		 System.out.println(almenoDue(t0)==false);
		 System.out.println(almenoDue(t1)==false);
		 System.out.println(almenoDue(t2)==false);
		 System.out.println(almenoDue(t3)==true );
		 System.out.println(almenoDue(t4)==true );
		 System.out.println(almenoDue(t5)==true );
		 
		 System.out.println("Testing per multiploDx");
		 int[] u0 = {10}; 
		 int[] u1 = {10, 2, 5}; 
		 int[] u2 = {3, 10, 2, 5}; 
		 int[] u3 = {3, 10, 2, 5, 3}; 
		 System.out.println(multiploDx(u0)==false);
		 System.out.println(multiploDx(u1)==true);
		 System.out.println(multiploDx(u2)==true);
		 System.out.println(multiploDx(u3)==false);
		 
		 System.out.println("Testing per sommaDueCons");
		 int[] a0 = {}; 
		 int[] b0 = {1}; 
		 int[] a1 = {10}; 
		 int[] b1 = {5, 5}; 
		 int[] b2 = {5, 1, 5}; 
		 int[] a2 = {10, 2}; 
		 int[] b3 = {1, 1, 7, 3}; 
		 System.out.println(sommaDueCons(a0,b0)==false);
		 System.out.println(sommaDueCons(a1,b0)==false);
		 System.out.println(sommaDueCons(a1,b1)==true);
		 System.out.println(sommaDueCons(a1,b2)==false);
		 System.out.println(sommaDueCons(a2,b3)==true);
	 }
}