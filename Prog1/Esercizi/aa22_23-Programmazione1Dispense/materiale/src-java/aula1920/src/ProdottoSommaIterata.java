/**
 * Soluzione possibile a MSDP.
 * Ovvero, moltiplicazione di un numero naturale, contenuto nella
 * variabile {@code a} per uno contenuto nella variabile
 * {@code a}. E' realizzata come iterazione di somme successive, 
 * perche' assumiamo di saper solo addizionare un numero qualsiasi
 * ad un altro, e di saper sottrarre che una sola unita'
 * da un qualsiasi numero dato.
 */
public class ProdottoSommaIterata {

        public static void main(String[] args) {

                int a = 3; // Moltiplicando
                int b = 2; // Moltiplicatore
                int r = 0; // Risultato

                while (b > 0) {

                        r = r + a; 
                        b = b - 1;
                }

                System.out.println("Risultato = " + r);
        }
}