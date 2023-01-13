/**
 * Letta tramite tastiera una sequenza di interi che termini con 0, contare le
 * occorrenze di numeri pari e di numeri dispari.
 */
public class ContaPariDispari {

	public static void main(String[] args) {
		/*
		 * Assumiamo di indicare con: a_0, a_1, a_2,... una sequenza di numeri
		 * letti.
		 * 
		 * La proprieta' cui siamo interessati e': 
		 * abbiamo letto i>=0 elementi
		 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,a_{i-1} 
		 * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,a_{i-1} 
		 * && i==p+d.
		 */
		int p = 0;
		int d = 0;
		int i = 0;
		System.out.print("Intero? ");
		int a = SIn.readInt();
		/*
		 * abbiamo letto i>=0 elementi 
		 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,a_{i-1} 
		 * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,a_{i-1} 
		 * && i==p+d
		 * && abbiamo letto un nuovo elemento a_i.
		 */
		while (a != 0) {
			/*
			 * abbiamo letto un nuovo elemento a_i
			 * && a_i!=0 
			 * && abbiamo letto i>=0 elementi 
			 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,a_{i-1} 
			 * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,a_{i-1} 
			 * && i==p+d 
			 */
			if (a % 2 == 0) {
				/*
				 * abbiamo letto i>=0 elementi 
				 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,a_{i-1} 
				 * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,a_{i-1} 
				 * && i==p+d 
				 * && a_i e' pari 
				 * implica che: 
				 * abbiamo letto i+1>0 elementi 
				 * && p+1 e' la quantita' di numeri pari in a_0, a_1, a_2,...,a_{i-1},a_i
				 * && d e' la quantita' di numeri dispari in a_1, a_2,a_3,...,a_{i-1},a_i 
				 * && i+1==(p+1)+d
				 */
				p = p + 1;
				/*
				 * abbiamo letto i+1>0 elementi 
				 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,,a_{i+1-1} 
				 * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,,a_{i+1-1} 
				 * && i+1==p+d
				 */
			} else {
				/*
				 * abbiamo letto i>=0 elementi 
				 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,a_{i-1} 
				 * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,a_{i-1} 
				 * && i==p+d 
				 * && a_i e' dispari 
				 * implica che:
				 * abbiamo letto i+1>0 elementi 
				 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,a_{i-1},a_i 
				 * && d+1 e' la quantita' di numeri dispari in a_1, a_2, a_3,...,a_{i-1},a_i * && i+1==p+(d+1)
				 */
				d = d + 1;
				/*
				 * abbiamo letto i+1>0 elementi 
				 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,,a_{i+1-1} 
				 * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,,a_{i+1-1} 
				 * && i+1==p+d
				 */
			}
                        /* Entrambi i rami si concludono col medesimo predicato:
                         * abbiamo letto i+1>0 elementi 
                         * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,,a_{i+1-1} 
                         * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,,a_{i+1-1} 
                         * && i+1==p+d
                         */
			i = i + 1;
                        /* 
                         * abbiamo letto i>0 elementi 
                         * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,,a_{i-1} 
                         * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,,a_{i-1} 
                         * && i==p+d
                         */

			System.out.print("Intero? ");
			a = SIn.readInt();
			/*
			 * abbiamo letto i>0 elementi
			 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,a_{i-1} 
			 * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,a_{i-1} 
			 * && i==p+d
			 * && abbiamo letto un nuovo elemento a_i.
			 */
		}
		/*
		 * abbiamo letto i>0 elementi
		 * && p e' la quantita' di numeri pari in a_0, a_1, a_2,...,a_{i-1} 
		 * && d e' la quantita' di numeri dispari in a_1, a_2, a_3,...,a_{i-1} 
		 * && i==p+d
		 * && abbiamo letto un nuovo elemento a_i==0.
		 * 
		 * p e d ciascuno contano i pari e i dispari tra i numeri letti, escluso l'ultimo.
		 */
		System.out.println("Quantita' di numeri pari = " + p + ".");
		System.out.println("Quantita' di numeri dispari = " + d + ".");
	}
}