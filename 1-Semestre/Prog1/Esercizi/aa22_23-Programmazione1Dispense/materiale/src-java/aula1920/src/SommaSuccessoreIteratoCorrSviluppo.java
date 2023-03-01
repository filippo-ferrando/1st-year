/**
 * Sviluppo del ciclo principale de {@code SommaSuccessoreIteratoCorr} 
 * sotto forma di annidamenti successivi di selezioni.
 * Lo scopo e' rendere evidente il significato di <i>predicato
 * invariante di ciclo</i>.
 *
 * <p>
 * Fissati due valori per le variabili {@code a} e {@code b},
 * questa classe ne calcola la somma per applicazioni successive 
 * del blocco:
 * <div> 
 * 			{@code sAB = sAB + 1;}
 * 			{@code b = b - 1; }
 * </div>
 * <p>
 * finche' {@code b} non sia uguale a zero. Le applicazioni successive,
 * sino al raggiungimento della condizione di stop, ovvero 
 * {@code b==0} sono controllate dall'annidamento opportuno
 * di selezioni.
 * 
 * <p>
 * L'osservazione fondamentale e' sulla forma dei predicato che descrive
 * le proprieta' (rilevanti) dello stato prima e dopo ogni blocco:
 * <div>
 * 			{@code sAB = sAB + 1;}
 * 			{@code b = b - 1; }
 * </div>
 * <p>
 * <ol>
 *  <li> ogni blocco e' preceduto da {@code b>0 && P[a,b,sAB]}
 *  in cui  {@code b>0} e' il predicato che decide il ramo della
 *  selezione da percorrere, e {@code P[a,b,sAB]} descrive le proprieta'
 *  delle variabili {@code a}, {@code b} e {@code sAB}.
 *  <li> ogni blocco e' seguito da {@code P[a,b,sAB]}
 *  che descrive come i valori di {@code a}, {@code b} e {@code sAB}
 *  siano cambiati in funzione dell'esecuzione del blocco di assegnazioni
 *  in questione.
 * </ol>
 * <p>
 * {@code P[a,b,sAB]} e' un predicato <i>invariante</i> rispetto al 
 * blocco:
 * <div>
 * 			{@code sAB = sAB + 1;}
 * 			{@code b = b - 1; }
 * </div>
 * <p>
 * perche' le uniche parti di {@code P[a,b,sAB]} che mutano con 
 * l'avanzare della computazione sono i valori assegnati alle
 * variabili di cui esso predica.
 */

public class SommaSuccessoreIteratoCorrSviluppo {
	public static void main(String[] args) {

		int a = 5; // corrisponde a x in SommaSuccessoreIterato
		int b = 3; // corrisponde a y in SommaSuccessoreIterato
		int sAB = a;
		/*
		 * a == 5 && b == 3 && sAB == 5  (*)
		 */
		if(b > 0) {
			/* 
			 * b > 0 &&
			 * a == 5 && b == 3 && sAB == 5
			 * implica 
			 * (a == 5) && (b-1 == 3-1) && (sAB+1 == 5+1)
			 */
			sAB = sAB + 1;
			/* 
			 * (a == 5) && (b-1 == 3-1) && (sAB == 6)
			 */
			b = b - 1;
			/* 
			 * (a == 5) && (b == 2) && (sAB == 6)  (*)
			 */
			if(b > 0) {
				/* 
				 * b > 0 &&
				 * a == 5 && b == 2 && sAB == 6
				 * implica 
				 * (a == 5) && (b-1 == 2-1) && (sAB+1 == 6+1)
				 */
				sAB = sAB + 1;
				/* 
				 * (a == 5) && (b-1 == 3-1) && (sAB == 7)
				 */
				b = b - 1;
				/* 
				 * (a == 5) && (b == 1) && (sAB == 7)  (*)
				 */
				if(b > 0) {
					/* 
					 * b > 0 &&
					 * a == 5 && b == 1 && sAB == 7
					 * implica 
					 * (a == 5) && (b-1 == 1-1) && (sAB+1 == 7+1)
					 */
					sAB = sAB + 1;
					/* 
					 * (a == 5) && (b-1 == 1-1) && (sAB == 8)
					 */
					b = b - 1;
					/*
					 *  (a == 5) && (b == 0) && (sAB == 8)  (*)
					 */
					if(b > 0) {
						sAB = sAB + 1;
						b = b - 1;
					} else {
						/* 
						 * (a == 5) && (b == 0) && (sAB == 8)
						 * implica che sAB contiene la somma tra 
						 * i valori iniziali di a e b.
						 */
						System.out.println(sAB);
					}
				} else {
					/* 
					 * (a == 5) && (b == 0) && (sAB == 7)
					 * implica che sAB contiene la somma tra 
					 * i valori iniziali di a e b.
					 */
					System.out.println(sAB);
			    }
			} else {
				/* 
				 * (a == 5) && (b == 0) && (sAB == 6)
				 * implica che sAB contiene la somma tra 
				 * i valori iniziali di a e b.
				 */
				System.out.println(sAB);
			}		
		} else {
			/* 
			 * (a == 5) && (b == 0) && (sAB == 5)
			 * implica che sAB contiene la somma tra 
			 * i valori iniziali di a e b.
			 */
			System.out.println(sAB);
		}
	}
}
