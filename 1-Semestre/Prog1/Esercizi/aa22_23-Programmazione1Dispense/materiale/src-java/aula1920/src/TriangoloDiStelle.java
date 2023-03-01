/**
 * Fissati due numeri naturali {@code m} ed {@code n} stampa un triangolo equilatero
 * di simboli * con altezza pari al minimo tra {@code m} ed {@code n}.
 */
public class TriangoloDiStelle {
	public static void main(String[] args) {

		int m = 7;
		int n = 5;
		int i = 0;
                int j = 0;
		/* In questo punto, il triangolo stampato e' necessariamente vuoto.
		 * Il seguente predicato descrive esattamente questo stato:
                 * per ogni k, se 0<=k<i, allora k-esima riga ha k occorrenze di *
                 *             && i-esima riga ha j occorrenze di * .
                 * Per verificarne la verita' sostituiamo 0 ad i e j:
                 * per ogni k, se 0<=k<0, allora k-esima riga ha k occorrenze di *
                 *             && 0-esima riga ha 0 occorrenze di *
                 * equivale a:
                 * per ogni k, se falso, allora k-esima riga ha k * stampati &&
                 *             vero
                 * equivale a:
                 * per ogni k, vero &&
                 *             vero
                 * equivale a vero.
		 */
		while (i < m && i < n) {
                        /* In questo punto, in generale, il triangolo ha forma:
                         *       *            riga 1
                         *       **           riga 2
                         *       ***          riga 3
                         *       .......
                         *       *********    riga i-1 con i-1 asterischi
                         *       ****         riga i con j asterischi
                         * ed e', quindi, descritto da:
                         * per ogni k, se 0<=k<i, allora k-esima riga ha k occorrenze di *
                         *             && i-esima riga ha j occorrenze di * 
                         */
			while (j < i) {
                                /* In questo punto, in generale, il triangolo ha forma:
                                 *       *            riga 1
                                 *       **           riga 2
                                 *       ***          riga 3
                                 *       .......
                                 *       *********    riga i-1 con i-1 asterischi
                                 *       ****         riga i con j asterischi
                                 * ed e', quindi, descritto da:
                                 * per ogni k, se 0<=k<i, allora k-esima riga ha k occorrenze di *
                                 *             && i-esima riga ha j occorrenze di *
                                 */
				System.out.print("*");
				 /*
                                  * Il triangolo ha cambiato forma in:
                                  *       *            riga 1
                                  *       **           riga 2
                                  *       ***          riga 3
                                  *       .......
                                  *       *********    riga i-1 con i-1 asterischi
                                  *       *****        riga i con j+1 asterischi
                                  * Quindi:
                                  * per ogni k, se 0<=k<i, allora k-esima riga ha k occorrenze di *
                                  *             && i-esima riga ha j+1 occorrenze di *
				  */
				j = j + 1;
                                 /* j è diventato nome per il valore j+1.
                                  * Quindi:
                                  * per ogni k, se 0<=k<i, allora k-esima riga con k occorrenze di *
                                  *             && i-esima riga ha j occorrenze di *
                                  * ed il triangolo rimane:
                                  *       *            riga 1
                                  *       **           riga 2
                                  *       ***          riga 3
                                  *       .......
                                  *       *********    riga i-1 con i-1 asterischi
                                  *       *****        riga i con j asterischi                                  
                                  */
			}
                        /* j == i implca che il triangolo, passo dopo passo, sia diventato:
                         *       *            riga 1
                         *       **           riga 2
                         *       ***          riga 3
                         *       .......
                         *       *********    riga i-1 con i-1 asterischi
                         *       **********   riga j==i con j==i asterischi
                         * implicando:
                         * per ogni k, se 0<=k<i+1, allora k-esima riga ha k occorrenze di *
                         *             && i-esima riga ha j occorrenze di *
                         */

			i = i + 1;

			/* i è diventato il nome per l'espressione i+1.
                         * Quindi:
                         * per ogni k, se 0<=k<i, allora k-esima riga ha k occorrenze di *
                         *             && (i-1)-esima riga ha j occorrenze di *
                         * Il triangolo rimane:
                         *       *            riga 1
                         *       **           riga 2
                         *       ***          riga 3
                         *       .......
                         *       *********    riga i-1 con i-1 asterischi
                         *       **********   riga i con i asterischi
                         */
			System.out.println();
			// Nulla cambia
                        j = 0;
                        /* Il triangolo rimane:
                         *       *            riga 1
                         *       **           riga 2
                         *       ***          riga 3
                         *       .......
                         *       *********    riga i-1 con i-1 asterischi
                         *       **********   riga i con i asterischi
                         * e l'intero predicato:
                         * per ogni k, se 0<=k<i, allora k-esima riga ha k occorrenze di *
                         *             && i-esima riga ha j occorrenze di *
                         * e' vero perche', ora, j==0 e può correttamente descrivere
                         * che nessun * e' stato stampato nella riga di indice i.
                         */
		}
                /* Vale almeno uno dei due casi indicati dal predicato: i == m || i == n.
                 * Supponiamo i == m. Questo implica che m<=n, cioe' e' il minimo tra i due.
                 * La forma geometrica ottenuta e':
                 *       *            riga 1
                 *       **           riga 2
                 *       ***          riga 3
                 *       .......
                 *       *********    riga i-1 con i-1 asterischi
                 *       ...........
                 *       *************   riga m con m asterischi
                 *
                 * Supponiamo, invece i == n. Questo implica che n<=m, cioe' e' il minimo tra i due.
                 * La forma geometrica ottenuta e':
                 *       *            riga 1
                 *       **           riga 2
                 *       ***          riga 3
                 *       .......
                 *       *********    riga i-1 con i-1 asterischi
                 *       ...........
                 *       *************   riga n con n asterischi
                 */
	}
}
