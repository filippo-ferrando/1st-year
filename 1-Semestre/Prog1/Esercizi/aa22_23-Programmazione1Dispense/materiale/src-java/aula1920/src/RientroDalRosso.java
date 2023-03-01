/**
 * Assumiamo che una banca applichi una penalita' al saldo di ogni
 * conto in rosso, per ogni unita' temporale prefissata.
 * Questa classe deve permettere di capire quante unita' di misura
 * temporali occorrano per riportare un saldo in attivo, ipotizzando di
 * depositare una quota fissa ogni unita' di misura temporale.
 * <p>
 * Il problema e' interessante perche' non e' scontato che
 * il rientro possa terminare.
 */
public class RientroDalRosso {
	
	public static void main(String[] args) {
		
		final double SALDO_INIZIALE = -1000;
		final double PENALE = 100;
		
		double deposito = PENALE + 100;
		while (deposito > PENALE) { 

			double conto = SALDO_INIZIALE;
			int unitaTemporali = 0;
			while(conto < 0) {
				conto = conto + deposito - PENALE;
				unitaTemporali = unitaTemporali + 1;
			}
			
			deposito = deposito - 20;
			System.out.println("Se il deposito e' " + deposito);
			System.out.print("si e' in attivo dopo " + unitaTemporali);
			System.out.print(" unita temporali,");
			System.out.print(" limitate inferiormente da ");
			System.out.print("(" + (-SALDO_INIZIALE) + "/(" 
	                 + deposito + "-" + PENALE + ")) = ");
			double limiteInferiore = (-SALDO_INIZIALE)/(deposito-PENALE) - 1;
			System.out.println(limiteInferiore + ".");
		}
	}
}