/**
 * Fissati due numeri non negativi {@code x} e {@code y},
 * calcola l'elevamento a potenza del primo per il secondo, 
 * senza utilizzare iterazione, ma sfruttando solo selezioni 
 * opportunamente annidate.
 */
public class PotenzaMoltiplicazioneIterataApprossimato {

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		int potenza = 1;

		if (y > 0) {
			potenza = potenza * x;
			y = y - 1;

			if (y > 0) {
				potenza = potenza * x;
				y = y - 1;

				if (y > 0) {
					potenza = potenza * x;
					y = y - 1;

					if (y > 0) {
						potenza = potenza * x;
						y = y - 1;

					} else {
						// risultato in x
						System.out.println("Quarta alternativa");
						System.out.println("Il risultato è " + potenza);
					}

				} else {
					// risultato in x
					System.out.println("Terza alternativa");
					System.out.println("Il risultato è " + potenza);
				}
			} else {
				// risultato in x
				System.out.println("Seconda alternativa");
				System.out.println("Il risultato è " + potenza);
			}
		} else {
			// risultato in x
			System.out.println("Prima alternativa");
			System.out.println("Il risultato è " + potenza);
		}
	}
}
