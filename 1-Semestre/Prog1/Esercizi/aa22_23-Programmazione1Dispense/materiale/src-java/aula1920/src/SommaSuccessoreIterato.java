/**
 * Addizione tra due numeri naturali positivi, contenuti nelle
 * variabili {@code a} ed {@code b}. L'addizione e' realizzata 
 * come iterazione di successore e predecessore, perche'
 * assumiamo di non saper sommare (sottrarre) che una sola unita'
 * ad un qualsiasi numero dato.
 */
public class SommaSuccessoreIterato {

	public static void main(String[] args) {

		int a = 5; // Primo addendo
		int b = 3; // Secondo addendo

		while (a > 0) {

			a = a - 1;
			b = b + 1;
		}

		System.out.println("Risultato = " + b);
	}
}