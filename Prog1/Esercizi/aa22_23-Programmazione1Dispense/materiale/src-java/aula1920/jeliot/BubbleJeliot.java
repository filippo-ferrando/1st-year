import jeliot.io.*;

/** 
 * Classe adatta ad essere eseguita in Jeliot che
 * fornisce metodi alternativi per far emergere il valore
 * massimo in un array e li sfrutta in diversi modi
 * definire l'algoritmo di sorting BubbleSort. 
 * Contiene anche commenti sul costo dell'algoritmo
 * BubbleSort.
 */
public class BubbleJeliot {
    
    public static void eMaxR(int[] a) {
        eMaxR(a, a.length - 1);
    }

    private static void eMaxR(int[] a, int l) {
        if (l == 0 ) { }
        else {
            eMaxR(a, l - 1);
            if (a[l - 1] > a[l]) 
                scambia(a, l, l - 1);
        }
    }
    
    public static void eMaxRAlt(int[] a) {
        eMaxRAlt(a, 0);
    }

    private static void eMaxRAlt(int[] a, int l) {
        if (l == a.length - 1) { }
        else {
            if (a[l] > a[l + 1]) 
                scambia(a, l, l + 1);
            eMaxRAlt(a, l + 1);
        }
    }

    private static void scambia(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * Questa versione possiamo considerarla ridondante
     * nel seguente senso: ogni chiamata diu bubbleRec
     * esegue a.length - 1 confronti anche se, via via che
     * si procede, la porzione di array non ordinata 
     * ha meno elementi. Il numero di confronti:
     *   durante la 1ma chiamata sono a.length - 1
     *   durante la 2da chiamata sono a.length - 1
     *   ...
     *   durante la chiamata a.length sono a.length - 1
     * In totale il numero di confronti cresce come
     * il quadrato di a.length.
     */
    public static void bubbleRecRidondante(int[] a) {
        for (int i = 0; i < a.length; i++) {
	  bubbleRec(a, 0);
    }

    /**
     * In questa versione il numero di confronti
     * eseguiti via via da eMaxR cala di numero.
     * La successione del numero di confronti e' 
     * la seguente:
     *   durante la 1ma chiamata sono a.length - 1
     *   durante la 2da chiamata sono a.length - 2
     *   ...
     *   durante la chiamata a.length - 1 sono 1
     * In totale il numero di confronti e':
     *   (a.length - 1) + (a.length - 2) + .. + 1
     * cioe' ((a.length - 1)*a.length)/2 che e'
     * un valore che cresce col quadrato di 
     * a.length, esattamente come nella versione
     * ridondnante.
     */
    public static void bubbleIter(int[] a) {
        
        for (int i = a.length - 1; i >= 1; i--) {
            // emersione del massimo per porzioni via via decrescenti di a
            eMaxR(a,i);
        }
    }

    /**
     * Questa versione e' analoga a bubbleIter
     * in termini costi.
     */
    public static void bubbleRec(int[] a) {
        bubbleRec(a, a.length - 1);
    }

    private static void bubbleRec(int[] a, int l) {
        
        if(l == 0) { }
        else {
            eMaxR(a, l); // emerge il massimo nella porzione 0...l
                         // ovvero a e' ordinata nella porzione l+1..a.length-1
            bubbleRec(a, l - 1); // ordina la porzione 0..l-1
        }
    }

    public static void main() {
        int[] a = {5, 4, 2, 1};
//        eMaxR(a);
//        eMaxRAlt(a);
//        bubbleIter(a);
          bubbleRec(a);
    }
}