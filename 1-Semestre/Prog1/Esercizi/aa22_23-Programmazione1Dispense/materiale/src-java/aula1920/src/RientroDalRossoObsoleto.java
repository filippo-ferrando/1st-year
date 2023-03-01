/**
 * Assumiamo che una banche applichi una penalita' al saldo di ogni
 * conti in rosso, per ogni unita' temporale prefissata.
 * Questa classe deve permettere di capire quante unita' di misura
 * temporali occorrano per riportare un saldo in attivo, ipotizzando di
 * depositare una quota fissa ogni unita' di misura temporale.
 * <p>
 * Il problema e' interessante perche' non e' scontato che
 * possa terminare, ed occorre individuare in quante unita' 
 * di misura termina.
 */
public class RientroDalRossoObsoleto {
	
	public static void main(String[] args) {
		
		final double SALDO_INIZIALE = -1000;
		final double PENALE = 100;

		for(double deposito = PENALE + 100; 
				deposito > PENALE; 
				deposito = deposito - 20) {
			double conto = SALDO_INIZIALE;
			int unitaTemporali = 0;
			while(conto < 0) {
				conto = conto - PENALE;
				conto = conto + deposito;
				unitaTemporali++;
			}
			System.out.println("Se il deposito e' " + deposito);
			System.out.print("si e' in attivo dopo " + unitaTemporali);
			System.out.print(" unita temporali,");
			System.out.print(" limitate da ");
			System.out.print("1+(" + SALDO_INIZIALE + "/(" 
	                 + deposito + "-" + PENALE + ")) = ");
			System.out.println((1-SALDO_INIZIALE/(deposito-PENALE)) + ".");
		}
	}
}
