/**
 * Valore massimo di una sequenza di interi, immessi da tastiera.
 */
 public class MassimoTraInteri {

	public static void main(String[] args) {

		System.out.println("Quanti interi leggere? ");
		int n = SIn.readInt();
		int m = 25;
		int i = 0;
		/*
		 * Assumiamo di indicare con: a_0, a_2, a_3,... la sequenza di numeri da
		 * leggere.
		 * 
		 * Assumiamo che la variabile m contenga il massimo tra i valori letti e
		 * supponiamo di aver letto i numeri da tastiere. L'invariante è:
		 * \forall k. se 0<=k<i, allora abbiamo letto a_k e a_k<=m
		 * 
		 * L'invariante vale per i==0. In tal caso la sequenza:
		 * 
		 * a_0, a_1, a_2,...
		 * 
		 * dei numeri letti e' vuota e, per un qualsiasi valore di m,
		 * l'invariante e' vero perche' non c'e' alcuna contraddizione nel dire che
		 * ogni a_k<=m, quando nessun a_k esiste.
		 * 
		 * Questo è il motivo per cui possiamo scegliere un valore iniziale
		 * arbitrario per m.
		 */
		while (i < n) {
			/*
			 * 0<=i<n && \forall k. se 0<=k<i, allora abbiamo letto a_k e a_k<=m
			 */
			System.out.println("Intero? ");
			int a = SIn.readInt();
			/*
			 * La variabile a contiene l'i-esimo il valore. Il valore di a_i
			 * potrebbe essere maggiore del massimo letto sinora.
			 */
			if (i == 0)
				/*
				 * Non avendo letto sinora alcuna valore a_0 deve essere il
				 * massimo per definizione.
				 */
				m = a;
                                /*
			         * i==0 && 0<=i<n && (\forall k. se 0<=k<0, allora abbiamo letto a_k
			         * e a_k<=m) && a_0==m che implica 0<=i<n && (\forall k. se
			         * 0<=k<i+1, allora abbiamo letto a_k e a_k<=m)
			         */
			else if (a > m)
				/*
				 * i>0 && 0<=i<n && (\forall k. se 0<=k<i, allora abbiamo letto
				 * a_k e a_k<=m) && a_i>m
				 */
				m = a;
			        /*
			         * i>0 && 0<=i<n && (\forall k. se 0<=k<i+1, allora abbiamo letto
			         * a_k e a_k<=m)
			         */

                        /*
                         * Provenendo dai due rami della selezione "sovrapponiamo" i due
                         * predicati cosi' da inglobare i>=0:
                         * i>=0 && 0<=i<n && (\forall k. se 0<=k<i+1, allora abbiamo letto
                         * a_k e a_k<=m)
                         */
			i = i + 1;
			/*
			 * i>0 && 0<=i<=n && (\forall k. se 0<=k<i, allora abbiamo letto a_k
			 * e a_k<=m)
			 */
		}
		/*
		 * i==n && (\forall k. se 0<=k<n, allora abbiamo letto a_k e a_k<=m)
		 * ovvero, abbiamo letto n numeri ed m contiene il valore massimo.
		 */

		System.out.println("Il massimo vale " + m + ".");
	}
}
