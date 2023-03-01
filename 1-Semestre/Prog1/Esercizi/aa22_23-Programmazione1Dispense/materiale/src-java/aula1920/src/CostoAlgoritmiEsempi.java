/**
 * La classe fornisce alcuni metodi essenziali da prendere come
 * esempio per il calcolo del funzione costo.
 */
public class CostoAlgoritmiEsempi {

	public static void Ex1Costo(int n) {
		int i = 0; // 1
		int j = 1; // 1
		while (i < n) { // n*(1+1+1)+1
			i++;
			j = j * 3 + 42;
		}
	} // costo pari a 3*(n+1)

	public static void Ex2Costo(int n) {
		int i = 0; // 1
		int j = 1; // 1
		while (i < 2 * n) { // 2*n*(1+1+1)+1
			i = i + 1;
			j = j * 3 + 4367;
		}
	} // costo pari a 3*(2*n+1)

	public static void Ex3Costo(int n) {
		int i = 0; // 1
		while (i < n) { // n*costo_corpo+1
			for (int j = 0; j < n; j++) { // 1+n*(1+1+1)+1
				System.out.println("CIAO!");
			}
			i++; // 1
		}
	} // 1+n*(1+n*(1+1+1)+1)+1 == 2+2*n+3*n^2

	/*
	 * Il costo va espresso in funzione del valore di n,
	 * dato in ingresso, che possiamo prendere come dimensione.
	 * 
	 * Vediamo per vari valori di n quante volte
	 * si percorre il ciclo:
	 *  n|volte
	 * ---------------
	 *  0| 0
	 *  1| 1
	 *  2| 2
	 *  3| 2
	 *  4| 2
	 *  5| 3
	 *  6| 3
	 *  7| 3
	 *  8| 3
	 *  9| 3
	 * 10| 4
	 * 11| 4
	 * ....
	 * 16| 4
	 * 17| 5
	 * ....
	 * Per n>0, il ciclo viene percorso
	 * 1+parte_intera(radice_quadrata(n-1)) volte.
	 */
	public static void Ex4Costo(int n) {
		int i = 0; // 1
		while (i * i < n) // 1+parte_intera(radice_quadrata(n-1))*(1)+1
			i++;
	} // 3+parte_intera(radice_quadrata(n-1))*(1)
	
	/*
	 * Il costo va espresso in funzione del valore di n,
	 * dato in ingresso, che possiamo prendere come dimensione.
	 * 
	 * Vediamo per vari valori di n quante volte
	 * si percorre il ciclo:
	 *  n|volte
	 * ---------------
	 *  0| 0
	 *  1| 1
	 *  2| 1
	 *  3| 1
	 *  4| 2
	 * .....
	 *  8| 3
	 * .....
	 * 31| 3 
	 * 32| 4  
	 * ....
	 * Per n>0, il ciclo viene percorso
	 * parte_intera(log_2(n)) volte.
	 */
	public static void Ex5Costo(int n) {
		int i = 0; // 1
		while (i <= n) { // 1+parte-intera(log_2(n))*2
			i++;
			n = n/2;
		}
	} // 2*(1+parte_intera(log_2(n)))
}
