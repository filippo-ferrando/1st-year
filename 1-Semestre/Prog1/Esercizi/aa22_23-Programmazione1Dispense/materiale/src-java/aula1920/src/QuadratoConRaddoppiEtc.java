/**
 * Data una variabile intera {@code n}, ne calcola il quadrato, usando solo
 * somme, sottrazioni e raddoppi di valore.
 * <p>
 * Questo programma non ha righe di codice identiche a quelle dell'Algoritmo 4
 * per QPNP dato nelle dispense.
 * <p>
 * Calcola lo stesso risultato per ogni valore assegnato alla variabile
 * {@code n}?
 */
public class QuadratoConRaddoppiEtc {
    public static void main(String[] args) {
        int x = 4;
        int i = 1;
        int r = x;
        /*
         * x^2 == r+2*(x-i)+2*(x-(i+1))+2*(x-(i+2))+..+2*2+2*1 perche',
         * sostituendo i valori noti di r ed i, abbiamo x^2 ==
         * x+2*(x-1)+2*(x-2)+..+2*2+2*1 == x+2*((x-1)+(x-2)+..+2+1) ==
         * x+2*((x-1)*x)/2 == x+(x-1)*x == x+(x-1)*x == x*(1+x-1) == x*x
         */
        while (i < x) {
            /*
             * x^2 == r+2*(x-i)+2*(x-(i+1))+2*(x-(i+2))+..+2*2+2*1
             */
            r = r + 2 * (x - i);
            /*
             * r e' diventato un nome per r + 2 * (x - i). 
             * Quindi: x^2 == r+2*(x-(i+1))+2*(x-(i+2))+..+2*2+2*1
             */
            i = i + 1;
            /*
             * i e' diventato un nome per i + 1. 
             * Quindi: 
             * x^2 == r+2*(x-i)+2*(x-(i+1))+..+2*2+2*1
             */
        }
        /*
         * i == x implica: 
         * x^2 == r+2*(x-x) // la sommatoria si riduce ad un fattore nullo 
         *     == r+2*0 == r
         */
        System.out.println(x + "^2 = " + r + ".");
    }
}