/**
 * Calcolo della differenza tra due numeri interi non 
 * negativi {@code x} e {@code y} fissati, senza utilizzare iterazione, 
 * ma sfruttando solo selezioni opportunamente annidate.
 */
public class DifferenzaPredecessoreIteratoApprossimato {

	public static void main(String[] args) {
		int x = 4;
		int y = 3;

		if (y > 0) {
			x = x - 1;
			y = y - 1;

			if (y > 0) {
				x = x - 1;
				y = y - 1;

				if (y > 0) {
					x = x - 1;
					y = y - 1;

					if (y > 0) {
						x = x - 1;
						y = y - 1;

					} else {
						// risultato in x
						System.out.println("Quarta alternativa");
						System.out.println("Il risultato è " + x);
					}

				} else {
					// risultato in x
					System.out.println("Terza alternativa");
					System.out.println("Il risultato è " + x);
				}
			} else {
				// risultato in x
				System.out.println("Seconda alternativa");
				System.out.println("Il risultato è " + x);
			}
		} else {
			// risultato in x
			System.out.println("Prima alternativa");
			System.out.println("Il risultato è " + x);
		}

	}

}
