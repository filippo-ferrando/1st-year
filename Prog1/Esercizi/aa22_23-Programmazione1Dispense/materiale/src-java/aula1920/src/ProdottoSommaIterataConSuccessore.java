/**
 * Soluzione possibile a MSDP'.
 * Ovvero, moltiplicazione di un numero naturale, contenuto nella
 * variabile {@code m} per uno contenuto nella variabile
 * {@code n}. E' realizzata come iterazione di incrementi e sottrazioni
 * di una unità dai numeri dati.
 * <p>
 * Il codice non coincide con quello dell'Algoritmo 5 dato nelle dispense.
 * <p>
 * I due codici producono lo stesso risultato, fornendo gli stessi valori 
 * per {@code m} ed {@code n}?
 */
public class ProdottoSommaIterataConSuccessore {

        public static void main(String[] args) {

                int m = 3; // Moltiplicando
                int n = 2; // Moltiplicatore
                int r = 0; // Risultato

                while (n > 0) {
                   int i = m;
                   while (i > 0) { // ciclo che implementa r = r + m
                        r = r + 1; 
                        i = i - 1;
                   }
                   n = n - 1;
                }

                System.out.println("Risultato = " + r);
        }
}