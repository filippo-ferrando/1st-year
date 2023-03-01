/**
 * Influenza della selezione sulle proprieta' dello stato di un programma.
 * <p>
 * Supponiamo che P sia la proprieta' che descriva lo stato
 * prima della generica selezione seguente:
 * <div>
 * {P}  if (C) BIf else BElse  (1)
 * </div>
 * in cui C e' l'espressione condizione, mentre BIf e BElse sono blocchi di 
 * istruizioni.
 * <p>
 * Qual e' il predicato vero al termine di (1)?
 * <ol>
 *   <li> Se C e' vero, allora BIf sara' eseguito nello stato descritto da
 *   P && C,
 *   <li> Se C e' falso, allora BElse sara' eseguito nello stato descritto da
 *   P && not(C).
 * </ol>
 * Se esiste un predicato Q tale che:  
 * <ol>
 *   <li> P && C implica Q,
 *   <li> P && not(C) implica Q.
 * </ol>
 * allora P implica Q attraverso l'interpretazione di (1).
 */
public class SelezioneCorr {
	public static void main(String[] args) {

	/*
	 * Lo stato di un programma e' costituito: 
	 * -) dalle variabili in esso definite, 
	 * -) dai valori assegnati alle variabili
	 */
	 int a = 0;
	 int b = 0;
	/*
	 * Dopo queste assegnazioni, possiamo caratterizzare le proprieta' 8 
	 * dello stato come segue:
	 * 
	 * a==0 && b==0
	 */

	System.out.println("Primo valore intero:?");
	a = SIn.readInt();
	/*
	 * Dopo l'assegnazione del valore ad a tramite la tastiera, lo stato
	 * e' caratterizzabile come segue:
	 * 
	 * a == 'un qualche valore letto dall'esterno che chiamiamo x' 
	 *   && b==0
	 */
	System.out.println("Secondo valore intero:?");
	b = SIn.readInt();

	/*
	 * Dopo l'assegnazione di valori per a e b tramite la tastiera, 
	 * lo stato e' caratterizzabile come segue:
	 * 
	 * a == 'un qualche valore letto dall'esterno che chiamiamo x' 
	 *   && b == 'un qualche valore letto dall'esterno che chiamiamo y'
	 */
	
	if (a > b) {
		/*
		 * Percorrere questo ramo, permette di meglio specializzare 
		 * la proprieta' dello stato, aggiungendo ad esso il fatto 
		 * che la condizione del costrutto condizionale sia vera:
		 * 
		 * a == x && b == y && a > b . (1)
		 * 
		 * Qualsiasi istruzione seguente agira' in uno stato in 
		 * cui vale (1) e qualsiasi predicato che (1) possa implicare.
		 * 
		 * Ad esempio, (1) implica:
		 * 
		 * a-b == x-y . (2)
		 * 
		 * applicando ad a==x una sottrazione ad entrambi i membri di
		 * quantita' identiche fra loro, cioe' b e y.
		 */

		a = a - b;

		/*
		 * L'assegnazione, aggiorna il valore di a col risultato 
		 * della sottrazione del valore di b da quello di a. E' 
		 * quindi possibile sostituire a al posto di 
		 * a-b in (2), ottenendo almeno:
		 * 
		 * a == x-y . (3)
		 * 
		 * Siccome, prima dell'assegnazione a>b, avremo:
		 * 
		 * a > 0 . (4)
		 * 
		 * Al termine di questo ramo della selezione le 
		 * proprieta' rilevanti  dello stato sono descritte 
		 * dal predicato:
		 * 
		 * a == x-y && a > 0 . (5)
		 */

	} else {
		/*
		 * Percorrere questo ramo, permette di meglio specializzare 
		 * la proprieta' dello stato, aggiungendo ad esso il fatto 
		 * che la condizione del costrutto condizionale sia vera:
		 * 
		 * a == x && b == y && a <= b . (6)
		 * 
		 * Qualsiasi istruzione seguente agira' in uno stato in 
		 * cui vale (6) e qualsiasi predicato che (6) possa 
		 * implicare.
		 * 
		 * Ad esempio, (1) implica:
		 * 
		 * b-a == y-x . (7)
		 * 
		 * applicando a b==y una sottrazione ad entrambi i membri di
		 * quantita' identiche fra loro, cioe' a e x.
		 */

		a = b - a;

		/*
		 * L'assegnazione, aggiorna il valore di a col risultato 
		 * della sottrazione del valore di a da quello di b. E' 
		 * quindi possibile sostituire a al posto di 
		 * b-a in (7), ottenendo almeno:
		 * 
		 * a == y-x . (8)
		 * 
		 * Siccome , prima dell'assegnazione a<=b, avremo:
		 * 
		 * a >= 0 . (9)
		 * 
		 * Al termine di questo ramo della selezione le 
		 * proprieta' rilevanti dello stato sono descritte dal 
		 * predicato:
		 * 
		 * a == y-x && a >= 0 . (10)
		 */
	}
	/*
	 * In questo punto del programma abbiamo percorso uno dei due rami
	 * quindi, grazie a (5) e (10) sappiamo che:
	 * 
	 * a >= 0 . (11)
	 * 
	 * Possiamo sperimentare il valore di verita' di (11), sfruttando le
	 * direttive:
	 * 
	 * assert Espressione ; assert Espressione : Espressione' ;
	 * 
	 * ammesse dal linguaggio Java. L'interpretazione delle direttive deve
	 * essere abilitata esplicitamente in fase di esecuzione:
	 * 
	 * java -ea NomeClasse .
	 */

	assert (a >= 0) : "a == " + a + ".";
  }
}