/**
 * Produce configurazioni esplicite e le mosse per
 * muoversi dall'una all'altra.
 */
public class TorreHanoiConfigurazioni {
	public static final int PioloA = 0;
	public static final int PioloB = 1;
	public static final int PioloC = 2;
	public static final int NUMERO_PIOLI = 3;
	public static int numeroMosse = 0;

	public static String tH(int n, int sorgente, int appoggio, int obiettivo,
			String mosse) {

		if (n == 1)
			mosse = sposta(sorgente, obiettivo, mosse);
		else {
			mosse = tH(n - 1, sorgente, obiettivo, appoggio, mosse);
			mosse = sposta(sorgente, obiettivo, mosse);
			mosse = tH(n - 1, appoggio, sorgente, obiettivo, mosse);
		}
		return mosse;
	}

	public static String sposta(int sorgente, int obiettivo, String mosse) {
		mosse = mosse + sorgente + "->" + obiettivo + ":";
		numeroMosse++;
		return mosse;
	}

	/**
	 * Data una mossa della forma {@code x->y:} in cui {@code x} e {@code y}
	 * siano numeri, restituisce .
	 */
	public static int mossaGetElemento(String mossa, int e) {
		int risultato = 0;
		char[] tmp = mossa.toCharArray();
		switch (tmp[e]) {
		case '0':
			risultato = 0;
			break;
		case '1':
			risultato = 1;
			break;
		case '2':
			risultato = 2;
			break;
		default:
			risultato = 3; // produce deliberatamente un out of bound error
			break;
		}

		return risultato;
	}

	/**
	 * Data una sequenza di mosse della forma {@code x->y:...w->z:} restituisce
	 * la prima mossa a sinistra {@code x->x:}.
	 */
	public static String headMosse(String mosse) {
		return mosse.substring(0, 4);
	}

	/**
	 * Data una sequenza di mosse della forma {@code x->y:...w->z:} restituisce
	 * la sequenza iniziale di mosse da cui {@code x->x:} e' stata rimossa.
	 */
	public static String tailMosse(String mosse) {
		return mosse.substring(5);
	}

	/**
	 * Data una sequenza di mosse della forma {@code x->y:...w->z:} restituisce
	 * {@code true} se la sequenza contiene almeno una mossa, {@code false}
	 * altrimenti.
	 */
	public static boolean emptyMosse(String mosse) {
		return mosse.length() == 0;
	}

	/**
	 * Data una sequenza di mosse della forma {@code x->y:...w->z:}, ed un
	 * numero di dischi, stampa la sequenza di configurazioni .
	 */
	public static void configurazioni(String mosse, int numeroDischi) {

		// char[][] configurazione =
		// {{'C',' ',' '},{'B',' ',' '},{'A',' ',' '}};
		// configurazione iniziale
		char[][] configurazione = new char[numeroDischi][NUMERO_PIOLI];
		for (int r = 0; r < configurazione.length; r++)
			configurazione[r][0] = Character.toChars(configurazione.length - 1 - r + 65)[0];			
		
		for (int r = 0; r < configurazione.length; r++)
			for (int c = 1; c < NUMERO_PIOLI; c++)
				configurazione[r][c] = ' ';

		while (!emptyMosse(mosse)) {
			String mossa = headMosse(mosse);
			System.out.println(toString(configurazione, mossa));
//			System.out.println(toStringLaTeX(configurazione, mossa));
			String nuoveMosse = tailMosse(mosse);
			int sorgente = mossaGetElemento(mossa, 0);
			int destinazione = mossaGetElemento(mossa, 3);
			// cerca l'indice del disco in cima a sorgente
			boolean trovataCima = false;
			int cimaSorg = configurazione.length - 1;
			while (cimaSorg >= 0 && !trovataCima) {
				trovataCima = configurazione[cimaSorg][sorgente] != ' ';
				cimaSorg--;
			}
			cimaSorg++; // primo elemento diverso da ' ' in destinazione
			// cerca l'indice della posizione libera in cima a destinazione
			trovataCima = false;
			int cimaDest = configurazione.length - 1;
			while (cimaDest >= 0 && !trovataCima) {
				trovataCima = configurazione[cimaDest][destinazione] != ' ';
				cimaDest--;
			}
			cimaDest++; // primo elemento libero in destinazione
			if (trovataCima) // la destinazione ha alemno un disco
				cimaDest++;
			// sposta il disco da sorgente a destinazione
			configurazione[cimaDest][destinazione] = configurazione[cimaSorg][sorgente];
			configurazione[cimaSorg][sorgente] = ' ';
			mosse = nuoveMosse;
		}
		System.out.println(toString(configurazione, ""));
//		System.out.println(toStringLaTeX(configurazione, ""));
	}

	public static String toString(char[][] configurazione, String mossa) {
		String risultato = "";
		for (int r = configurazione.length - 1; r >= 0; r--) {
			for (int c = 0; c < 3; c++)
				switch (configurazione[r][c]) {
				case ' ':
					risultato = risultato + " | ";
					break;
				default:
					risultato = risultato + " " + configurazione[r][c] + " ";
				}
			risultato = risultato + "\n";
		}
		risultato = risultato + "---------\n";
		risultato = risultato + " 0  1  2 \n";
		risultato = risultato + "\n   " + mossa + "\n";
		return risultato;
	}
	
	public static String toStringLaTeX(char[][] configurazione, String mossa) {
		String risultato = "\\begin{tabular}{cccc}\n";
		for (int r = configurazione.length - 1; r >= 0; r--) {
			for (int c = 0; c < 3; c++)
				switch (configurazione[r][c]) {
				case ' ':
					risultato = risultato + " | &";
					break;
				default:
					risultato = risultato + " " + configurazione[r][c] + " &";
				}
			risultato = risultato + "\\\\\n";
		}
		risultato = risultato + "\\hline\n";
		risultato = risultato + " 0 & 1 & 2 \n \\end{tabular}\n";
		risultato = risultato + " \\\\ " + mossa + "\\\\\n";
		return risultato;
	}
	
	public static void main(String[] args) {
		
		int numeroMaxDischi = 4;
		for (int numeroDischi = 4; numeroDischi <= numeroMaxDischi; numeroDischi++) {
			System.out.println("-------------------------------");
			System.out.println("Torre di Hanoi con " + numeroDischi + ".");
			String config = tH(numeroDischi, PioloA, PioloB, PioloC, "");
//			System.out.println(config);
			configurazioni(config, numeroDischi);
            System.out.println("Numero totale mosse: " + numeroMosse);
		}
	}
}
