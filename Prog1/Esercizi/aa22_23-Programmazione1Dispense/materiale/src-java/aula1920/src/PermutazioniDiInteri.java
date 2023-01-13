/**
 * @author rover
 * Riempito un array di interi generati a casp, ne stampa stampa tutte 
 * le permutazioni. 
 */
import java.util.Random;

public class PermutazioniDiInteri {

    public static void main (String[] args) {
        int[] p = new int[5];
        randomFill(p,10);
        System.out.println("Array iniziale: ");
        log(p);
        System.out.println("Permutazioni: ");
        primtPerm(p);        
    }
    
    /*
     * Stampa tutte le permutazioni degli elementi in a.
     */
    public static void primtPerm(int[] a) {
        if (a != null) {
            perm(a, 0);
        }
    }
    
    /*
     * Stampa tutte le permutazioni di a[start...a.length-1]
     * ciascuna preceduta dalla stessa sequenza a[0...start-1].
     */
    private static void perm(int[] a, int start) {
        if (start == a.length - 1) {
            // senza piu' elementi da permutare si stampa
            log(a);
        } else
            /* Stampa ogni permutazione di una copia di
             * a[start+1...a.length-1] preceduta da una copia
             * a[0...start].
             * Al termine scambia a[start] con l'i-esimo a 
             * partire da start e ricomincia. Il motivo
             * della generazione della copia sta nel fatto che
             * ogni scambio deve avvenire sull'array di partenza.
             */
            for (int other = start ; other < a.length ; other++) {
                swap(a, start, other);
                perm(cloneArray(a), start + 1);
            }
    }

    private static void log(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println("");        
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static int[] cloneArray(int[] a) {
        int[] clone = new int[a.length];
        for (int i = 0; i < a.length; i++ )
            clone[i] = a[i];
        return clone;
    }

    /*
     * Preso l'array {@code a} la riempie con numeri generati
     * a caso con valori compresi tra {@code 0} e {@code upperBound}
     */
    public static void randomFill(int[] a, int upperBound) {
        Random randomGenerator = new Random();
        for (int i = 0; i < a.length ; ++i){
          a[i] = randomGenerator.nextInt(upperBound);
        }
    }
}
