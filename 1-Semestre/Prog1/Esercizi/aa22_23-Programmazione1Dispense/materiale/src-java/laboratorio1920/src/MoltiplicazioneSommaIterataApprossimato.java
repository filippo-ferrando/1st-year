/**
 * Fissati due numeri non negativi {@code x} e {@code y},
 * calcola la moltiplicazione del primo per il secondo, 
 * senza utilizzare iterazione, ma sfruttando solo selezioni 
 * opportunamente annidate.
 */
public class MoltiplicazioneSommaIterataApprossimato {

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		int moltiplicazione = 0;

		if (y > 0) {
			moltiplicazione = moltiplicazione + x;
			y = y - 1;

			if (y > 0) {
				moltiplicazione = moltiplicazione + x;
				y = y - 1;

				if (y > 0) {
					moltiplicazione = moltiplicazione + x;
					y = y - 1;

					if (y > 0) {
						moltiplicazione = moltiplicazione + x;
						y = y - 1;

					} else {
						// risultato in x
						System.out.println("Quarta alternativa");
						System.out.println("Il risultato è " + moltiplicazione);
					}

				} else {
					// risultato in x
					System.out.println("Terza alternativa");
					System.out.println("Il risultato è " + moltiplicazione);
				}
			} else {
				// risultato in x
				System.out.println("Seconda alternativa");
				System.out.println("Il risultato è " + moltiplicazione);
			}
		} else {
			// risultato in x
			System.out.println("Prima alternativa");
			System.out.println("Il risultato è " + moltiplicazione);
		}
	}
}
