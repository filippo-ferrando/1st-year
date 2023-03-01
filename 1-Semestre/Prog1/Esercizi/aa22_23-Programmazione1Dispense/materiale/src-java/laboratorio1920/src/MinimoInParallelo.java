/** Fornisce tre possibili algoritmi per il problema 
 * MSMP che, dati due numeri naturali {@code m} ed {@code n},
 * restituisce il minimo, ipotizzando di poter solo decrementare
 * {@code m} ed {@code n} e di poter solo rispondere alle domande
 * {@code x==0} e {@code x !=0}.
 * 
 * Visto il punto del corso in cui si sviluppa questo 
 * sorgente, le soluzioni proposte ono si avvalgono di metodi.
 * 
 * @author rover
 */
public class MinimoInParallelo {

    public static void main(String[] args) {
        /*
         * La prima soluzione ipotizza la manipolazione
         * di configurazioni con tre componenti. Le prime due
         * per {@code m} ed {@code n}, l'ultima per contenere
         * il risultato: conterra' {@code 0} se {@code m>n}, ed 
         * {@code 1} altrimenti.
         */
        
        // Configurazione iniziale prima soluzione
        int mZero = 3; int nZero = 3;
        int rZero = 0; // ipotizza che {@code mZero} sia il minimo
        while (mZero != 0 && nZero != 0) {
            mZero = mZero - 1;
            nZero = nZero - 1;
        }
        if (nZero == 0)
            rZero = 1;
        
        /*
         * La seconda soluzione ipotizza la manipolazione
         * di configurazioni le cui componenti hanno lo stesso
         * significato assegnato nella prima soluzione. La 
         * differenza sta nel simulare la congiunzione, usata 
         * nella pria soluzione, annidando iterazione e selezione.
         */
        // Configurazione iniziale seconda soluzione
        int mUno = 3; int nUno = 3;
        int rUno = 0; // ipotizza che {@code mZero} sia il minimo
        while (mUno != 0) {
            if (nUno != 0) {
                mUno = mUno - 1;
                nUno = nUno - 1;
            } else {
                mUno = mUno - 1;
                rUno = 1; // {@code nUno} e' necessariamente il minimo
            }
        }

        /*
         * La prima soluzione ipotizza la manipolazione
         * di configurazioni con tre componenti. Le prime due
         * per {@code m} ed {@code n}, l'ultima per contenere
         * il valore iniziale del minimo tra {@code m} ed {@code n}.
         * Questa soluzione utilizza comunque incrementi, e non solo
         * decrementi.
         */
        // Configurazione iniziale seconda soluzione
        int mDue = 3; int nDue = 3;
        int rDue = 0; // accumulera' il valore del minimo
        while (mDue != 0 && nDue != 0) {
            mDue = mDue - 1;
            nDue = nDue - 1;
            rDue = rDue + 1;
        }
        System.out.println("rZero = " + rZero);  // deve esere 1
        System.out.println("rUno  = " + rUno );  // deve esere 0
        System.out.println("rDue  = " + rDue );  // deve contenere {@code nDue}
    }

}
